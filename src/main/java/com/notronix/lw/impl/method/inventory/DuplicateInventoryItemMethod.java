package com.notronix.lw.impl.method.inventory;

import com.google.api.client.http.HttpContent;
import com.google.api.client.http.UrlEncodedContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.StockItem;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static java.util.Objects.requireNonNull;

public class DuplicateInventoryItemMethod extends AbstractLinnworksAPIMethod<Void>
{
    private StockItem inventoryItem;
    private UUID sourceItemId;
    private Boolean copyImages;

    @Override
    public String getURI() {
        return "Inventory/DuplicateInventoryItem";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        Map<String, Object> params = new HashMap<>();
        params.put("inventoryItem", gson.toJson(requireNonNull(inventoryItem)));
        params.put("sourceItemId", requireNonNull(sourceItemId));
        params.put("copyImages", requireNonNull(copyImages).toString());

        return new UrlEncodedContent(params);
    }

    @Override
    public Void getResponse(Gson gson, String jsonPayload) {
        return null;
    }

    public StockItem getInventoryItem() {
        return inventoryItem;
    }

    public void setInventoryItem(StockItem inventoryItem) {
        this.inventoryItem = inventoryItem;
    }

    public DuplicateInventoryItemMethod withInventoryItem(StockItem inventoryItem) {
        this.inventoryItem = inventoryItem;
        return this;
    }

    public UUID getSourceItemId() {
        return sourceItemId;
    }

    public void setSourceItemId(UUID sourceItemId) {
        this.sourceItemId = sourceItemId;
    }

    public DuplicateInventoryItemMethod withSourceItemId(UUID sourceItemId) {
        this.sourceItemId = sourceItemId;
        return this;
    }

    public Boolean getCopyImages() {
        return copyImages;
    }

    public void setCopyImages(Boolean copyImages) {
        this.copyImages = copyImages;
    }

    public DuplicateInventoryItemMethod withCopyImages(Boolean copyImages) {
        this.copyImages = copyImages;
        return this;
    }
}
