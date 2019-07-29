package com.notronix.lw.impl.method.orders;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.OrderItem;
import com.notronix.lw.api.model.UpdateOrderItemResult;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class UpdateOrderItemMethod extends AbstractLinnworksAPIMethod<UpdateOrderItemResult>
{
    private UUID orderId;
    private OrderItem orderItem;
    private UUID fulfilmentCenter;
    private String source;
    private String subSource;

    @Override
    public String getURI() {
        return "Orders/UpdateOrderItem";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        Map<String, Object> params = new HashMap<>();
        params.put("orderId", requireNonNull(orderId));
        params.put("orderItem", gson.toJson(requireNonNull(orderItem)));
        params.put("fulfilmentCenter", requireNonNull(fulfilmentCenter));
        params.put("source", requireNonNull(source));
        params.put("subSource", requireNonNull(subSource));

        return urlEncode(params);
    }

    @Override
    public UpdateOrderItemResult getResponse(Gson gson, String jsonPayload) {
        return gson.fromJson(jsonPayload, UpdateOrderItemResult.class);
    }

    public UUID getOrderId() {
        return orderId;
    }

    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }

    public UpdateOrderItemMethod withOrderId(UUID orderId) {
        this.orderId = orderId;
        return this;
    }

    public UUID getFulfilmentCenter() {
        return fulfilmentCenter;
    }

    public void setFulfilmentCenter(UUID fulfilmentCenter) {
        this.fulfilmentCenter = fulfilmentCenter;
    }

    public UpdateOrderItemMethod withFulfilmentCenter(UUID fulfilmentCenter) {
        this.fulfilmentCenter = fulfilmentCenter;
        return this;
    }

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

    public UpdateOrderItemMethod withOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
        return this;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public UpdateOrderItemMethod withSource(String source) {
        this.source = source;
        return this;
    }

    public String getSubSource() {
        return subSource;
    }

    public void setSubSource(String subSource) {
        this.subSource = subSource;
    }

    public UpdateOrderItemMethod withSubSource(String subSource) {
        this.subSource = subSource;
        return this;
    }
}
