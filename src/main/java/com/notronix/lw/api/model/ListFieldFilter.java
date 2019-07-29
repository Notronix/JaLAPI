package com.notronix.lw.api.model;

public class ListFieldFilter
{
    private String Value;
    private ListFieldFilterType Type;
    private FieldCode FieldCode;

    public String getValue() {
        return Value;
    }

    public void setValue(String value) {
        Value = value;
    }

    public ListFieldFilterType getType() {
        return Type;
    }

    public void setType(ListFieldFilterType type) {
        Type = type;
    }

    public com.notronix.lw.api.model.FieldCode getFieldCode() {
        return FieldCode;
    }

    public void setFieldCode(com.notronix.lw.api.model.FieldCode fieldCode) {
        FieldCode = fieldCode;
    }
}
