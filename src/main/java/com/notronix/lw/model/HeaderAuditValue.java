package com.notronix.lw.model;

public class HeaderAuditValue
{
    private Integer pkPropertyId;
    private Integer fkChannelId;
    private String PropertyName;
    private Object PropertyValue;
    private String PropertyType;
    private String Source;

    public Integer getPkPropertyId()
    {
        return pkPropertyId;
    }

    public void setPkPropertyId(Integer pkPropertyId)
    {
        this.pkPropertyId = pkPropertyId;
    }

    public Integer getFkChannelId()
    {
        return fkChannelId;
    }

    public void setFkChannelId(Integer fkChannelId)
    {
        this.fkChannelId = fkChannelId;
    }

    public String getPropertyName()
    {
        return PropertyName;
    }

    public void setPropertyName(String propertyName)
    {
        PropertyName = propertyName;
    }

    public Object getPropertyValue()
    {
        return PropertyValue;
    }

    public void setPropertyValue(Object propertyValue)
    {
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

    public String getSource()
    {
        return Source;
    }

    public void setSource(String source)
    {
        Source = source;
    }
}
