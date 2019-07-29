package com.notronix.lw.api.model;

import java.util.UUID;

public class PurchaseOrderItem
{
    private UUID pkPurchaseItemId;
    private UUID fkStockItemId;
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
    private Boolean IsDeleted;
    private Integer SortOrder;
    private Double DimHeight;
    private Double DimWidth;
    private Double DimDepth;
    private Integer BoundToOpenOrdersItems;
    private String BinRack;
    private Integer QuantityBoundToOpenOrdersItems;
    private UUID BoundOrderId;
    private String SupplierCode;

    public UUID getPkPurchaseItemId() {
        return pkPurchaseItemId;
    }

    public void setPkPurchaseItemId(UUID pkPurchaseItemId) {
        this.pkPurchaseItemId = pkPurchaseItemId;
    }

    public UUID getFkStockItemId() {
        return fkStockItemId;
    }

    public void setFkStockItemId(UUID fkStockItemId) {
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
        return IsDeleted;
    }

    public void setDeleted(Boolean deleted) {
        IsDeleted = deleted;
    }

    public Integer getSortOrder() {
        return SortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        SortOrder = sortOrder;
    }

    public Double getDimHeight() {
        return DimHeight;
    }

    public void setDimHeight(Double dimHeight) {
        DimHeight = dimHeight;
    }

    public Double getDimWidth() {
        return DimWidth;
    }

    public void setDimWidth(Double dimWidth) {
        DimWidth = dimWidth;
    }

    public Double getDimDepth() {
        return DimDepth;
    }

    public void setDimDepth(Double dimDepth) {
        DimDepth = dimDepth;
    }

    public Integer getBoundToOpenOrdersItems() {
        return BoundToOpenOrdersItems;
    }

    public void setBoundToOpenOrdersItems(Integer boundToOpenOrdersItems) {
        BoundToOpenOrdersItems = boundToOpenOrdersItems;
    }

    public String getBinRack() {
        return BinRack;
    }

    public void setBinRack(String binRack) {
        BinRack = binRack;
    }

    public Integer getQuantityBoundToOpenOrdersItems() {
        return QuantityBoundToOpenOrdersItems;
    }

    public void setQuantityBoundToOpenOrdersItems(Integer quantityBoundToOpenOrdersItems) {
        QuantityBoundToOpenOrdersItems = quantityBoundToOpenOrdersItems;
    }

    public UUID getBoundOrderId() {
        return BoundOrderId;
    }

    public void setBoundOrderId(UUID boundOrderId) {
        BoundOrderId = boundOrderId;
    }

    public String getSupplierCode() {
        return SupplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        SupplierCode = supplierCode;
    }
}
