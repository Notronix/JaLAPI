package com.notronix.lw;

public class LinnworksAPIException extends Exception
{
    public LinnworksAPIException(String message)
    {
        super(message);
    }

    public LinnworksAPIException(String message, Throwable cause)
    {
        super(message, cause);
    }
}
