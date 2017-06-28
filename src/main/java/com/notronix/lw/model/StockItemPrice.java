package com.notronix.lw.model;

import java.util.List;

public class StockItemPrice {
    private String pkRowId;
    private String Source;
    private String SubSource;
    private Double Price;
    private UpdateStatusType UpdateStatus;
    private String Tag;
    private List<StockItemPricingRule> Rules;
    private String StockItemId;

    public String getPkRowId() {
        return pkRowId;
    }

    public void setPkRowId(String pkRowId) {
        this.pkRowId = pkRowId;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    public String getSubSource() {
        return SubSource;
    }

    public void setSubSource(String subSource) {
        SubSource = subSource;
    }

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

    public String getStockItemId() {
        return StockItemId;
    }

    public void setStockItemId(String stockItemId) {
        StockItemId = stockItemId;
    }
}
