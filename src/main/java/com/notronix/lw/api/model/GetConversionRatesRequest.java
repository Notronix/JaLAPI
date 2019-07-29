package com.notronix.lw.api.model;

public class GetConversionRatesRequest
{
    private Boolean GetCurrenciesFromOrders;
    private String Currency;

    public Boolean getGetCurrenciesFromOrders() {
        return GetCurrenciesFromOrders;
    }

    public void setGetCurrenciesFromOrders(Boolean getCurrenciesFromOrders) {
        GetCurrenciesFromOrders = getCurrenciesFromOrders;
    }

    public GetConversionRatesRequest withGetCurrenciesFromOrders(Boolean getCurrenciesFromOrders) {
        GetCurrenciesFromOrders = getCurrenciesFromOrders;
        return this;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }

    public GetConversionRatesRequest withCurrency(String currency) {
        Currency = currency;
        return this;
    }
}
