package com.notronix.lw.impl.method.orders;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.OrderDetails;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.UUID;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class GetOrderByIdMethod extends AbstractLinnworksAPIMethod<OrderDetails>
{
    private UUID pkOrderId;

    @Override
    public String getURI() {
        return "Orders/GetOrderById";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        return urlEncode("pkOrderId", requireNonNull(pkOrderId));
    }

    @Override
    public OrderDetails getResponse(Gson gson, String jsonPayload) {
        return gson.fromJson(jsonPayload, OrderDetails.class);
    }

    public UUID getPkOrderId() {
        return pkOrderId;
    }

    public void setPkOrderId(UUID pkOrderId) {
        this.pkOrderId = pkOrderId;
    }

    public GetOrderByIdMethod withPkOrderId(UUID pkOrderId) {
        this.pkOrderId = pkOrderId;
        return this;
    }
}
