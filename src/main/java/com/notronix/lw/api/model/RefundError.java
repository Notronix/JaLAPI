package com.notronix.lw.api.model;

import java.time.Instant;
import java.util.UUID;

public class RefundError
{
    private UUID RefundRowId;
    private String ErrorMessage;
    private Instant DateStamp;
    private Boolean Acknowledged;

    public UUID getRefundRowId() {
        return RefundRowId;
    }

    public void setRefundRowId(UUID refundRowId) {
        RefundRowId = refundRowId;
    }

    public String getErrorMessage() {
        return ErrorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        ErrorMessage = errorMessage;
    }

    public Instant getDateStamp() {
        return DateStamp;
    }

    public void setDateStamp(Instant dateStamp) {
        DateStamp = dateStamp;
    }

    public Boolean getAcknowledged() {
        return Acknowledged;
    }

    public void setAcknowledged(Boolean acknowledged) {
        Acknowledged = acknowledged;
    }
}
