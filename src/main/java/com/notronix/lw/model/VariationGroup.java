package com.notronix.lw.model;

public class VariationGroup
{
    private String VariationSKU;
    private String pkVariationItemId;
    private String VariationGroupName;

    public String getVariationSKU() {
        return VariationSKU;
    }

    public void setVariationSKU(String variationSKU) {
        VariationSKU = variationSKU;
    }

    public String getPkVariationItemId() {
        return pkVariationItemId;
    }

    public void setPkVariationItemId(String pkVariationItemId) {
        this.pkVariationItemId = pkVariationItemId;
    }

    public String getVariationGroupName() {
        return VariationGroupName;
    }

    public void setVariationGroupName(String variationGroupName) {
        VariationGroupName = variationGroupName;
    }
}
