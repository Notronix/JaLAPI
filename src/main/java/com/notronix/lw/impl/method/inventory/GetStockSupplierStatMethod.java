package com.notronix.lw.impl.method.inventory;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.StockItemSupplierStat;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class GetStockSupplierStatMethod extends AbstractLinnworksAPIMethod<List<StockItemSupplierStat>>
{
    private UUID inventoryItemId;

    @Override
    public String getURI() {
        return "Inventory/GetStockSupplierStat";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        return urlEncode("inventoryItemId", requireNonNull(inventoryItemId));
    }

    @Override
    public List<StockItemSupplierStat> getResponse(Gson gson, String jsonPayload) {
        return Arrays.asList(gson.fromJson(jsonPayload, StockItemSupplierStat[].class));
    }

    public UUID getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(UUID inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public GetStockSupplierStatMethod withInventoryItemId(UUID inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
        return this;
    }
}
