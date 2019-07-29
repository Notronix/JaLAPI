package com.notronix.lw.api.model;

import java.time.Instant;
import java.util.UUID;

public class RefundInfo
{
    private UUID pkRefundRowId;
    private String SKU;
    private String ItemTitle;
    private Boolean IsItem;
    private Boolean IsService;
    private Double Amount;
    private String Reason;
    private Boolean Actioned;
    private Instant ActionDate;
    private String ReturnReference;
    private Double Cost;
    private PostSaleStatusType RefundStatus;
    private Boolean IgnoredValidation;
    private UUID fkOrderItemRowId;
    private Boolean ShouldSerializeChannelReason;
    private String ChannelReason;
    private Boolean ShouldSerializeChannelReasonSec;
    private String ChannelReasonSec;
    private Boolean IsNew;

    public UUID getPkRefundRowId() {
        return pkRefundRowId;
    }

    public void setPkRefundRowId(UUID pkRefundRowId) {
        this.pkRefundRowId = pkRefundRowId;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public String getItemTitle() {
        return ItemTitle;
    }

    public void setItemTitle(String itemTitle) {
        ItemTitle = itemTitle;
    }

    public Boolean getItem() {
        return IsItem;
    }

    public void setItem(Boolean item) {
        IsItem = item;
    }

    public Boolean getService() {
        return IsService;
    }

    public void setService(Boolean service) {
        IsService = service;
    }

    public Double getAmount() {
        return Amount;
    }

    public void setAmount(Double amount) {
        Amount = amount;
    }

    public String getReason() {
        return Reason;
    }

    public void setReason(String reason) {
        Reason = reason;
    }

    public Boolean getActioned() {
        return Actioned;
    }

    public void setActioned(Boolean actioned) {
        Actioned = actioned;
    }

    public Instant getActionDate() {
        return ActionDate;
    }

    public void setActionDate(Instant actionDate) {
        ActionDate = actionDate;
    }

    public String getReturnReference() {
        return ReturnReference;
    }

    public void setReturnReference(String returnReference) {
        ReturnReference = returnReference;
    }

    public Double getCost() {
        return Cost;
    }

    public void setCost(Double cost) {
        Cost = cost;
    }

    public PostSaleStatusType getRefundStatus() {
        return RefundStatus;
    }

    public void setRefundStatus(PostSaleStatusType refundStatus) {
        RefundStatus = refundStatus;
    }

    public Boolean getIgnoredValidation() {
        return IgnoredValidation;
    }

    public void setIgnoredValidation(Boolean ignoredValidation) {
        IgnoredValidation = ignoredValidation;
    }

    public UUID getFkOrderItemRowId() {
        return fkOrderItemRowId;
    }

    public void setFkOrderItemRowId(UUID fkOrderItemRowId) {
        this.fkOrderItemRowId = fkOrderItemRowId;
    }

    public Boolean getShouldSerializeChannelReason() {
        return ShouldSerializeChannelReason;
    }

    public void setShouldSerializeChannelReason(Boolean shouldSerializeChannelReason) {
        ShouldSerializeChannelReason = shouldSerializeChannelReason;
    }

    public String getChannelReason() {
        return ChannelReason;
    }

    public void setChannelReason(String channelReason) {
        ChannelReason = channelReason;
    }

    public Boolean getShouldSerializeChannelReasonSec() {
        return ShouldSerializeChannelReasonSec;
    }

    public void setShouldSerializeChannelReasonSec(Boolean shouldSerializeChannelReasonSec) {
        ShouldSerializeChannelReasonSec = shouldSerializeChannelReasonSec;
    }

    public String getChannelReasonSec() {
        return ChannelReasonSec;
    }

    public void setChannelReasonSec(String channelReasonSec) {
        ChannelReasonSec = channelReasonSec;
    }

    public Boolean getNew() {
        return IsNew;
    }

    public void setNew(Boolean aNew) {
        IsNew = aNew;
    }
}
