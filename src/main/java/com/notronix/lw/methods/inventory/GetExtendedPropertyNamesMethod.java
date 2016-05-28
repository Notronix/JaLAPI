package com.notronix.lw.methods.inventory;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;

import java.util.Arrays;
import java.util.List;

public class GetExtendedPropertyNamesMethod extends InventoryMethod<List<String>>
{
    @Override
    public String getName()
    {
        return "GetExtendedPropertyNames";
    }

    @Override
    public String getPayload()
    {
        return null;
    }

    @Override
    public List<String> getResponse()
            throws LinnworksAPIException
    {
        return Arrays.asList(new Gson().fromJson(getJsonResult(), String[].class));
    }
}
