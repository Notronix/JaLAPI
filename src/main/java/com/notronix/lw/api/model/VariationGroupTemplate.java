package com.notronix.lw.api.model;

import java.util.List;
import java.util.UUID;

public class VariationGroupTemplate
{
    private String VariationGroupName;
    private String ParentSKU;
    private UUID ParentStockItemId;
    private List<UUID> VariationItemIds;

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

    public UUID getParentStockItemId() {
        return ParentStockItemId;
    }

    public void setParentStockItemId(UUID parentStockItemId) {
        ParentStockItemId = parentStockItemId;
    }

    public List<UUID> getVariationItemIds() {
        return VariationItemIds;
    }

    public void setVariationItemIds(List<UUID> variationItemIds) {
        VariationItemIds = variationItemIds;
    }
}
