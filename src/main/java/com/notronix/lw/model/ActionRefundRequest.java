package com.notronix.lw.model;

public class ActionRefundRequest
{
    private Integer RefundHeaderId;
    private String OrderId;
    private ActionForm Request;

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

    public ActionForm getRequest() {
        return Request;
    }

    public void setRequest(ActionForm request) {
        Request = request;
    }
}
