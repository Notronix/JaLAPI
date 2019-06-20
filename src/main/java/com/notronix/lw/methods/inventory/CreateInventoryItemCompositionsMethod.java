package com.notronix.lw.methods.inventory;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.StockItemComposition;

import java.util.List;

public class CreateInventoryItemCompositionsMethod extends InventoryMethod<List<StockItemComposition>>
{
    private List<StockItemComposition> inventoryItemCompositions;

    @Override
    public String getName() {
        return "CreateInventoryItemCompositions";
    }

    @Override
    public String getPayload() {
        return "inventoryItemCompositions=" + new Gson().toJson(inventoryItemCompositions);
    }

    @Override
    public List<StockItemComposition> getResponse() throws LinnworksAPIException {
        return inventoryItemCompositions;
    }

    public List<StockItemComposition> getInventoryItemCompositions() {
        return inventoryItemCompositions;
    }

    public void setInventoryItemCompositions(List<StockItemComposition> inventoryItemCompositions) {
        this.inventoryItemCompositions = inventoryItemCompositions;
    }

    public CreateInventoryItemCompositionsMethod withInventoryItemCompositions(List<StockItemComposition> inventoryItemCompositions) {
        this.inventoryItemCompositions = inventoryItemCompositions;
        return this;
    }
}
