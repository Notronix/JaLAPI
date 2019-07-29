package com.notronix.lw.impl.method.stock;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class DeleteVariationItemMethod extends AbstractLinnworksAPIMethod<Void>
{
    private UUID pkVariationItemId;
    private UUID pkStockItemId;

    @Override
    public String getURI() {
        return "Stock/DeleteVariationItem";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        Map<String, Object> params = new HashMap<>();
        params.put("pkVariationItemId", requireNonNull(pkVariationItemId));
        params.put("pkStockItemId", requireNonNull(pkStockItemId));

        return urlEncode(params);
    }

    @Override
    public Void getResponse(Gson gson, String jsonPayload) {
        return null;
    }

    public UUID getPkVariationItemId() {
        return pkVariationItemId;
    }

    public void setPkVariationItemId(UUID pkVariationItemId) {
        this.pkVariationItemId = pkVariationItemId;
    }

    public DeleteVariationItemMethod withPkVariationItemId(UUID pkVariationItemId) {
        this.pkVariationItemId = pkVariationItemId;
        return this;
    }

    public UUID getPkStockItemId() {
        return pkStockItemId;
    }

    public void setPkStockItemId(UUID pkStockItemId) {
        this.pkStockItemId = pkStockItemId;
    }

    public DeleteVariationItemMethod withPkStockItemId(UUID pkStockItemId) {
        this.pkStockItemId = pkStockItemId;
        return this;
    }
}
