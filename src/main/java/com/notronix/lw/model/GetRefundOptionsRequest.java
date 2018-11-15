package com.notronix.lw.model;

public class GetRefundOptionsRequest
{
    private Integer RefundHeaderId;
    private String OrderId;

    public Integer getRefundHeaderId() {
        return RefundHeaderId;
    }

    public void setRefundHeaderId(Integer refundHeaderId) {
        RefundHeaderId = refundHeaderId;
    }

    public String getOrderId() {
        return OrderId;
    }

    public void setOrderId(String orderId) {
        OrderId = orderId;
    }
}
