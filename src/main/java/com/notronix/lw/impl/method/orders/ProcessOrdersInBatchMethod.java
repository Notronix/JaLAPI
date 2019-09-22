package com.notronix.lw.impl.method.orders;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.ProcessOrderResult;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.*;

import static com.notronix.lw.impl.method.MethodUtils.putIfProvided;
import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class ProcessOrdersInBatchMethod extends AbstractLinnworksAPIMethod<List<ProcessOrderResult>>
{
    private List<UUID> ordersIds;
    private UUID locationId;

    @Override
    public String getURI() {
        return "Orders/ProcessOrdersInBatch";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        Map<String, Object> params = new HashMap<>();
        params.put("ordersIds", gson.toJson(requireNonNull(ordersIds)));
        putIfProvided(params, "locationId", locationId);

        return urlEncode(params);
    }

    @Override
    public List<ProcessOrderResult> getResponse(Gson gson, String jsonPayload) {
        return Arrays.asList(gson.fromJson(jsonPayload, ProcessOrderResult[].class));
    }

    public List<UUID> getOrdersIds() {
        return ordersIds;
    }

    public void setOrdersIds(List<UUID> ordersIds) {
        this.ordersIds = ordersIds;
    }

    public ProcessOrdersInBatchMethod withOrdersIds(List<UUID> ordersIds) {
        this.ordersIds = ordersIds;
        return this;
    }

    public UUID getLocationId() {
        return locationId;
    }

    public void setLocationId(UUID locationId) {
        this.locationId = locationId;
    }

    public ProcessOrdersInBatchMethod withLocationId(UUID locationId) {
        this.locationId = locationId;
        return this;
    }
}
