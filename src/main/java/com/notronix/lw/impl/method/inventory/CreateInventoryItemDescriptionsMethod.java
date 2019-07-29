package com.notronix.lw.impl.method.inventory;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.StockItemDescription;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.List;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class CreateInventoryItemDescriptionsMethod extends AbstractLinnworksAPIMethod<Void>
{
    private List<StockItemDescription> inventoryItemDescriptions;

    @Override
    public String getURI() {
        return "Inventory/CreateInventoryItemDescriptions";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        return urlEncode("inventoryItemDescriptions", gson.toJson(requireNonNull(inventoryItemDescriptions)));
    }

    @Override
    public Void getResponse(Gson gson, String jsonPayload) {
        return null;
    }

    public List<StockItemDescription> getInventoryItemDescriptions() {
        return inventoryItemDescriptions;
    }

    public void setInventoryItemDescriptions(List<StockItemDescription> inventoryItemDescriptions) {
        this.inventoryItemDescriptions = inventoryItemDescriptions;
    }

    public CreateInventoryItemDescriptionsMethod withInventoryItemDescriptions(List<StockItemDescription> inventoryItemDescriptions) {
        this.inventoryItemDescriptions = inventoryItemDescriptions;
        return this;
    }
}
