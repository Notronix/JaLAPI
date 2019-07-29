package com.notronix.lw.impl.method.orders;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.notronix.lw.api.model.FieldSorting;
import com.notronix.lw.api.model.FieldsFilter;
import com.notronix.lw.api.model.GenericPagedResult;
import com.notronix.lw.api.model.OpenOrder;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import static com.notronix.lw.impl.method.MethodUtils.putIfProvided;
import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class GetOpenOrdersMethod extends AbstractLinnworksAPIMethod<GenericPagedResult<OpenOrder>>
{
    private Integer entriesPerPage;
    private Integer pageNumber;
    private FieldsFilter filters;
    private List<FieldSorting> sorting;
    private UUID fulfilmentCenter;
    private String additionalFilter;

    @Override
    public String getURI() {
        return "Orders/GetOpenOrders";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        Map<String, Object> params = new HashMap<>();
        params.put("entriesPerPage", requireNonNull(entriesPerPage));
        params.put("pageNumber", requireNonNull(pageNumber));
        putIfProvided(params, "filters", filters, gson::toJson);
        putIfProvided(params, "sorting", sorting, gson::toJson);
        putIfProvided(params, "fulfilmentCenter", fulfilmentCenter);
        putIfProvided(params, "additionalFilter", additionalFilter);

        return urlEncode(params);
    }

    @Override
    public GenericPagedResult<OpenOrder> getResponse(Gson gson, String jsonPayload) {
        GenericPagedResult<OpenOrder> result =
                gson.fromJson(jsonPayload, new TypeToken<GenericPagedResult<OpenOrder>>(){}.getType());

        if (result.hasNextPage()) {
            result.setNextBuilder(method -> {
                if (!(method instanceof GetOpenOrdersMethod)) {
                    throw new IllegalArgumentException("invalid method");
                }

                ((GetOpenOrdersMethod) method).withFilters(filters).withSorting(sorting)
                        .withFulfilmentCenter(fulfilmentCenter).withAdditionalFilter(additionalFilter)
                        .withEntriesPerPage(entriesPerPage).withPageNumber(result.getNextPageNumber());
            });
        }

        return result;
    }

    public Integer getEntriesPerPage() {
        return entriesPerPage;
    }

    public void setEntriesPerPage(Integer entriesPerPage) {
        this.entriesPerPage = entriesPerPage;
    }

    public GetOpenOrdersMethod withEntriesPerPage(Integer entriesPerPage) {
        this.entriesPerPage = entriesPerPage;
        return this;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public GetOpenOrdersMethod withPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    public FieldsFilter getFilters() {
        return filters;
    }

    public void setFilters(FieldsFilter filters) {
        this.filters = filters;
    }

    public GetOpenOrdersMethod withFilters(FieldsFilter filters) {
        this.filters = filters;
        return this;
    }

    public List<FieldSorting> getSorting() {
        return sorting;
    }

    public void setSorting(List<FieldSorting> sorting) {
        this.sorting = sorting;
    }

    public GetOpenOrdersMethod withSorting(List<FieldSorting> sorting) {
        this.sorting = sorting;
        return this;
    }

    public UUID getFulfilmentCenter() {
        return fulfilmentCenter;
    }

    public void setFulfilmentCenter(UUID fulfilmentCenter) {
        this.fulfilmentCenter = fulfilmentCenter;
    }

    public GetOpenOrdersMethod withFulfilmentCenter(UUID fulfilmentCenter) {
        this.fulfilmentCenter = fulfilmentCenter;
        return this;
    }

    public String getAdditionalFilter() {
        return additionalFilter;
    }

    public void setAdditionalFilter(String additionalFilter) {
        this.additionalFilter = additionalFilter;
    }

    public GetOpenOrdersMethod withAdditionalFilter(String additionalFilter) {
        this.additionalFilter = additionalFilter;
        return this;
    }
}
