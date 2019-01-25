package com.notronix.lw.model;

public class System_Channel_Setting_Property
{
    private Integer pkPropertyId;
    private Integer fkChannelId;
    private String PropertyName;
    private String PropertyValue;
    private String PropertyType;
    private Object Source;

    public Integer getPkPropertyId() {
        return pkPropertyId;
    }

    public void setPkPropertyId(Integer pkPropertyId) {
        this.pkPropertyId = pkPropertyId;
    }

    public Integer getFkChannelId() {
        return fkChannelId;
    }

    public void setFkChannelId(Integer fkChannelId) {
        this.fkChannelId = fkChannelId;
    }

    public String getPropertyName() {
        return PropertyName;
    }

    public void setPropertyName(String propertyName) {
        PropertyName = propertyName;
    }

    public String getPropertyValue() {
        return PropertyValue;
    }

    public void setPropertyValue(String propertyValue) {
        PropertyValue = propertyValue;
    }

    public String getPropertyType() {
        return PropertyType;
    }

    public void setPropertyType(String propertyType) {
        PropertyType = propertyType;
    }

    public Object getSource() {
        return Source;
    }

    public void setSource(Object source) {
        Source = source;
    }
}
