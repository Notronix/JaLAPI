package com.notronix.lw.api.method;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.BaseSession;

public interface LinnworksAPIMethod<Result>
{
    String getURL();
    String getRequestMethod();
    BaseSession getSession();
    HttpContent getContent(Gson gson);
    Result getResponse(Gson gson, String jsonPayload);
}
