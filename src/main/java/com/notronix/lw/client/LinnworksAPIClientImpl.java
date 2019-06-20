package com.notronix.lw.client;

import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.ThrottlingException;
import com.notronix.lw.WrongTokenException;
import com.notronix.lw.methods.Method;
import org.apache.http.HttpHost;
import org.apache.http.StatusLine;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.util.List;

import static org.apache.http.HttpStatus.SC_NO_CONTENT;
import static org.apache.http.HttpStatus.SC_OK;

public class LinnworksAPIClientImpl implements LinnworksAPIClient
{
    @Override
    public <T> T executeMethod(Method<T> method) throws LinnworksAPIException, WrongTokenException, ThrottlingException {
        String url = method.getHost();

        if (url == null) {
            throw new LinnworksAPIException(method.getClass().getSimpleName() + ": host is null.");
        }

        if (!url.endsWith("/")) {
            url += "/";
        }
        url += "api/" + method.getModule() + "/" + method.getName();

        StatusLine status;
        int statusCode;
        String responsePayload;

        HttpRequestBase request = getRequest(url, method.getPayload(), method.getSessionToken());

        try (CloseableHttpClient client = HttpClientBuilder.create().setDefaultRequestConfig(request.getConfig()).build();
             CloseableHttpResponse response = client.execute(request)) {
            status = response.getStatusLine();
            statusCode = status == null ? 0 : status.getStatusCode();
            responsePayload = response.getEntity() == null ? null : EntityUtils.toString(response.getEntity());
        }
        catch (Exception e) {
            throw new LinnworksAPIException("A failure occurred executing linnworks method (" + method.getModule() + "/" + method.getName() + ")", e);
        }

        if (statusCode != SC_OK && statusCode != SC_NO_CONTENT) {
            if (responsePayload != null && responsePayload.toLowerCase().contains("token is wrong")) {
                throw new WrongTokenException(responsePayload);
            }
            else if (responsePayload != null && responsePayload.toLowerCase().contains("api calls quota exceeded")) {
                throw new ThrottlingException(responsePayload);
            }
            else {
                String reason = status == null ? "" : status.getReasonPhrase();
                throw new LinnworksAPIException("API call failed" + ". Code: " + statusCode + ", Reason: " + reason
                        + ", Details: " + responsePayload);
            }
        }

        method.setJsonResult(responsePayload);

        return method.getResponse();
    }

    private static HttpRequestBase getRequest(String url, String postPayload, String sessionToken) {
        int timeoutInMillis = 300000;

        RequestConfig.Builder defaultRequestConfigBuilder = RequestConfig.custom()
                .setCookieSpec(CookieSpecs.IGNORE_COOKIES)
                .setExpectContinueEnabled(true);

        URI uri = URI.create(url);
        ProxySelector proxySelector = ProxySelector.getDefault();
        List<Proxy> proxies = proxySelector.select(uri);

        if (!proxies.isEmpty()) {
            Proxy proxy = proxies.get(0);

            if (Proxy.Type.HTTP.equals(proxy.type())) {
                String[] fields = proxy.address().toString().split(":");
                String host = fields[0];
                int port = -1;

                if (fields.length > 1) {
                    port = Integer.parseInt(fields[1]);
                }

                defaultRequestConfigBuilder.setProxy(new HttpHost(host, port));
            }
        }

        RequestConfig defaultRequestConfig = defaultRequestConfigBuilder.build();
        RequestConfig requestConfig = RequestConfig.copy(defaultRequestConfig)
                .setSocketTimeout(timeoutInMillis)
                .setConnectTimeout(timeoutInMillis)
                .setConnectionRequestTimeout(timeoutInMillis)
                .build();

        HttpRequestBase request = new HttpPost(url);
        ((HttpPost) request).setEntity(new ByteArrayEntity(postPayload == null ? new byte[0] : postPayload.getBytes()));

        if (sessionToken != null && sessionToken.trim().length() > 0) {
            request.addHeader("Authorization", sessionToken);
        }

        request.addHeader("Accept", "application/json, text/javascript, */*; q=0.01");
        request.addHeader("Accept-Encoding", "gzip, deflate");
        request.addHeader("Accept-Language", "en");
        request.addHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        request.setConfig(requestConfig);

        return request;
    }
}
