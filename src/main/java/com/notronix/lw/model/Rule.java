package com.notronix.lw.model;

import java.util.List;

public class Rule
{
    private String FieldName;
    private List<FieldRule> Rules;

    public String getFieldName()
    {
        return FieldName;
    }

    public void setFieldName(String fieldName)
    {
        FieldName = fieldName;
    }

    public List<FieldRule> getRules()
    {
        return Rules;
    }

    public void setRules(List<FieldRule> rules)
    {
        Rules = rules;
    }
}
