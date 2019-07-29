package com.notronix.lw.impl.method.inventory;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.List;
import java.util.UUID;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class DeleteInventoryItemPricesMethod extends AbstractLinnworksAPIMethod<Void>
{
    private List<UUID> inventoryItemPriceIds;

    @Override
    public String getURI() {
        return "Inventory/DeleteInventoryItemPrices";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        return urlEncode("inventoryItemPriceIds", gson.toJson(requireNonNull(inventoryItemPriceIds)));
    }

    @Override
    public Void getResponse(Gson gson, String jsonPayload) {
        return null;
    }

    public List<UUID> getInventoryItemPriceIds() {
        return inventoryItemPriceIds;
    }

    public void setInventoryItemPriceIds(List<UUID> inventoryItemPriceIds) {
        this.inventoryItemPriceIds = inventoryItemPriceIds;
    }

    public DeleteInventoryItemPricesMethod withInventoryItemPriceIds(List<UUID> inventoryItemPriceIds) {
        this.inventoryItemPriceIds = inventoryItemPriceIds;
        return this;
    }
}
