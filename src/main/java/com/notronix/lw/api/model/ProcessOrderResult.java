package com.notronix.lw.api.model;

import java.util.UUID;

public class ProcessOrderResult
{
    private UUID OrderId;
    private Boolean Processed;
    private String Error;

    public UUID getOrderId() {
        return OrderId;
    }

    public void setOrderId(UUID orderId) {
        OrderId = orderId;
    }

    public Boolean getProcessed() {
        return Processed;
    }

    public void setProcessed(Boolean processed) {
        Processed = processed;
    }

    public String getError() {
        return Error;
    }

    public void setError(String error) {
        Error = error;
    }
}
