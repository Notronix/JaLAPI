package com.notronix.lw.api.model;

import java.util.UUID;

public class StockItemEbayCompatibility
{
    private UUID FkStockItemId;
    private UUID FkCompatibilityListId;
    private String SKU;
    private String CompatibilityNotes;
    private String Value;
    private String IncludeYears;
    private String ExcludeYears;
    private String Culture;

    public UUID getFkStockItemId() {
        return FkStockItemId;
    }

    public void setFkStockItemId(UUID fkStockItemId) {
        FkStockItemId = fkStockItemId;
    }

    public UUID getFkCompatibilityListId() {
        return FkCompatibilityListId;
    }

    public void setFkCompatibilityListId(UUID fkCompatibilityListId) {
        FkCompatibilityListId = fkCompatibilityListId;
    }

    public String getCompatibilityNotes() {
        return CompatibilityNotes;
    }

    public void setCompatibilityNotes(String compatibilityNotes) {
        CompatibilityNotes = compatibilityNotes;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String value) {
        Value = value;
    }

    public String getIncludeYears() {
        return IncludeYears;
    }

    public void setIncludeYears(String includeYears) {
        IncludeYears = includeYears;
    }

    public String getExcludeYears() {
        return ExcludeYears;
    }

    public void setExcludeYears(String excludeYears) {
        ExcludeYears = excludeYears;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public String getCulture() {
        return Culture;
    }

    public void setCulture(String culture) {
        Culture = culture;
    }
}
