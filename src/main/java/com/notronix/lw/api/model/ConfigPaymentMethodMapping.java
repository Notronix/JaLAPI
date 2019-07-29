package com.notronix.lw.api.model;

import java.util.List;

public class ConfigPaymentMethodMapping
{
    private List<ConfigPaymentMethodMappingItem> Mapping;
    private List<ChannelPaymentMethod> ChannelServices;
    private Boolean IsChanged;

    public List<ConfigPaymentMethodMappingItem> getMapping() {
        return Mapping;
    }

    public void setMapping(List<ConfigPaymentMethodMappingItem> mapping) {
        Mapping = mapping;
    }

    public List<ChannelPaymentMethod> getChannelServices() {
        return ChannelServices;
    }

    public void setChannelServices(List<ChannelPaymentMethod> channelServices) {
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
