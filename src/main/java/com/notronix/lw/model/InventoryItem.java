package com.notronix.lw.model;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Map;

public class InventoryItem
{
    private String Id;
    private String SKU;
    private String Title;
    private String Barcode;
    private Double PurchasePrice;
    private Double RetailPrice;
    private Integer Available;
    private Integer Due;
    private Integer InOrder;
    private Integer MinimumLevel;
    private Boolean Tracked;
    private Boolean IsComposite;
    private Boolean IsArchived;
    private String Image;
    private String VariationGroupName;
    private List<InventoryItem> Products;

    private Integer StockLevel;
    private Double StockValue;
    private Integer TotalChangedProducts;
    private Boolean ContainsChanges;
    private String BinRack;
    private Map<String, InventoryItemChannel> Channels;

    private String CreatedDate;
    private String ModifiedDate;
    private Boolean SerialNumberScanRequired;
    private Boolean BatchNumberScanRequired;
    private Boolean HasBatches;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public Double getRetailPrice() {
        return RetailPrice;
    }

    public void setRetailPrice(Double retailPrice) {
        RetailPrice = retailPrice;
    }

    public Double getPurchasePrice() {
        return PurchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        PurchasePrice = purchasePrice;
    }

    public Integer getAvailable() {
        return Available;
    }

    public void setAvailable(Integer available) {
        Available = available;
    }

    public String getBarcode() {
        return Barcode;
    }

    public void setBarcode(String barcode) {
        Barcode = barcode;
    }

    public Integer getStockLevel() {
        return StockLevel;
    }

    public void setStockLevel(Integer stockLevel) {
        StockLevel = stockLevel;
    }

    public Integer getDue() {
        return Due;
    }

    public void setDue(Integer due) {
        Due = due;
    }

    public Integer getTotalChangedProducts() {
        return TotalChangedProducts;
    }

    public void setTotalChangedProducts(Integer totalChangedProducts) {
        TotalChangedProducts = totalChangedProducts;
    }

    public Boolean getContainsChanges() {
        return ContainsChanges;
    }

    public void setContainsChanges(Boolean containsChanges) {
        ContainsChanges = containsChanges;
    }

    public String getBinRack() {
        return BinRack;
    }

    public void setBinRack(String binRack) {
        BinRack = binRack;
    }

    public Map<String, InventoryItemChannel> getChannels() {
        return Channels;
    }

    public void setChannels(Map<String, InventoryItemChannel> channels) {
        Channels = channels;
    }

    public String getCreatedDate() {
        return CreatedDate;
    }

    public Instant getCreatedInstant() {
        return CreatedDate == null ? null : LocalDateTime.parse(CreatedDate).toInstant(ZoneOffset.UTC);
    }

    public void setCreatedDate(String createdDate) {
        CreatedDate = createdDate;
    }

    public String getModifiedDate() {
        return ModifiedDate;
    }

    public Instant getModifiedInstant() {
        return ModifiedDate == null ? null : LocalDateTime.parse(ModifiedDate).toInstant(ZoneOffset.UTC);
    }

    public void setModifiedDate(String modifiedDate) {
        ModifiedDate = modifiedDate;
    }

    public Integer getInOrder() {
        return InOrder;
    }

    public void setInOrder(Integer inOrder) {
        InOrder = inOrder;
    }

    public Integer getMinimumLevel() {
        return MinimumLevel;
    }

    public void setMinimumLevel(Integer minimumLevel) {
        MinimumLevel = minimumLevel;
    }

    public Boolean getTracked() {
        return Tracked;
    }

    public void setTracked(Boolean tracked) {
        Tracked = tracked;
    }

    public Boolean getComposite() {
        return IsComposite;
    }

    public void setComposite(Boolean composite) {
        IsComposite = composite;
    }

    public Boolean getArchived() {
        return IsArchived;
    }

    public void setArchived(Boolean archived) {
        IsArchived = archived;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getVariationGroupName() {
        return VariationGroupName;
    }

    public void setVariationGroupName(String variationGroupName) {
        VariationGroupName = variationGroupName;
    }

    public List<InventoryItem> getProducts() {
        return Products;
    }

    public void setProducts(List<InventoryItem> products) {
        Products = products;
    }

    public Double getStockValue() {
        return StockValue;
    }

    public void setStockValue(Double stockValue) {
        StockValue = stockValue;
    }

    public Boolean getSerialNumberScanRequired() {
        return SerialNumberScanRequired;
    }

    public void setSerialNumberScanRequired(Boolean serialNumberScanRequired) {
        SerialNumberScanRequired = serialNumberScanRequired;
    }

    public Boolean getBatchNumberScanRequired() {
        return BatchNumberScanRequired;
    }

    public void setBatchNumberScanRequired(Boolean batchNumberScanRequired) {
        BatchNumberScanRequired = batchNumberScanRequired;
    }

    public Boolean getHasBatches() {
        return HasBatches;
    }

    public void setHasBatches(Boolean hasBatches) {
        HasBatches = hasBatches;
    }

    @Override
    public int hashCode() {
        return 31 + (SKU == null ? 0 : SKU.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof InventoryItem && ((SKU == null && ((InventoryItem) obj).getSKU() == null) || (SKU != null && SKU.equals(((InventoryItem) obj).getSKU())));
    }
}

