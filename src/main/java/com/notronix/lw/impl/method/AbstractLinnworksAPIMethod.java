package com.notronix.lw.impl.method;

import com.google.api.client.http.EmptyContent;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpMethods;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.notronix.lw.api.method.LinnworksAPIMethod;
import com.notronix.lw.api.model.BaseSession;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class AbstractLinnworksAPIMethod<Result> implements LinnworksAPIMethod<Result>
{
    protected static final Type LIST_OF_STRINGS = new TypeToken<ArrayList<String>>(){}.getType();
    protected static final Type STRING_OBJECT_MAP = new TypeToken<HashMap<String, Object>>(){}.getType();
    private static final String BASE_URL = "https://api.linnworks.net/";

    private BaseSession session;

    public abstract String getURI();

    @Override
    public final String getURL() {
        String url = session == null ? BASE_URL : session.getServer();
        url += "/api/" + getURI();

        return url;
    }

    @Override
    public String getRequestMethod() {
        return HttpMethods.POST;
    }

    @Override
    public HttpContent getContent(Gson gson) {
        return new EmptyContent();
    }

    @Override
    public BaseSession getSession() {
        return session;
    }

    public void setSession(BaseSession session) {
        this.session = session;
    }

    public AbstractLinnworksAPIMethod<Result> withSession(BaseSession session) {
        this.session = session;
        return this;
    }
}
