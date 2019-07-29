package com.notronix.lw.api.model;

import java.util.List;
import java.util.UUID;

public class OpenOrder
{
    private String ORDER_NOT_FOUND_ERROR;
    private Integer NumOrderId;
    private OrderGeneralInfo GeneralInfo;
    private OrderShippingInfo ShippingInfo;
    private OrderCustomerInfo CustomerInfo;
    private OrderTotalsInfo TotalsInfo;
    private List<String> FolderName;
    private Integer OrderOnPage;
    private Boolean IsPostFilteredOut;
    private Boolean CanFulfil;
    private List<OrderItem> Items;
    private Boolean HasItems;
    private UUID OrderId;

    public String getORDER_NOT_FOUND_ERROR() {
        return ORDER_NOT_FOUND_ERROR;
    }

    public void setORDER_NOT_FOUND_ERROR(String ORDER_NOT_FOUND_ERROR) {
        this.ORDER_NOT_FOUND_ERROR = ORDER_NOT_FOUND_ERROR;
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

    public OrderGeneralInfo getGeneralInfo() {
        return GeneralInfo;
    }

    public void setGeneralInfo(OrderGeneralInfo generalInfo) {
        GeneralInfo = generalInfo;
    }

    public OrderShippingInfo getShippingInfo() {
        return ShippingInfo;
    }

    public void setShippingInfo(OrderShippingInfo shippingInfo) {
        ShippingInfo = shippingInfo;
    }

    public OrderCustomerInfo getCustomerInfo() {
        return CustomerInfo;
    }

    public void setCustomerInfo(OrderCustomerInfo customerInfo) {
        CustomerInfo = customerInfo;
    }

    public OrderTotalsInfo getTotalsInfo() {
        return TotalsInfo;
    }

    public void setTotalsInfo(OrderTotalsInfo totalsInfo) {
        TotalsInfo = totalsInfo;
    }

    public List<String> getFolderName() {
        return FolderName;
    }

    public void setFolderName(List<String> folderName) {
        FolderName = folderName;
    }

    public List<OrderItem> getItems() {
        return Items;
    }

    public void setItems(List<OrderItem> items) {
        Items = items;
    }

    public Integer getOrderOnPage() {
        return OrderOnPage;
    }

    public void setOrderOnPage(Integer orderOnPage) {
        OrderOnPage = orderOnPage;
    }

    public Boolean getPostFilteredOut() {
        return IsPostFilteredOut;
    }

    public void setPostFilteredOut(Boolean postFilteredOut) {
        IsPostFilteredOut = postFilteredOut;
    }

    public Boolean getCanFulfil() {
        return CanFulfil;
    }

    public void setCanFulfil(Boolean canFulfil) {
        CanFulfil = canFulfil;
    }

    public Boolean getHasItems() {
        return HasItems;
    }

    public void setHasItems(Boolean hasItems) {
        HasItems = hasItems;
    }
}
