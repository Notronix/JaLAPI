package com.notronix.lw.model;

public class StockItemSupplierStat
{
    private Boolean IsDefault;
    private String Supplier;
    private String SupplierID;
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
    private String StockItemId;

    public Boolean getDefault()
    {
        return IsDefault;
    }

    public void setDefault(Boolean aDefault)
    {
        IsDefault = aDefault;
    }

    public String getSupplier()
    {
        return Supplier;
    }

    public void setSupplier(String supplier)
    {
        Supplier = supplier;
    }

    public String getSupplierID()
    {
        return SupplierID;
    }

    public void setSupplierID(String supplierID)
    {
        SupplierID = supplierID;
    }

    public String getCode()
    {
        return Code;
    }

    public void setCode(String code)
    {
        Code = code;
    }

    public String getSupplierBarcode()
    {
        return SupplierBarcode;
    }

    public void setSupplierBarcode(String supplierBarcode)
    {
        SupplierBarcode = supplierBarcode;
    }

    public Integer getLeadTime()
    {
        return LeadTime;
    }

    public void setLeadTime(Integer leadTime)
    {
        LeadTime = leadTime;
    }

    public Double getPurchasePrice()
    {
        return PurchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice)
    {
        PurchasePrice = purchasePrice;
    }

    public Double getMinPrice()
    {
        return MinPrice;
    }

    public void setMinPrice(Double minPrice)
    {
        MinPrice = minPrice;
    }

    public Double getMaxPrice()
    {
        return MaxPrice;
    }

    public void setMaxPrice(Double maxPrice)
    {
        MaxPrice = maxPrice;
    }

    public Double getAveragePrice()
    {
        return AveragePrice;
    }

    public void setAveragePrice(Double averagePrice)
    {
        AveragePrice = averagePrice;
    }

    public Double getAverageLeadTime()
    {
        return AverageLeadTime;
    }

    public void setAverageLeadTime(Double averageLeadTime)
    {
        AverageLeadTime = averageLeadTime;
    }

    public Integer getSupplierMinOrderQty()
    {
        return SupplierMinOrderQty;
    }

    public void setSupplierMinOrderQty(Integer supplierMinOrderQty)
    {
        SupplierMinOrderQty = supplierMinOrderQty;
    }

    public Integer getSupplierPackSize()
    {
        return SupplierPackSize;
    }

    public void setSupplierPackSize(Integer supplierPackSize)
    {
        SupplierPackSize = supplierPackSize;
    }

    public String getStockItemId()
    {
        return StockItemId;
    }

    public void setStockItemId(String stockItemId)
    {
        StockItemId = stockItemId;
    }
}
