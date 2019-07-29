package com.notronix.lw.impl.method.inventory;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.StockItemChannelSKU;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.List;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class CreateInventoryItemChannelSKUsMethod extends AbstractLinnworksAPIMethod<Void>
{
    private List<StockItemChannelSKU> inventoryItemChannelSKUs;

    @Override
    public String getURI() {
        return "Inventory/CreateInventoryItemChannelSKUs";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        return urlEncode("inventoryItemChannelSKUs", gson.toJson(requireNonNull(inventoryItemChannelSKUs)));
    }

    @Override
    public Void getResponse(Gson gson, String jsonPayload) {
        return null;
    }

    public List<StockItemChannelSKU> getInventoryItemChannelSKUs() {
        return inventoryItemChannelSKUs;
    }

    public void setInventoryItemChannelSKUs(List<StockItemChannelSKU> inventoryItemChannelSKUs) {
        this.inventoryItemChannelSKUs = inventoryItemChannelSKUs;
    }

    public CreateInventoryItemChannelSKUsMethod withInventoryItemChannelSKUs(List<StockItemChannelSKU> inventoryItemChannelSKUs) {
        this.inventoryItemChannelSKUs = inventoryItemChannelSKUs;
        return this;
    }
}
