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

public class DeleteInventoryItemExtendedPropertiesMethod extends AbstractLinnworksAPIMethod<Void>
{
    private UUID inventoryItemId;
    private List<UUID> inventoryItemExtendedPropertyIds;

    @Override
    public String getURI() {
        return "Inventory/DeleteInventoryItemExtendedProperties";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        Map<String, Object> params = new HashMap<>();
        params.put("inventoryItemId", requireNonNull(inventoryItemId));
        params.put("inventoryItemExtendedPropertyIds", gson.toJson(requireNonNull(inventoryItemExtendedPropertyIds)));

        return new UrlEncodedContent(params);
    }

    @Override
    public Void getResponse(Gson gson, String jsonPayload) {
        return null;
    }

    public UUID getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(UUID inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public DeleteInventoryItemExtendedPropertiesMethod withInventoryItemId(UUID inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
        return this;
    }

    public List<UUID> getInventoryItemExtendedPropertyIds() {
        return inventoryItemExtendedPropertyIds;
    }

    public void setInventoryItemExtendedPropertyIds(List<UUID> inventoryItemExtendedPropertyIds) {
        this.inventoryItemExtendedPropertyIds = inventoryItemExtendedPropertyIds;
    }

    public DeleteInventoryItemExtendedPropertiesMethod withInventoryItemExtendedPropertyIds(List<UUID> inventoryItemExtendedPropertyIds) {
        this.inventoryItemExtendedPropertyIds = inventoryItemExtendedPropertyIds;
        return this;
    }
}
