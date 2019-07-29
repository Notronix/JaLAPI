package com.notronix.lw.impl.method.inventory;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.StockItemTitle;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.List;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class CreateInventoryItemTitlesMethod extends AbstractLinnworksAPIMethod<Void>
{
    private List<StockItemTitle> inventoryItemTitles;

    @Override
    public String getURI() {
        return "Inventory/CreateInventoryItemTitles";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        return urlEncode("inventoryItemTitles", gson.toJson(requireNonNull(inventoryItemTitles)));
    }

    @Override
    public Void getResponse(Gson gson, String jsonPayload) {
        return null;
    }

    public List<StockItemTitle> getInventoryItemTitles() {
        return inventoryItemTitles;
    }

    public void setInventoryItemTitles(List<StockItemTitle> inventoryItemTitles) {
        this.inventoryItemTitles = inventoryItemTitles;
    }

    public CreateInventoryItemTitlesMethod withInventoryItemTitles(List<StockItemTitle> inventoryItemTitles) {
        this.inventoryItemTitles = inventoryItemTitles;
        return this;
    }
}
