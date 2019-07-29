package com.notronix.lw.impl.method.orders;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static com.notronix.lw.impl.method.MethodUtils.putIfProvided;
import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class CancelOrderMethod extends AbstractLinnworksAPIMethod<String>
{
    private UUID orderId;
    private UUID fulfilmentCenter;
    private Double refund;
    private String note;

    @Override
    public String getURI() {
        return "Orders/CancelOrder";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        Map<String, Object> params = new HashMap<>();
        params.put("orderId", requireNonNull(orderId));
        params.put("fulfilmentCenter", requireNonNull(fulfilmentCenter));
        params.put("refund", requireNonNull(refund));
        putIfProvided(params, "note", note);

        return urlEncode(params);
    }

    @Override
    public String getResponse(Gson gson, String jsonPayload) {
        return gson.fromJson(jsonPayload, String.class);
    }

    public UUID getOrderId() {
        return orderId;
    }

    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }

    public CancelOrderMethod withOrderId(UUID orderId) {
        this.orderId = orderId;
        return this;
    }

    public UUID getFulfilmentCenter() {
        return fulfilmentCenter;
    }

    public void setFulfilmentCenter(UUID fulfilmentCenter) {
        this.fulfilmentCenter = fulfilmentCenter;
    }

    public CancelOrderMethod withFulfilmentCenter(UUID fulfilmentCenter) {
        this.fulfilmentCenter = fulfilmentCenter;
        return this;
    }

    public Double getRefund() {
        return refund;
    }

    public void setRefund(Double refund) {
        this.refund = refund;
    }

    public CancelOrderMethod withRefund(Double refund) {
        this.refund = refund;
        return this;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public CancelOrderMethod withNote(String note) {
        this.note = note;
        return this;
    }
}
