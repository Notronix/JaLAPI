package com.notronix.lw.model;

public class StockLocation
{
    private String StockLocationId;
    private String LocationName;
    private Boolean IsFulfillmentCenter;
    private String LocationTag;
    private String BinRack;

    public String getStockLocationId()
    {
        return StockLocationId;
    }

    public void setStockLocationId(String stockLocationId)
    {
        StockLocationId = stockLocationId;
    }

    public String getLocationName()
    {
        return LocationName;
    }

    public void setLocationName(String locationName)
    {
        LocationName = locationName;
    }

    public Boolean getFulfillmentCenter()
    {
        return IsFulfillmentCenter;
    }

    public void setFulfillmentCenter(Boolean fulfillmentCenter)
    {
        IsFulfillmentCenter = fulfillmentCenter;
    }

    public String getLocationTag()
    {
        return LocationTag;
    }

    public void setLocationTag(String locationTag)
    {
        LocationTag = locationTag;
    }

    public String getBinRack() {
        return BinRack;
    }

    public void setBinRack(String binRack) {
        BinRack = binRack;
    }
}
