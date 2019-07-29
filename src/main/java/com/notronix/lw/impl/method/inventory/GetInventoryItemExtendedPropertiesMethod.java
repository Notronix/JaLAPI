package com.notronix.lw.impl.method.inventory;

import com.google.api.client.http.HttpContent;
import com.google.api.client.http.UrlEncodedContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.GetExtendedPropertyFilter;
import com.notronix.lw.api.model.StockItemExtendedProperty;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.*;

import static com.notronix.lw.impl.method.MethodUtils.putIfProvided;
import static java.util.Objects.requireNonNull;

public class GetInventoryItemExtendedPropertiesMethod extends AbstractLinnworksAPIMethod<List<StockItemExtendedProperty>>
{
    private UUID inventoryItemId;
    private GetExtendedPropertyFilter propertyParams;

    @Override
    public String getURI() {
        return "Inventory/GetInventoryItemExtendedProperties";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        Map<String, Object> params = new HashMap<>();
        params.put("inventoryItemId", requireNonNull(inventoryItemId));
        putIfProvided(params, "propertyParams", propertyParams, gson::toJson);

        return new UrlEncodedContent(params);
    }

    @Override
    public List<StockItemExtendedProperty> getResponse(Gson gson, String jsonPayload) {
        return Arrays.asList(gson.fromJson(jsonPayload, StockItemExtendedProperty[].class));
    }

    public UUID getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(UUID inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public GetInventoryItemExtendedPropertiesMethod withInventoryItemId(UUID inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
        return this;
    }

    public GetExtendedPropertyFilter getPropertyParams() {
        return propertyParams;
    }

    public void setPropertyParams(GetExtendedPropertyFilter propertyParams) {
        this.propertyParams = propertyParams;
    }

    public GetInventoryItemExtendedPropertiesMethod withPropertyParams(GetExtendedPropertyFilter propertyParams) {
        this.propertyParams = propertyParams;
        return this;
    }
}
