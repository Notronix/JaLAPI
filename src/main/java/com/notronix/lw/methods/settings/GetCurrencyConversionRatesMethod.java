package com.notronix.lw.methods.settings;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.CurrencyConversionRate;
import com.notronix.lw.model.GetConversionRatesRequest;

import java.util.Arrays;
import java.util.List;

public class GetCurrencyConversionRatesMethod extends SettingsMethod<List<CurrencyConversionRate>>
{
    private boolean GetCurrenciesFromOrders = Boolean.FALSE;
    private String currency;

    @Override
    public String getName()
    {
        return "GetCurrencyConversionRates";
    }

    @Override
    public String getPayload()
    {
        return "requestParams=" + new Gson().toJson(new GetConversionRatesRequest()
                .withGetCurrenciesFromOrders(GetCurrenciesFromOrders).forCurrency(currency));
    }

    @Override
    public List<CurrencyConversionRate> getResponse() throws LinnworksAPIException
    {
        return Arrays.asList(new Gson().fromJson(getJsonResult(), CurrencyConversionRate[].class));
    }

    public boolean isGetCurrenciesFromOrders() {
        return GetCurrenciesFromOrders;
    }

    public void setGetCurrenciesFromOrders(boolean getCurrenciesFromOrders)
    {
        GetCurrenciesFromOrders = getCurrenciesFromOrders;
    }

    public GetCurrencyConversionRatesMethod withGetCurrenciesFromOrders(boolean getCurrenciesFromOrders)
    {
        GetCurrenciesFromOrders = getCurrenciesFromOrders;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public GetCurrencyConversionRatesMethod forCurrency(String currency)
    {
        this.currency = currency;
        return this;
    }
}
