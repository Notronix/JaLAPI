package com.notronix.lw.methods.auth;

import com.google.gson.Gson;
import com.notronix.lw.model.BaseSession;
import com.notronix.lw.model.SessionToken;
import com.notronix.lw.LinnworksAPIException;

public class AuthorizeByApplicationMethod extends AuthMethod<SessionToken>
{
    private static final String NAME = "AuthorizeByApplication";

    private String appId;
    private String appSecret;
    private String authToken;

    @Override
    public SessionToken getResponse()
            throws LinnworksAPIException
    {
        Gson gson = new Gson();
        BaseSession baseSession = gson.fromJson(getJsonResult(), BaseSession.class);

        if (baseSession == null || baseSession.getServer() == null || baseSession.getToken() == null)
        {
            throw new LinnworksAPIException("Failed to authorize by application. " + gson.toJson(baseSession));
        }

        return new SessionToken(baseSession.getServer(), baseSession.getToken());
    }

    @Override
    public String getPayload()
    {
        return "applicationId=" + appId + "&applicationSecret=" + appSecret + "&token=" + authToken;
    }

    public String getName()
    {
        return NAME;
    }

    public String getAppId()
    {
        return appId;
    }

    public void setAppId(String appId)
    {
        this.appId = appId;
    }

    public String getAppSecret()
    {
        return appSecret;
    }

    public void setAppSecret(String appSecret)
    {
        this.appSecret = appSecret;
    }

    public String getAuthToken()
    {
        return authToken;
    }

    public void setAuthToken(String authToken)
    {
        this.authToken = authToken;
    }
}
