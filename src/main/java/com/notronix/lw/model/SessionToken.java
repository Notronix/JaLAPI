package com.notronix.lw.model;

public class SessionToken
{
    private String server;
    private String sessionToken;

    public SessionToken(String server, String token)
    {
        this.server = server;
        this.sessionToken = token;
    }

    public String getServer()
    {
        return server;
    }

    public String getSessionToken()
    {
        return sessionToken;
    }
}
