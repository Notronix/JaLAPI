package com.notronix.lw.impl.method.inventory;

import com.google.gson.Gson;
import com.notronix.lw.api.model.StockLocation;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.Arrays;
import java.util.List;

public class GetStockLocationsMethod extends AbstractLinnworksAPIMethod<List<StockLocation>>
{
    @Override
    public String getURI() {
        return "Inventory/GetStockLocations";
    }

    @Override
    public List<StockLocation> getResponse(Gson gson, String jsonPayload) {
        return Arrays.asList(gson.fromJson(jsonPayload, StockLocation[].class));
    }
}
