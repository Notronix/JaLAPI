package com.notronix.lw.api.model;

import java.util.UUID;

public class StockLocation
{
    private UUID StockLocationId;
    private String LocationName;
    private Boolean IsFulfillmentCenter;
    private String LocationTag;
    private String BinRack;
    private Boolean IsWarehouseManaged;

    public UUID getStockLocationId() {
        return StockLocationId;
    }

    public void setStockLocationId(UUID stockLocationId) {
        StockLocationId = stockLocationId;
    }

    public String getLocationName() {
        return LocationName;
    }

    public void setLocationName(String locationName) {
        LocationName = locationName;
    }

    public Boolean getFulfillmentCenter() {
        return IsFulfillmentCenter;
    }

    public void setFulfillmentCenter(Boolean fulfillmentCenter) {
        IsFulfillmentCenter = fulfillmentCenter;
    }

    public String getLocationTag() {
        return LocationTag;
    }

    public void setLocationTag(String locationTag) {
        LocationTag = locationTag;
    }

    public String getBinRack() {
        return BinRack;
    }

    public void setBinRack(String binRack) {
        BinRack = binRack;
    }

    public Boolean getWarehouseManaged() {
        return IsWarehouseManaged;
    }

    public void setWarehouseManaged(Boolean warehouseManaged) {
        IsWarehouseManaged = warehouseManaged;
    }
}
