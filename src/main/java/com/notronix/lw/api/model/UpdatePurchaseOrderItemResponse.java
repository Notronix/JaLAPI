package com.notronix.lw.api.model;

public class UpdatePurchaseOrderItemResponse
{
    private PurchaseOrderItem NewPurchaseOrderItem;
    private PurchaseOrderHeader PurchaseOrderHeader;

    public PurchaseOrderItem getNewPurchaseOrderItem() {
        return NewPurchaseOrderItem;
    }

    public void setNewPurchaseOrderItem(PurchaseOrderItem newPurchaseOrderItem) {
        NewPurchaseOrderItem = newPurchaseOrderItem;
    }

    public PurchaseOrderHeader getPurchaseOrderHeader() {
        return PurchaseOrderHeader;
    }

    public void setPurchaseOrderHeader(PurchaseOrderHeader purchaseOrderHeader) {
        PurchaseOrderHeader = purchaseOrderHeader;
    }
}
