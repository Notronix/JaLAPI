package com.notronix.lw.impl.method.stock;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.VariationItem;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.*;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class AddVariationItemsMethod extends AbstractLinnworksAPIMethod<List<VariationItem>>
{
    private UUID pkVariationItemId;
    private List<UUID> pkStockItemIds;

    @Override
    public String getURI() {
        return "Stock/AddVariationItems";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        Map<String, Object> params = new HashMap<>();
        params.put("pkVariationItemId", requireNonNull(pkVariationItemId));
        params.put("pkStockItemIds", gson.toJson(requireNonNull(pkStockItemIds)));

        return urlEncode(params);
    }

    @Override
    public List<VariationItem> getResponse(Gson gson, String jsonPayload) {
        return Arrays.asList(gson.fromJson(jsonPayload, VariationItem[].class));
    }

    public UUID getPkVariationItemId() {
        return pkVariationItemId;
    }

    public void setPkVariationItemId(UUID pkVariationItemId) {
        this.pkVariationItemId = pkVariationItemId;
    }

    public AddVariationItemsMethod withPkVariationItemId(UUID pkVariationItemId) {
        this.pkVariationItemId = pkVariationItemId;
        return this;
    }

    public List<UUID> getPkStockItemIds() {
        return pkStockItemIds;
    }

    public void setPkStockItemIds(List<UUID> pkStockItemIds) {
        this.pkStockItemIds = pkStockItemIds;
    }

    public AddVariationItemsMethod withPkStockItemIds(List<UUID> pkStockItemIds) {
        this.pkStockItemIds = pkStockItemIds;
        return this;
    }
}
