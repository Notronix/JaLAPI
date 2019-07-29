package com.notronix.lw.api;

public class LinnworksAPIException extends Exception
{
    private LinnworksAPIExceptionReason reason = LinnworksAPIExceptionReason.GENERAL;

    public LinnworksAPIException(String message)
    {
        super(message);
    }

    public LinnworksAPIException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public boolean isDueToWrongToken() {
        return reason == LinnworksAPIExceptionReason.WRONG_TOKEN;
    }

    public LinnworksAPIException dueToWrongToken() {
        reason = LinnworksAPIExceptionReason.WRONG_TOKEN;
        return this;
    }

    public boolean isDueToThrottling() {
        return reason == LinnworksAPIExceptionReason.THROTTLING;
    }

    public LinnworksAPIException dueToThrottling() {
        reason = LinnworksAPIExceptionReason.THROTTLING;
        return this;
    }
}
