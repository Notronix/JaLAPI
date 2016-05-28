package com.notronix.lw.model;

public class ChannelTemplate
{
    private boolean IsErrorMsg;
    private String Status;
    private String CreatedDate;
    private String InventoryItemId;
    private String Source;
    private String SubSource;
    private String CombinedSource;

    public boolean isErrorMsg()
    {
        return IsErrorMsg;
    }

    public void setIsErrorMsg(boolean isErrorMsg)
    {
        IsErrorMsg = isErrorMsg;
    }

    public String getStatus()
    {
        return Status;
    }

    public void setStatus(String status)
    {
        Status = status;
    }

    public String getCreatedDate()
    {
        return CreatedDate;
    }

    public void setCreatedDate(String createdDate)
    {
        CreatedDate = createdDate;
    }

    public String getInventoryItemId()
    {
        return InventoryItemId;
    }

    public void setInventoryItemId(String inventoryItemId)
    {
        InventoryItemId = inventoryItemId;
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

    public String getCombinedSource()
    {
        return CombinedSource;
    }

    public void setCombinedSource(String combinedSource)
    {
        CombinedSource = combinedSource;
    }
}
