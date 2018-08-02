package com.notronix.lw.methods.orders;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.MoveToLocationResult;

import java.util.List;

import static java.util.Objects.requireNonNull;

public class MoveToLocationMethod extends OrdersMethod<MoveToLocationResult>
{
    private List<String> orderIds;
    private String locationId;

    @Override
    public String getName() {
        return "MoveToLocation";
    }

    @Override
    public String getPayload() {
        String payload = "orderIds=[";
        int orderCount = 0;

        for (String orderId : requireNonNull(orderIds)) {
            if (orderCount > 0) {
                payload += ",";
            }
            payload += "\"" + orderId + "\"";
            orderCount++;
        }

        payload += "]&pkStockLocationId=" + locationId;

        return payload;

    }

    @Override
    public MoveToLocationResult getResponse() throws LinnworksAPIException {
        return new Gson().fromJson(getJsonResult(), MoveToLocationResult.class);
    }

    public List<String> getOrderIds() {
        return orderIds;
    }

    public void setOrderIds(List<String> orderIds) {
        this.orderIds = orderIds;
    }

    public MoveToLocationMethod withOrderIds(List<String> orderIds) {
        this.orderIds = orderIds;
        return this;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public MoveToLocationMethod withLocationId(String locationId) {
        this.locationId = locationId;
        return this;
    }
}
