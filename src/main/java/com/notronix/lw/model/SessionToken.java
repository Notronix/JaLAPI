package com.notronix.lw.model;

import java.time.Clock;
import java.time.ZonedDateTime;

public class SessionToken
{
    private String server;
    private String sessionToken;
    private ZonedDateTime dateAcquired;

    public SessionToken(String server, String token)
    {
        this.server = server;
        this.sessionToken = token;
        dateAcquired = ZonedDateTime.now(Clock.systemUTC());
    }

    public String getServer()
    {
        return server;
    }

    public String getSessionToken()
    {
        return sessionToken;
    }

    public ZonedDateTime getDateAcquired() 
    {
        return dateAcquired;
    }
}
