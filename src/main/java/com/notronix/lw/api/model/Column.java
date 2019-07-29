package com.notronix.lw.api.model;

public class Column
{
    private ColumnNameType ColumnName;
    private String DisplayName;
    private GroupType Group;
    private FieldType Field;
    private SortDirectionType SortDirection;
    private Double Width;
    private Boolean IsEditable;

    public ColumnNameType getColumnName() {
        return ColumnName;
    }

    public void setColumnName(ColumnNameType columnName) {
        ColumnName = columnName;
    }

    public String getDisplayName() {
        return DisplayName;
    }

    public void setDisplayName(String displayName) {
        DisplayName = displayName;
    }

    public GroupType getGroup() {
        return Group;
    }

    public void setGroup(GroupType group) {
        Group = group;
    }

    public FieldType getField() {
        return Field;
    }

    public void setField(FieldType field) {
        Field = field;
    }

    public SortDirectionType getSortDirection() {
        return SortDirection;
    }

    public void setSortDirection(SortDirectionType sortDirection) {
        SortDirection = sortDirection;
    }

    public Double getWidth() {
        return Width;
    }

    public void setWidth(Double width) {
        Width = width;
    }

    public Boolean getEditable() {
        return IsEditable;
    }

    public void setEditable(Boolean editable) {
        IsEditable = editable;
    }
}
