package com.notronix.lw.api.model;

import java.util.List;

public class ConfigStockLocationBinding
{
    private List<ConfigStockLocation> Locations;

    public List<ConfigStockLocation> getLocations()
    {
        return Locations;
    }

    public void setLocations(List<ConfigStockLocation> locations)
    {
        Locations = locations;
    }
}
