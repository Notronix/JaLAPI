package com.notronix.lw.methods.inventory;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.InventoryField;

import java.util.HashMap;
import java.util.Map;

public class UpdateInventoryItemFieldMethod extends InventoryMethod<Map<String, Object>>
{
    private String itemId;
    private InventoryField field;
    private String value;

    @Override
    public String getName() {
        return "UpdateInventoryItemField";
    }

    @Override
    public String getPayload() {
        return "inventoryItemId=" + itemId + "&fieldName=" + field.name() + "&fieldValue=" + value;
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

    public UpdateInventoryItemFieldMethod withItemId(String itemId)
    {
        this.itemId = itemId;
        return this;
    }

    public InventoryField getField() {
        return field;
    }

    public void setField(InventoryField field) {
        this.field = field;
    }

    public UpdateInventoryItemFieldMethod withField(InventoryField field) {
        this.field = field;
        return this;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public UpdateInventoryItemFieldMethod withValue(String value) {
        this.value = value;
        return this;
    }
}
