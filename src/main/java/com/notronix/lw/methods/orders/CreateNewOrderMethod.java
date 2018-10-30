package com.notronix.lw.methods.orders;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.OpenOrder;

import static java.util.Objects.requireNonNull;

public class CreateNewOrderMethod extends OrdersMethod<OpenOrder>
{
    private String fulfilmentCenterId;

    @Override
    public String getName() {
        return "CreateNewOrder";
    }

    @Override
    public String getPayload() {
        return "fulfilmentCenter=" + requireNonNull(fulfilmentCenterId);
    }

    @Override
    public OpenOrder getResponse() throws LinnworksAPIException {
        return new Gson().fromJson(getJsonResult(), OpenOrder.class);
    }

    public String getFulfilmentCenterId() {
        return fulfilmentCenterId;
    }

    public void setFulfilmentCenterId(String fulfilmentCenterId) {
        this.fulfilmentCenterId = fulfilmentCenterId;
    }

    public CreateNewOrderMethod withFulfilmentCenterId(String fulfilmentCenterId) {
        this.fulfilmentCenterId = fulfilmentCenterId;
        return this;
    }
}
