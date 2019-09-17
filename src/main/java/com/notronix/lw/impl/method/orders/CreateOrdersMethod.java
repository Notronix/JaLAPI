package com.notronix.lw.impl.method.orders;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.ChannelOrder;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.*;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class CreateOrdersMethod extends AbstractLinnworksAPIMethod<List<UUID>>
{
    private String location;
    private List<ChannelOrder> orders;

    @Override
    public String getURI() {
        return "Orders/CreateOrders";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        Map<String, Object> params = new HashMap<>();
        params.put("location", requireNonNull(location));
        params.put("orders", gson.toJson(requireNonNull(orders)));

        return urlEncode(params);
    }

    @Override
    public List<UUID> getResponse(Gson gson, String jsonPayload) {
        return Arrays.asList(gson.fromJson(jsonPayload, UUID[].class));
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public CreateOrdersMethod withLocation(String location) {
        this.location = location;
        return this;
    }

    public List<ChannelOrder> getOrders() {
        return orders;
    }

    public void setOrders(List<ChannelOrder> orders) {
        this.orders = orders;
    }

    public CreateOrdersMethod withOrders(List<ChannelOrder> orders) {
        this.orders = orders;
        return this;
    }
}
