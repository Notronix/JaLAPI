package com.notronix.lw.api.model;

import java.util.List;
import java.util.UUID;

public class DeleteVariationItemsRequest
{
    private UUID VariationItemId;
    private List<UUID> StockItemIds;

    public UUID getVariationItemId() {
        return VariationItemId;
    }

    public void setVariationItemId(UUID variationItemId) {
        VariationItemId = variationItemId;
    }

    public List<UUID> getStockItemIds() {
        return StockItemIds;
    }

    public void setStockItemIds(List<UUID> stockItemIds) {
        StockItemIds = stockItemIds;
    }
}
