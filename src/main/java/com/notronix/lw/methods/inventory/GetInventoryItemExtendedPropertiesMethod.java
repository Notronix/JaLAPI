package com.notronix.lw.methods.inventory;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.StockItemExtendedProperty;

import java.util.Arrays;
import java.util.List;

public class GetInventoryItemExtendedPropertiesMethod extends InventoryMethod<List<StockItemExtendedProperty>>
{
    private String itemId;

    @Override
    public String getName()
    {
        return "GetInventoryItemExtendedProperties";
    }

    @Override
    public String getPayload()
    {
        return "inventoryItemId=" + (itemId == null ? "" : itemId);
    }

    @Override
    public List<StockItemExtendedProperty> getResponse()
            throws LinnworksAPIException
    {
        return Arrays.asList(new Gson().fromJson(getJsonResult(), StockItemExtendedProperty[].class));
    }

    public String getItemId()
    {
        return itemId;
    }

    public void setItemId(String itemId)
    {
        this.itemId = itemId;
    }

    public GetInventoryItemExtendedPropertiesMethod withItemId(String itemId)
    {
        this.itemId = itemId;
        return this;
    }
}
