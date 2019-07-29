package com.notronix.lw.api.model;

import java.util.UUID;

public class GetRefundOptionsRequest
{
    private Integer RefundHeaderId;
    private UUID OrderId;

    public Integer getRefundHeaderId() {
        return RefundHeaderId;
    }

    public void setRefundHeaderId(Integer refundHeaderId) {
        RefundHeaderId = refundHeaderId;
    }

    public GetRefundOptionsRequest withRefundHeaderId(Integer refundHeaderId) {
        RefundHeaderId = refundHeaderId;
        return this;
    }

    public UUID getOrderId() {
        return OrderId;
    }

    public void setOrderId(UUID orderId) {
        OrderId = orderId;
    }

    public GetRefundOptionsRequest withOrderId(UUID orderId) {
        OrderId = orderId;
        return this;
    }
}
