package com.notronix.lw.model;

import java.util.List;

public class OrderRefundHeader
{
    private Integer RefundHeaderId;
    private String OrderId;
    private Integer NumOrderId;
    private String ExternalReference;
    private String CreatedDate;
    private String Currency;
    private Double Amount;
    private PostSaleStatus Status;
    private Boolean Actioned;
    private String LastActionDate;
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

    public String getOrderId() {
        return OrderId;
    }

    public void setOrderId(String orderId) {
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

    public String getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(String createdDate) {
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

    public String getLastActionDate() {
        return LastActionDate;
    }

    public void setLastActionDate(String lastActionDate) {
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
