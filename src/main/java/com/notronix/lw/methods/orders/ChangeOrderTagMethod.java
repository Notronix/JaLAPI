package com.notronix.lw.methods.orders;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;

import java.util.List;

import static java.util.Arrays.asList;

public class ChangeOrderTagMethod extends OrdersMethod<List<String>>
{
    private List<String> orderIds;
    private Integer tag;

    @Override
    public String getName() {
        return "ChangeOrderTag";
    }

    @Override
    public String getPayload() {
        Gson gson = new Gson();
        return "orderIds=" + gson.toJson(orderIds) + "&tag=" + tag.toString();
    }

    @Override
    public List<String> getResponse() throws LinnworksAPIException {
        return asList(new Gson().fromJson(getJsonResult(), String[].class));
    }

    public List<String> getOrderIds() {
        return orderIds;
    }

    public void setOrderIds(List<String> orderIds) {
        this.orderIds = orderIds;
    }

    public ChangeOrderTagMethod withOrderIds(List<String> orderIds) {
        this.orderIds = orderIds;
        return this;
    }

    public Integer getTag() {
        return tag;
    }

    public void setTag(Integer tag) {
        this.tag = tag;
    }

    public ChangeOrderTagMethod withTag(Integer tag) {
        this.tag = tag;
        return this;
    }
}
