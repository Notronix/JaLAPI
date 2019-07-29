package com.notronix.lw.api.model;

public class BooleanFieldFilter
{
    private Boolean Value;
    private FieldCode FieldCode;

    public Boolean getValue() {
        return Value;
    }

    public void setValue(Boolean value) {
        Value = value;
    }

    public com.notronix.lw.api.model.FieldCode getFieldCode() {
        return FieldCode;
    }

    public void setFieldCode(com.notronix.lw.api.model.FieldCode fieldCode) {
        FieldCode = fieldCode;
    }
}
