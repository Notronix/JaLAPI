package com.notronix.lw.impl.method.stock;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.UUID;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class DeleteVariationGroupMethod extends AbstractLinnworksAPIMethod<Void>
{
    private UUID pkVariationGroupId;

    @Override
    public String getURI() {
        return "Stock/DeleteVariationGroup";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        return urlEncode("pkVariationGroupId", requireNonNull(pkVariationGroupId));
    }

    @Override
    public Void getResponse(Gson gson, String jsonPayload) {
        return null;
    }

    public UUID getPkVariationGroupId() {
        return pkVariationGroupId;
    }

    public void setPkVariationGroupId(UUID pkVariationGroupId) {
        this.pkVariationGroupId = pkVariationGroupId;
    }

    public DeleteVariationGroupMethod withPkVariationGroupId(UUID pkVariationGroupId) {
        this.pkVariationGroupId = pkVariationGroupId;
        return this;
    }
}
