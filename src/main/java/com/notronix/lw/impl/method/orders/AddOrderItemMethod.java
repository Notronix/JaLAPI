package com.notronix.lw.impl.method.orders;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.LinePricingRequest;
import com.notronix.lw.api.model.UpdateOrderItemResult;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static com.notronix.lw.impl.method.MethodUtils.putIfProvided;
import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class AddOrderItemMethod extends AbstractLinnworksAPIMethod<UpdateOrderItemResult>
{
    private UUID orderId;
    private UUID itemId;
    private String channelSKU;
    private UUID fulfilmentCenter;
    private Integer quantity;
    private LinePricingRequest linePricing;

    @Override
    public String getURI() {
        return "Orders/AddOrderItem";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        Map<String, Object> params = new HashMap<>();
        params.put("orderId", requireNonNull(orderId));
        params.put("itemId", requireNonNull(itemId));
        params.put("quantity", requireNonNull(quantity));
        params.put("channelSKU", requireNonNull(channelSKU));
        params.put("fulfilmentCenter", requireNonNull(fulfilmentCenter));

        putIfProvided(params, "linePricing", linePricing, gson::toJson);

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

    public AddOrderItemMethod withOrderId(UUID orderId) {
        this.orderId = orderId;
        return this;
    }

    public UUID getItemId() {
        return itemId;
    }

    public void setItemId(UUID itemId) {
        this.itemId = itemId;
    }

    public AddOrderItemMethod withItemId(UUID itemId) {
        this.itemId = itemId;
        return this;
    }

    public UUID getFulfilmentCenter() {
        return fulfilmentCenter;
    }

    public void setFulfilmentCenter(UUID fulfilmentCenter) {
        this.fulfilmentCenter = fulfilmentCenter;
    }

    public AddOrderItemMethod withFulfilmentCenter(UUID fulfilmentCenter) {
        this.fulfilmentCenter = fulfilmentCenter;
        return this;
    }

    public String getChannelSKU() {
        return channelSKU;
    }

    public void setChannelSKU(String channelSKU) {
        this.channelSKU = channelSKU;
    }

    public AddOrderItemMethod withChannelSKU(String channelSKU) {
        this.channelSKU = channelSKU;
        return this;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public AddOrderItemMethod withQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public LinePricingRequest getLinePricing() {
        return linePricing;
    }

    public void setLinePricing(LinePricingRequest linePricing) {
        this.linePricing = linePricing;
    }

    public AddOrderItemMethod withLinePricing(LinePricingRequest linePricing) {
        this.linePricing = linePricing;
        return this;
    }
}
