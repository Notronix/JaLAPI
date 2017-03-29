package com.notronix.lw.model;

public class GetConversionRatesRequest
{
    private boolean GetCurrenciesFromOrders;
    private String Currency;

    public boolean isGetCurrenciesFromOrders()
    {
        return GetCurrenciesFromOrders;
    }

    public void setGetCurrenciesFromOrders(boolean getCurrenciesFromOrders)
    {
        GetCurrenciesFromOrders = getCurrenciesFromOrders;
    }

    public GetConversionRatesRequest withGetCurrenciesFromOrders(boolean getCurrenciesFromOrders)
    {
        GetCurrenciesFromOrders = getCurrenciesFromOrders;
        return this;
    }

    public String getCurrency()
    {
        return Currency;
    }

    public void setCurrency(String currency)
    {
        Currency = currency;
    }

    public GetConversionRatesRequest forCurrency(String currency)
    {
        Currency = currency;
        return this;
    }
}
