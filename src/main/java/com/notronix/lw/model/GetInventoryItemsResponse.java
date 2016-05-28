package com.notronix.lw.model;

import com.notronix.lw.model.InventoryItem;

import java.util.List;

public class GetInventoryItemsResponse
{
    private List<InventoryItem> Items;
    private int TotalItems;
    private int StartIndex;
    private int batchSize;

    public List<InventoryItem> getItems()
    {
        return Items;
    }

    public void setItems(List<InventoryItem> items)
    {
        Items = items;
    }

    public int getTotalItems()
    {
        return TotalItems;
    }

    public void setTotalItems(int totalItems)
    {
        TotalItems = totalItems;
    }

    public int getStartIndex()
    {
        return StartIndex;
    }

    public void setStartIndex(int startIndex)
    {
        StartIndex = startIndex;
    }

    public int getBatchSize()
    {
        return batchSize;
    }

    public void setBatchSize(int batchSize)
    {
        this.batchSize = batchSize;
    }
}
