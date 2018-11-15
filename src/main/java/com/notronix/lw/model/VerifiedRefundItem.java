package com.notronix.lw.model;

public class VerifiedRefundItem
{
    private String OrderItemRowId;
    private Integer ReturnRowId	;
    private String ItemSKU;
    private String ChannelSKU;
    private String ItemTitle;
    private Double Cost;
    private Integer CancelledQuantity;

    public String getOrderItemRowId() {
        return OrderItemRowId;
    }

    public void setOrderItemRowId(String orderItemRowId) {
        OrderItemRowId = orderItemRowId;
    }

    public Integer getReturnRowId() {
        return ReturnRowId;
    }

    public void setReturnRowId(Integer returnRowId) {
        ReturnRowId = returnRowId;
    }

    public String getItemSKU() {
        return ItemSKU;
    }

    public void setItemSKU(String itemSKU) {
        ItemSKU = itemSKU;
    }

    public String getChannelSKU() {
        return ChannelSKU;
    }

    public void setChannelSKU(String channelSKU) {
        ChannelSKU = channelSKU;
    }

    public String getItemTitle() {
        return ItemTitle;
    }

    public void setItemTitle(String itemTitle) {
        ItemTitle = itemTitle;
    }

    public Double getCost() {
        return Cost;
    }

    public void setCost(Double cost) {
        Cost = cost;
    }

    public Integer getCancelledQuantity() {
        return CancelledQuantity;
    }

    public void setCancelledQuantity(Integer cancelledQuantity) {
        CancelledQuantity = cancelledQuantity;
    }
}
