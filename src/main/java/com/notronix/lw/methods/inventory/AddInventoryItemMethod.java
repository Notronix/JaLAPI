package com.notronix.lw.methods.inventory;

import com.google.gson.GsonBuilder;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.StockItemInv;

import java.util.UUID;

import static java.util.Objects.requireNonNull;

public class AddInventoryItemMethod extends InventoryMethod<String>
{
    private StockItemInv stockItem;

    @Override
    public String getName() {
        return "AddInventoryItem";
    }

    @Override
    public String getPayload() {
        requireNonNull(stockItem).setStockItemId(UUID.randomUUID().toString());

        return "inventoryItem=" + new GsonBuilder().create().toJson(stockItem);
    }

    @Override
    public String getResponse() throws LinnworksAPIException {
        return stockItem.getStockItemId();
    }

    public StockItemInv getStockItem() {
        return stockItem;
    }

    public void setStockItem(StockItemInv stockItem) {
        this.stockItem = stockItem;
    }

    public AddInventoryItemMethod withStockItem(StockItemInv stockItem) {
        this.stockItem = stockItem;
        return this;
    }
}
