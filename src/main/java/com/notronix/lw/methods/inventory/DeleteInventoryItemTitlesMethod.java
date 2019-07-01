package com.notronix.lw.methods.inventory;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;

import java.util.List;

public class DeleteInventoryItemTitlesMethod extends InventoryMethod<List<String>>
{
    private List<String> inventoryItemTitleIds;

    @Override
    public String getName() {
        return "DeleteInventoryItemTitles";
    }

    @Override
    public String getPayload() {
        return "inventoryItemTitleIds=" + new Gson().toJson(inventoryItemTitleIds);
    }

    @Override
    public List<String> getResponse() throws LinnworksAPIException {
        return inventoryItemTitleIds;
    }

    public List<String> getInventoryItemTitleIds() {
        return inventoryItemTitleIds;
    }

    public void setInventoryItemTitleIds(List<String> inventoryItemTitleIds) {
        this.inventoryItemTitleIds = inventoryItemTitleIds;
    }

    public DeleteInventoryItemTitlesMethod withInventoryItemTitleIds(List<String> inventoryItemTitleIds) {
        this.inventoryItemTitleIds = inventoryItemTitleIds;
        return this;
    }
}
