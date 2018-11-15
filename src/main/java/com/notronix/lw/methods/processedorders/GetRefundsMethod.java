package com.notronix.lw.methods.processedorders;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.RefundInfo;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.requireNonNull;

public class GetRefundsMethod extends ProcessedOrdersMethod<List<RefundInfo>>
{
    private static final Type REFUND_INFO = new TypeToken<ArrayList<RefundInfo>>(){}.getType();

    private String orderId;

    @Override
    public String getName() {
        return "GetRefunds";
    }

    @Override
    public String getPayload() {
        return "pkOrderId=" + requireNonNull(orderId);
    }

    @Override
    public List<RefundInfo> getResponse() throws LinnworksAPIException {
        return new Gson().fromJson(getJsonResult(), REFUND_INFO);
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public GetRefundsMethod withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
}
