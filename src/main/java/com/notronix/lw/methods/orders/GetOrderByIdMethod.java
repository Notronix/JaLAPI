package com.notronix.lw.methods.orders;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.OrderDetails;

import static java.util.Objects.requireNonNull;

public class GetOrderByIdMethod extends OrdersMethod<OrderDetails>
{
    private String orderId;

    @Override
    public String getName() {
        return "GetOrderById";
    }

    @Override
    public String getPayload() {
        return "pkOrderId=" + requireNonNull(orderId);
    }

    @Override
    public OrderDetails getResponse() throws LinnworksAPIException {
        return new Gson().fromJson(getJsonResult(), OrderDetails.class);
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public GetOrderByIdMethod withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
}
