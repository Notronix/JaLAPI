package com.notronix.lw.impl.method.orders;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.MoveToLocationResult;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class MoveToLocationMethod extends AbstractLinnworksAPIMethod<MoveToLocationResult>
{
    private List<UUID> orderIds;
    private UUID pkStockLocationId;

    @Override
    public String getURI() {
        return "Orders/MoveToLocation";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        Map<String, Object> params = new HashMap<>();
        params.put("orderIds", gson.toJson(requireNonNull(orderIds)));
        params.put("pkStockLocationId", requireNonNull(pkStockLocationId));

        return urlEncode(params);
    }

    @Override
    public MoveToLocationResult getResponse(Gson gson, String jsonPayload) {
        return gson.fromJson(jsonPayload, MoveToLocationResult.class);
    }

    public List<UUID> getOrderIds() {
        return orderIds;
    }

    public void setOrderIds(List<UUID> orderIds) {
        this.orderIds = orderIds;
    }

    public MoveToLocationMethod withOrderIds(List<UUID> orderIds) {
        this.orderIds = orderIds;
        return this;
    }

    public UUID getPkStockLocationId() {
        return pkStockLocationId;
    }

    public void setPkStockLocationId(UUID pkStockLocationId) {
        this.pkStockLocationId = pkStockLocationId;
    }

    public MoveToLocationMethod withPkStockLocationId(UUID pkStockLocationId) {
        this.pkStockLocationId = pkStockLocationId;
        return this;
    }
}
