package com.notronix.lw.api.model;

import java.time.Instant;
import java.util.UUID;

public class PurchaseOrderDeliveredRecord
{
    private Integer pkDeliveryRecordId;
    private UUID fkPurchaseItemId;
    private UUID fkStockLocationId;
    private Double UnitCost;
    private Integer DeliveredQuantity;
    private Instant CreatedDateTime;
    private Instant ModifiedDateTime;
    private Integer fkBatchInventoryId;

    public Integer getPkDeliveryRecordId() {
        return pkDeliveryRecordId;
    }

    public void setPkDeliveryRecordId(Integer pkDeliveryRecordId) {
        this.pkDeliveryRecordId = pkDeliveryRecordId;
    }

    public UUID getFkPurchaseItemId() {
        return fkPurchaseItemId;
    }

    public void setFkPurchaseItemId(UUID fkPurchaseItemId) {
        this.fkPurchaseItemId = fkPurchaseItemId;
    }

    public UUID getFkStockLocationId() {
        return fkStockLocationId;
    }

    public void setFkStockLocationId(UUID fkStockLocationId) {
        this.fkStockLocationId = fkStockLocationId;
    }

    public Double getUnitCost() {
        return UnitCost;
    }

    public void setUnitCost(Double unitCost) {
        UnitCost = unitCost;
    }

    public Integer getDeliveredQuantity() {
        return DeliveredQuantity;
    }

    public void setDeliveredQuantity(Integer deliveredQuantity) {
        DeliveredQuantity = deliveredQuantity;
    }

    public Instant getCreatedDateTime() {
        return CreatedDateTime;
    }

    public void setCreatedDateTime(Instant createdDateTime) {
        CreatedDateTime = createdDateTime;
    }

    public Instant getModifiedDateTime() {
        return ModifiedDateTime;
    }

    public void setModifiedDateTime(Instant modifiedDateTime) {
        ModifiedDateTime = modifiedDateTime;
    }

    public Integer getFkBatchInventoryId() {
        return fkBatchInventoryId;
    }

    public void setFkBatchInventoryId(Integer fkBatchInventoryId) {
        this.fkBatchInventoryId = fkBatchInventoryId;
    }
}
