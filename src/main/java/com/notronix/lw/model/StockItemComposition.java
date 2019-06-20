package com.notronix.lw.model;

public class StockItemComposition
{
    private String LinkedStockItemId;
    private String ItemTitle;
    private String SKU;
    private Integer Quantity;
    private Double PurchasePrice;
    private Byte InventoryTrackingType;
    private Double DimHeight;
    private Double DimWidth;
    private Double DimDepth;
    private String StockItemId;

    public String getLinkedStockItemId() {
        return LinkedStockItemId;
    }

    public void setLinkedStockItemId(String linkedStockItemId) {
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

    public String getStockItemId() {
        return StockItemId;
    }

    public void setStockItemId(String stockItemId) {
        StockItemId = stockItemId;
    }
}
