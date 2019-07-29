package com.notronix.lw.api.model;

import java.util.List;

public class ConfigRule
{
    private String FieldName;
    private List<PropertyRule> Rules;

    public String getFieldName() {
        return FieldName;
    }

    public void setFieldName(String fieldName) {
        FieldName = fieldName;
    }

    public List<PropertyRule> getRules() {
        return Rules;
    }

    public void setRules(List<PropertyRule> rules) {
        Rules = rules;
    }
}
