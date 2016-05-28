package com.notronix.lw.methods.inventory;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.StockItemInv;

public class GetInventoryItemByIdMethod extends InventoryMethod<StockItemInv>
{
    private String itemId;

    @Override
    public String getName()
    {
        return "GetInventoryItemById";
    }

    @Override
    public String getPayload()
    {
        return "id=" + itemId;
    }

    @Override
    public StockItemInv getResponse()
            throws LinnworksAPIException
    {
        return new Gson().fromJson(getJsonResult(), StockItemInv.class);
    }

    public String getItemId()
    {
        return itemId;
    }

    public void setItemId(String itemId)
    {
        this.itemId = itemId;
    }

    public GetInventoryItemByIdMethod withItemId(String itemId)
    {
        this.itemId = itemId;
        return this;
    }
}
