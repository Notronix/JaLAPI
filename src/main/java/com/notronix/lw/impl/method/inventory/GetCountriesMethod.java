package com.notronix.lw.impl.method.inventory;

import com.google.gson.Gson;
import com.notronix.lw.api.model.Country;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.Arrays;
import java.util.List;

public class GetCountriesMethod extends AbstractLinnworksAPIMethod<List<Country>>
{
    @Override
    public String getURI() {
        return "Inventory/GetCountries";
    }

    @Override
    public List<Country> getResponse(Gson gson, String jsonPayload) {
        return Arrays.asList(gson.fromJson(jsonPayload, Country[].class));
    }
}
