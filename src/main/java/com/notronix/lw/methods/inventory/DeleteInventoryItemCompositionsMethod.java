package com.notronix.lw.methods.inventory;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;

import java.util.List;

public class DeleteInventoryItemCompositionsMethod extends InventoryMethod<Boolean>
{
    private String stockItemId;
    private List<String> inventoryItemCompositionIds;

    @Override
    public String getName() {
        return "DeleteInventoryItemCompositions";
    }

    @Override
    public String getPayload() {
        return "stockItemId=" + stockItemId
                + "&inventoryItemCompositionIds=" + new Gson().toJson(inventoryItemCompositionIds);
    }

    @Override
    public Boolean getResponse() throws LinnworksAPIException {
        return Boolean.TRUE;
    }

    public String getStockItemId() {
        return stockItemId;
    }

    public void setStockItemId(String stockItemId) {
        this.stockItemId = stockItemId;
    }

    public DeleteInventoryItemCompositionsMethod withStockItemId(String stockItemId) {
        this.stockItemId = stockItemId;
        return this;
    }

    public List<String> getInventoryItemCompositionIds() {
        return inventoryItemCompositionIds;
    }

    public void setInventoryItemCompositionIds(List<String> inventoryItemCompositionIds) {
        this.inventoryItemCompositionIds = inventoryItemCompositionIds;
    }

    public DeleteInventoryItemCompositionsMethod withInventoryItemCompositionIds(List<String> inventoryItemCompositionIds) {
        this.inventoryItemCompositionIds = inventoryItemCompositionIds;
        return this;
    }
}
