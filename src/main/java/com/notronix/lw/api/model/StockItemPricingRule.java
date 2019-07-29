package com.notronix.lw.api.model;

import java.util.UUID;

public class StockItemPricingRule {
    private Integer pkRowId;
    private UUID fkStockPricingId;
    private String Type;
    private Integer LowerBound;
    private Double Value;

    public Integer getPkRowId() {
        return pkRowId;
    }

    public void setPkRowId(Integer pkRowId) {
        this.pkRowId = pkRowId;
    }

    public UUID getFkStockPricingId() {
        return fkStockPricingId;
    }

    public void setFkStockPricingId(UUID fkStockPricingId) {
        this.fkStockPricingId = fkStockPricingId;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public Integer getLowerBound() {
        return LowerBound;
    }

    public void setLowerBound(Integer lowerBound) {
        LowerBound = lowerBound;
    }

    public Double getValue() {
        return Value;
    }

    public void setValue(Double value) {
        Value = value;
    }
}
