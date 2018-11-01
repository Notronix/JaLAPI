package com.notronix.lw.methods.orders;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.CustomerAddress;
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
        if (info.getAddress() == null) {
            info.setAddress(new CustomerAddress());
        }
        if (info.getBillingAddress() == null) {
            info.setBillingAddress(new CustomerAddress());
        }

        return "orderId=" + requireNonNull(orderId)
                + "&info=" + new GsonBuilder().setVersion(0.0).serializeNulls().create()
                .toJson(requireNonNull(info)).replaceAll("null", "\"\"")
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
