package com.notronix.lw.model;

public class Filter
{
    private String FilterName;
    private String DisplayName;
    private String FilterNameExact;
    private String Field;
    private String Condition;
    private String Value;

    public String getFilterName()
    {
        return FilterName;
    }

    public void setFilterName(String filterName)
    {
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

    public String getFilterNameExact()
    {
        return FilterNameExact;
    }

    public void setFilterNameExact(String filterNameExact)
    {
        FilterNameExact = filterNameExact;
    }

    public String getField()
    {
        return Field;
    }

    public void setField(String field)
    {
        Field = field;
    }

    public String getCondition()
    {
        return Condition;
    }

    public void setCondition(String condition)
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
