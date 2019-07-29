package com.notronix.lw.api.model;

public class TextFieldFilter
{
    private TextFieldFilterType Type;
    private String Text;
    private FieldCode FieldCode;

    public TextFieldFilterType getType() {
        return Type;
    }

    public void setType(TextFieldFilterType type) {
        Type = type;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public FieldCode getFieldCode() {
        return FieldCode;
    }

    public void setFieldCode(FieldCode fieldCode) {
        FieldCode = fieldCode;
    }
}
