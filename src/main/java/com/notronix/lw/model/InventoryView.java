package com.notronix.lw.model;

import java.util.List;

public class InventoryView
{
    private String Id;
    private String Name;
    private String Mode;
    private String Source;
    private String SubSource;
    private String CountryCode;
    private String CountryName;
    private String Listing;
    private Boolean ShowOnlyChanged;
    private String IncludeProducts;
    private List<Filter> Filters;
    private List<Column> Columns;
    private List<Channel> Channels;

    public String getId()
    {
        return Id;
    }

    public void setId(String id)
    {
        Id = id;
    }

    public String getName()
    {
        return Name;
    }

    public void setName(String name)
    {
        Name = name;
    }

    public String getMode()
    {
        return Mode;
    }

    public void setMode(String mode)
    {
        Mode = mode;
    }

    public String getSource()
    {
        return Source;
    }

    public void setSource(String source)
    {
        Source = source;
    }

    public String getSubSource()
    {
        return SubSource;
    }

    public void setSubSource(String subSource)
    {
        SubSource = subSource;
    }

    public String getCountryCode()
    {
        return CountryCode;
    }

    public void setCountryCode(String countryCode)
    {
        CountryCode = countryCode;
    }

    public String getCountryName()
    {
        return CountryName;
    }

    public void setCountryName(String countryName)
    {
        CountryName = countryName;
    }

    public String getListing()
    {
        return Listing;
    }

    public void setListing(String listing)
    {
        Listing = listing;
    }

    public Boolean getShowOnlyChanged()
    {
        return ShowOnlyChanged;
    }

    public void setShowOnlyChanged(Boolean showOnlyChanged)
    {
        ShowOnlyChanged = showOnlyChanged;
    }

    public String getIncludeProducts()
    {
        return IncludeProducts;
    }

    public void setIncludeProducts(String includeProducts)
    {
        IncludeProducts = includeProducts;
    }

    public List<Filter> getFilters()
    {
        return Filters;
    }

    public void setFilters(List<Filter> filters)
    {
        Filters = filters;
    }

    public List<Column> getColumns()
    {
        return Columns;
    }

    public void setColumns(List<Column> columns)
    {
        Columns = columns;
    }

    public List<Channel> getChannels()
    {
        return Channels;
    }

    public void setChannels(List<Channel> channels)
    {
        Channels = channels;
    }
}
