package com.notronix.lw.methods.orders;

import com.notronix.lw.LinnworksAPIException;

import static java.util.Objects.requireNonNull;

public class DeleteOrderMethod extends OrdersMethod<String>
{
    private String orderId;

    @Override
    public String getName() {
        return "DeleteOrder";
    }

    @Override
    public String getPayload() {
        return "orderId=" + requireNonNull(orderId);
    }

    @Override
    public String getResponse() throws LinnworksAPIException {
        return orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public DeleteOrderMethod withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
}
