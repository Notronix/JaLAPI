package com.notronix.lw.model;

public class CustomerAddress extends Address
{
    private String EmailAddress;

    public String getEmailAddress()
    {
        return EmailAddress;
    }

    public void setEmailAddress(String emailAddress)
    {
        EmailAddress = emailAddress;
    }
}
