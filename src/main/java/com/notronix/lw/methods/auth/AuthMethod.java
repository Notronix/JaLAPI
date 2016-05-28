package com.notronix.lw.methods.auth;

import com.notronix.lw.methods.BaseMethod;

abstract class AuthMethod<T> extends BaseMethod<T>
{
    @Override
    public String getSessionToken()
    {
        return null;
    }

    @Override
    public void setSessionToken(String token)
    {
    }

    @Override
    public String getModule()
    {
        return "Auth";
    }
}
