package com.notronix.lw.impl.method.inventory;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.StockItemDescription;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class GetInventoryItemDescriptionsMethod extends AbstractLinnworksAPIMethod<List<StockItemDescription>>
{
    private UUID inventoryItemId;

    @Override
    public String getURI() {
        return "Inventory/GetInventoryItemDescriptions";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        return urlEncode("inventoryItemId", requireNonNull(inventoryItemId));
    }

    @Override
    public List<StockItemDescription> getResponse(Gson gson, String jsonPayload) {
        return Arrays.asList(gson.fromJson(jsonPayload, StockItemDescription[].class));
    }

    public UUID getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(UUID inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public GetInventoryItemDescriptionsMethod withInventoryItemId(UUID inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
        return this;
    }
}
