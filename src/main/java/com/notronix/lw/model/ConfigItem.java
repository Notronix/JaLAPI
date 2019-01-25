package com.notronix.lw.model;

public class ConfigItem<T>
{
    private Boolean Loaded;
    private Integer pkPropertyId;
    private Boolean IsChanged;
    private String PropertyValue;
    private String PropertyType;

    public Boolean getLoaded()
    {
        return Loaded;
    }

    public void setLoaded(Boolean loaded)
    {
        Loaded = loaded;
    }

    public Integer getPkPropertyId()
    {
        return pkPropertyId;
    }

    public void setPkPropertyId(Integer pkPropertyId)
    {
        this.pkPropertyId = pkPropertyId;
    }

    public Boolean getChanged()
    {
        return IsChanged;
    }

    public void setChanged(Boolean changed)
    {
        IsChanged = changed;
    }

    public String getPropertyValue() {
        return PropertyValue;
    }

    public void setPropertyValue(String propertyValue) {
        PropertyValue = propertyValue;
    }

    public String getPropertyType()
    {
        return PropertyType;
    }

    public void setPropertyType(String propertyType)
    {
        PropertyType = propertyType;
    }
}
