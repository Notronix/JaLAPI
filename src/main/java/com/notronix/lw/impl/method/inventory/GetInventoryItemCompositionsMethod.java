package com.notronix.lw.impl.method.inventory;

import com.google.api.client.http.HttpContent;
import com.google.api.client.http.UrlEncodedContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.StockItemComposition;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.*;

import static com.notronix.lw.impl.method.MethodUtils.putIfProvided;
import static java.util.Objects.requireNonNull;

public class GetInventoryItemCompositionsMethod extends AbstractLinnworksAPIMethod<List<StockItemComposition>>
{
    private UUID inventoryItemId;
    private Boolean getFullDetail;

    @Override
    public String getURI() {
        return "Inventory/GetInventoryItemCompositions";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        Map<String, Object> params = new HashMap<>();
        params.put("inventoryItemId", requireNonNull(inventoryItemId));
        putIfProvided(params, "getFullDetail", getFullDetail);

        return new UrlEncodedContent(params);
    }

    @Override
    public List<StockItemComposition> getResponse(Gson gson, String jsonPayload) {
        return Arrays.asList(gson.fromJson(jsonPayload, StockItemComposition[].class));
    }

    public UUID getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(UUID inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public GetInventoryItemCompositionsMethod withInventoryItemId(UUID inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
        return this;
    }

    public Boolean getGetFullDetail() {
        return getFullDetail;
    }

    public void setGetFullDetail(Boolean getFullDetail) {
        this.getFullDetail = getFullDetail;
    }

    public GetInventoryItemCompositionsMethod withGetFullDetail(Boolean getFullDetail) {
        this.getFullDetail = getFullDetail;
        return this;
    }
}
