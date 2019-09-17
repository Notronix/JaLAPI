package com.notronix.lw.impl.method.orders;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.UUID;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class CompleteOrderMethod extends AbstractLinnworksAPIMethod<String>
{
    private UUID orderId;

    @Override
    public String getURI() {
        return "Orders/CompleteOrder";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        return urlEncode("orderId", requireNonNull(orderId));
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

    public CompleteOrderMethod withOrderId(UUID orderId) {
        this.orderId = orderId;
        return this;
    }
}
