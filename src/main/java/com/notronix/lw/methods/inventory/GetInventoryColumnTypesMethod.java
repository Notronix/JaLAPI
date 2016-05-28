package com.notronix.lw.methods.inventory;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.Column;

import java.util.Arrays;
import java.util.List;

public class GetInventoryColumnTypesMethod extends InventoryMethod<List<Column>>
{
    @Override
    public String getName()
    {
        return "GetInventoryColumnTypes";
    }

    @Override
    public String getPayload()
    {
        return null;
    }

    @Override
    public List<Column> getResponse()
            throws LinnworksAPIException
    {
        return Arrays.asList(new Gson().fromJson(getJsonResult(), Column[].class));
    }
}
