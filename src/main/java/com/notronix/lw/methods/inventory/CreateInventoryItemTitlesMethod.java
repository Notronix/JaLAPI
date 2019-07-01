package com.notronix.lw.methods.inventory;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.StockItemTitle;

import java.util.List;

import static java.util.Objects.requireNonNull;

public class CreateInventoryItemTitlesMethod extends InventoryMethod<List<StockItemTitle>>
{
    private List<StockItemTitle> inventoryItemTitles;

    @Override
    public String getName() {
        return "CreateInventoryItemTitles";
    }

    @Override
    public String getPayload() {
        return "inventoryItemTitles=" + new Gson().toJson(requireNonNull(inventoryItemTitles));
    }

    @Override
    public List<StockItemTitle> getResponse() throws LinnworksAPIException {
        return inventoryItemTitles;
    }

    public List<StockItemTitle> getInventoryItemTitles() {
        return inventoryItemTitles;
    }

    public void setInventoryItemTitles(List<StockItemTitle> inventoryItemTitles) {
        this.inventoryItemTitles = inventoryItemTitles;
    }

    public CreateInventoryItemTitlesMethod withInventoryItemTitles(List<StockItemTitle> inventoryItemTitles) {
        this.inventoryItemTitles = inventoryItemTitles;
        return this;
    }
}
