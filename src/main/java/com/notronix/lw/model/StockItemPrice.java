package com.notronix.lw.model;

import java.util.List;

public class StockItemPrice extends ChannelItem
{
    private Double Price;
    private UpdateStatusType UpdateStatus;
    private String Tag;
    private List<StockItemPricingRule> Rules;

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public UpdateStatusType getUpdateStatus() {
        return UpdateStatus;
    }

    public void setUpdateStatus(UpdateStatusType updateStatus) {
        UpdateStatus = updateStatus;
    }

    public String getTag() {
        return Tag;
    }

    public void setTag(String tag) {
        Tag = tag;
    }

    public List<StockItemPricingRule> getRules() {
        return Rules;
    }

    public void setRules(List<StockItemPricingRule> rules) {
        Rules = rules;
    }
}
