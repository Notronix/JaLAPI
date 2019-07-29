package com.notronix.lw.api.model;

import java.util.UUID;

public class StockItemExtendedProperty
{
    private UUID pkRowId;
    private UUID fkStockItemId;
    private String ProperyName;
    private String PropertyValue;
    private String PropertyType;

    public UUID getPkRowId()
    {
        return pkRowId;
    }

    public void setPkRowId(UUID pkRowId)
    {
        this.pkRowId = pkRowId;
    }

    public UUID getFkStockItemId()
    {
        return fkStockItemId;
    }

    public void setFkStockItemId(UUID fkStockItemId)
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
