package com.notronix.lw.impl.method.inventory;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.StockItemInv;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class UpdateInventoryItemMethod extends AbstractLinnworksAPIMethod<Void>
{
    private StockItemInv inventoryItem;

    @Override
    public String getURI() {
        return "Inventory/UpdateInventoryItem";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        return urlEncode("inventoryItem", gson.toJson(requireNonNull(inventoryItem)));
    }

    @Override
    public Void getResponse(Gson gson, String jsonPayload) {
        return null;
    }

    public StockItemInv getInventoryItem() {
        return inventoryItem;
    }

    public void setInventoryItem(StockItemInv inventoryItem) {
        this.inventoryItem = inventoryItem;
    }

    public UpdateInventoryItemMethod withInventoryItem(StockItemInv inventoryItem) {
        this.inventoryItem = inventoryItem;
        return this;
    }
}
