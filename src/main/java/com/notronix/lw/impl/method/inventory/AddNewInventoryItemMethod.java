package com.notronix.lw.impl.method.inventory;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.StockItem;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class AddNewInventoryItemMethod extends AbstractLinnworksAPIMethod<Void>
{
    private StockItem inventoryItem;

    @Override
    public String getURI() {
        return "Inventory/AddInventoryItem";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        return urlEncode("inventoryItem", gson.toJson(requireNonNull(inventoryItem)));
    }

    @Override
    public Void getResponse(Gson gson, String jsonPayload) {
        return null;
    }

    public StockItem getInventoryItem() {
        return inventoryItem;
    }

    public void setInventoryItem(StockItem inventoryItem) {
        this.inventoryItem = inventoryItem;
    }

    public AddNewInventoryItemMethod withInventoryItem(StockItem inventoryItem) {
        this.inventoryItem = inventoryItem;
        return this;
    }
}
