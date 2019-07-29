package com.notronix.lw.api.model;

import java.util.UUID;

public class StockLevelUpdate
{
    private String SKU;
    private UUID LocationId;
    private Integer Level;

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public UUID getLocationId() {
        return LocationId;
    }

    public void setLocationId(UUID locationId) {
        LocationId = locationId;
    }

    public Integer getLevel() {
        return Level;
    }

    public void setLevel(Integer level) {
        Level = level;
    }
}
