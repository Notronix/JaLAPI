package com.notronix.lw.impl.method.settings;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.CurrencyConversionRate;
import com.notronix.lw.api.model.GetConversionRatesRequest;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.notronix.lw.impl.method.MethodUtils.putIfProvided;
import static com.notronix.lw.impl.method.MethodUtils.urlEncode;

public class GetCurrencyConversionRatesMethod extends AbstractLinnworksAPIMethod<List<CurrencyConversionRate>>
{
    private GetConversionRatesRequest requestParams;

    @Override
    public String getURI() {
        return "Settings/GetCurrencyConversionRates";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        Map<String, Object> params = new HashMap<>();
        putIfProvided(params, "requestParams", requestParams, gson::toJson);

        return urlEncode(params);
    }

    @Override
    public List<CurrencyConversionRate> getResponse(Gson gson, String jsonPayload) {
        return Arrays.asList(gson.fromJson(jsonPayload, CurrencyConversionRate[].class));
    }

    public GetConversionRatesRequest getRequestParams() {
        return requestParams;
    }

    public void setRequestParams(GetConversionRatesRequest requestParams) {
        this.requestParams = requestParams;
    }

    public GetCurrencyConversionRatesMethod withRequestParams(GetConversionRatesRequest requestParams) {
        this.requestParams = requestParams;
        return this;
    }
}
