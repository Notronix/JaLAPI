package com.notronix.lw.impl.method.orders;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.OrderGeneralInfo;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class SetOrderGeneralInfoMethod extends AbstractLinnworksAPIMethod<Void>
{
    private UUID orderId;
    private OrderGeneralInfo info;
    private Boolean wasDraft;

    @Override
    public String getURI() {
        return "Orders/SetOrderGeneralInfo";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        Map<String, Object> params = new HashMap<>();
        params.put("orderId", requireNonNull(orderId));
        params.put("info", gson.toJson(requireNonNull(info)));
        params.put("wasDraft", requireNonNull(wasDraft));

        return urlEncode(params);
    }

    @Override
    public Void getResponse(Gson gson, String jsonPayload) {
        return null;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }

    public SetOrderGeneralInfoMethod withOrderId(UUID orderId) {
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
