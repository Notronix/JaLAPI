package com.notronix.lw.model;

public class StockLevelUpdate
{
    private String SKU;
    private String LocationId;
    private Integer Level;

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public String getLocationId() {
        return LocationId;
    }

    public void setLocationId(String locationId) {
        LocationId = locationId;
    }

    public Integer getLevel() {
        return Level;
    }

    public void setLevel(Integer level) {
        Level = level;
    }
}
