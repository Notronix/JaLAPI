package com.notronix.lw.methods;

import com.google.gson.annotations.Since;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class BaseMethod<T> implements Method<T>
{
    protected static final Type LIST_OF_STRINGS = new TypeToken<ArrayList<String>>(){}.getType();
    protected static final Type STRING_OBJECT_MAP = new TypeToken<HashMap<String, Object>>(){}.getType();

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
