package com.notronix.lw.model;

public class VerifiedRefund
{
    private RefundValidationErrorType RefundValidationError;
    private String RefundRowId;
    private PostSaleStatus Status;
    private RefundUnitType RefundedUnit;
    private Boolean IsShippingRefund;
    private Boolean IsAdditionalRefund;
    private VerifiedRefundItem RefundedItem;
    private String Error;
    private String ExternalReference;
    private Boolean Actioned;
    private String ActionedDate;
    private Boolean ChannelInitiated;
    private Boolean Deleted	;
    private Boolean IsFreeText;
    private String FreeTextOrNote;
    private Double Amount;
    private String ReasonTag;
    private String SubReasonTag	;
    private String InsufficientRefundTag;
    private String InsufficientRefundNote;

    public RefundValidationErrorType getRefundValidationError() {
        return RefundValidationError;
    }

    public void setRefundValidationError(RefundValidationErrorType refundValidationError) {
        RefundValidationError = refundValidationError;
    }

    public String getRefundRowId() {
        return RefundRowId;
    }

    public void setRefundRowId(String refundRowId) {
        RefundRowId = refundRowId;
    }

    public PostSaleStatus getStatus() {
        return Status;
    }

    public void setStatus(PostSaleStatus status) {
        Status = status;
    }

    public RefundUnitType getRefundedUnit() {
        return RefundedUnit;
    }

    public void setRefundedUnit(RefundUnitType refundedUnit) {
        RefundedUnit = refundedUnit;
    }

    public Boolean getShippingRefund() {
        return IsShippingRefund;
    }

    public void setShippingRefund(Boolean shippingRefund) {
        IsShippingRefund = shippingRefund;
    }

    public Boolean getAdditionalRefund() {
        return IsAdditionalRefund;
    }

    public void setAdditionalRefund(Boolean additionalRefund) {
        IsAdditionalRefund = additionalRefund;
    }

    public VerifiedRefundItem getRefundedItem() {
        return RefundedItem;
    }

    public void setRefundedItem(VerifiedRefundItem refundedItem) {
        RefundedItem = refundedItem;
    }

    public String getError() {
        return Error;
    }

    public void setError(String error) {
        Error = error;
    }

    public String getExternalReference() {
        return ExternalReference;
    }

    public void setExternalReference(String externalReference) {
        ExternalReference = externalReference;
    }

    public Boolean getActioned() {
        return Actioned;
    }

    public void setActioned(Boolean actioned) {
        Actioned = actioned;
    }

    public String getActionedDate() {
        return ActionedDate;
    }

    public void setActionedDate(String actionedDate) {
        ActionedDate = actionedDate;
    }

    public Boolean getChannelInitiated() {
        return ChannelInitiated;
    }

    public void setChannelInitiated(Boolean channelInitiated) {
        ChannelInitiated = channelInitiated;
    }

    public Boolean getDeleted() {
        return Deleted;
    }

    public void setDeleted(Boolean deleted) {
        Deleted = deleted;
    }

    public Boolean getFreeText() {
        return IsFreeText;
    }

    public void setFreeText(Boolean freeText) {
        IsFreeText = freeText;
    }

    public String getFreeTextOrNote() {
        return FreeTextOrNote;
    }

    public void setFreeTextOrNote(String freeTextOrNote) {
        FreeTextOrNote = freeTextOrNote;
    }

    public Double getAmount() {
        return Amount;
    }

    public void setAmount(Double amount) {
        Amount = amount;
    }

    public String getReasonTag() {
        return ReasonTag;
    }

    public void setReasonTag(String reasonTag) {
        ReasonTag = reasonTag;
    }

    public String getSubReasonTag() {
        return SubReasonTag;
    }

    public void setSubReasonTag(String subReasonTag) {
        SubReasonTag = subReasonTag;
    }

    public String getInsufficientRefundTag() {
        return InsufficientRefundTag;
    }

    public void setInsufficientRefundTag(String insufficientRefundTag) {
        InsufficientRefundTag = insufficientRefundTag;
    }

    public String getInsufficientRefundNote() {
        return InsufficientRefundNote;
    }

    public void setInsufficientRefundNote(String insufficientRefundNote) {
        InsufficientRefundNote = insufficientRefundNote;
    }
}
