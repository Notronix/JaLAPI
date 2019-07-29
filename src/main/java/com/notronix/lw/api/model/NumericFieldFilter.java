package com.notronix.lw.api.model;

public class NumericFieldFilter
{
    private NumericFieldFilterType Type;
    private Double Value;
    private FieldCode FieldCode;

    public NumericFieldFilterType getType() {
        return Type;
    }

    public void setType(NumericFieldFilterType type) {
        Type = type;
    }

    public Double getValue() {
        return Value;
    }

    public void setValue(Double value) {
        Value = value;
    }

    public com.notronix.lw.api.model.FieldCode getFieldCode() {
        return FieldCode;
    }

    public void setFieldCode(com.notronix.lw.api.model.FieldCode fieldCode) {
        FieldCode = fieldCode;
    }
}
