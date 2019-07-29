package com.notronix.lw.impl.method.inventory;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.StockItemChannelSKU;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class GetInventoryItemChannelSKUsMethod extends AbstractLinnworksAPIMethod<List<StockItemChannelSKU>>
{
    private UUID inventoryItemId;

    @Override
    public String getURI() {
        return "Inventory/GetInventoryItemChannelSKUs";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        return urlEncode("inventoryItemId", requireNonNull(inventoryItemId));
    }

    @Override
    public List<StockItemChannelSKU> getResponse(Gson gson, String jsonPayload) {
        return Arrays.asList(gson.fromJson(jsonPayload, StockItemChannelSKU[].class));
    }

    public UUID getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(UUID inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public GetInventoryItemChannelSKUsMethod withInventoryItemId(UUID inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
        return this;
    }
}
