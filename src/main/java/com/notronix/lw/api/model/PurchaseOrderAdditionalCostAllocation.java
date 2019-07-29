package com.notronix.lw.api.model;

import java.util.UUID;

public class PurchaseOrderAdditionalCostAllocation
{
    private Integer CostAllocationId;
    private Integer PurchaseAdditionalCostItemId;
    private UUID PurchaseItemId;
    private Double AllocationPercentage;

    public Integer getCostAllocationId() {
        return CostAllocationId;
    }

    public void setCostAllocationId(Integer costAllocationId) {
        CostAllocationId = costAllocationId;
    }

    public Integer getPurchaseAdditionalCostItemId() {
        return PurchaseAdditionalCostItemId;
    }

    public void setPurchaseAdditionalCostItemId(Integer purchaseAdditionalCostItemId) {
        PurchaseAdditionalCostItemId = purchaseAdditionalCostItemId;
    }

    public UUID getPurchaseItemId() {
        return PurchaseItemId;
    }

    public void setPurchaseItemId(UUID purchaseItemId) {
        PurchaseItemId = purchaseItemId;
    }

    public Double getAllocationPercentage() {
        return AllocationPercentage;
    }

    public void setAllocationPercentage(Double allocationPercentage) {
        AllocationPercentage = allocationPercentage;
    }
}
