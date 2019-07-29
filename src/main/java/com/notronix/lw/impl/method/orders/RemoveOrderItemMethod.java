package com.notronix.lw.impl.method.orders;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.UpdateOrderItemResult;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class RemoveOrderItemMethod extends AbstractLinnworksAPIMethod<UpdateOrderItemResult>
{
    private UUID orderId;
    private UUID rowId;
    private UUID fulfilmentCenter;

    @Override
    public String getURI() {
        return "Orders/RemoveOrderItem";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        Map<String, Object> params = new HashMap<>();
        params.put("orderId", requireNonNull(orderId));
        params.put("rowId", requireNonNull(rowId));
        params.put("fulfilmentCenter", requireNonNull(fulfilmentCenter));

        return urlEncode(params);
    }

    @Override
    public UpdateOrderItemResult getResponse(Gson gson, String jsonPayload) {
        return gson.fromJson(jsonPayload, UpdateOrderItemResult.class);
    }

    public UUID getOrderId() {
        return orderId;
    }

    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }

    public RemoveOrderItemMethod withOrderId(UUID orderId) {
        this.orderId = orderId;
        return this;
    }

    public UUID getRowId() {
        return rowId;
    }

    public void setRowId(UUID rowId) {
        this.rowId = rowId;
    }

    public RemoveOrderItemMethod withRowId(UUID rowId) {
        this.rowId = rowId;
        return this;
    }

    public UUID getFulfilmentCenter() {
        return fulfilmentCenter;
    }

    public void setFulfilmentCenter(UUID fulfilmentCenter) {
        this.fulfilmentCenter = fulfilmentCenter;
    }

    public RemoveOrderItemMethod withFulfilmentCenter(UUID fulfilmentCenter) {
        this.fulfilmentCenter = fulfilmentCenter;
        return this;
    }
}
