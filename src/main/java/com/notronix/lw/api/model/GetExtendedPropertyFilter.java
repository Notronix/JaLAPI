package com.notronix.lw.api.model;

public class GetExtendedPropertyFilter
{
    private String PropertyName;
    private String PropertyType;

    public String getPropertyName() {
        return PropertyName;
    }

    public void setPropertyName(String propertyName) {
        PropertyName = propertyName;
    }

    public String getPropertyType() {
        return PropertyType;
    }

    public void setPropertyType(String propertyType) {
        PropertyType = propertyType;
    }
}
