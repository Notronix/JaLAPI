package com.notronix.lw.impl.method.processedorders;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.RefundInfo;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class GetRefundsMethod extends AbstractLinnworksAPIMethod<List<RefundInfo>>
{
    private UUID pkOrderId;

    @Override
    public String getURI() {
        return "ProcessedOrders/GetRefunds";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        return urlEncode("pkOrderId", requireNonNull(pkOrderId));
    }

    @Override
    public List<RefundInfo> getResponse(Gson gson, String jsonPayload) {
        return Arrays.asList(gson.fromJson(jsonPayload, RefundInfo[].class));
    }

    public UUID getPkOrderId() {
        return pkOrderId;
    }

    public void setPkOrderId(UUID pkOrderId) {
        this.pkOrderId = pkOrderId;
    }

    public GetRefundsMethod withPkOrderId(UUID pkOrderId) {
        this.pkOrderId = pkOrderId;
        return this;
    }
}
