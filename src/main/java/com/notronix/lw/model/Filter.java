package com.notronix.lw.model;

import java.util.List;

public class Filter
{
    private FilterName FilterName;
    private String DisplayName;
    private List<String> FilterNameExact;
    private FieldType Field;
    private ConditionType Condition;
    private String Value;

    public FilterName getFilterName() {
        return FilterName;
    }

    public void setFilterName(FilterName filterName) {
        FilterName = filterName;
    }

    public String getDisplayName()
    {
        return DisplayName;
    }

    public void setDisplayName(String displayName)
    {
        DisplayName = displayName;
    }

    public List<String> getFilterNameExact() {
        return FilterNameExact;
    }

    public void setFilterNameExact(List<String> filterNameExact) {
        FilterNameExact = filterNameExact;
    }

    public FieldType getField() {
        return Field;
    }

    public void setField(FieldType field) {
        Field = field;
    }

    public ConditionType getCondition()
    {
        return Condition;
    }

    public void setCondition(ConditionType condition)
    {
        Condition = condition;
    }

    public String getValue()
    {
        return Value;
    }

    public void setValue(String value)
    {
        this.Value = value;
    }
}
