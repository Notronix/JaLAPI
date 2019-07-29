package com.notronix.lw.impl.method.inventory;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.List;
import java.util.UUID;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class DeleteInventoryItemChannelSKUsMethod extends AbstractLinnworksAPIMethod<Void>
{
    private List<UUID> inventoryItemChannelSKUIds;

    @Override
    public String getURI() {
        return "Inventory/DeleteInventoryItemChannelSKUs";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        return urlEncode("inventoryItemChannelSKUIds", gson.toJson(requireNonNull(inventoryItemChannelSKUIds)));
    }

    @Override
    public Void getResponse(Gson gson, String jsonPayload) {
        return null;
    }

    public List<UUID> getInventoryItemChannelSKUIds() {
        return inventoryItemChannelSKUIds;
    }

    public void setInventoryItemChannelSKUIds(List<UUID> inventoryItemChannelSKUIds) {
        this.inventoryItemChannelSKUIds = inventoryItemChannelSKUIds;
    }

    public DeleteInventoryItemChannelSKUsMethod withInventoryItemChannelSKUIds(List<UUID> inventoryItemChannelSKUIds) {
        this.inventoryItemChannelSKUIds = inventoryItemChannelSKUIds;
        return this;
    }
}
