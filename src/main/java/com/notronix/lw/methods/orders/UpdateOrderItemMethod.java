package com.notronix.lw.methods.orders;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.OrderItem;
import com.notronix.lw.model.UpdateOrderItemResult;

import static java.util.Objects.requireNonNull;

public class UpdateOrderItemMethod extends OrdersMethod<UpdateOrderItemResult>
{
    private String orderId;
    private String fulfilmentCenterId;
    private OrderItem orderItem;
    private String source;
    private String subSource;

    @Override
    public String getName() {
        return "UpdateOrderItem";
    }

    @Override
    public String getPayload() {
        return "orderId=" + requireNonNull(orderId)
                + "&fulfilmentCenter=" + requireNonNull(fulfilmentCenterId)
                + "&source=" + requireNonNull(source)
                + "&subSource=" + requireNonNull(subSource)
                + "&orderItem=" + new Gson().toJson(requireNonNull(orderItem));
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

    public UpdateOrderItemMethod withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public String getFulfilmentCenterId() {
        return fulfilmentCenterId;
    }

    public void setFulfilmentCenterId(String fulfilmentCenterId) {
        this.fulfilmentCenterId = fulfilmentCenterId;
    }

    public UpdateOrderItemMethod withFulfilmentCenterId(String fulfilmentCenterId) {
        this.fulfilmentCenterId = fulfilmentCenterId;
        return this;
    }

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

    public UpdateOrderItemMethod withOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
        return this;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public UpdateOrderItemMethod withSource(String source) {
        this.source = source;
        return this;
    }

    public String getSubSource() {
        return subSource;
    }

    public void setSubSource(String subSource) {
        this.subSource = subSource;
    }

    public UpdateOrderItemMethod withSubSource(String subSource) {
        this.subSource = subSource;
        return this;
    }
}
