package com.notronix.lw.model;

import java.util.List;

public class ConfigChannelLocation
{
    private Integer pkChannelLocationId;
    private Boolean Deleted;
    private String Identifier;
    private String Name;
    private String OrderDownloadLocation;
    private List<String> InventorySyncLocations;
    private Boolean IsFulfilment;

    public Integer getPkChannelLocationId() {
        return pkChannelLocationId;
    }

    public void setPkChannelLocationId(Integer pkChannelLocationId) {
        this.pkChannelLocationId = pkChannelLocationId;
    }

    public Boolean getDeleted() {
        return Deleted;
    }

    public void setDeleted(Boolean deleted) {
        Deleted = deleted;
    }

    public String getIdentifier() {
        return Identifier;
    }

    public void setIdentifier(String identifier) {
        Identifier = identifier;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getOrderDownloadLocation() {
        return OrderDownloadLocation;
    }

    public void setOrderDownloadLocation(String orderDownloadLocation) {
        OrderDownloadLocation = orderDownloadLocation;
    }

    public List<String> getInventorySyncLocations() {
        return InventorySyncLocations;
    }

    public void setInventorySyncLocations(List<String> inventorySyncLocations) {
        InventorySyncLocations = inventorySyncLocations;
    }

    public Boolean getFulfilment() {
        return IsFulfilment;
    }

    public void setFulfilment(Boolean fulfilment) {
        IsFulfilment = fulfilment;
    }
}
