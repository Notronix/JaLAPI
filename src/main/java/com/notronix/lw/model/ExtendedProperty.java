package com.notronix.lw.model;

public class ExtendedProperty
{
    private String RowId;
    private String Name;
    private String Value;
    private String Type;

    public String getRowId()
    {
        return RowId;
    }

    public void setRowId(String rowId)
    {
        RowId = rowId;
    }

    public String getName()
    {
        return Name;
    }

    public void setName(String name)
    {
        Name = name;
    }

    public String getValue()
    {
        return Value;
    }

    public void setValue(String value)
    {
        Value = value;
    }

    public String getType()
    {
        return Type;
    }

    public void setType(String type)
    {
        Type = type;
    }
}
