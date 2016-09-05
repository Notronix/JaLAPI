package com.notronix.lw.model;

public class SearchField
{
    private String Field;
    private String Name;
    private boolean AllowForAllDates;
    private boolean ExactSearchOptional;

    public String getField()
    {
        return Field;
    }

    public void setField(String field)
    {
        Field = field;
    }

    public String getName()
    {
        return Name;
    }

    public void setName(String name)
    {
        Name = name;
    }

    public boolean getAllowForAllDates()
    {
        return AllowForAllDates;
    }

    public void setAllowForAllDates(boolean allowForAllDates)
    {
        AllowForAllDates = allowForAllDates;
    }

    public boolean getExactSearchOptional()
    {
        return ExactSearchOptional;
    }

    public void setExactSearchOptional(boolean exactSearchOptional)
    {
        ExactSearchOptional = exactSearchOptional;
    }
}
