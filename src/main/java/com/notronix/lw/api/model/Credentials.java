package com.notronix.lw.api.model;

public interface Credentials
{
    String getAppId();
    String getAppSecret();
    String getAuthToken();

    static Credentials withKeys(final String appId, final String appSecret, final String authToken) {
        return new Credentials()
        {
            @Override
            public String getAppId() {
                return appId;
            }

            @Override
            public String getAppSecret() {
                return appSecret;
            }

            @Override
            public String getAuthToken() {
                return authToken;
            }
        };
    }
}
