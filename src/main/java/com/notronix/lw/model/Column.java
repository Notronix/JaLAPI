package com.notronix.lw.model;

public class Column
{
    private ColumnName ColumnName;
    private String DisplayName;
    private GroupType Group;
    private FieldType Field;
    private SortDirection SortDirection;
    private Double Width;
    private Boolean IsEditable;

    public ColumnName getColumnName()
    {
        return ColumnName;
    }

    public void setColumnName(ColumnName columnName)
    {
        ColumnName = columnName;
    }

    public Column withColumnName(ColumnName columnName)
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

    public GroupType getGroup()
    {
        return Group;
    }

    public void setGroup(GroupType group)
    {
        Group = group;
    }

    public Column withGroup(GroupType group)
    {
        this.Group = group;
        return this;
    }

    public FieldType getField()
    {
        return Field;
    }

    public void setField(FieldType field)
    {
        Field = field;
    }

    public Column withField(FieldType field)
    {
        this.Field = field;
        return this;
    }

    public SortDirection getSortDirection()
    {
        return SortDirection;
    }

    public void setSortDirection(SortDirection sortDirection)
    {
        SortDirection = sortDirection;
    }

    public Column withSortDirection(SortDirection sortDirection)
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
