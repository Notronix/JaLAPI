package com.notronix.lw.methods.orders;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.LinePricingRequest;
import com.notronix.lw.model.UpdateOrderItemResult;

import static java.util.Objects.requireNonNull;

public class AddOrderItemMethod extends OrdersMethod<UpdateOrderItemResult>
{
    private String orderId;
    private String itemId;
    private String fulfilmentCenterId;
    private String channelSKU;
    private Integer quantity;
    private LinePricingRequest linePricing;

    @Override
    public String getName() {
        return "AddOrderItem";
    }

    @Override
    public String getPayload() {
        return "orderId=" + requireNonNull(orderId)
                + "&itemId=" + requireNonNull(itemId)
                + "&channelSKU=" + requireNonNull(channelSKU)
                + "&fulfilmentCenter=" + requireNonNull(fulfilmentCenterId)
                + "&quantity=" + requireNonNull(quantity)
                + (linePricing == null ? "" : "&linePricing=" + new Gson().toJson(linePricing));
    }

    @Override
    public UpdateOrderItemResult getResponse() throws LinnworksAPIException {
        return new Gson().fromJson(getJsonResult(), UpdateOrderItemResult.class);
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public AddOrderItemMethod withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public AddOrderItemMethod withItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }

    public String getFulfilmentCenterId() {
        return fulfilmentCenterId;
    }

    public void setFulfilmentCenterId(String fulfilmentCenterId) {
        this.fulfilmentCenterId = fulfilmentCenterId;
    }

    public AddOrderItemMethod withFulfilmentCenterId(String fulfilmentCenterId) {
        this.fulfilmentCenterId = fulfilmentCenterId;
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
