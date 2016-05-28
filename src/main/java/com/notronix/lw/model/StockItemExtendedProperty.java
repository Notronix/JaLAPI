package com.notronix.lw.model;

public class StockItemExtendedProperty
{
    private String pkRowId;
    private String fkStockItemId;
    private String ProperyName;
    private String PropertyValue;
    private String PropertyType;

    public String getPkRowId()
    {
        return pkRowId;
    }

    public void setPkRowId(String pkRowId)
    {
        this.pkRowId = pkRowId;
    }

    public String getFkStockItemId()
    {
        return fkStockItemId;
    }

    public void setFkStockItemId(String fkStockItemId)
    {
        this.fkStockItemId = fkStockItemId;
    }

    public String getProperyName()
    {
        return ProperyName;
    }

    public void setProperyName(String properyName)
    {
        ProperyName = properyName;
    }

    // added due to spelling mistake in LW public api
    public String getPropertyName()
    {
        return ProperyName;
    }

    // added due to spelling mistake in LW public api
    public void setPropertyName(String propertyName)
    {
        ProperyName = propertyName;
    }

    public String getPropertyValue()
    {
        return PropertyValue;
    }

    public void setPropertyValue(String propertyValue)
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
}
