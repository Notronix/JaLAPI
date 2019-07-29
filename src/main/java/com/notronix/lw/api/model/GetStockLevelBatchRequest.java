package com.notronix.lw.api.model;

import java.util.List;
import java.util.UUID;

public class GetStockLevelBatchRequest
{
    private List<UUID> StockItemIds;

    public List<UUID> getStockItemIds() {
        return StockItemIds;
    }

    public void setStockItemIds(List<UUID> stockItemIds) {
        StockItemIds = stockItemIds;
    }

    public GetStockLevelBatchRequest withStockItemIds(List<UUID> stockItemIds) {
        StockItemIds = stockItemIds;
        return this;
    }
}
