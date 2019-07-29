package com.notronix.lw.impl.method.inventory;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.StockItemExtendedProperty;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.List;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class CreateInventoryItemExtendedPropertiesMethod extends AbstractLinnworksAPIMethod<Void>
{
    private List<StockItemExtendedProperty> inventoryItemExtendedProperties;

    @Override
    public String getURI() {
        return "Inventory/CreateInventoryItemExtendedProperties";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        return urlEncode("inventoryItemExtendedProperties",
                gson.toJson(requireNonNull(inventoryItemExtendedProperties)));
    }

    @Override
    public Void getResponse(Gson gson, String jsonPayload) {
        return null;
    }

    public List<StockItemExtendedProperty> getInventoryItemExtendedProperties() {
        return inventoryItemExtendedProperties;
    }

    public void setInventoryItemExtendedProperties(List<StockItemExtendedProperty> inventoryItemExtendedProperties) {
        this.inventoryItemExtendedProperties = inventoryItemExtendedProperties;
    }

    public CreateInventoryItemExtendedPropertiesMethod withInventoryItemExtendedProperties(List<StockItemExtendedProperty> inventoryItemExtendedProperties) {
        this.inventoryItemExtendedProperties = inventoryItemExtendedProperties;
        return this;
    }
}
