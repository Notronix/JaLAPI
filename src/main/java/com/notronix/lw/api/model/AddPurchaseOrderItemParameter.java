package com.notronix.lw.api.model;

import java.util.UUID;

public class AddPurchaseOrderItemParameter
{
    private UUID pkPurchaseId;
    private UUID fkStockItemId;
    private Integer Qty;
    private Integer PackQuantity;
    private Integer PackSize;
    private Double Cost;
    private Double TaxRate;

    public UUID getPkPurchaseId() {
        return pkPurchaseId;
    }

    public void setPkPurchaseId(UUID pkPurchaseId) {
        this.pkPurchaseId = pkPurchaseId;
    }

    public UUID getFkStockItemId() {
        return fkStockItemId;
    }

    public void setFkStockItemId(UUID fkStockItemId) {
        this.fkStockItemId = fkStockItemId;
    }

    public Integer getQty() {
        return Qty;
    }

    public void setQty(Integer qty) {
        Qty = qty;
    }

    public Integer getPackQuantity() {
        return PackQuantity;
    }

    public void setPackQuantity(Integer packQuantity) {
        PackQuantity = packQuantity;
    }

    public Integer getPackSize() {
        return PackSize;
    }

    public void setPackSize(Integer packSize) {
        PackSize = packSize;
    }

    public Double getCost() {
        return Cost;
    }

    public void setCost(Double cost) {
        Cost = cost;
    }

    public Double getTaxRate() {
        return TaxRate;
    }

    public void setTaxRate(Double taxRate) {
        TaxRate = taxRate;
    }
}
