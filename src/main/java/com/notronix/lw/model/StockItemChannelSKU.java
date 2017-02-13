package com.notronix.lw.model;

public class StockItemChannelSKU
{
    private String StockItemId;
    private String ChannelSKURowId;
    private String ChannelReferenceId;
    private String SKU;
    private String Source;
    private String SubSource;
    private Integer SubmittedQuantity;
    private Integer ListedQuantity;
    private Integer MaxListedQuantity;
    private String UpdateStatus;
    private String LastUpdate;

    public String getStockItemId()
    {
        return StockItemId;
    }

    public void setStockItemId(String stockItemId)
    {
        StockItemId = stockItemId;
    }

    public String getChannelSKURowId()
    {
        return ChannelSKURowId;
    }

    public void setChannelSKURowId(String channelSKURowId)
    {
        ChannelSKURowId = channelSKURowId;
    }

    public String getChannelReferenceId()
    {
        return ChannelReferenceId;
    }

    public void setChannelReferenceId(String channelReferenceId)
    {
        ChannelReferenceId = channelReferenceId;
    }

    public String getSKU()
    {
        return SKU;
    }

    public void setSKU(String SKU)
    {
        this.SKU = SKU;
    }

    public String getSource()
    {
        return Source;
    }

    public void setSource(String source)
    {
        Source = source;
    }

    public String getSubSource()
    {
        return SubSource;
    }

    public void setSubSource(String subSource)
    {
        SubSource = subSource;
    }

    public Integer getSubmittedQuantity()
    {
        return SubmittedQuantity;
    }

    public void setSubmittedQuantity(Integer submittedQuantity)
    {
        SubmittedQuantity = submittedQuantity;
    }

    public Integer getListedQuantity()
    {
        return ListedQuantity;
    }

    public void setListedQuantity(Integer listedQuantity)
    {
        ListedQuantity = listedQuantity;
    }

    public Integer getMaxListedQuantity()
    {
        return MaxListedQuantity;
    }

    public void setMaxListedQuantity(Integer maxListedQuantity)
    {
        MaxListedQuantity = maxListedQuantity;
    }

    public String getUpdateStatus()
    {
        return UpdateStatus;
    }

    public void setUpdateStatus(String updateStatus)
    {
        UpdateStatus = updateStatus;
    }

    public String getLastUpdate()
    {
        return LastUpdate;
    }

    public void setLastUpdate(String lastUpdate)
    {
        LastUpdate = lastUpdate;
    }
}
