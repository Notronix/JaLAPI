package com.notronix.lw.api.model;

import java.util.List;

public class GetPurchaseOrderResponse
{
    private PurchaseOrderHeader PurchaseOrderHeader;
    private List<PurchaseOrderItem> PurchaseOrderItem;
    private List<PurchaseOrderAdditionalCost> AdditionalCosts;
    private Integer NoteCount;
    private List<PurchaseOrderPaymentStatement> PaymentStatements;
    private List<PurchaseOrderDeliveredRecord> DeliveredRecords;

    public PurchaseOrderHeader getPurchaseOrderHeader() {
        return PurchaseOrderHeader;
    }

    public void setPurchaseOrderHeader(PurchaseOrderHeader purchaseOrderHeader) {
        PurchaseOrderHeader = purchaseOrderHeader;
    }

    public List<PurchaseOrderItem> getPurchaseOrderItem() {
        return PurchaseOrderItem;
    }

    public void setPurchaseOrderItem(List<PurchaseOrderItem> purchaseOrderItem) {
        PurchaseOrderItem = purchaseOrderItem;
    }

    public Integer getNoteCount() {
        return NoteCount;
    }

    public void setNoteCount(Integer noteCount) {
        NoteCount = noteCount;
    }

    public List<PurchaseOrderAdditionalCost> getAdditionalCosts() {
        return AdditionalCosts;
    }

    public void setAdditionalCosts(List<PurchaseOrderAdditionalCost> additionalCosts) {
        AdditionalCosts = additionalCosts;
    }

    public List<PurchaseOrderPaymentStatement> getPaymentStatements() {
        return PaymentStatements;
    }

    public void setPaymentStatements(List<PurchaseOrderPaymentStatement> paymentStatements) {
        PaymentStatements = paymentStatements;
    }

    public List<PurchaseOrderDeliveredRecord> getDeliveredRecords() {
        return DeliveredRecords;
    }

    public void setDeliveredRecords(List<PurchaseOrderDeliveredRecord> deliveredRecords) {
        DeliveredRecords = deliveredRecords;
    }
}
