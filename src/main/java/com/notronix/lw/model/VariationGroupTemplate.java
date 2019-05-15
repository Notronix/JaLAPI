package com.notronix.lw.model;

import java.util.List;

public class VariationGroupTemplate
{
    private String VariationGroupName;
    private String ParentSKU;
    private String ParentStockItemId;
    private List<String> VariationItemIds;

    public String getVariationGroupName() {
        return VariationGroupName;
    }

    public void setVariationGroupName(String variationGroupName) {
        VariationGroupName = variationGroupName;
    }

    public String getParentSKU() {
        return ParentSKU;
    }

    public void setParentSKU(String parentSKU) {
        ParentSKU = parentSKU;
    }

    public String getParentStockItemId() {
        return ParentStockItemId;
    }

    public void setParentStockItemId(String parentStockItemId) {
        ParentStockItemId = parentStockItemId;
    }

    public List<String> getVariationItemIds() {
        return VariationItemIds;
    }

    public void setVariationItemIds(List<String> variationItemIds) {
        VariationItemIds = variationItemIds;
    }
}
