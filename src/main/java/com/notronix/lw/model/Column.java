package com.notronix.lw.model;

public class Column
{
    private String ColumnName;
    private String DisplayName;
    private String Group;
    private String Field;
    private String SortDirection;
    private Double Width;
    private Boolean IsEditable;

    public String getColumnName()
    {
        return ColumnName;
    }

    public void setColumnName(String columnName)
    {
        ColumnName = columnName;
    }

    public Column withColumnName(String columnName)
    {
        this.ColumnName = columnName;
        return this;
    }

    public String getDisplayName()
    {
        return DisplayName;
    }

    public void setDisplayName(String displayName)
    {
        DisplayName = displayName;
    }

    public Column withDisplayName(String displayName)
    {
        this.DisplayName = displayName;
        return this;
    }

    public String getGroup()
    {
        return Group;
    }

    public void setGroup(String group)
    {
        Group = group;
    }

    public Column withGroup(String group)
    {
        this.Group = group;
        return this;
    }

    public String getField()
    {
        return Field;
    }

    public void setField(String field)
    {
        Field = field;
    }

    public Column withField(String field)
    {
        this.Field = field;
        return this;
    }

    public String getSortDirection()
    {
        return SortDirection;
    }

    public void setSortDirection(String sortDirection)
    {
        SortDirection = sortDirection;
    }

    public Column withSortDirection(String sortDirection)
    {
        this.SortDirection = sortDirection;
        return this;
    }

    public Double getWidth()
    {
        return Width;
    }

    public void setWidth(Double width)
    {
        Width = width;
    }

    public Column withWidth(Double width)
    {
        this.Width = width;
        return this;
    }

    public Boolean getEditable()
    {
        return IsEditable;
    }

    public void setEditable(Boolean editable)
    {
        IsEditable = editable;
    }

    public Column asEditable(Boolean editable)
    {
        this.IsEditable = editable;
        return this;
    }
}
