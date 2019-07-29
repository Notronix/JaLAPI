package com.notronix.lw.impl.method.orders;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.OrderCustomerInfo;
import com.notronix.lw.api.model.OrderTotalsInfo;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static com.notronix.lw.impl.method.MethodUtils.putIfProvided;
import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class SetOrderCustomerInfoMethod extends AbstractLinnworksAPIMethod<OrderTotalsInfo>
{
    private UUID orderId;
    private OrderCustomerInfo info;
    private Boolean saveToCrm;

    @Override
    public String getURI() {
        return "Orders/SetOrderCustomerInfo";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        requireNonNull(info);
        requireNonNull(info.getAddress());
        requireNonNull(info.getAddress().getCountryId());

        if (info.getBillingAddress() == null) {
            info.setBillingAddress(info.getAddress());
        }
        else {
            requireNonNull(info.getBillingAddress().getCountryId());
        }

        Map<String, Object> params = new HashMap<>();
        params.put("orderId", requireNonNull(orderId));
        params.put("info", gson.toJson(info));
        putIfProvided(params, "saveToCrm", saveToCrm);

        return urlEncode(params);
    }

    @Override
    public OrderTotalsInfo getResponse(Gson gson, String jsonPayload) {
        return gson.fromJson(jsonPayload, OrderTotalsInfo.class);
    }

//    @Override
//    public String getPayload() {
//        return "orderId=" + requireNonNull(orderId)
//                + "&info=" + new GsonBuilder().serializeNulls().create()
//                .toJson(info).replaceAll("null", "\"\"")
//                + "&saveToCrm=" + requireNonNull(saveToCrm).toString();
//    }

    public UUID getOrderId() {
        return orderId;
    }

    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }

    public SetOrderCustomerInfoMethod withOrderId(UUID orderId) {
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
