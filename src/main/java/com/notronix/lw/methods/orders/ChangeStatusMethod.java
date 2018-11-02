package com.notronix.lw.methods.orders;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.OrderStatus;

import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.requireNonNull;

public class ChangeStatusMethod extends OrdersMethod<List<String>>
{
    private List<String> orderIds;
    private OrderStatus status;

    @Override
    public String getName() {
        return "ChangeStatus";
    }

    @Override
    public String getPayload() {
        return "orderIds=" + new Gson().toJson(requireNonNull(orderIds)) + "&status=" + requireNonNull(status).ordinal();
    }

    @Override
    public List<String> getResponse() throws LinnworksAPIException {
        return new Gson().fromJson(getJsonResult(), new TypeToken<ArrayList<String>>()
        {
        }.getType());
    }

    public List<String> getOrderIds() {
        return orderIds;
    }

    public void setOrderIds(List<String> orderIds) {
        this.orderIds = orderIds;
    }

    public ChangeStatusMethod withOrderIds(List<String> orderIds) {
        this.orderIds = orderIds;
        return this;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public ChangeStatusMethod withStatus(OrderStatus status) {
        this.status = status;
        return this;
    }
}
