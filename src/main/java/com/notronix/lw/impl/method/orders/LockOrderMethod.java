package com.notronix.lw.impl.method.orders;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class LockOrderMethod extends AbstractLinnworksAPIMethod<Void>
{
    private List<UUID> orderIds;
    private Boolean lockOrder;

    @Override
    public String getURI() {
        return "Orders/LockOrder";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        Map<String, Object> params = new HashMap<>();
        params.put("orderIds", gson.toJson(requireNonNull(orderIds)));
        params.put("lockOrder", requireNonNull(lockOrder));

        return urlEncode(params);
    }

    @Override
    public Void getResponse(Gson gson, String jsonPayload) {
        return null;
    }

    public List<UUID> getOrderIds() {
        return orderIds;
    }

    public void setOrderIds(List<UUID> orderIds) {
        this.orderIds = orderIds;
    }

    public LockOrderMethod withOrderIds(List<UUID> orderIds) {
        this.orderIds = orderIds;
        return this;
    }

    public Boolean getLockOrder() {
        return lockOrder;
    }

    public void setLockOrder(Boolean lockOrder) {
        this.lockOrder = lockOrder;
    }

    public LockOrderMethod withLockOrder(Boolean lockOrder) {
        this.lockOrder = lockOrder;
        return this;
    }
}
