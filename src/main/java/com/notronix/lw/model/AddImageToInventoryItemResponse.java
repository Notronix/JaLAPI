package com.notronix.lw.model;

public class AddImageToInventoryItemResponse
{
    private String StockItemId;
    private String ImageId;
    private String ImageUrl;
    private String ImageThumbnailUrl;

    public String getStockItemId() {
        return StockItemId;
    }

    public void setStockItemId(String stockItemId) {
        StockItemId = stockItemId;
    }

    public String getImageId() {
        return ImageId;
    }

    public void setImageId(String imageId) {
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
