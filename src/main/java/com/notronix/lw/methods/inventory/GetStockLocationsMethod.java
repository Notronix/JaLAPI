package com.notronix.lw.methods.inventory;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.StockLocation;

import java.util.Arrays;
import java.util.List;

public class GetStockLocationsMethod extends InventoryMethod<List<StockLocation>>
{
    @Override
    public String getName()
    {
        return "GetStockLocations";
    }

    @Override
    public String getPayload()
    {
        return null;
    }

    @Override
    public List<StockLocation> getResponse()
            throws LinnworksAPIException
    {
        return Arrays.asList(new Gson().fromJson(getJsonResult(), StockLocation[].class));
    }
}
