package com.notronix.lw.methods.stock;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.GenericPagedResult;

public class GetStockItemsMethod extends StockMethod<GenericPagedResult>
{
    private String keyWord;
    private String locationId;
    private Integer pageSize;
    private Integer pageNumber;
    private Boolean excludeComposites;

    @Override
    public String getName()
    {
        return "GetStockItems";
    }

    @Override
    public String getPayload()
    {
        String payload = "keyWord=" + (keyWord == null ? "" : keyWord);
        payload += "&locationId=" + (locationId == null ? "" : locationId);
        payload += "&entriesPerPage=" + (pageSize == null ? Integer.MAX_VALUE : pageSize);
        payload += "&pageNumber=" + (pageNumber == null ? 1 : pageNumber);
        payload += "&excludeComposites=" + (excludeComposites == null ? true : excludeComposites);

        return payload;
    }

    @Override
    public GenericPagedResult getResponse()
            throws LinnworksAPIException
    {
        return new Gson().fromJson(getJsonResult(), GenericPagedResult.class);
    }

    public String getKeyWord()
    {
        return keyWord;
    }

    public void setKeyWord(String keyWord)
    {
        this.keyWord = keyWord;
    }

    public String getLocationId()
    {
        return locationId;
    }

    public void setLocationId(String locationId)
    {
        this.locationId = locationId;
    }

    public Integer getPageSize()
    {
        return pageSize;
    }

    public void setPageSize(Integer pageSize)
    {
        this.pageSize = pageSize;
    }

    public GetStockItemsMethod withPageSize(Integer pageSize)
    {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getPageNumber()
    {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber)
    {
        this.pageNumber = pageNumber;
    }

    public Boolean getExcludeComposites()
    {
        return excludeComposites;
    }

    public void setExcludeComposites(Boolean excludeComposites)
    {
        this.excludeComposites = excludeComposites;
    }
}
