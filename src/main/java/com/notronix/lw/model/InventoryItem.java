package com.notronix.lw.model;

import java.util.Map;

public class InventoryItem
{
    private String Id;
    private String SKU;
    private String Title;
    private String Barcode;
    private Double PurchasePrice;
    private Double RetailPrice;
    private Integer AvailableQuantity;
    private Integer InStockQuantity;
    private Integer Due;
    private Integer OnOrderQuantity;
    private Integer MinimumLevelQuantity;

    private Integer StockLevel;
    private String Name;
    private Integer TotalChangedProducts;
    private Boolean ContainsChanges;
    private String BinRack;
    private Map<String, InventoryItemChannel> Channels;

    public String getId()
    {
        return Id;
    }

    public void setId(String id)
    {
        Id = id;
    }

    public String getSKU()
    {
        return SKU;
    }

    public void setSKU(String SKU)
    {
        this.SKU = SKU;
    }

    public String getTitle()
    {
        return Title;
    }

    public void setTitle(String title)
    {
        Title = title;
    }

    public Double getRetailPrice()
    {
        return RetailPrice;
    }

    public void setRetailPrice(Double retailPrice)
    {
        RetailPrice = retailPrice;
    }

    public Double getPurchasePrice()
    {
        return PurchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice)
    {
        PurchasePrice = purchasePrice;
    }

    public Integer getAvailableQuantity()
    {
        return AvailableQuantity;
    }

    public void setAvailableQuantity(Integer availableQuantity)
    {
        AvailableQuantity = availableQuantity;
    }

    public String getBarcode()
    {
        return Barcode;
    }

    public void setBarcode(String barcode)
    {
        Barcode = barcode;
    }

    public Integer getInStockQuantity()
    {
        return InStockQuantity;
    }

    public void setInStockQuantity(Integer inStockQuantity)
    {
        InStockQuantity = inStockQuantity;
    }

    public Integer getMinimumLevelQuantity()
    {
        return MinimumLevelQuantity;
    }

    public void setMinimumLevelQuantity(Integer minimumLevelQuantity)
    {
        MinimumLevelQuantity = minimumLevelQuantity;
    }

    public Integer getOnOrderQuantity()
    {
        return OnOrderQuantity;
    }

    public void setOnOrderQuantity(Integer onOrderQuantity)
    {
        OnOrderQuantity = onOrderQuantity;
    }

    public Integer getStockLevel()
    {
        return StockLevel;
    }

    public void setStockLevel(Integer stockLevel)
    {
        StockLevel = stockLevel;
    }

    public Integer getDue()
    {
        return Due;
    }

    public void setDue(Integer due)
    {
        Due = due;
    }

    public String getName()
    {
        return Name;
    }

    public void setName(String name)
    {
        Name = name;
    }

    public Integer getTotalChangedProducts()
    {
        return TotalChangedProducts;
    }

    public void setTotalChangedProducts(Integer totalChangedProducts)
    {
        TotalChangedProducts = totalChangedProducts;
    }

    public Boolean getContainsChanges()
    {
        return ContainsChanges;
    }

    public void setContainsChanges(Boolean containsChanges)
    {
        ContainsChanges = containsChanges;
    }

    public String getBinRack()
    {
        return BinRack;
    }

    public void setBinRack(String binRack)
    {
        BinRack = binRack;
    }

    public Map<String, InventoryItemChannel> getChannels()
    {
        return Channels;
    }

    public void setChannels(Map<String, InventoryItemChannel> channels)
    {
        Channels = channels;
    }

    @Override
    public int hashCode()
    {
        return 31 + (SKU == null ? 0 : SKU.hashCode());
    }

    @Override
    public boolean equals(Object obj)
    {
        return obj instanceof InventoryItem && ((SKU == null && ((InventoryItem) obj).getSKU() == null) || (SKU != null && SKU.equals(((InventoryItem) obj).getSKU())));
    }
}

