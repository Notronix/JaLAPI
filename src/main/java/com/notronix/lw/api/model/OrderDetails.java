package com.notronix.lw.api.model;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

public class OrderDetails
{
    private UUID OrderId;
    private Integer NumOrderId;
    private Boolean Processed;
    private Instant ProcessedDateTime;
    private UUID FulfilmentLocationId;
    private OrderGeneralInfo GeneralInfo;
    private OrderShippingInfo ShippingInfo;
    private OrderCustomerInfo CustomerInfo;
    private OrderTotalsInfo TotalsInfo;
    private List<ExtendedProperty> ExtendedProperties;
    private List<String> FolderName;
    private List<OrderItem> Items;
    private List<OrderNote> Notes;

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

    public Boolean getProcessed() {
        return Processed;
    }

    public void setProcessed(Boolean processed) {
        Processed = processed;
    }

    public Instant getProcessedDateTime() {
        return ProcessedDateTime;
    }

    public void setProcessedDateTime(Instant processedDateTime) {
        ProcessedDateTime = processedDateTime;
    }

    public UUID getFulfilmentLocationId() {
        return FulfilmentLocationId;
    }

    public void setFulfilmentLocationId(UUID fulfilmentLocationId) {
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
