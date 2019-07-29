package com.notronix.lw.impl.method.auth;

import com.google.api.client.http.HttpContent;
import com.google.api.client.http.UrlEncodedContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.BaseSession;
import com.notronix.lw.api.model.Credentials;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.HashMap;
import java.util.Map;

import static java.util.Objects.requireNonNull;

public class AuthorizeByApplicationMethod extends AbstractLinnworksAPIMethod<BaseSession>
{
    private Credentials credentials;

    @Override
    public String getURI() {
        return "Auth/AuthorizeByApplication";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        requireNonNull(credentials);

        Map<String, String> params = new HashMap<>();
        params.put("applicationId", requireNonNull(credentials.getAppId()));
        params.put("applicationSecret", requireNonNull(credentials.getAppSecret()));
        params.put("token", requireNonNull(credentials.getAuthToken()));

        return new UrlEncodedContent(params);
    }

    @Override
    public BaseSession getResponse(Gson gson, String jsonPayload) {
        return gson.fromJson(jsonPayload, BaseSession.class);
    }

    public Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    public AuthorizeByApplicationMethod withCredentials(Credentials credentials) {
        this.credentials = credentials;
        return this;
    }
}
