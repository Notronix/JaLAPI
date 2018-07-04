package com.notronix.lw.methods;

import com.google.gson.annotations.Since;

public abstract class BaseMethod<T> implements Method<T>
{
    @Since(2.0) private String jsonResult;
    @Since(2.0) private String host;
    @Since(2.0) private String sessionToken;

    @Override
    public String getJsonResult()
    {
        return jsonResult;
    }

    @Override
    public void setJsonResult(String jsonResult)
    {
        this.jsonResult = jsonResult;
    }

    @Override
    public String getHost()
    {
        return host;
    }

    @Override
    public void setHost(String host)
    {
        this.host = host;
    }

    @Override
    public String getSessionToken()
    {
        return sessionToken;
    }

    @Override
    public void setSessionToken(String sessionToken)
    {
        this.sessionToken = sessionToken;
    }
}
