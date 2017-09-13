package com.notronix.lw.methods.processedorders;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.GenericPagedResult;
import com.notronix.lw.model.ProcessedOrderWeb;
import com.notronix.lw.model.SearchDateType;
import com.notronix.lw.model.SearchField;

import java.time.Instant;

public class SearchProcessedOrdersPagedMethod extends ProcessedOrdersMethod<GenericPagedResult<ProcessedOrderWeb>>
{
    private Instant from;
    private Instant to;
    private SearchDateType dateType;
    private SearchField searchField;
    private Boolean exactMatch;
    private String searchTerm;
    private Integer pageNum = 1;
    private Integer pageSize = 200;

    @Override
    public String getName()
    {
        return "SearchProcessedOrdersPaged";
    }

    @Override
    public String getPayload()
    {
        // from: 2016-08-02T14:36:51.9034133+01:00
        // to: 2016-08-02T14:36:51.9034133+01:00
        return "from=" + from + "&to=" + to + "&dateType=" + dateType.value()
                + "&searchField=" + (searchField == null ? "" : searchField.getField()) + "&exactMatch=" + exactMatch + "&searchTerm=" + searchTerm
                + "&pageNum=" + pageNum + "&numEntriesPerPage=" + pageSize;
    }

    @Override
    public GenericPagedResult<ProcessedOrderWeb> getResponse() throws LinnworksAPIException
    {
        return new Gson().fromJson(getJsonResult(), new TypeToken<GenericPagedResult<ProcessedOrderWeb>>(){}.getType());
    }

    public Instant getFrom()
    {
        return from;
    }

    public void setFrom(Instant from)
    {
        this.from = from;
    }

    public SearchProcessedOrdersPagedMethod from(Instant fromDate)
    {
        this.from = fromDate;
        return this;
    }

    public Instant getTo()
    {
        return to;
    }

    public void setTo(Instant to)
    {
        this.to = to;
    }

    public SearchProcessedOrdersPagedMethod to(Instant toDate)
    {
        this.to = toDate;
        return this;
    }

    public SearchDateType getDateType()
    {
        return dateType;
    }

    public void setDateType(SearchDateType dateType)
    {
        this.dateType = dateType;
    }

    public SearchProcessedOrdersPagedMethod withDateType(SearchDateType dateType)
    {
        this.dateType = dateType;
        return this;
    }

    public SearchField getSearchField()
    {
        return searchField;
    }

    public void setSearchField(SearchField searchField)
    {
        this.searchField = searchField;

        if (searchField != null && !searchField.getExactSearchOptional())
        {
            setExactMatch();
        }
    }

    public SearchProcessedOrdersPagedMethod withSearchField(SearchField searchField)
    {
        setSearchField(searchField);
        return this;
    }

    public Boolean isExactMatch()
    {
        return exactMatch;
    }

    public void setExactMatch()
    {
        exactMatch = true;
    }

    public SearchProcessedOrdersPagedMethod withExactMatch()
    {
        setExactMatch();
        return this;
    }

    public Boolean isPartialMatch()
    {
        return !exactMatch;
    }

    public void setPartialMatch() throws IllegalAccessException, IllegalArgumentException
    {
        if (searchField == null)
        {
            throw new IllegalAccessException("You cannot specify partial matching until you have specified the search field.");
        }

        if (!searchField.getExactSearchOptional())
        {
            throw new IllegalArgumentException("Partial matching is not an option for the specified search field.");
        }

        this.exactMatch = false;
    }

    public SearchProcessedOrdersPagedMethod withPartialMatch() throws IllegalAccessException, IllegalArgumentException
    {
        setPartialMatch();
        return this;
    }

    public String getSearchTerm()
    {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm)
    {
        this.searchTerm = searchTerm;
    }

    public SearchProcessedOrdersPagedMethod withSearchTerm(String searchTerm)
    {
        this.searchTerm = searchTerm;
        return this;
    }

    public Integer getPageNum()
    {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) throws IllegalArgumentException
    {
        if (pageNum == null || pageNum < 1)
        {
            throw new IllegalArgumentException("pageNum must be greater than 0.");
        }

        this.pageNum = pageNum;
    }

    public SearchProcessedOrdersPagedMethod withPageNum(Integer pageNum) throws IllegalArgumentException
    {
        setPageNum(pageNum);
        return this;
    }

    public Integer getPageSize()
    {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) throws IllegalArgumentException
    {
        if (pageSize == null || pageSize < 1 || pageSize > 200)
        {
            throw new IllegalArgumentException("pageSize must be between 1 and 200 inclusive.");
        }

        this.pageSize = pageSize;
    }

    public SearchProcessedOrdersPagedMethod withPageSize(Integer pageSize) throws IllegalArgumentException
    {
        setPageSize(pageSize);
        return this;
    }
}
