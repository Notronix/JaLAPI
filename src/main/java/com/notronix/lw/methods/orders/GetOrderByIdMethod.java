package com.notronix.lw.methods.orders;

import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.OrderDetails;

public class GetOrderByIdMethod extends OrdersMethod<OrderDetails>
{
    private String orderId;

    @Override
    public String getName() {
        return "GetOrderById";
    }

    @Override
    public String getPayload() {
        return "pkOrderId=" + orderId;
    }

    @Override
    public OrderDetails getResponse() throws LinnworksAPIException {
        return null;
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
