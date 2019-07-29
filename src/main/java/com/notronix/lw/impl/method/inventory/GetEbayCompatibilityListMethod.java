package com.notronix.lw.impl.method.inventory;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.StockItemEbayCompatibility;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class GetEbayCompatibilityListMethod extends AbstractLinnworksAPIMethod<List<StockItemEbayCompatibility>>
{
    private UUID stockItemId;

    @Override
    public String getURI() {
        return "Inventory/GetEbayCompatibilityList";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        return urlEncode("stockItemId", requireNonNull(stockItemId));
    }

    @Override
    public List<StockItemEbayCompatibility> getResponse(Gson gson, String jsonPayload) {
        return Arrays.asList(gson.fromJson(jsonPayload, StockItemEbayCompatibility[].class));
    }

    public UUID getStockItemId() {
        return stockItemId;
    }

    public void setStockItemId(UUID stockItemId) {
        this.stockItemId = stockItemId;
    }

    public GetEbayCompatibilityListMethod withStockItemId(UUID stockItemId) {
        this.stockItemId = stockItemId;
        return this;
    }
}
