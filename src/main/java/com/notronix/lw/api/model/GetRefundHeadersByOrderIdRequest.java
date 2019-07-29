package com.notronix.lw.api.model;

import java.util.UUID;

public class GetRefundHeadersByOrderIdRequest
{
    private UUID OrderId;

    public UUID getOrderId() {
        return OrderId;
    }

    public void setOrderId(UUID orderId) {
        OrderId = orderId;
    }

    public GetRefundHeadersByOrderIdRequest withOrderId(UUID orderId) {
        OrderId = orderId;
        return this;
    }
}
