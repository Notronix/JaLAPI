package com.notronix.lw.model;

public class ChangePurchaseOrderStatusParameter
{
    private String pkPurchaseId	;
    private PurchaseOrderStatus status;

    public String getPkPurchaseId() {
        return pkPurchaseId;
    }

    public void setPkPurchaseId(String pkPurchaseId) {
        this.pkPurchaseId = pkPurchaseId;
    }

    public PurchaseOrderStatus getStatus() {
        return status;
    }

    public void setStatus(PurchaseOrderStatus status) {
        this.status = status;
    }
}
