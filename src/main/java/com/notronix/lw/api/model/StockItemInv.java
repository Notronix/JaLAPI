package com.notronix.lw.api.model;

public class StockItemInv extends AbstractStockItem
{
    private String VariationGroupName;

    public String getVariationGroupName() {
        return VariationGroupName;
    }

    public void setVariationGroupName(String variationGroupName) {
        VariationGroupName = variationGroupName;
    }
}
