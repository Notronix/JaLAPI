package com.notronix.lw.api.model;

import java.util.List;
import java.util.UUID;

public class ConfigChannelLocation
{
    private Integer pkChannelLocationId;
    private Boolean Deleted;
    private String Identifier;
    private String Name;
    private UUID OrderDownloadLocation;
    private List<UUID> InventorySyncLocations;
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

    public UUID getOrderDownloadLocation() {
        return OrderDownloadLocation;
    }

    public void setOrderDownloadLocation(UUID orderDownloadLocation) {
        OrderDownloadLocation = orderDownloadLocation;
    }

    public List<UUID> getInventorySyncLocations() {
        return InventorySyncLocations;
    }

    public void setInventorySyncLocations(List<UUID> inventorySyncLocations) {
        InventorySyncLocations = inventorySyncLocations;
    }

    public Boolean getFulfilment() {
        return IsFulfilment;
    }

    public void setFulfilment(Boolean fulfilment) {
        IsFulfilment = fulfilment;
    }
}
