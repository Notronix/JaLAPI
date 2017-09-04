package com.notronix.lw.methods.inventory;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.InventoryStockField;

import java.util.HashMap;
import java.util.Map;

public class UpdateInventoryItemStockFieldMethod extends InventoryMethod<Map<String, Object>>
{
    private String itemId;
    private InventoryStockField field;
    private String value;
    private String locationId;

    @Override
    public String getName() {
        return "UpdateInventoryItemStockField";
    }

    @Override
    public String getPayload() {
        return "inventoryItemId=" + itemId + "&fieldName=" + field.name()
                + "&fieldValue=" + value + "&locationId=" + locationId;
    }

    @Override
    public Map<String, Object> getResponse() throws LinnworksAPIException {
        return new Gson().fromJson(getJsonResult(), new TypeToken<HashMap<String, Object>>(){}.getType());
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public UpdateInventoryItemStockFieldMethod withItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }

    public InventoryStockField getField() {
        return field;
    }

    public void setField(InventoryStockField field) {
        this.field = field;
    }

    public UpdateInventoryItemStockFieldMethod withField(InventoryStockField field) {
        this.field = field;
        return this;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public UpdateInventoryItemStockFieldMethod withValue(String value) {
        this.value = value;
        return this;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public UpdateInventoryItemStockFieldMethod withLocationId(String locationId) {
        this.locationId = locationId;
        return this;
    }
}
