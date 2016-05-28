package com.notronix.lw.model;

public class StockItemImage
{
    private String pkRowId;
    private String StockItemId;
    private String Source;
    private Boolean IsMain;

    public String getPkRowId()
    {
        return pkRowId;
    }

    public void setPkRowId(String pkRowId)
    {
        this.pkRowId = pkRowId;
    }

    public String getStockItemId()
    {
        return StockItemId;
    }

    public void setStockItemId(String stockItemId)
    {
        StockItemId = stockItemId;
    }

    public String getSource()
    {
        return Source;
    }

    public void setSource(String source)
    {
        Source = source;
    }

    public Boolean getMain()
    {
        return IsMain;
    }

    public void setMain(Boolean main)
    {
        IsMain = main;
    }
}
