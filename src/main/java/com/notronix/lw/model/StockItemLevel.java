package com.notronix.lw.model;

public class StockItemLevel
{
    private String StockItemId;
    private StockLocation Location;
    private Integer StockLevel;
    private Double StockValue;
    private Integer MinimumLevel;
    private Integer InOrders;
    private Integer Available;
    private Integer Due;
    private Double UnitCost;

    public String getStockItemId()
    {
        return StockItemId;
    }

    public void setStockItemId(String stockItemId)
    {
        StockItemId = stockItemId;
    }

    public StockLocation getLocation()
    {
        return Location;
    }

    public void setLocation(StockLocation location)
    {
        Location = location;
    }

    public Integer getStockLevel()
    {
        return StockLevel;
    }

    public void setStockLevel(Integer stockLevel)
    {
        StockLevel = stockLevel;
    }

    public Double getStockValue()
    {
        return StockValue;
    }

    public void setStockValue(Double stockValue)
    {
        StockValue = stockValue;
    }

    public Integer getMinimumLevel()
    {
        return MinimumLevel;
    }

    public void setMinimumLevel(Integer minimumLevel)
    {
        MinimumLevel = minimumLevel;
    }

    public Integer getInOrders()
    {
        return InOrders;
    }

    public void setInOrders(Integer inOrders)
    {
        InOrders = inOrders;
    }

    public Integer getAvailable()
    {
        return Available;
    }

    public void setAvailable(Integer available)
    {
        Available = available;
    }

    public Integer getDue()
    {
        return Due;
    }

    public void setDue(Integer due)
    {
        Due = due;
    }

    public Double getUnitCost()
    {
        return UnitCost;
    }

    public void setUnitCost(Double unitCost)
    {
        UnitCost = unitCost;
    }
}
