package com.notronix.lw.api.model;

import com.notronix.lw.api.method.LinnworksAPIMethod;
import com.notronix.lw.api.method.PagedResult;

import java.util.List;
import java.util.function.Consumer;

public class GenericPagedResult<T> implements PagedResult<T>
{
    private Integer PageNumber;
    private Integer EntriesPerPage;
    private Integer TotalEntries;
    private Integer TotalPages;
    private List<T> Data;
    private Consumer<LinnworksAPIMethod<? extends PagedResult<T>>> nextBuilder;

    @Override
    public Integer getPageNumber() {
        return PageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        PageNumber = pageNumber;
    }

    @Override
    public Integer getEntriesPerPage() {
        return EntriesPerPage;
    }

    public void setEntriesPerPage(Integer entriesPerPage) {
        EntriesPerPage = entriesPerPage;
    }

    @Override
    public Integer getTotalEntries() {
        return TotalEntries;
    }

    public void setTotalEntries(Integer totalEntries) {
        TotalEntries = totalEntries;
    }

    @Override
    public Integer getTotalPages() {
        return TotalPages;
    }

    public void setTotalPages(Integer totalPages) {
        TotalPages = totalPages;
    }

    @Override
    public List<T> getData() {
        return Data;
    }

    public void setData(List<T> data) {
        Data = data;
    }

    @Override
    public Consumer<LinnworksAPIMethod<? extends PagedResult<T>>> getNextBuilder() {
        return nextBuilder;
    }

    public void setNextBuilder(Consumer<LinnworksAPIMethod<? extends PagedResult<T>>> nextBuilder) {
        this.nextBuilder = nextBuilder;
    }

    public boolean hasNextPage() {
        Integer pageNumber = getPageNumber();
        Integer totalPages = getTotalPages();

        return pageNumber != null && totalPages != null && pageNumber < totalPages;
    }

    public Integer getNextPageNumber() {
        Integer pageNumber = getPageNumber();
        Integer totalPages = getTotalPages();

        return (pageNumber == null || pageNumber < 1) ? 1
                : ((totalPages != null && pageNumber >= totalPages) ? totalPages : pageNumber + 1);
    }

    public boolean isLastPage() {
        Integer pageNumber = getPageNumber();
        Integer totalPages = getTotalPages();

        return pageNumber != null && pageNumber.equals(totalPages);
    }
}
