package com.notronix.lw.impl.method.orders;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.*;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class ChangeOrderTagMethod extends AbstractLinnworksAPIMethod<List<UUID>>
{
    private List<UUID> orderIds;
    private Integer tag;

    @Override
    public String getURI() {
        return "Orders/ChangeOrderTag";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        Map<String, Object> params = new HashMap<>();
        params.put("orderIds", gson.toJson(requireNonNull(orderIds)));
        params.put("tag", tag);

        return urlEncode(params);
    }

    @Override
    public List<UUID> getResponse(Gson gson, String jsonPayload) {
        return Arrays.asList(gson.fromJson(jsonPayload, UUID[].class));
    }

    public List<UUID> getOrderIds() {
        return orderIds;
    }

    public void setOrderIds(List<UUID> orderIds) {
        this.orderIds = orderIds;
    }

    public ChangeOrderTagMethod withOrderIds(List<UUID> orderIds) {
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
