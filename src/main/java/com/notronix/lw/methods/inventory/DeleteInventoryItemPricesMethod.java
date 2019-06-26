package com.notronix.lw.methods.inventory;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;

import java.util.List;

public class DeleteInventoryItemPricesMethod extends InventoryMethod<List<String>>
{
    private List<String> inventoryItemPriceIds;

    @Override
    public String getName() {
        return "DeleteInventoryItemPrices";
    }

    @Override
    public String getPayload() {
        return "inventoryItemPriceIds=" + new Gson().toJson(inventoryItemPriceIds);
    }

    @Override
    public List<String> getResponse() throws LinnworksAPIException {
        return inventoryItemPriceIds;
    }

    public List<String> getInventoryItemPriceIds() {
        return inventoryItemPriceIds;
    }

    public void setInventoryItemPriceIds(List<String> inventoryItemPriceIds) {
        this.inventoryItemPriceIds = inventoryItemPriceIds;
    }

    public DeleteInventoryItemPricesMethod withInventoryItemPriceIds(List<String> inventoryItemPriceIds) {
        this.inventoryItemPriceIds = inventoryItemPriceIds;
        return this;
    }
}
