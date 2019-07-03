package com.notronix.lw.methods.inventory;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.StockItemDescription;

import java.util.Arrays;
import java.util.List;

import static java.util.Objects.requireNonNull;

public class GetInventoryItemDescriptionsMethod extends InventoryMethod<List<StockItemDescription>>
{
    private String itemId;

    @Override
    public String getName() {
        return "GetInventoryItemDescriptions";
    }

    @Override
    public String getPayload() {
        return "inventoryItemId=" + requireNonNull(itemId);
    }

    @Override
    public List<StockItemDescription> getResponse() throws LinnworksAPIException {
        return Arrays.asList(new Gson().fromJson(getJsonResult(), StockItemDescription[].class));
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public GetInventoryItemDescriptionsMethod withItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
}
