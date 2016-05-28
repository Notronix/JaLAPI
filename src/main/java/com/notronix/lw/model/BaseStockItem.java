package com.notronix.lw.model;

public class BaseStockItem
{
    private String StockItemId;
    private String ItemNumber;
    private String ItemTitle;
    private String BarcodeNumber;
    private Double PurchasePrice;
    private Double RetailPrice;
    private Integer Quantity;
    private Double TaxRate;

    public String getStockItemId()
    {
        return StockItemId;
    }

    public void setStockItemId(String stockItemId)
    {
        StockItemId = stockItemId;
    }

    public String getItemNumber()
    {
        return ItemNumber;
    }

    public void setItemNumber(String itemNumber)
    {
        ItemNumber = itemNumber;
    }

    public String getItemTitle()
    {
        return ItemTitle;
    }

    public void setItemTitle(String itemTitle)
    {
        ItemTitle = itemTitle;
    }

    public String getBarcodeNumber()
    {
        return BarcodeNumber;
    }

    public void setBarcodeNumber(String barcodeNumber)
    {
        BarcodeNumber = barcodeNumber;
    }

    public Double getPurchasePrice()
    {
        return PurchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice)
    {
        PurchasePrice = purchasePrice;
    }

    public Double getRetailPrice()
    {
        return RetailPrice;
    }

    public void setRetailPrice(Double retailPrice)
    {
        RetailPrice = retailPrice;
    }

    public Integer getQuantity()
    {
        return Quantity;
    }

    public void setQuantity(Integer quantity)
    {
        Quantity = quantity;
    }

    public Double getTaxRate()
    {
        return TaxRate;
    }

    public void setTaxRate(Double taxRate)
    {
        TaxRate = taxRate;
    }
}
