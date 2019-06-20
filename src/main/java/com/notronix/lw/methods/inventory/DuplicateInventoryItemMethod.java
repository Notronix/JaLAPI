package com.notronix.lw.methods.inventory;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.StockItem;

public class DuplicateInventoryItemMethod extends InventoryMethod<StockItem>
{
    private StockItem inventoryItem;
    private String sourceItemId;
    private Boolean copyImages;

    @Override
    public String getName() {
        return "DuplicateInventoryItem";
    }

    @Override
    public String getPayload() {
        Gson gson = new Gson();

        return "inventoryItem=" + gson.toJson(inventoryItem)
                + "&sourceItemId=" + sourceItemId
                + "&copyImages=" + copyImages.toString();
    }

    @Override
    public StockItem getResponse() throws LinnworksAPIException {
        return inventoryItem;
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

    public String getSourceItemId() {
        return sourceItemId;
    }

    public void setSourceItemId(String sourceItemId) {
        this.sourceItemId = sourceItemId;
    }

    public DuplicateInventoryItemMethod withSourceItemId(String sourceItemId) {
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
