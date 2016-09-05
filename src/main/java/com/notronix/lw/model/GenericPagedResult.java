package com.notronix.lw.model;

import java.util.List;

public class GenericPagedResult<T>
{
    private Integer PageNumber;
    private Integer EntriesPerPage;
    private Integer TotalEntries;
    private Integer TotalPages;
    private List<T> Data;

    public Integer getPageNumber()
    {
        return PageNumber;
    }

    public void setPageNumber(Integer pageNumber)
    {
        PageNumber = pageNumber;
    }

    public Integer getEntriesPerPage()
    {
        return EntriesPerPage;
    }

    public void setEntriesPerPage(Integer entriesPerPage)
    {
        EntriesPerPage = entriesPerPage;
    }

    public Integer getTotalEntries()
    {
        return TotalEntries;
    }

    public void setTotalEntries(Integer totalEntries)
    {
        TotalEntries = totalEntries;
    }

    public Integer getTotalPages()
    {
        return TotalPages;
    }

    public void setTotalPages(Integer totalPages)
    {
        TotalPages = totalPages;
    }

    public List<T> getData()
    {
        return Data;
    }

    public void setData(List<T> data)
    {
        Data = data;
    }
}
