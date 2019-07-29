package com.notronix.lw.impl.method.inventory;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.List;
import java.util.UUID;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class DeleteInventoryItemDescriptionsMethod extends AbstractLinnworksAPIMethod<Void>
{
    private List<UUID> inventoryItemDescriptionIds;

    @Override
    public String getURI() {
        return "Inventory/DeleteInventoryItemDescriptions";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        return urlEncode("inventoryItemDescriptionIds", gson.toJson(requireNonNull(inventoryItemDescriptionIds)));
    }

    @Override
    public Void getResponse(Gson gson, String jsonPayload) {
        return null;
    }

    public List<UUID> getInventoryItemDescriptionIds() {
        return inventoryItemDescriptionIds;
    }

    public void setInventoryItemDescriptionIds(List<UUID> inventoryItemDescriptionIds) {
        this.inventoryItemDescriptionIds = inventoryItemDescriptionIds;
    }

    public DeleteInventoryItemDescriptionsMethod withInventoryItemDescriptionIds(List<UUID> inventoryItemDescriptionIds) {
        this.inventoryItemDescriptionIds = inventoryItemDescriptionIds;
        return this;
    }
}
