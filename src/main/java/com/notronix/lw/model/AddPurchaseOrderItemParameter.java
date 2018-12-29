package com.notronix.lw.model;

public class AddPurchaseOrderItemParameter
{
    private String pkPurchaseId	;
    private String fkStockItemId;
    private Integer Qty;
    private Integer PackQuantity;
    private Integer PackSize;
    private Double Cost;
    private Double TaxRate;

    public String getPkPurchaseId() {
        return pkPurchaseId;
    }

    public void setPkPurchaseId(String pkPurchaseId) {
        this.pkPurchaseId = pkPurchaseId;
    }

    public String getFkStockItemId() {
        return fkStockItemId;
    }

    public void setFkStockItemId(String fkStockItemId) {
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
