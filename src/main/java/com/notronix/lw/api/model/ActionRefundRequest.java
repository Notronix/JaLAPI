package com.notronix.lw.api.model;

import java.util.UUID;

public class ActionRefundRequest
{
    private Integer RefundHeaderId;
    private UUID OrderId;
    private ActionForm Request;

    public Integer getRefundHeaderId() {
        return RefundHeaderId;
    }

    public void setRefundHeaderId(Integer refundHeaderId) {
        RefundHeaderId = refundHeaderId;
    }

    public UUID getOrderId() {
        return OrderId;
    }

    public void setOrderId(UUID orderId) {
        OrderId = orderId;
    }

    public ActionForm getRequest() {
        return Request;
    }

    public void setRequest(ActionForm request) {
        Request = request;
    }
}
