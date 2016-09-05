package com.notronix.lw.model;

public enum SearchDateType
{
    ALLDATES(0),
    RECEIVED(1),
    PROCESSED(2),
    PAYMENTRECEIVED(3);

    private int value;

    SearchDateType(int value)
    {
        this.value = value;
    }

    public int value()
    {
        return value;
    }
}
