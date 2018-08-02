package com.notronix.lw.model;

import java.util.List;

public class GetPurchaseOrderResponse
{
    private PurchaseOrderHeader PurchaseOrderHeader;
    private List<PurchaseOrderItem> PurchaseOrderItem;
    private Integer NoteCount;

    public com.notronix.lw.model.PurchaseOrderHeader getPurchaseOrderHeader() {
        return PurchaseOrderHeader;
    }

    public void setPurchaseOrderHeader(com.notronix.lw.model.PurchaseOrderHeader purchaseOrderHeader) {
        PurchaseOrderHeader = purchaseOrderHeader;
    }

    public List<com.notronix.lw.model.PurchaseOrderItem> getPurchaseOrderItem() {
        return PurchaseOrderItem;
    }

    public void setPurchaseOrderItem(List<com.notronix.lw.model.PurchaseOrderItem> purchaseOrderItem) {
        PurchaseOrderItem = purchaseOrderItem;
    }

    public Integer getNoteCount() {
        return NoteCount;
    }

    public void setNoteCount(Integer noteCount) {
        NoteCount = noteCount;
    }
}
