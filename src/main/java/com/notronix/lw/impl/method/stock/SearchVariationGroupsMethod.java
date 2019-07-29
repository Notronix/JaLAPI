package com.notronix.lw.impl.method.stock;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.notronix.lw.api.model.GenericPagedResult;
import com.notronix.lw.api.model.VariationGroup;
import com.notronix.lw.api.model.VariationSearchType;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.HashMap;
import java.util.Map;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class SearchVariationGroupsMethod extends AbstractLinnworksAPIMethod<GenericPagedResult<VariationGroup>>
{
    private VariationSearchType searchType;
    private String searchText;
    private Integer pageNumber;
    private Integer entriesPerPage;

    @Override
    public String getURI() {
        return "Stock/SearchVariationGroups";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        Map<String, Object> params = new HashMap<>();
        params.put("searchType", requireNonNull(searchType).ordinal());
        params.put("searchText", requireNonNull(searchText));
        params.put("pageNumber", requireNonNull(pageNumber));
        params.put("entriesPerPage", requireNonNull(entriesPerPage));

        return urlEncode(params);
    }

    @Override
    public GenericPagedResult<VariationGroup> getResponse(Gson gson, String jsonPayload) {
        GenericPagedResult<VariationGroup> response = gson.fromJson(jsonPayload,
                new TypeToken<GenericPagedResult<VariationGroup>>(){}.getType());

        if (response.hasNextPage()) {
            response.setNextBuilder(method -> {
                if (!(method instanceof SearchVariationGroupsMethod)) {
                    throw new IllegalArgumentException("invalid method");
                }

                ((SearchVariationGroupsMethod) method).withSearchType(searchType).withSearchText(searchText)
                        .withEntriesPerPage(entriesPerPage).withPageNumber(response.getNextPageNumber());
            });
        }

        return response;
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
