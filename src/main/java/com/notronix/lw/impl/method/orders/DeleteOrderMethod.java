package com.notronix.lw.impl.method.orders;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.UUID;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class DeleteOrderMethod extends AbstractLinnworksAPIMethod<Void>
{
    private UUID orderId;

    @Override
    public String getURI() {
        return "Orders/DeleteOrder";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        return urlEncode("orderId", requireNonNull(orderId));
    }

    @Override
    public Void getResponse(Gson gson, String jsonPayload) {
        return null;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }

    public DeleteOrderMethod withOrderId(UUID orderId) {
        this.orderId = orderId;
        return this;
    }
}
