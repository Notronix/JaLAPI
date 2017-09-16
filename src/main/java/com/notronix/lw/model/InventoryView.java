package com.notronix.lw.model;

import java.util.List;

public class InventoryView {
    private String Id;
    private String Name;
    private Mode Mode;
    private String Source;
    private String SubSource;
    private String CountryCode;
    private String CountryName;
    private ListingType Listing;
    private Boolean ShowOnlyChanged;
    private IncludeArchived IncludeProducts;
    private List<Filter> Filters;
    private List<Column> Columns;
    private List<ViewChannel> Channels;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Mode getMode() {
        return Mode;
    }

    public void setMode(Mode mode) {
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

    public List<ViewChannel> getChannels() {
        return Channels;
    }

    public void setChannels(List<ViewChannel> channels) {
        Channels = channels;
    }
}
