package com.notronix.lw.api.model;

import java.util.List;

public class RefundOptions
{
    private Boolean CanRefund;
    private Boolean CanRefundInternally;
    private Boolean CanRefundItems;
    private Boolean CanRefundServices;
    private Boolean CanRefundShipping;
    private Boolean CanRefundShippingIndependently;
    private Boolean CanRefundAdditionally;
    private Boolean CanRefundFreeText;
    private Boolean CanInsufficientRefundFreeText;
    private Integer RefundFreeTextOrNoteMaxLength;
    private List<PostSaleSubStatus> SubStatuses;
    private List<ChannelReason> InsufficientRefundReasons;
    private List<ChannelReason> ItemRefundReasons;
    private List<ChannelReason> ServiceRefundReasons;
    private List<ChannelReason> ShippingRefundReasons;
    private CannotRefundReasonType CannotRefundReason;
    private OrderDetails Order;
    private OrderRefundHeader RefundHeader;
    private List<VerifiedRefund> AllExistingRefunds;
    private List<String> Errors;

    public Boolean getCanRefund() {
        return CanRefund;
    }

    public void setCanRefund(Boolean canRefund) {
        CanRefund = canRefund;
    }

    public Boolean getCanRefundInternally() {
        return CanRefundInternally;
    }

    public void setCanRefundInternally(Boolean canRefundInternally) {
        CanRefundInternally = canRefundInternally;
    }

    public Boolean getCanRefundItems() {
        return CanRefundItems;
    }

    public void setCanRefundItems(Boolean canRefundItems) {
        CanRefundItems = canRefundItems;
    }

    public Boolean getCanRefundServices() {
        return CanRefundServices;
    }

    public void setCanRefundServices(Boolean canRefundServices) {
        CanRefundServices = canRefundServices;
    }

    public Boolean getCanRefundShipping() {
        return CanRefundShipping;
    }

    public void setCanRefundShipping(Boolean canRefundShipping) {
        CanRefundShipping = canRefundShipping;
    }

    public Boolean getCanRefundShippingIndependently() {
        return CanRefundShippingIndependently;
    }

    public void setCanRefundShippingIndependently(Boolean canRefundShippingIndependently) {
        CanRefundShippingIndependently = canRefundShippingIndependently;
    }

    public Boolean getCanRefundAdditionally() {
        return CanRefundAdditionally;
    }

    public void setCanRefundAdditionally(Boolean canRefundAdditionally) {
        CanRefundAdditionally = canRefundAdditionally;
    }

    public Boolean getCanRefundFreeText() {
        return CanRefundFreeText;
    }

    public void setCanRefundFreeText(Boolean canRefundFreeText) {
        CanRefundFreeText = canRefundFreeText;
    }

    public Boolean getCanInsufficientRefundFreeText() {
        return CanInsufficientRefundFreeText;
    }

    public void setCanInsufficientRefundFreeText(Boolean canInsufficientRefundFreeText) {
        CanInsufficientRefundFreeText = canInsufficientRefundFreeText;
    }

    public Integer getRefundFreeTextOrNoteMaxLength() {
        return RefundFreeTextOrNoteMaxLength;
    }

    public void setRefundFreeTextOrNoteMaxLength(Integer refundFreeTextOrNoteMaxLength) {
        RefundFreeTextOrNoteMaxLength = refundFreeTextOrNoteMaxLength;
    }

    public List<PostSaleSubStatus> getSubStatuses() {
        return SubStatuses;
    }

    public void setSubStatuses(List<PostSaleSubStatus> subStatuses) {
        SubStatuses = subStatuses;
    }

    public List<ChannelReason> getInsufficientRefundReasons() {
        return InsufficientRefundReasons;
    }

    public void setInsufficientRefundReasons(List<ChannelReason> insufficientRefundReasons) {
        InsufficientRefundReasons = insufficientRefundReasons;
    }

    public List<ChannelReason> getItemRefundReasons() {
        return ItemRefundReasons;
    }

    public void setItemRefundReasons(List<ChannelReason> itemRefundReasons) {
        ItemRefundReasons = itemRefundReasons;
    }

    public List<ChannelReason> getServiceRefundReasons() {
        return ServiceRefundReasons;
    }

    public void setServiceRefundReasons(List<ChannelReason> serviceRefundReasons) {
        ServiceRefundReasons = serviceRefundReasons;
    }

    public List<ChannelReason> getShippingRefundReasons() {
        return ShippingRefundReasons;
    }

    public void setShippingRefundReasons(List<ChannelReason> shippingRefundReasons) {
        ShippingRefundReasons = shippingRefundReasons;
    }

    public CannotRefundReasonType getCannotRefundReason() {
        return CannotRefundReason;
    }

    public void setCannotRefundReason(CannotRefundReasonType cannotRefundReason) {
        CannotRefundReason = cannotRefundReason;
    }

    public OrderDetails getOrder() {
        return Order;
    }

    public void setOrder(OrderDetails order) {
        Order = order;
    }

    public OrderRefundHeader getRefundHeader() {
        return RefundHeader;
    }

    public void setRefundHeader(OrderRefundHeader refundHeader) {
        RefundHeader = refundHeader;
    }

    public List<VerifiedRefund> getAllExistingRefunds() {
        return AllExistingRefunds;
    }

    public void setAllExistingRefunds(List<VerifiedRefund> allExistingRefunds) {
        AllExistingRefunds = allExistingRefunds;
    }

    public List<String> getErrors() {
        return Errors;
    }

    public void setErrors(List<String> errors) {
        Errors = errors;
    }
}
