package com.notronix.lw.methods.inventory;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.StockItemComposition;

import java.util.Arrays;
import java.util.List;

import static org.apache.http.util.TextUtils.isBlank;

public class GetInventoryItemCompositionsMethod extends InventoryMethod<List<StockItemComposition>>
{
    private String inventoryItemId;
    private boolean fullDetail = false;

    @Override
    public String getName()
    {
        return "GetInventoryItemCompositions";
    }

    @Override
    public String getPayload()
    {
        return "inventoryItemId=" + inventoryItemId + "&getFullDetail=" + (fullDetail ? "true" : "false");
    }

    @Override
    public List<StockItemComposition> getResponse() throws LinnworksAPIException
    {
        if (isBlank(inventoryItemId))
        {
            throw new LinnworksAPIException("invalid inventoryItemId");
        }

        return Arrays.asList(new Gson().fromJson(getJsonResult(), StockItemComposition[].class));
    }

    public String getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public GetInventoryItemCompositionsMethod withInventoryItemId(String inventoryItemId)
    {
        this.inventoryItemId = inventoryItemId;
        return this;
    }

    public boolean isFullDetail() {
        return fullDetail;
    }

    public void setFullDetail(boolean fullDetail) {
        this.fullDetail = fullDetail;
    }

    public GetInventoryItemCompositionsMethod withFullDetail(boolean fullDetail)
    {
        this.fullDetail = fullDetail;
        return this;
    }
}
