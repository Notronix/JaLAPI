package com.notronix.lw.methods.inventory;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.StockItemSupplierStat;

import java.util.Arrays;
import java.util.List;

public class GetStockSupplierStatMethod extends InventoryMethod<List<StockItemSupplierStat>>
{
    private String inventoryItemId;

    @Override
    public String getName()
    {
        return "GetStockSupplierStat";
    }

    @Override
    public String getPayload()
    {
        return "inventoryItemId=" + inventoryItemId;
    }

    @Override
    public List<StockItemSupplierStat> getResponse() throws LinnworksAPIException
    {
        return Arrays.asList(new Gson().fromJson(getJsonResult(), StockItemSupplierStat[].class));
    }

    public String getInventoryItemId()
    {
        return inventoryItemId;
    }

    public void setInventoryItemId(String inventoryItemId)
    {
        this.inventoryItemId = inventoryItemId;
    }

    public GetStockSupplierStatMethod withInventoryItemId(String inventoryItemId)
    {
        this.inventoryItemId = inventoryItemId;
        return this;
    }
}
