package com.notronix.lw.model;

import java.util.List;

public class Rule<T>
{
    private String FieldName;
    private List<T> Rules;

    public String getFieldName()
    {
        return FieldName;
    }

    public void setFieldName(String fieldName)
    {
        FieldName = fieldName;
    }

    public List<T> getRules() {
        return Rules;
    }

    public void setRules(List<T> rules) {
        Rules = rules;
    }
}
