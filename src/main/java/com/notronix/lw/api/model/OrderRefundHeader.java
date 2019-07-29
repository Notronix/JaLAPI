package com.notronix.lw.api.model;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

public class OrderRefundHeader
{
    private Integer RefundHeaderId;
    private UUID OrderId;
    private Integer NumOrderId;
    private String ExternalReference;
    private Instant CreatedDate;
    private String Currency;
    private Double Amount;
    private PostSaleStatus Status;
    private Boolean Actioned;
    private Instant LastActionDate;
    private String OrderSource;
    private String OrderSubSource;
    private Boolean ChannelInitiated;
    private List<VerifiedRefund> RefundLines;
    private String RefundLink;

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

    public Integer getNumOrderId() {
        return NumOrderId;
    }

    public void setNumOrderId(Integer numOrderId) {
        NumOrderId = numOrderId;
    }

    public String getExternalReference() {
        return ExternalReference;
    }

    public void setExternalReference(String externalReference) {
        ExternalReference = externalReference;
    }

    public Instant getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(Instant createdDate) {
        CreatedDate = createdDate;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }

    public Double getAmount() {
        return Amount;
    }

    public void setAmount(Double amount) {
        Amount = amount;
    }

    public PostSaleStatus getStatus() {
        return Status;
    }

    public void setStatus(PostSaleStatus status) {
        Status = status;
    }

    public Boolean getActioned() {
        return Actioned;
    }

    public void setActioned(Boolean actioned) {
        Actioned = actioned;
    }

    public Instant getLastActionDate() {
        return LastActionDate;
    }

    public void setLastActionDate(Instant lastActionDate) {
        LastActionDate = lastActionDate;
    }

    public String getOrderSource() {
        return OrderSource;
    }

    public void setOrderSource(String orderSource) {
        OrderSource = orderSource;
    }

    public String getOrderSubSource() {
        return OrderSubSource;
    }

    public void setOrderSubSource(String orderSubSource) {
        OrderSubSource = orderSubSource;
    }

    public Boolean getChannelInitiated() {
        return ChannelInitiated;
    }

    public void setChannelInitiated(Boolean channelInitiated) {
        ChannelInitiated = channelInitiated;
    }

    public List<VerifiedRefund> getRefundLines() {
        return RefundLines;
    }

    public void setRefundLines(List<VerifiedRefund> refundLines) {
        RefundLines = refundLines;
    }

    public String getRefundLink() {
        return RefundLink;
    }

    public void setRefundLink(String refundLink) {
        RefundLink = refundLink;
    }
}
