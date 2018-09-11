package com.notronix.lw.methods.inventory;

import com.google.gson.GsonBuilder;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.StockItemInv;

public class UpdateInventoryItemMethod extends InventoryMethod<StockItemInv>
{
    private StockItemInv stockItem;

    @Override
    public String getName() {
        return "UpdateInventoryItem";
    }

    @Override
    public String getPayload() {
        return "inventoryItem=" + new GsonBuilder().create().toJson(stockItem);
    }

    @Override
    public StockItemInv getResponse() throws LinnworksAPIException {
        return stockItem;
    }

    public StockItemInv getStockItem() {
        return stockItem;
    }

    public void setStockItem(StockItemInv stockItem) {
        this.stockItem = stockItem;
    }

    public UpdateInventoryItemMethod withStockItem(StockItemInv stockItem) {
        this.stockItem = stockItem;
        return this;
    }
}
