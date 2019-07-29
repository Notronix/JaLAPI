package com.notronix.lw.impl.method.inventory;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.List;
import java.util.UUID;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class DeleteInventoryItemTitlesMethod extends AbstractLinnworksAPIMethod<Void>
{
    private List<UUID> inventoryItemTitleIds;

    @Override
    public String getURI() {
        return "Inventory/DeleteInventoryItemTitles";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        return urlEncode("inventoryItemTitleIds", gson.toJson(requireNonNull(inventoryItemTitleIds)));
    }

    @Override
    public Void getResponse(Gson gson, String jsonPayload) {
        return null;
    }

    public List<UUID> getInventoryItemTitleIds() {
        return inventoryItemTitleIds;
    }

    public void setInventoryItemTitleIds(List<UUID> inventoryItemTitleIds) {
        this.inventoryItemTitleIds = inventoryItemTitleIds;
    }

    public DeleteInventoryItemTitlesMethod withInventoryItemTitleIds(List<UUID> inventoryItemTitleIds) {
        this.inventoryItemTitleIds = inventoryItemTitleIds;
        return this;
    }
}
