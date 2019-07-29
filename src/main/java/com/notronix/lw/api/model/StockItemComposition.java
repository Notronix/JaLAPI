package com.notronix.lw.api.model;

import java.util.UUID;

public class StockItemComposition
{
    private UUID LinkedStockItemId;
    private String ItemTitle;
    private String SKU;
    private Integer Quantity;
    private Double PurchasePrice;
    private Byte InventoryTrackingType;
    private Double DimHeight;
    private Double DimWidth;
    private Double DimDepth;
    private UUID StockItemId;

    public UUID getLinkedStockItemId() {
        return LinkedStockItemId;
    }

    public void setLinkedStockItemId(UUID linkedStockItemId) {
        LinkedStockItemId = linkedStockItemId;
    }

    public String getItemTitle() {
        return ItemTitle;
    }

    public void setItemTitle(String itemTitle) {
        ItemTitle = itemTitle;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer quantity) {
        Quantity = quantity;
    }

    public Double getPurchasePrice() {
        return PurchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        PurchasePrice = purchasePrice;
    }

    public Byte getInventoryTrackingType() {
        return InventoryTrackingType;
    }

    public void setInventoryTrackingType(Byte inventoryTrackingType) {
        InventoryTrackingType = inventoryTrackingType;
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

    public UUID getStockItemId() {
        return StockItemId;
    }

    public void setStockItemId(UUID stockItemId) {
        StockItemId = stockItemId;
    }
}
