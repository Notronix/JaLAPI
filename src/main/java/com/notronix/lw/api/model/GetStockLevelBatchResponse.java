package com.notronix.lw.api.model;

import java.util.List;

public class GetStockLevelBatchResponse
{
    private String pkStockItemId;
    private List<StockItemLevel> StockItemLevels;

    public String getPkStockItemId() {
        return pkStockItemId;
    }

    public void setPkStockItemId(String pkStockItemId) {
        this.pkStockItemId = pkStockItemId;
    }

    public List<StockItemLevel> getStockItemLevels() {
        return StockItemLevels;
    }

    public void setStockItemLevels(List<StockItemLevel> stockItemLevels) {
        StockItemLevels = stockItemLevels;
    }
}
