package com.notronix.lw.api.model;

import java.util.UUID;

public class ChannelItem
{
    private UUID pkRowId;
    private UUID StockItemId;
    private String Source;
    private String SubSource;

    public UUID getPkRowId() {
        return pkRowId;
    }

    public void setPkRowId(UUID pkRowId) {
        this.pkRowId = pkRowId;
    }

    public UUID getStockItemId() {
        return StockItemId;
    }

    public void setStockItemId(UUID stockItemId) {
        StockItemId = stockItemId;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    public String getSubSource() {
        return SubSource;
    }

    public void setSubSource(String subSource) {
        SubSource = subSource;
    }
}
