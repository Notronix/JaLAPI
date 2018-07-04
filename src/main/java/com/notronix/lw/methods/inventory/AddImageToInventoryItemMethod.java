package com.notronix.lw.methods.inventory;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Since;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.AddImageToInventoryItemResponse;

import static java.lang.Boolean.TRUE;

public class AddImageToInventoryItemMethod extends InventoryMethod<AddImageToInventoryItemResponse>
{
    @Since(1.0) private String ItemNumber;
    @Since(1.0) private String StockItemId;
    @Since(1.0) private Boolean IsMain;
    @Since(1.0) private String ImageUrl;

    @Override
    public String getName() {
        return "AddImageToInventoryItem";
    }

    @Override
    public String getPayload() {
        IsMain = TRUE.equals(IsMain);

        return "request=" + new GsonBuilder().setVersion(1.0).create().toJson(this);
    }

    @Override
    public AddImageToInventoryItemResponse getResponse() throws LinnworksAPIException {
        return new GsonBuilder().create().fromJson(getJsonResult(), AddImageToInventoryItemResponse.class);
    }

    public String getItemNumber() {
        return ItemNumber;
    }

    public void setItemNumber(String itemNumber) {
        ItemNumber = itemNumber;
    }

    public AddImageToInventoryItemMethod withItemNumber(String itemNumber) {
        ItemNumber = itemNumber;
        return this;
    }

    public String getStockItemId() {
        return StockItemId;
    }

    public void setStockItemId(String stockItemId) {
        StockItemId = stockItemId;
    }

    public AddImageToInventoryItemMethod withItemId(String itemId) {
        StockItemId= itemId;
        return this;
    }

    public Boolean getMain() {
        return IsMain;
    }

    public void setMain(Boolean main) {
        IsMain = main;
    }

    public AddImageToInventoryItemMethod withMain(boolean isMain) {
        IsMain = isMain;
        return this;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    public AddImageToInventoryItemMethod withImageURL(String imageURL) {
        ImageUrl = imageURL;
        return this;
    }
}
