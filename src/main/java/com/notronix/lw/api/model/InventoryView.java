package com.notronix.lw.api.model;

import java.util.List;
import java.util.UUID;

public class InventoryView
{
    private UUID Id;
    private String Name;
    private ModeType Mode;
    private String Source;
    private String SubSource;
    private String CountryCode;
    private String CountryName;
    private ListingType Listing;
    private Boolean ShowOnlyChanged;
    private IncludeArchived IncludeProducts;
    private List<Filter> Filters;
    private List<Column> Columns;
    private List<Channel> Channels;

    public UUID getId() {
        return Id;
    }

    public void setId(UUID id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public ModeType getMode() {
        return Mode;
    }

    public void setMode(ModeType mode) {
        Mode = mode;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    public String getSubSource() {
        return SubSource;
    }

    public void setSubSource(String subSource) {
        SubSource = subSource;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }

    public String getCountryName() {
        return CountryName;
    }

    public void setCountryName(String countryName) {
        CountryName = countryName;
    }

    public ListingType getListing() {
        return Listing;
    }

    public void setListing(ListingType listing) {
        Listing = listing;
    }

    public Boolean getShowOnlyChanged() {
        return ShowOnlyChanged;
    }

    public void setShowOnlyChanged(Boolean showOnlyChanged) {
        ShowOnlyChanged = showOnlyChanged;
    }

    public IncludeArchived getIncludeProducts() {
        return IncludeProducts;
    }

    public void setIncludeProducts(IncludeArchived includeProducts) {
        IncludeProducts = includeProducts;
    }

    public List<Filter> getFilters() {
        return Filters;
    }

    public void setFilters(List<Filter> filters) {
        Filters = filters;
    }

    public List<Column> getColumns() {
        return Columns;
    }

    public void setColumns(List<Column> columns) {
        Columns = columns;
    }

    public List<Channel> getChannels() {
        return Channels;
    }

    public void setChannels(List<Channel> channels) {
        Channels = channels;
    }
}
