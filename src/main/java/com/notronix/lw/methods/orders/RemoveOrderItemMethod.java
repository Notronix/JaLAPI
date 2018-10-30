package com.notronix.lw.methods.orders;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.UpdateOrderItemResult;

import static java.util.Objects.requireNonNull;

public class RemoveOrderItemMethod extends OrdersMethod<UpdateOrderItemResult>
{
    private String orderId;
    private String rowId;
    private String fulfilmentCenterId;

    @Override
    public String getName() {
        return "RemoveOrderItem";
    }

    @Override
    public String getPayload() {
        return "orderId=" + requireNonNull(orderId) + "&rowid=" + requireNonNull(rowId)
                + "&fulfilmentCenter=" + requireNonNull(fulfilmentCenterId);
    }

    @Override
    public UpdateOrderItemResult getResponse() throws LinnworksAPIException {
        return new Gson().fromJson(getJsonResult(), UpdateOrderItemResult.class);
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public RemoveOrderItemMethod withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public RemoveOrderItemMethod withRowId(String rowId) {
        this.rowId = rowId;
        return this;
    }

    public String getFulfilmentCenterId() {
        return fulfilmentCenterId;
    }

    public void setFulfilmentCenterId(String fulfilmentCenterId) {
        this.fulfilmentCenterId = fulfilmentCenterId;
    }

    public RemoveOrderItemMethod withFulfilmentCenterId(String fulfilmentCenterId) {
        this.fulfilmentCenterId = fulfilmentCenterId;
        return this;
    }
}
