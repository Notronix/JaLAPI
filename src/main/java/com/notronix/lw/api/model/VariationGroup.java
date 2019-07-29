package com.notronix.lw.api.model;

import java.util.UUID;

public class VariationGroup
{
    private String VariationSKU;
    private UUID pkVariationItemId;
    private String VariationGroupName;

    public String getVariationSKU() {
        return VariationSKU;
    }

    public void setVariationSKU(String variationSKU) {
        VariationSKU = variationSKU;
    }

    public UUID getPkVariationItemId() {
        return pkVariationItemId;
    }

    public void setPkVariationItemId(UUID pkVariationItemId) {
        this.pkVariationItemId = pkVariationItemId;
    }

    public String getVariationGroupName() {
        return VariationGroupName;
    }

    public void setVariationGroupName(String variationGroupName) {
        VariationGroupName = variationGroupName;
    }
}
