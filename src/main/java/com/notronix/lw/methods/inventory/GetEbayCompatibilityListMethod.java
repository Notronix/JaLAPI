package com.notronix.lw.methods.inventory;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.StockItemEbayCompatibility;

import java.util.Arrays;
import java.util.List;

import static org.apache.http.util.TextUtils.isBlank;

public class GetEbayCompatibilityListMethod extends InventoryMethod<List<StockItemEbayCompatibility>>
{
    private String itemId;

    @Override
    public String getName() {
        return "GetEbayCompatibilityList";
    }

    @Override
    public String getPayload() {
        return "stockItemId=" + this.itemId;
    }

    @Override
    public List<StockItemEbayCompatibility> getResponse() throws LinnworksAPIException {
        if (isBlank(itemId))
        {
            throw new LinnworksAPIException("Invalid stockItemId");
        }

        return Arrays.asList(new Gson().fromJson(getJsonResult(), StockItemEbayCompatibility[].class));
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public GetEbayCompatibilityListMethod withItemId(String itemId)
    {
        this.itemId = itemId;
        return this;
    }
}
