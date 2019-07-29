package com.notronix.lw.api.model;

public class PropertyRule
{
    private PropertyRuleType RuleType;
    private String Options;
    private String DependantField;

    public PropertyRuleType getRuleType() {
        return RuleType;
    }

    public void setRuleType(PropertyRuleType ruleType) {
        RuleType = ruleType;
    }

    public String getOptions() {
        return Options;
    }

    public void setOptions(String options) {
        Options = options;
    }

    public String getDependantField() {
        return DependantField;
    }

    public void setDependantField(String dependantField) {
        DependantField = dependantField;
    }
}
