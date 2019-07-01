package com.notronix.lw.model;

public class StockItemTitle
{
    private String pkRowId;
    private String StockItemId;
    private String Source;
    private String SubSource;
    private String Title;

    public String getPkRowId() {
        return pkRowId;
    }

    public void setPkRowId(String pkRowId) {
        this.pkRowId = pkRowId;
    }

    public String getStockItemId() {
        return StockItemId;
    }

    public void setStockItemId(String stockItemId) {
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

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }
}
