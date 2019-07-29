package com.notronix.lw.impl.method.inventory;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.ColumnNameType;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class UpdateInventoryItemFieldMethod extends AbstractLinnworksAPIMethod<Map<String, Object>>
{
    private UUID inventoryItemId;
    private ColumnNameType fieldName;
    private String fieldValue;

    @Override
    public String getURI() {
        return "Inventory/UpdateInventoryItemField";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        Map<String, Object> params = new HashMap<>();
        params.put("inventoryItemId", requireNonNull(inventoryItemId));
        params.put("fieldName", requireNonNull(fieldName).name());
        params.put("fieldValue", requireNonNull(fieldValue));

        return urlEncode(params);
    }

    @Override
    public Map<String, Object> getResponse(Gson gson, String jsonPayload) {
        return gson.fromJson(jsonPayload, STRING_OBJECT_MAP);
    }

    public UUID getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(UUID inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public UpdateInventoryItemFieldMethod withInventoryItemId(UUID inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
        return this;
    }

    public ColumnNameType getFieldName() {
        return fieldName;
    }

    public void setFieldName(ColumnNameType fieldName) {
        this.fieldName = fieldName;
    }

    public UpdateInventoryItemFieldMethod withFieldName(ColumnNameType fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    public UpdateInventoryItemFieldMethod withFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
        return this;
    }
}
