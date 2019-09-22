package com.notronix.lw.impl.method.orders;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.ProcessOrderResult;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static com.notronix.lw.impl.method.MethodUtils.putIfProvided;
import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class ProcessOrderMethod extends AbstractLinnworksAPIMethod<ProcessOrderResult>
{
    private UUID orderId;
    private boolean scanPerformed;
    private UUID locationId;

    @Override
    public String getURI() {
        return "Orders/ProcessOrder";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        Map<String, Object> params = new HashMap<>();
        params.put("orderId", requireNonNull(orderId));
        params.put("scanPerformed", scanPerformed);
        putIfProvided(params, "locationId", locationId);

        return urlEncode(params);
    }

    @Override
    public ProcessOrderResult getResponse(Gson gson, String jsonPayload) {
        return gson.fromJson(jsonPayload, ProcessOrderResult.class);
    }

    public UUID getOrderId() {
        return orderId;
    }

    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }

    public ProcessOrderMethod withOrderId(UUID orderId) {
        this.orderId = orderId;
        return this;
    }

    public boolean isScanPerformed() {
        return scanPerformed;
    }

    public void setScanPerformed(boolean scanPerformed) {
        this.scanPerformed = scanPerformed;
    }

    public ProcessOrderMethod withScanPerformed(boolean scanPerformed) {
        this.scanPerformed = scanPerformed;
        return this;
    }

    public UUID getLocationId() {
        return locationId;
    }

    public void setLocationId(UUID locationId) {
        this.locationId = locationId;
    }

    public ProcessOrderMethod withLocationId(UUID locationId) {
        this.locationId = locationId;
        return this;
    }
}
