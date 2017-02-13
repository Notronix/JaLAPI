package com.notronix.lw.methods.inventory;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.StockItemChannelSKU;

import java.util.Arrays;
import java.util.List;

public class GetInventoryItemChannelSKUsMethod extends InventoryMethod<List<StockItemChannelSKU>>
{
    private String itemId;

    @Override
    public String getName()
    {
        return "GetInventoryItemChannelSKUs";
    }

    @Override
    public String getPayload()
    {
        return "inventoryItemId=" + (itemId == null ? "" : itemId);
    }

    @Override
    public List<StockItemChannelSKU> getResponse() throws LinnworksAPIException
    {
        return Arrays.asList(new Gson().fromJson(getJsonResult(), StockItemChannelSKU[].class));
    }

    public String getItemId()
    {
        return itemId;
    }

    public void setItemId(String itemId)
    {
        this.itemId = itemId;
    }

    public GetInventoryItemChannelSKUsMethod withItemId(String itemId)
    {
        this.itemId = itemId;
        return this;
    }
}
