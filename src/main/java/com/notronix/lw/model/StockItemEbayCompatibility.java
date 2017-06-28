package com.notronix.lw.model;

public class StockItemEbayCompatibility
{
    private String FkStockItemId;
    private String FkCompatibilityListId;
    private String CompatibilityNotes;
    private String Value;
    private String IncludeYears;
    private String ExcludeYears;

    public String getFkStockItemId() {
        return FkStockItemId;
    }

    public void setFkStockItemId(String fkStockItemId) {
        FkStockItemId = fkStockItemId;
    }

    public String getFkCompatibilityListId() {
        return FkCompatibilityListId;
    }

    public void setFkCompatibilityListId(String fkCompatibilityListId) {
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
}
