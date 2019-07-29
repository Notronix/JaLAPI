package com.notronix.lw.impl.method.inventory;

import com.google.api.client.http.HttpContent;
import com.google.api.client.http.UrlEncodedContent;
import com.google.gson.Gson;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import static java.util.Objects.requireNonNull;

public class DeleteInventoryItemCompositionsMethod extends AbstractLinnworksAPIMethod<Void>
{
    private UUID stockItemId;
    private List<UUID> inventoryItemCompositionIds;

    @Override
    public String getURI() {
        return "Inventory/DeleteInventoryItemCompositions";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        Map<String, Object> params = new HashMap<>();
        params.put("stockItemId", requireNonNull(stockItemId));
        params.put("inventoryItemCompositionIds", gson.toJson(requireNonNull(inventoryItemCompositionIds)));

        return new UrlEncodedContent(params);
    }

    @Override
    public Void getResponse(Gson gson, String jsonPayload) {
        return null;
    }

    public UUID getStockItemId() {
        return stockItemId;
    }

    public void setStockItemId(UUID stockItemId) {
        this.stockItemId = stockItemId;
    }

    public DeleteInventoryItemCompositionsMethod withStockItemId(UUID stockItemId) {
        this.stockItemId = stockItemId;
        return this;
    }

    public List<UUID> getInventoryItemCompositionIds() {
        return inventoryItemCompositionIds;
    }

    public void setInventoryItemCompositionIds(List<UUID> inventoryItemCompositionIds) {
        this.inventoryItemCompositionIds = inventoryItemCompositionIds;
    }

    public DeleteInventoryItemCompositionsMethod withInventoryItemCompositionIds(List<UUID> inventoryItemCompositionIds) {
        this.inventoryItemCompositionIds = inventoryItemCompositionIds;
        return this;
    }
}
