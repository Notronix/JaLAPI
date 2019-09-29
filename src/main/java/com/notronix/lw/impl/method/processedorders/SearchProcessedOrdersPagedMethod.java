package com.notronix.lw.impl.method.processedorders;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.notronix.lw.api.model.GenericPagedResult;
import com.notronix.lw.api.model.ProcessedOrderWeb;
import com.notronix.lw.api.model.SearchDateType;
import com.notronix.lw.api.model.SearchField;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

import static com.notronix.lw.impl.method.MethodUtils.putIfProvided;
import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class SearchProcessedOrdersPagedMethod extends AbstractLinnworksAPIMethod<GenericPagedResult<ProcessedOrderWeb>>
{
    private Instant from;
    private Instant to;
    private SearchDateType dateType;
    private SearchField searchField;
    private Boolean exactMatch;
    private String searchTerm;
    private Integer pageNum;
    private Integer numEntriesPerPage;

    @Override
    public String getURI() {
        return "ProcessedOrders/SearchProcessedOrdersPaged";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        Map<String, Object> params = new HashMap<>();
        params.put("pageNum", requireNonNull(pageNum));
        params.put("numEntriesPerPage", requireNonNull(numEntriesPerPage));
        params.put("dateType", requireNonNull(dateType).ordinal());
        params.put("exactMatch", requireNonNull(exactMatch));

        putIfProvided(params, "from", from);
        putIfProvided(params, "to", to);
        putIfProvided(params, "searchField", searchField, SearchField::getField);
        putIfProvided(params, "searchTerm", searchTerm);

        return urlEncode(params);
    }

    @Override
    public GenericPagedResult<ProcessedOrderWeb> getResponse(Gson gson, String jsonPayload) {
        GenericPagedResult<ProcessedOrderWeb> response = gson.fromJson(jsonPayload,
                new TypeToken<GenericPagedResult<ProcessedOrderWeb>>(){}.getType());

        if (response.hasNextPage()) {
            response.setNextBuilder(method -> {
                if (!(method instanceof SearchProcessedOrdersPagedMethod)) {
                    throw new IllegalArgumentException("Invalid method");
                }

                ((SearchProcessedOrdersPagedMethod) method).withFrom(from).withTo(to).withDateType(dateType)
                        .withSearchField(searchField).withExactMatch(exactMatch).withSearchTerm(searchTerm)
                        .withNumEntriesPerPage(numEntriesPerPage).withPageNum(response.getNextPageNumber());
            });
        }

        return response;
    }

    public Instant getFrom() {
        return from;
    }

    public void setFrom(Instant from) {
        this.from = from;
    }

    public SearchProcessedOrdersPagedMethod withFrom(Instant fromDate) {
        this.from = fromDate;
        return this;
    }

    public Instant getTo() {
        return to;
    }

    public void setTo(Instant to) {
        this.to = to;
    }

    public SearchProcessedOrdersPagedMethod withTo(Instant toDate) {
        this.to = toDate;
        return this;
    }

    public SearchDateType getDateType() {
        return dateType;
    }

    public void setDateType(SearchDateType dateType) {
        this.dateType = dateType;
    }

    public SearchProcessedOrdersPagedMethod withDateType(SearchDateType dateType) {
        this.dateType = dateType;
        return this;
    }

    public SearchField getSearchField() {
        return searchField;
    }

    public void setSearchField(SearchField searchField) {
        this.searchField = searchField;
    }

    public SearchProcessedOrdersPagedMethod withSearchField(SearchField searchField) {
        this.searchField = searchField;
        return this;
    }

    public Boolean getExactMatch() {
        return exactMatch;
    }

    public void setExactMatch(Boolean exactMatch) {
        this.exactMatch = exactMatch;
    }

    public SearchProcessedOrdersPagedMethod withExactMatch(Boolean exactMatch) {
        this.exactMatch = exactMatch;
        return this;
    }

    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    public SearchProcessedOrdersPagedMethod withSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
        return this;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public SearchProcessedOrdersPagedMethod withPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    public Integer getNumEntriesPerPage() {
        return numEntriesPerPage;
    }

    public void setNumEntriesPerPage(Integer numEntriesPerPage) {
        this.numEntriesPerPage = numEntriesPerPage;
    }

    public SearchProcessedOrdersPagedMethod withNumEntriesPerPage(Integer numEntriesPerPage) {
        this.numEntriesPerPage = numEntriesPerPage;
        return this;
    }
}
