package com.notronix.lw.methods.stock;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.VariationItem;

import java.util.Arrays;
import java.util.List;

import static java.util.Objects.requireNonNull;

public class AddVariationItemsMethod extends StockMethod<List<VariationItem>>
{
    private String pkVariationItemId;
    private List<String> pkStockItemIds;

    @Override
    public String getName() {
        return "AddVariationItems";
    }

    @Override
    public String getPayload() {
        return "pkVariationItemId=" + requireNonNull(pkVariationItemId)
                + "&pkStockItemIds=" + new Gson().toJson(requireNonNull(pkStockItemIds));
    }

    @Override
    public List<VariationItem> getResponse() throws LinnworksAPIException {
        return Arrays.asList(new Gson().fromJson(getJsonResult(), VariationItem[].class));
    }

    public String getPkVariationItemId() {
        return pkVariationItemId;
    }

    public void setPkVariationItemId(String pkVariationItemId) {
        this.pkVariationItemId = pkVariationItemId;
    }

    public AddVariationItemsMethod withPkVariationItemId(String pkVariationItemId) {
        this.pkVariationItemId = pkVariationItemId;
        return this;
    }

    public List<String> getPkStockItemIds() {
        return pkStockItemIds;
    }

    public void setPkStockItemIds(List<String> pkStockItemIds) {
        this.pkStockItemIds = pkStockItemIds;
    }

    public AddVariationItemsMethod withPkStockItemIds(List<String> pkStockItemIds) {
        this.pkStockItemIds = pkStockItemIds;
        return this;
    }
}
