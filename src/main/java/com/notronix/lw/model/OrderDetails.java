package com.notronix.lw.model;

import java.util.List;

public class OrderDetails {
    private String OrderId;
    private Integer NumOrderId;
    private Boolean Processed;
    private String ProcessedDateTime;
    private String FulfilmentLocationId;
    private OrderGeneralInfo GeneralInfo;
    private OrderShippingInfo ShippingInfo;
    private OrderCustomerInfo CustomerInfo;
    private OrderTotalsInfo TotalsInfo;
    private List<ExtendedProperty> ExtendedProperties;
    private List<String> FolderName;
    private List<OrderItem> Items;
    private List<OrderNote> Notes;

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

    public Boolean getProcessed() {
        return Processed;
    }

    public void setProcessed(Boolean processed) {
        Processed = processed;
    }

    public String getProcessedDateTime() {
        return ProcessedDateTime;
    }

    public void setProcessedDateTime(String processedDateTime) {
        ProcessedDateTime = processedDateTime;
    }

    public String getFulfilmentLocationId() {
        return FulfilmentLocationId;
    }

    public void setFulfilmentLocationId(String fulfilmentLocationId) {
        FulfilmentLocationId = fulfilmentLocationId;
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

    public List<ExtendedProperty> getExtendedProperties() {
        return ExtendedProperties;
    }

    public void setExtendedProperties(List<ExtendedProperty> extendedProperties) {
        ExtendedProperties = extendedProperties;
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

    public List<OrderNote> getNotes() {
        return Notes;
    }

    public void setNotes(List<OrderNote> notes) {
        Notes = notes;
    }
}
