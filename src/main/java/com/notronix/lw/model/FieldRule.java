package com.notronix.lw.model;

public class FieldRule
{
    private String RuleType;
    private Object Options;
    private String DependantField;

    public String getRuleType()
    {
        return RuleType;
    }

    public void setRuleType(String ruleType)
    {
        RuleType = ruleType;
    }

    public Object getOptions()
    {
        return Options;
    }

    public void setOptions(Object options)
    {
        Options = options;
    }

    public String getDependantField()
    {
        return DependantField;
    }

    public void setDependantField(String dependantField)
    {
        DependantField = dependantField;
    }
}
