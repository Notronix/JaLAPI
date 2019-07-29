package com.notronix.lw.api.model;

import java.util.UUID;

public class AddImageToInventoryItemResponse
{
    private UUID StockItemId;
    private UUID ImageId;
    private String ImageUrl;
    private String ImageThumbnailUrl;

    public UUID getStockItemId() {
        return StockItemId;
    }

    public void setStockItemId(UUID stockItemId) {
        StockItemId = stockItemId;
    }

    public UUID getImageId() {
        return ImageId;
    }

    public void setImageId(UUID imageId) {
        ImageId = imageId;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    public String getImageThumbnailUrl() {
        return ImageThumbnailUrl;
    }

    public void setImageThumbnailUrl(String imageThumbnailUrl) {
        ImageThumbnailUrl = imageThumbnailUrl;
    }
}
