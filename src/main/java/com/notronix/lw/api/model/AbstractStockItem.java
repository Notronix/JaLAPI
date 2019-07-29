package com.notronix.lw.api.model;

import java.time.Instant;
import java.util.UUID;

public abstract class AbstractStockItem
{
    private Integer Quantity;
    private Integer InOrder;
    private Integer Due;
    private Integer MinimumLevel;
    private Integer Available;
    private Boolean IsCompositeParent;
    private String ItemNumber;
    private String ItemTitle;
    private String BarcodeNumber;
    private String MetaData;
    private Boolean isBatchedStockType;
    private Double PurchasePrice;
    private Double RetailPrice;
    private Double TaxRate;
    private UUID PostalServiceId;
    private String PostalServiceName;
    private UUID CategoryId;
    private String CategoryName;
    private UUID PackageGroupId;
    private String PackageGroupName;
    private Double Height;
    private Double Width;
    private Double Depth;
    private Double Weight;
    private Instant CreationDate;
    private Integer InventoryTrackingType;
    private Boolean BatchNumberScanRequired;
    private Boolean SerialNumberScanRequired;
    private UUID StockItemId;

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer quantity) {
        Quantity = quantity;
    }

    public Integer getInOrder() {
        return InOrder;
    }

    public void setInOrder(Integer inOrder) {
        InOrder = inOrder;
    }

    public Integer getDue() {
        return Due;
    }

    public void setDue(Integer due) {
        Due = due;
    }

    public Integer getMinimumLevel() {
        return MinimumLevel;
    }

    public void setMinimumLevel(Integer minimumLevel) {
        MinimumLevel = minimumLevel;
    }

    public Integer getAvailable() {
        return Available;
    }

    public void setAvailable(Integer available) {
        Available = available;
    }

    public Boolean getCompositeParent() {
        return IsCompositeParent;
    }

    public void setCompositeParent(Boolean compositeParent) {
        IsCompositeParent = compositeParent;
    }

    public String getItemNumber() {
        return ItemNumber;
    }

    public void setItemNumber(String itemNumber) {
        ItemNumber = itemNumber;
    }

    public String getItemTitle() {
        return ItemTitle;
    }

    public void setItemTitle(String itemTitle) {
        ItemTitle = itemTitle;
    }

    public String getBarcodeNumber() {
        return BarcodeNumber;
    }

    public void setBarcodeNumber(String barcodeNumber) {
        BarcodeNumber = barcodeNumber;
    }

    public String getMetaData() {
        return MetaData;
    }

    public void setMetaData(String metaData) {
        MetaData = metaData;
    }

    public Boolean getBatchedStockType() {
        return isBatchedStockType;
    }

    public void setBatchedStockType(Boolean batchedStockType) {
        isBatchedStockType = batchedStockType;
    }

    public Double getPurchasePrice() {
        return PurchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        PurchasePrice = purchasePrice;
    }

    public Double getRetailPrice() {
        return RetailPrice;
    }

    public void setRetailPrice(Double retailPrice) {
        RetailPrice = retailPrice;
    }

    public Double getTaxRate() {
        return TaxRate;
    }

    public void setTaxRate(Double taxRate) {
        TaxRate = taxRate;
    }

    public UUID getPostalServiceId() {
        return PostalServiceId;
    }

    public void setPostalServiceId(UUID postalServiceId) {
        PostalServiceId = postalServiceId;
    }

    public String getPostalServiceName() {
        return PostalServiceName;
    }

    public void setPostalServiceName(String postalServiceName) {
        PostalServiceName = postalServiceName;
    }

    public UUID getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(UUID categoryId) {
        CategoryId = categoryId;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public UUID getPackageGroupId() {
        return PackageGroupId;
    }

    public void setPackageGroupId(UUID packageGroupId) {
        PackageGroupId = packageGroupId;
    }

    public String getPackageGroupName() {
        return PackageGroupName;
    }

    public void setPackageGroupName(String packageGroupName) {
        PackageGroupName = packageGroupName;
    }

    public Double getHeight() {
        return Height;
    }

    public void setHeight(Double height) {
        Height = height;
    }

    public Double getWidth() {
        return Width;
    }

    public void setWidth(Double width) {
        Width = width;
    }

    public Double getDepth() {
        return Depth;
    }

    public void setDepth(Double depth) {
        Depth = depth;
    }

    public Double getWeight() {
        return Weight;
    }

    public void setWeight(Double weight) {
        Weight = weight;
    }

    public Instant getCreationDate() {
        return CreationDate;
    }

    public void setCreationDate(Instant creationDate) {
        CreationDate = creationDate;
    }

    public Integer getInventoryTrackingType() {
        return InventoryTrackingType;
    }

    public void setInventoryTrackingType(Integer inventoryTrackingType) {
        InventoryTrackingType = inventoryTrackingType;
    }

    public Boolean getBatchNumberScanRequired() {
        return BatchNumberScanRequired;
    }

    public void setBatchNumberScanRequired(Boolean batchNumberScanRequired) {
        BatchNumberScanRequired = batchNumberScanRequired;
    }

    public Boolean getSerialNumberScanRequired() {
        return SerialNumberScanRequired;
    }

    public void setSerialNumberScanRequired(Boolean serialNumberScanRequired) {
        SerialNumberScanRequired = serialNumberScanRequired;
    }

    public UUID getStockItemId() {
        return StockItemId;
    }

    public void setStockItemId(UUID stockItemId) {
        StockItemId = stockItemId;
    }
}
