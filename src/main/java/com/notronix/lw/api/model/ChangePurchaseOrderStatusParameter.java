package com.notronix.lw.api.model;

import java.util.UUID;

public class ChangePurchaseOrderStatusParameter
{
    private UUID pkPurchaseId;
    private PurchaseOrderStatus status;

    public UUID getPkPurchaseId() {
        return pkPurchaseId;
    }

    public void setPkPurchaseId(UUID pkPurchaseId) {
        this.pkPurchaseId = pkPurchaseId;
    }

    public PurchaseOrderStatus getStatus() {
        return status;
    }

    public void setStatus(PurchaseOrderStatus status) {
        this.status = status;
    }
}
