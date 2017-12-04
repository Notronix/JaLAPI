package com.notronix.lw.client;

import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.methods.Method;
import org.apache.http.HttpHost;
import org.apache.http.HttpStatus;
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

public class LinnworksAPIClientImpl implements LinnworksAPIClient
{
    @Override
    public <T> T executeMethod(Method<T> method)
            throws LinnworksAPIException
    {
        String url = method.getHost();

        if (url == null)
        {
            throw new LinnworksAPIException(method.getClass().getSimpleName() + ": host is null.");
        }

        if (!url.endsWith("/"))
        {
            url += "/";
        }
        url += "api/" + method.getModule() + "/" + method.getName();

        HttpRequestBase request = getRequest(url, method.getPayload(), method.getSessionToken());

        try (CloseableHttpClient client = HttpClientBuilder.create().setDefaultRequestConfig(request.getConfig()).build();
             CloseableHttpResponse response = client.execute(request))
        {
            StatusLine status = response.getStatusLine();
            String responsePayload = response.getEntity() == null ? null : EntityUtils.toString(response.getEntity());

            if (status.getStatusCode() == HttpStatus.SC_OK || status.getStatusCode() == HttpStatus.SC_NO_CONTENT)
            {
                method.setJsonResult(responsePayload);
            }
            else
            {
                throw new Exception("API call failed" +
                        ". Code: " + status.getStatusCode() +
                        ", Reason: " + status.getReasonPhrase() +
                        ", Details: " + responsePayload);
            }
        }
        catch (Exception e)
        {
            throw new LinnworksAPIException("A failure occurred executing linnworks method (" + method.getModule() + "/" + method.getName() + ")", e);
        }

        return method.getResponse();
    }

    private static HttpRequestBase getRequest(String url, String postPayload, String sessionToken)
    {
        int timeoutInMillis = 300000;

        RequestConfig.Builder defaultRequestConfigBuilder = RequestConfig.custom()
                .setCookieSpec(CookieSpecs.IGNORE_COOKIES)
                .setExpectContinueEnabled(true);

        URI uri = URI.create(url);
        ProxySelector proxySelector = ProxySelector.getDefault();
        List<Proxy> proxies = proxySelector.select(uri);

        if (!proxies.isEmpty())
        {
            Proxy proxy = proxies.get(0);

            if (Proxy.Type.HTTP.equals(proxy.type()))
            {
                String[] fields = proxy.address().toString().split(":");
                String host = fields[0];
                int port = -1;

                if (fields.length > 1)
                {
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

        if (sessionToken != null && sessionToken.trim().length() > 0)
        {
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
