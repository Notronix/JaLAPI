package com.notronix.lw.impl.method.inventory;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.StockItemPrice;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.List;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class CreateInventoryItemPricesMethod extends AbstractLinnworksAPIMethod<Void>
{
    private List<StockItemPrice> inventoryItemPrices;

    @Override
    public String getURI() {
        return "Inventory/CreateInventoryItemPrices";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        return urlEncode("inventoryItemPrices", gson.toJson(requireNonNull(inventoryItemPrices)));
    }

    @Override
    public Void getResponse(Gson gson, String jsonPayload) {
        return null;
    }

    public List<StockItemPrice> getInventoryItemPrices() {
        return inventoryItemPrices;
    }

    public void setInventoryItemPrices(List<StockItemPrice> inventoryItemPrices) {
        this.inventoryItemPrices = inventoryItemPrices;
    }

    public CreateInventoryItemPricesMethod withInventoryItemPrices(List<StockItemPrice> inventoryItemPrices) {
        this.inventoryItemPrices = inventoryItemPrices;
        return this;
    }
}
