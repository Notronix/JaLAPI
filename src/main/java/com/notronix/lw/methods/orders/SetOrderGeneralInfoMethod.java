package com.notronix.lw.methods.orders;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.OrderGeneralInfo;

import static java.util.Objects.requireNonNull;

public class SetOrderGeneralInfoMethod extends OrdersMethod<OrderGeneralInfo>
{
    private String orderId;
    private OrderGeneralInfo info;
    private Boolean wasDraft;

    @Override
    public String getName() {
        return "SetOrderGeneralInfo";
    }

    @Override
    public String getPayload() {
        String payload = "orderId=" + requireNonNull(orderId)
                + "&info=" + new Gson().toJson(requireNonNull(info))
                + "&wasDraft=" + requireNonNull(wasDraft).toString();

        return payload;
    }

    @Override
    public OrderGeneralInfo getResponse() throws LinnworksAPIException {
        return info;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public SetOrderGeneralInfoMethod withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public OrderGeneralInfo getInfo() {
        return info;
    }

    public void setInfo(OrderGeneralInfo info) {
        this.info = info;
    }

    public SetOrderGeneralInfoMethod withInfo(OrderGeneralInfo info) {
        this.info = info;
        return this;
    }

    public Boolean getWasDraft() {
        return wasDraft;
    }

    public void setWasDraft(Boolean wasDraft) {
        this.wasDraft = wasDraft;
    }

    public SetOrderGeneralInfoMethod withWasDraft(Boolean wasDraft) {
        this.wasDraft = wasDraft;
        return this;
    }
}
