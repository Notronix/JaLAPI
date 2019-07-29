package com.notronix.lw.api.model;

import java.util.List;

public class ConfigChannelLocationBinding
{
    private List<ConfigChannelLocation> Locations;

    public List<ConfigChannelLocation> getLocations() {
        return Locations;
    }

    public void setLocations(List<ConfigChannelLocation> locations) {
        Locations = locations;
    }
}
