package com.notronix.lw.model;

public class PurchaseOrderItem
{
    private String pkPurchaseItemId;
    private String fkStockItemId;
    private Integer Quantity;
    private Double Cost;
    private Integer Delivered;
    private Double TaxRate;
    private Double Tax;
    private Integer PackQuantity;
    private Integer PackSize;
    private String SKU;
    private String ItemTitle;
    private Integer InventoryTrackingType;
    private Boolean isDeleted;

    public String getPkPurchaseItemId() {
        return pkPurchaseItemId;
    }

    public void setPkPurchaseItemId(String pkPurchaseItemId) {
        this.pkPurchaseItemId = pkPurchaseItemId;
    }

    public String getFkStockItemId() {
        return fkStockItemId;
    }

    public void setFkStockItemId(String fkStockItemId) {
        this.fkStockItemId = fkStockItemId;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer quantity) {
        Quantity = quantity;
    }

    public Double getCost() {
        return Cost;
    }

    public void setCost(Double cost) {
        Cost = cost;
    }

    public Integer getDelivered() {
        return Delivered;
    }

    public void setDelivered(Integer delivered) {
        Delivered = delivered;
    }

    public Double getTaxRate() {
        return TaxRate;
    }

    public void setTaxRate(Double taxRate) {
        TaxRate = taxRate;
    }

    public Double getTax() {
        return Tax;
    }

    public void setTax(Double tax) {
        Tax = tax;
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

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public String getItemTitle() {
        return ItemTitle;
    }

    public void setItemTitle(String itemTitle) {
        ItemTitle = itemTitle;
    }

    public Integer getInventoryTrackingType() {
        return InventoryTrackingType;
    }

    public void setInventoryTrackingType(Integer inventoryTrackingType) {
        InventoryTrackingType = inventoryTrackingType;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }
}