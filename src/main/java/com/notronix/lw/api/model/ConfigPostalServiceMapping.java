package com.notronix.lw.api.model;

import java.util.List;

public class ConfigPostalServiceMapping
{
    private List<ConfigPostalServiceMappingItem> Mapping;
    private List<ChannelPostalService> ChannelServices;
    private Boolean IsChanged;

    public List<ConfigPostalServiceMappingItem> getMapping() {
        return Mapping;
    }

    public void setMapping(List<ConfigPostalServiceMappingItem> mapping) {
        Mapping = mapping;
    }

    public List<ChannelPostalService> getChannelServices() {
        return ChannelServices;
    }

    public void setChannelServices(List<ChannelPostalService> channelServices) {
        ChannelServices = channelServices;
    }

    public Boolean getChanged()
    {
        return IsChanged;
    }

    public void setChanged(Boolean changed)
    {
        IsChanged = changed;
    }
}
