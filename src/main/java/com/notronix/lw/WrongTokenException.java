package com.notronix.lw;

public class WrongTokenException extends Exception
{
    public WrongTokenException(String message) {
        super(message);
    }

    public WrongTokenException(String message, Throwable cause) {
        super(message, cause);
    }
}
