package com.notronix.lw.methods.inventory;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.StockItemTitle;

import java.util.Arrays;
import java.util.List;

import static java.util.Objects.requireNonNull;

public class GetInventoryItemTitlesMethod extends InventoryMethod<List<StockItemTitle>>
{
    private String itemId;

    @Override
    public String getName() {
        return "GetInventoryItemTitles";
    }

    @Override
    public String getPayload() {
        return "inventoryItemId=" + requireNonNull(itemId);
    }

    @Override
    public List<StockItemTitle> getResponse() throws LinnworksAPIException {
        return Arrays.asList(new Gson().fromJson(getJsonResult(), StockItemTitle[].class));
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public GetInventoryItemTitlesMethod withItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
}
