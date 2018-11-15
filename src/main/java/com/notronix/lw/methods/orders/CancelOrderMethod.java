package com.notronix.lw.methods.orders;

import com.notronix.lw.LinnworksAPIException;

import static java.util.Objects.requireNonNull;

public class CancelOrderMethod extends OrdersMethod<String>
{
    private String orderId;
    private String fulfilmentCenterId;
    private Double refund;
    private String note;

    @Override
    public String getName() {
        return "CancelOrder";
    }

    @Override
    public String getPayload() {
        return "orderId=" + requireNonNull(orderId)
                + "&fulfilmentCenter=" + requireNonNull(fulfilmentCenterId)
                + "&refund=" + requireNonNull(refund)
                + "&note=" + (note == null ? "" : note);
    }

    @Override
    public String getResponse() throws LinnworksAPIException {
        return getJsonResult();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public CancelOrderMethod withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public String getFulfilmentCenterId() {
        return fulfilmentCenterId;
    }

    public void setFulfilmentCenterId(String fulfilmentCenterId) {
        this.fulfilmentCenterId = fulfilmentCenterId;
    }

    public CancelOrderMethod withFulfilmentCenterId(String fulfilmentCenterId) {
        this.fulfilmentCenterId = fulfilmentCenterId;
        return this;
    }

    public Double getRefund() {
        return refund;
    }

    public void setRefund(Double refund) {
        this.refund = refund;
    }

    public CancelOrderMethod withRefund(Double refund) {
        this.refund = refund;
        return this;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public CancelOrderMethod withNote(String note) {
        this.note = note;
        return this;
    }
}
