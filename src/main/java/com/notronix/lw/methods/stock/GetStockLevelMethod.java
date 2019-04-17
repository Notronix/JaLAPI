package com.notronix.lw.methods.stock;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.gson.InstantDeserializer;
import com.notronix.lw.model.StockItemLevel;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;

public class GetStockLevelMethod extends StockMethod<List<StockItemLevel>>
{
    private String itemId;

    @Override
    public String getName()
    {
        return "GetStockLevel";
    }

    @Override
    public String getPayload()
    {
        return "stockItemId=" + (itemId == null ? "" : itemId);
    }

    @Override
    public List<StockItemLevel> getResponse()
            throws LinnworksAPIException
    {
        Gson gson = new GsonBuilder().registerTypeAdapter(Instant.class, new InstantDeserializer()).create();

        return Arrays.asList(gson.fromJson(getJsonResult(), StockItemLevel[].class));
    }

    public String getItemId()
    {
        return itemId;
    }

    public void setItemId(String itemId)
    {
        this.itemId = itemId;
    }

    public GetStockLevelMethod withItemId(String itemId)
    {
        this.itemId = itemId;
        return this;
    }
}
