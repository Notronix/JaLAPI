package com.notronix.lw.model;

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

    public com.notronix.lw.model.PurchaseOrderHeader getPurchaseOrderHeader() {
        return PurchaseOrderHeader;
    }

    public void setPurchaseOrderHeader(com.notronix.lw.model.PurchaseOrderHeader purchaseOrderHeader) {
        PurchaseOrderHeader = purchaseOrderHeader;
    }
}
