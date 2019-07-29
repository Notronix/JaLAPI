package com.notronix.lw.impl.method.inventory;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.StockItemPrice;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class GetInventoryItemPricesMethod extends AbstractLinnworksAPIMethod<List<StockItemPrice>>
{
    private UUID inventoryItemId;

    @Override
    public String getURI() {
        return "Inventory/GetInventoryItemPrices";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        return urlEncode("inventoryItemId", requireNonNull(inventoryItemId));
    }

    @Override
    public List<StockItemPrice> getResponse(Gson gson, String jsonPayload) {
        return Arrays.asList(gson.fromJson(jsonPayload, StockItemPrice[].class));
    }

    public UUID getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(UUID inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public GetInventoryItemPricesMethod withInventoryItemId(UUID inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
        return this;
    }
}
