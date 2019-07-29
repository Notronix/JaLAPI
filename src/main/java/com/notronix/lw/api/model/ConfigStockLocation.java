package com.notronix.lw.api.model;

import java.util.UUID;

public class ConfigStockLocation
{
    private UUID pkStockLocationId;
    private Boolean Deleted;
    private Integer fkChannelLocationId;

    public UUID getPkStockLocationId() {
        return pkStockLocationId;
    }

    public void setPkStockLocationId(UUID pkStockLocationId) {
        this.pkStockLocationId = pkStockLocationId;
    }

    public Boolean getDeleted() {
        return Deleted;
    }

    public void setDeleted(Boolean deleted) {
        Deleted = deleted;
    }

    public Integer getFkChannelLocationId() {
        return fkChannelLocationId;
    }

    public void setFkChannelLocationId(Integer fkChannelLocationId) {
        this.fkChannelLocationId = fkChannelLocationId;
    }
}
