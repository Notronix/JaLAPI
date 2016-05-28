package com.notronix.lw.model;

public class ConfigPaymentMethodMapping
{
    private Object Mapping;
    private Object ChannelServices;
    private Boolean IsChanged;

    public Object getMapping()
    {
        return Mapping;
    }

    public void setMapping(Object mapping)
    {
        Mapping = mapping;
    }

    public Object getChannelServices()
    {
        return ChannelServices;
    }

    public void setChannelServices(Object channelServices)
    {
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
