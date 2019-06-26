package com.notronix.lw.methods.stock;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.GenericPagedResult;
import com.notronix.lw.model.VariationGroup;
import com.notronix.lw.model.VariationSearchType;

import static java.util.Objects.requireNonNull;

public class SearchVariationGroupsMethod extends StockMethod<GenericPagedResult<VariationGroup>>
{
    private VariationSearchType searchType;
    private String searchText;
    private Integer pageNumber;
    private Integer entriesPerPage;

    @Override
    public String getName() {
        return "SearchVariationGroups";
    }

    @Override
    public String getPayload() {
        return "searchType=" + requireNonNull(searchType)
                + "&searchText=" + requireNonNull(searchText)
                + "&pageNumber=" + requireNonNull(pageNumber)
                + "&entriesPerPage=" + requireNonNull(entriesPerPage);
    }

    @Override
    public GenericPagedResult<VariationGroup> getResponse() throws LinnworksAPIException {
        return new Gson().fromJson(getJsonResult(), new TypeToken<GenericPagedResult<VariationGroup>>(){}.getType());
    }

    public VariationSearchType getSearchType() {
        return searchType;
    }

    public void setSearchType(VariationSearchType searchType) {
        this.searchType = searchType;
    }

    public SearchVariationGroupsMethod withSearchType(VariationSearchType searchType) {
        this.searchType = searchType;
        return this;
    }

    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }

    public SearchVariationGroupsMethod withSearchText(String searchText) {
        this.searchText = searchText;
        return this;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public SearchVariationGroupsMethod withPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    public Integer getEntriesPerPage() {
        return entriesPerPage;
    }

    public void setEntriesPerPage(Integer entriesPerPage) {
        this.entriesPerPage = entriesPerPage;
    }

    public SearchVariationGroupsMethod withEntriesPerPage(Integer entriesPerPage) {
        this.entriesPerPage = entriesPerPage;
        return this;
    }
}
