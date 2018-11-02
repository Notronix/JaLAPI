package com.notronix.lw.methods.orders;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.OrderCustomerInfo;
import com.notronix.lw.model.OrderTotalsInfo;

import static java.util.Objects.requireNonNull;

public class SetOrderCustomerInfoMethod extends OrdersMethod<OrderTotalsInfo>
{
    private String orderId;
    private OrderCustomerInfo info;
    private Boolean saveToCrm;

    @Override
    public String getName() {
        return "SetOrderCustomerInfo";
    }

    @Override
    public String getPayload() {
        requireNonNull(info);
        requireNonNull(info.getAddress());
        requireNonNull(info.getAddress().getCountryId());

        if (info.getBillingAddress() == null) {
            info.setBillingAddress(info.getAddress());
        }
        else {
            requireNonNull(info.getBillingAddress().getCountryId());
        }

        return "orderId=" + requireNonNull(orderId)
                + "&info=" + new GsonBuilder().serializeNulls().create()
                .toJson(info).replaceAll("null", "\"\"")
                + "&saveToCrm=" + requireNonNull(saveToCrm).toString();
    }

    @Override
    public OrderTotalsInfo getResponse() throws LinnworksAPIException {
        return new Gson().fromJson(getJsonResult(), OrderTotalsInfo.class);
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public SetOrderCustomerInfoMethod withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public OrderCustomerInfo getInfo() {
        return info;
    }

    public void setInfo(OrderCustomerInfo info) {
        this.info = info;
    }

    public SetOrderCustomerInfoMethod withInfo(OrderCustomerInfo info) {
        this.info = info;
        return this;
    }

    public Boolean getSaveToCrm() {
        return saveToCrm;
    }

    public void setSaveToCrm(Boolean saveToCrm) {
        this.saveToCrm = saveToCrm;
    }

    public SetOrderCustomerInfoMethod withSaveToCrm(Boolean saveToCrm) {
        this.saveToCrm = saveToCrm;
        return this;
    }
}
