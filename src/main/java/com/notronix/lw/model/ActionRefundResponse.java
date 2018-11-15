package com.notronix.lw.model;

import java.util.List;

public class ActionRefundResponse
{
    private Integer RefundHeaderId;
    private String RefundReference;
    private PostSaleStatus Status;
    private CannotRefundReasonType CannotRefundReason;
    private List<String> Errors;
    private List<VerifiedRefund> RefundLines;

    public Integer getRefundHeaderId() {
        return RefundHeaderId;
    }

    public void setRefundHeaderId(Integer refundHeaderId) {
        RefundHeaderId = refundHeaderId;
    }

    public String getRefundReference() {
        return RefundReference;
    }

    public void setRefundReference(String refundReference) {
        RefundReference = refundReference;
    }

    public PostSaleStatus getStatus() {
        return Status;
    }

    public void setStatus(PostSaleStatus status) {
        Status = status;
    }

    public CannotRefundReasonType getCannotRefundReason() {
        return CannotRefundReason;
    }

    public void setCannotRefundReason(CannotRefundReasonType cannotRefundReason) {
        CannotRefundReason = cannotRefundReason;
    }

    public List<String> getErrors() {
        return Errors;
    }

    public void setErrors(List<String> errors) {
        Errors = errors;
    }

    public List<VerifiedRefund> getRefundLines() {
        return RefundLines;
    }

    public void setRefundLines(List<VerifiedRefund> refundLines) {
        RefundLines = refundLines;
    }
}
