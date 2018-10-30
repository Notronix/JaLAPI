package com.notronix.lw.model;

public class UpdateOrderItemResult
{
    private OrderTotalsInfo TotalsInfo;
    private OrderItem Item;
    private Double ItemWeight;
    private Double TotalWeight;

    public OrderTotalsInfo getTotalsInfo() {
        return TotalsInfo;
    }

    public void setTotalsInfo(OrderTotalsInfo totalsInfo) {
        TotalsInfo = totalsInfo;
    }

    public OrderItem getItem() {
        return Item;
    }

    public void setItem(OrderItem item) {
        Item = item;
    }

    public Double getItemWeight() {
        return ItemWeight;
    }

    public void setItemWeight(Double itemWeight) {
        ItemWeight = itemWeight;
    }

    public Double getTotalWeight() {
        return TotalWeight;
    }

    public void setTotalWeight(Double totalWeight) {
        TotalWeight = totalWeight;
    }
}
