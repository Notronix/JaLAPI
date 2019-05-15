package com.notronix.lw.model;

public class VariationItem
{
    private String pkRowId;
    private String pkStockItemId;
    private String ItemNumber;
    private String ItemTitle;

    public String getPkRowId() {
        return pkRowId;
    }

    public void setPkRowId(String pkRowId) {
        this.pkRowId = pkRowId;
    }

    public String getPkStockItemId() {
        return pkStockItemId;
    }

    public void setPkStockItemId(String pkStockItemId) {
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
