package com.notronix.lw.impl.method.inventory;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.List;
import java.util.UUID;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class DeleteInventoryItemsMethod extends AbstractLinnworksAPIMethod<Void>
{
    private List<UUID> inventoryItemIds;

    @Override
    public String getURI() {
        return "Inventory/DeleteInventoryItems";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        return urlEncode("inventoryItemIds", gson.toJson(requireNonNull(inventoryItemIds)));
    }

    @Override
    public Void getResponse(Gson gson, String jsonPayload) {
        return null;
    }

    public List<UUID> getInventoryItemIds() {
        return inventoryItemIds;
    }

    public void setInventoryItemIds(List<UUID> inventoryItemIds) {
        this.inventoryItemIds = inventoryItemIds;
    }

    public DeleteInventoryItemsMethod withInventoryItemIds(List<UUID> inventoryItemIds) {
        this.inventoryItemIds = inventoryItemIds;
        return this;
    }
}
