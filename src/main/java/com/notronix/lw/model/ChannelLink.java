package com.notronix.lw.model;

public class ChannelLink
{
    private Object ChannelLinks;
    private String InventoryItemId;
    private String Source;
    private String SubSource;
    private String CombinedSource;

    public Object getChannelLinks()
    {
        return ChannelLinks;
    }

    public void setChannelLinks(Object channelLinks)
    {
        ChannelLinks = channelLinks;
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
