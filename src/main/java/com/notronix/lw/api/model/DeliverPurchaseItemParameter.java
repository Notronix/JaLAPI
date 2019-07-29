package com.notronix.lw.api.model;

import java.util.UUID;

public class DeliverPurchaseItemParameter
{
    private String BatchNumber;
    private String BinRack;
    private Integer PrioritySequence;
    private String BatchStatus;
    private UUID pkPurchaseId;
    private UUID pkPurchaseItemId;
    private Integer Delivered;
    private Integer AddToDelivered;

    public String getBatchNumber() {
        return BatchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        BatchNumber = batchNumber;
    }

    public String getBinRack() {
        return BinRack;
    }

    public void setBinRack(String binRack) {
        BinRack = binRack;
    }

    public Integer getPrioritySequence() {
        return PrioritySequence;
    }

    public void setPrioritySequence(Integer prioritySequence) {
        PrioritySequence = prioritySequence;
    }

    public String getBatchStatus() {
        return BatchStatus;
    }

    public void setBatchStatus(String batchStatus) {
        BatchStatus = batchStatus;
    }

    public UUID getPkPurchaseId() {
        return pkPurchaseId;
    }

    public void setPkPurchaseId(UUID pkPurchaseId) {
        this.pkPurchaseId = pkPurchaseId;
    }

    public UUID getPkPurchaseItemId() {
        return pkPurchaseItemId;
    }

    public void setPkPurchaseItemId(UUID pkPurchaseItemId) {
        this.pkPurchaseItemId = pkPurchaseItemId;
    }

    public Integer getDelivered() {
        return Delivered;
    }

    public void setDelivered(Integer delivered) {
        Delivered = delivered;
    }

    public Integer getAddToDelivered() {
        return AddToDelivered;
    }

    public void setAddToDelivered(Integer addToDelivered) {
        AddToDelivered = addToDelivered;
    }
}
