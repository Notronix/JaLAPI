package com.notronix.lw.methods.inventory;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.StockItemPrice;

import java.util.List;

import static java.util.Objects.requireNonNull;

public class CreateInventoryItemPricesMethod extends InventoryMethod<List<StockItemPrice>>
{
    private List<StockItemPrice> inventoryItemPrices;

    @Override
    public String getName() {
        return "CreateInventoryItemPrices";
    }

    @Override
    public String getPayload() {
        return "inventoryItemPrices=" + new Gson().toJson(requireNonNull(inventoryItemPrices));
    }

    @Override
    public List<StockItemPrice> getResponse() throws LinnworksAPIException {
        return inventoryItemPrices;
    }

    public List<StockItemPrice> getInventoryItemPrices() {
        return inventoryItemPrices;
    }

    public void setInventoryItemPrices(List<StockItemPrice> inventoryItemPrices) {
        this.inventoryItemPrices = inventoryItemPrices;
    }

    public CreateInventoryItemPricesMethod withInventoryItemPrices(List<StockItemPrice> inventoryItemPrices) {
        this.inventoryItemPrices = inventoryItemPrices;
        return this;
    }
}
