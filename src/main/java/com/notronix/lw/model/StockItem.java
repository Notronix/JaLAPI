package com.notronix.lw.model;

public class StockItem extends BaseStockItem
{
    private Integer Available;
    private Integer Due;
    private Integer InOrder;
    private Integer MinimumLevel;

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

    public Integer getInOrder()
    {
        return InOrder;
    }

    public void setInOrder(Integer inOrder)
    {
        InOrder = inOrder;
    }

    public Integer getMinimumLevel()
    {
        return MinimumLevel;
    }

    public void setMinimumLevel(Integer minimumLevel)
    {
        MinimumLevel = minimumLevel;
    }
}
