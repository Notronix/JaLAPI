package com.notronix.lw.impl.method.stock;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.StockItemLevel;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class GetStockLevelMethod extends AbstractLinnworksAPIMethod<List<StockItemLevel>>
{
    private UUID stockItemId;

    @Override
    public String getURI() {
        return "Stock/GetStockLevel";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        return urlEncode("stockItemId", requireNonNull(stockItemId));
    }

    @Override
    public List<StockItemLevel> getResponse(Gson gson, String jsonPayload) {
        return Arrays.asList(gson.fromJson(jsonPayload, StockItemLevel[].class));
    }

    public UUID getStockItemId() {
        return stockItemId;
    }

    public void setStockItemId(UUID stockItemId) {
        this.stockItemId = stockItemId;
    }

    public GetStockLevelMethod withStockItemId(UUID stockItemId) {
        this.stockItemId = stockItemId;
        return this;
    }
}
