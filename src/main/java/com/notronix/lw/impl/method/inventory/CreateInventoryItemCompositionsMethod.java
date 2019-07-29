package com.notronix.lw.impl.method.inventory;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.StockItemComposition;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.List;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class CreateInventoryItemCompositionsMethod extends AbstractLinnworksAPIMethod<Void>
{
    private List<StockItemComposition> inventoryItemCompositions;

    @Override
    public String getURI() {
        return "Inventory/CreateInventoryItemCompositions";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        return urlEncode("inventoryItemCompositions", gson.toJson(requireNonNull(inventoryItemCompositions)));
    }

    @Override
    public Void getResponse(Gson gson, String jsonPayload) {
        return null;
    }

    public List<StockItemComposition> getInventoryItemCompositions() {
        return inventoryItemCompositions;
    }

    public void setInventoryItemCompositions(List<StockItemComposition> inventoryItemCompositions) {
        this.inventoryItemCompositions = inventoryItemCompositions;
    }

    public CreateInventoryItemCompositionsMethod withInventoryItemCompositions(List<StockItemComposition> inventoryItemCompositions) {
        this.inventoryItemCompositions = inventoryItemCompositions;
        return this;
    }
}
