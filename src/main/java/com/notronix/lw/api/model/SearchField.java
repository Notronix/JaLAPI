package com.notronix.lw.api.model;

public class SearchField
{
    private String Field;
    private String Name;
    private Boolean AllowForAllDates;
    private Boolean ExactSearchOptional;

    public String getField() {
        return Field;
    }

    public void setField(String field) {
        Field = field;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Boolean getAllowForAllDates() {
        return AllowForAllDates;
    }

    public void setAllowForAllDates(Boolean allowForAllDates) {
        AllowForAllDates = allowForAllDates;
    }

    public Boolean getExactSearchOptional() {
        return ExactSearchOptional;
    }

    public void setExactSearchOptional(Boolean exactSearchOptional) {
        ExactSearchOptional = exactSearchOptional;
    }
}
