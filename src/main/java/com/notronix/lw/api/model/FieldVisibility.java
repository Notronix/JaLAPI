package com.notronix.lw.api.model;

import java.util.List;

public class FieldVisibility
{
    private String Name;
    private Boolean Visible;
    private Boolean CanFilter;
    private Boolean CanSort;
    private FieldTypes FieldType;
    private FieldCode Code;
    private List<FieldVisibility> SubFields;
    private Boolean IsFilterOnly;
    private String HotButtonIcon;
    private String HotButtonKey;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Boolean getVisible() {
        return Visible;
    }

    public void setVisible(Boolean visible) {
        Visible = visible;
    }

    public Boolean getCanFilter() {
        return CanFilter;
    }

    public void setCanFilter(Boolean canFilter) {
        CanFilter = canFilter;
    }

    public Boolean getCanSort() {
        return CanSort;
    }

    public void setCanSort(Boolean canSort) {
        CanSort = canSort;
    }

    public FieldTypes getFieldType() {
        return FieldType;
    }

    public void setFieldType(FieldTypes fieldType) {
        FieldType = fieldType;
    }

    public FieldCode getCode() {
        return Code;
    }

    public void setCode(FieldCode code) {
        Code = code;
    }

    public List<FieldVisibility> getSubFields() {
        return SubFields;
    }

    public void setSubFields(List<FieldVisibility> subFields) {
        SubFields = subFields;
    }

    public Boolean getFilterOnly() {
        return IsFilterOnly;
    }

    public void setFilterOnly(Boolean filterOnly) {
        IsFilterOnly = filterOnly;
    }

    public String getHotButtonIcon() {
        return HotButtonIcon;
    }

    public void setHotButtonIcon(String hotButtonIcon) {
        HotButtonIcon = hotButtonIcon;
    }

    public String getHotButtonKey() {
        return HotButtonKey;
    }

    public void setHotButtonKey(String hotButtonKey) {
        HotButtonKey = hotButtonKey;
    }
}
