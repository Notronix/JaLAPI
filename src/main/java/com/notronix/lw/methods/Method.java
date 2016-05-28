package com.notronix.lw.methods;

import com.notronix.lw.LinnworksAPIException;

public interface Method<T>
{
    String getHost();
    void setHost(String host);

    String getSessionToken();
    void setSessionToken(String sessionToken);

    String getModule();
    String getName();
    String getPayload();

    void setJsonResult(String jsonResponse);
    String getJsonResult();

    T getResponse() throws LinnworksAPIException;
}
