package com.notronix.lw.api.model;

import java.util.UUID;

public class VariationItem
{
    private UUID pkRowId;
    private UUID pkStockItemId;
    private String ItemNumber;
    private String ItemTitle;

    public UUID getPkRowId() {
        return pkRowId;
    }

    public void setPkRowId(UUID pkRowId) {
        this.pkRowId = pkRowId;
    }

    public UUID getPkStockItemId() {
        return pkStockItemId;
    }

    public void setPkStockItemId(UUID pkStockItemId) {
        this.pkStockItemId = pkStockItemId;
    }

    public String getItemNumber() {
        return ItemNumber;
    }

    public void setItemNumber(String itemNumber) {
        ItemNumber = itemNumber;
    }

    public String getItemTitle() {
        return ItemTitle;
    }

    public void setItemTitle(String itemTitle) {
        ItemTitle = itemTitle;
    }
}
