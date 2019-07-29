package com.notronix.lw.api.model;

import java.util.UUID;

public class StockItemSupplierStat
{
    private Boolean IsDefault;
    private String Supplier;
    private UUID SupplierID;
    private String Code;
    private String SupplierBarcode;
    private Integer LeadTime;
    private Double PurchasePrice;
    private Double MinPrice;
    private Double MaxPrice;
    private Double AveragePrice;
    private Double AverageLeadTime;
    private Integer SupplierMinOrderQty;
    private Integer SupplierPackSize;
    private String SupplierCurrency;
    private UUID StockItemId;

    public Boolean getDefault() {
        return IsDefault;
    }

    public void setDefault(Boolean aDefault) {
        IsDefault = aDefault;
    }

    public String getSupplier() {
        return Supplier;
    }

    public void setSupplier(String supplier) {
        Supplier = supplier;
    }

    public UUID getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(UUID supplierID) {
        SupplierID = supplierID;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getSupplierBarcode() {
        return SupplierBarcode;
    }

    public void setSupplierBarcode(String supplierBarcode) {
        SupplierBarcode = supplierBarcode;
    }

    public Integer getLeadTime() {
        return LeadTime;
    }

    public void setLeadTime(Integer leadTime) {
        LeadTime = leadTime;
    }

    public Double getPurchasePrice() {
        return PurchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        PurchasePrice = purchasePrice;
    }

    public Double getMinPrice() {
        return MinPrice;
    }

    public void setMinPrice(Double minPrice) {
        MinPrice = minPrice;
    }

    public Double getMaxPrice() {
        return MaxPrice;
    }

    public void setMaxPrice(Double maxPrice) {
        MaxPrice = maxPrice;
    }

    public Double getAveragePrice() {
        return AveragePrice;
    }

    public void setAveragePrice(Double averagePrice) {
        AveragePrice = averagePrice;
    }

    public Double getAverageLeadTime() {
        return AverageLeadTime;
    }

    public void setAverageLeadTime(Double averageLeadTime) {
        AverageLeadTime = averageLeadTime;
    }

    public Integer getSupplierMinOrderQty() {
        return SupplierMinOrderQty;
    }

    public void setSupplierMinOrderQty(Integer supplierMinOrderQty) {
        SupplierMinOrderQty = supplierMinOrderQty;
    }

    public Integer getSupplierPackSize() {
        return SupplierPackSize;
    }

    public void setSupplierPackSize(Integer supplierPackSize) {
        SupplierPackSize = supplierPackSize;
    }

    public String getSupplierCurrency() {
        return SupplierCurrency;
    }

    public void setSupplierCurrency(String supplierCurrency) {
        SupplierCurrency = supplierCurrency;
    }

    public UUID getStockItemId() {
        return StockItemId;
    }

    public void setStockItemId(UUID stockItemId) {
        StockItemId = stockItemId;
    }
}
