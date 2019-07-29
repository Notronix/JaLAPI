package com.notronix.lw.api.model;

import java.util.UUID;

public class OrderItemBinRack
{
    private Integer Quantity;
    private String BinRack;
    private UUID Location;
    private Integer BatchId	;
    private Integer OrderItemBatchId;

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer quantity) {
        Quantity = quantity;
    }

    public String getBinRack() {
        return BinRack;
    }

    public void setBinRack(String binRack) {
        BinRack = binRack;
    }

    public UUID getLocation() {
        return Location;
    }

    public void setLocation(UUID location) {
        Location = location;
    }

    public Integer getBatchId() {
        return BatchId;
    }

    public void setBatchId(Integer batchId) {
        BatchId = batchId;
    }

    public Integer getOrderItemBatchId() {
        return OrderItemBatchId;
    }

    public void setOrderItemBatchId(Integer orderItemBatchId) {
        OrderItemBatchId = orderItemBatchId;
    }
}
