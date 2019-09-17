package com.notronix.lw.api.model;

import java.util.List;

public class ChannelOrderItem
{
    private Boolean TaxCostInclusive;
    private Boolean UseChannelTax;
    private Double PricePerUnit;
    private Integer Qty;
    private Double TaxRate;
    private Double LineDiscount;
    private String ItemNumber;
    private String ChannelSKU;
    private Boolean IsService;
    private String ItemTitle;
    private List<ChannelOrderItemOption> Options;

    public Boolean getTaxCostInclusive() {
        return TaxCostInclusive;
    }

    public void setTaxCostInclusive(Boolean taxCostInclusive) {
        TaxCostInclusive = taxCostInclusive;
    }

    public Boolean getUseChannelTax() {
        return UseChannelTax;
    }

    public void setUseChannelTax(Boolean useChannelTax) {
        UseChannelTax = useChannelTax;
    }

    public Double getPricePerUnit() {
        return PricePerUnit;
    }

    public void setPricePerUnit(Double pricePerUnit) {
        PricePerUnit = pricePerUnit;
    }

    public Integer getQty() {
        return Qty;
    }

    public void setQty(Integer qty) {
        Qty = qty;
    }

    public Double getTaxRate() {
        return TaxRate;
    }

    public void setTaxRate(Double taxRate) {
        TaxRate = taxRate;
    }

    public Double getLineDiscount() {
        return LineDiscount;
    }

    public void setLineDiscount(Double lineDiscount) {
        LineDiscount = lineDiscount;
    }

    public String getItemNumber() {
        return ItemNumber;
    }

    public void setItemNumber(String itemNumber) {
        ItemNumber = itemNumber;
    }

    public String getChannelSKU() {
        return ChannelSKU;
    }

    public void setChannelSKU(String channelSKU) {
        ChannelSKU = channelSKU;
    }

    public Boolean getService() {
        return IsService;
    }

    public void setService(Boolean service) {
        IsService = service;
    }

    public String getItemTitle() {
        return ItemTitle;
    }

    public void setItemTitle(String itemTitle) {
        ItemTitle = itemTitle;
    }

    public List<ChannelOrderItemOption> getOptions() {
        return Options;
    }

    public void setOptions(List<ChannelOrderItemOption> options) {
        Options = options;
    }
}
