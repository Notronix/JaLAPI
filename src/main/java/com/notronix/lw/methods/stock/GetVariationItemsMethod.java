package com.notronix.lw.methods.stock;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.VariationItem;

import java.util.Arrays;
import java.util.List;

import static java.util.Objects.requireNonNull;

public class GetVariationItemsMethod extends StockMethod<List<VariationItem>>
{
    private String pkVariationItemId;

    @Override
    public String getName() {
        return "GetVariationItems";
    }

    @Override
    public String getPayload() {
        return "pkVariationItemId=" + requireNonNull(pkVariationItemId);
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

    public GetVariationItemsMethod withPkVariationItemId(String pkVariationItemId) {
        this.pkVariationItemId = pkVariationItemId;
        return this;
    }
}
