package com.notronix.lw.api.model;

import java.util.List;

public class FieldsFilter
{
    private List<TextFieldFilter> TextFields;
    private List<BooleanFieldFilter> BooleanFields;
    private List<NumericFieldFilter> NumericFields;
    private List<DateFieldFilter> DateFields;
    private List<ListFieldFilter> ListFields;
    private List<FieldVisibility> FieldVisibility;

    public List<TextFieldFilter> getTextFields() {
        return TextFields;
    }

    public void setTextFields(List<TextFieldFilter> textFields) {
        TextFields = textFields;
    }

    public List<BooleanFieldFilter> getBooleanFields() {
        return BooleanFields;
    }

    public void setBooleanFields(List<BooleanFieldFilter> booleanFields) {
        BooleanFields = booleanFields;
    }

    public List<NumericFieldFilter> getNumericFields() {
        return NumericFields;
    }

    public void setNumericFields(List<NumericFieldFilter> numericFields) {
        NumericFields = numericFields;
    }

    public List<DateFieldFilter> getDateFields() {
        return DateFields;
    }

    public void setDateFields(List<DateFieldFilter> dateFields) {
        DateFields = dateFields;
    }

    public List<ListFieldFilter> getListFields() {
        return ListFields;
    }

    public void setListFields(List<ListFieldFilter> listFields) {
        ListFields = listFields;
    }

    public List<FieldVisibility> getFieldVisibility() {
        return FieldVisibility;
    }

    public void setFieldVisibility(List<FieldVisibility> fieldVisibility) {
        FieldVisibility = fieldVisibility;
    }
}
