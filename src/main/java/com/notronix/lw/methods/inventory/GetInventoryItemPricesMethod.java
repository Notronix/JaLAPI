package com.notronix.lw.methods.inventory;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.StockItemPrice;

import java.util.Arrays;
import java.util.List;

public class GetInventoryItemPricesMethod extends InventoryMethod<List<StockItemPrice>>
{
    private String itemId;

    @Override
    public String getName() {
        return "GetInventoryItemPrices";
    }

    @Override
    public String getPayload() {
        return "inventoryItemId=" + itemId;
    }

    @Override
    public List<StockItemPrice> getResponse() throws LinnworksAPIException {
        return Arrays.asList(new Gson().fromJson(getJsonResult(), StockItemPrice[].class));
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public GetInventoryItemPricesMethod withItemId(String itemId)
    {
        this.itemId = itemId;
        return this;
    }
}
