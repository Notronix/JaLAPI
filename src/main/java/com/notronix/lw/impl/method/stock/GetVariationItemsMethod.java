package com.notronix.lw.impl.method.stock;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.VariationItem;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class GetVariationItemsMethod extends AbstractLinnworksAPIMethod<List<VariationItem>>
{
    private UUID pkVariationItemId;

    @Override
    public String getURI() {
        return "Stock/GetVariationItems";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        return urlEncode("pkVariationItemId", requireNonNull(pkVariationItemId));
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

    public GetVariationItemsMethod withPkVariationItemId(UUID pkVariationItemId) {
        this.pkVariationItemId = pkVariationItemId;
        return this;
    }
}
