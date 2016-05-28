package com.notronix.lw.methods.inventory;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.Country;

import java.util.Arrays;
import java.util.List;

public class GetCountriesMethod extends InventoryMethod<List<Country>>
{
    @Override
    public String getName()
    {
        return "GetCountries";
    }

    @Override
    public String getPayload()
    {
        return null;
    }

    @Override
    public List<Country> getResponse()
            throws LinnworksAPIException
    {
        return Arrays.asList(new Gson().fromJson(getJsonResult(), Country[].class));
    }
}
