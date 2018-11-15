package com.notronix.lw.model;

public class ActionablePostSaleSearchFilters
{
    private Boolean Actionable;
    private FilterType Type;
    private String Value;

    public Boolean getActionable() {
        return Actionable;
    }

    public void setActionable(Boolean actionable) {
        Actionable = actionable;
    }

    public FilterType getType() {
        return Type;
    }

    public void setType(FilterType type) {
        Type = type;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String value) {
        Value = value;
    }
}
