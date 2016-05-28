package com.notronix.lw.model;

import java.util.List;

public class InventoryItemChannel
{
    private boolean ContainsChanges;
    private List<ChannelLink> Links;
    private List<ChannelTemplate> Templates;
    private List<Object> Changes;

    public boolean isContainsChanges()
    {
        return ContainsChanges;
    }

    public void setContainsChanges(boolean containsChanges)
    {
        ContainsChanges = containsChanges;
    }

    public List<ChannelLink> getLinks()
    {
        return Links;
    }

    public void setLinks(List<ChannelLink> links)
    {
        Links = links;
    }

    public List<ChannelTemplate> getTemplates()
    {
        return Templates;
    }

    public void setTemplates(List<ChannelTemplate> templates)
    {
        Templates = templates;
    }

    public List<Object> getChanges()
    {
        return Changes;
    }

    public void setChanges(List<Object> changes)
    {
        Changes = changes;
    }
}
