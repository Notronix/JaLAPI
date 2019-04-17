package com.notronix.lw.model;

import java.util.List;

public class GetStockLevelBatchRequest
{
    private List<String> StockItemIds;

    public List<String> getStockItemIds() {
        return StockItemIds;
    }

    public void setStockItemIds(List<String> stockItemIds) {
        StockItemIds = stockItemIds;
    }

    public GetStockLevelBatchRequest withStockItemIds(List<String> stockItemIds) {
        StockItemIds = stockItemIds;
        return this;
    }
}
