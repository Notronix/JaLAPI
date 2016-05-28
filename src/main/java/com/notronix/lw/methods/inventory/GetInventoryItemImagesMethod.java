package com.notronix.lw.methods.inventory;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.StockItemImage;

import java.util.Arrays;
import java.util.List;

public class GetInventoryItemImagesMethod extends InventoryMethod<List<StockItemImage>>
{
    private String itemId;

    @Override
    public String getName()
    {
        return "GetInventoryItemImages";
    }

    @Override
    public String getPayload()
    {
        return "inventoryItemId=" + (itemId == null ? "" : itemId);
    }

    @Override
    public List<StockItemImage> getResponse()
            throws LinnworksAPIException
    {
        return Arrays.asList(new Gson().fromJson(getJsonResult(), StockItemImage[].class));
    }

    public String getItemId()
    {
        return itemId;
    }

    public void setItemId(String itemId)
    {
        this.itemId = itemId;
    }

    public GetInventoryItemImagesMethod withItemId(String itemId)
    {
        this.itemId = itemId;
        return this;
    }
}
