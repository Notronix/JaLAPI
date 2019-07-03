package com.notronix.lw.methods.inventory;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;

import java.util.List;

public class DeleteInventoryItemDescriptionsMethod extends InventoryMethod<List<String>>
{
    private List<String> inventoryItemDescriptionIds;

    @Override
    public String getName() {
        return "DeleteInventoryItemDescriptions";
    }

    @Override
    public String getPayload() {
        return "inventoryItemDescriptionIds=" + new Gson().toJson(inventoryItemDescriptionIds);
    }

    @Override
    public List<String> getResponse() throws LinnworksAPIException {
        return inventoryItemDescriptionIds;
    }

    public List<String> getInventoryItemDescriptionIds() {
        return inventoryItemDescriptionIds;
    }

    public void setInventoryItemDescriptionIds(List<String> inventoryItemDescriptionIds) {
        this.inventoryItemDescriptionIds = inventoryItemDescriptionIds;
    }

    public DeleteInventoryItemDescriptionsMethod withInventoryItemDescriptionIds(List<String> inventoryItemDescriptionIds) {
        this.inventoryItemDescriptionIds = inventoryItemDescriptionIds;
        return this;
    }
}
