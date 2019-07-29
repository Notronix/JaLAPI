package com.notronix.lw.impl.method.auth;

import com.google.gson.Gson;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.time.Instant;

public class GetServerUTCTimeMethod extends AbstractLinnworksAPIMethod<Instant>
{
    @Override
    public String getURI() {
        return "Auth/GetServerUTCTime";
    }

    @Override
    public Instant getResponse(Gson gson, String jsonPayload) {
        return gson.fromJson(jsonPayload, Instant.class);
    }
}
