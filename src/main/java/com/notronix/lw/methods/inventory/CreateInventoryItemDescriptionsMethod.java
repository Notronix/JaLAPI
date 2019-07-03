package com.notronix.lw.methods.inventory;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.StockItemDescription;

import java.util.List;

import static java.util.Objects.requireNonNull;

public class CreateInventoryItemDescriptionsMethod extends InventoryMethod<List<StockItemDescription>>
{
    private List<StockItemDescription> inventoryItemDescriptions;

    @Override
    public String getName() {
        return "CreateInventoryItemDescriptions";
    }

    @Override
    public String getPayload() {
        return "inventoryItemDescriptions=" + new Gson().toJson(requireNonNull(inventoryItemDescriptions));
    }

    @Override
    public List<StockItemDescription> getResponse() throws LinnworksAPIException {
        return inventoryItemDescriptions;
    }

    public List<StockItemDescription> getInventoryItemDescriptions() {
        return inventoryItemDescriptions;
    }

    public void setInventoryItemDescriptions(List<StockItemDescription> inventoryItemDescriptions) {
        this.inventoryItemDescriptions = inventoryItemDescriptions;
    }

    public CreateInventoryItemDescriptionsMethod withInventoryItemDescriptions(List<StockItemDescription> inventoryItemDescriptions) {
        this.inventoryItemDescriptions = inventoryItemDescriptions;
        return this;
    }
}
