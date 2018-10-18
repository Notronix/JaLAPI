package com.notronix.lw.methods.inventory;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.StockItemExtendedProperty;

import java.util.ArrayList;
import java.util.List;

public class CreateInventoryItemExtendedPropertiesMethod extends InventoryMethod<List<StockItemExtendedProperty>>
{
    private List<StockItemExtendedProperty> extendedProperties;

    @Override
    public String getName() {
        return "CreateInventoryItemExtendedProperties";
    }

    @Override
    public String getPayload() {
        return "inventoryItemExtendedProperties=" + new Gson().toJson(extendedProperties);
    }

    @Override
    public List<StockItemExtendedProperty> getResponse() throws LinnworksAPIException {
        return extendedProperties;
    }

    public List<StockItemExtendedProperty> getExtendedProperties() {
        return extendedProperties;
    }

    public void setExtendedProperties(List<StockItemExtendedProperty> extendedProperties) {
        this.extendedProperties = extendedProperties;
    }

    public CreateInventoryItemExtendedPropertiesMethod withExtendedProperties(List<StockItemExtendedProperty> extendedProperties)
    {
        this.extendedProperties = extendedProperties;
        return this;
    }

    public CreateInventoryItemExtendedPropertiesMethod withExtendedProperty(StockItemExtendedProperty extendedProperty) {
        if (extendedProperties == null) {
            extendedProperties = new ArrayList<>();
        }

        extendedProperties.add(extendedProperty);
        return this;
    }
}