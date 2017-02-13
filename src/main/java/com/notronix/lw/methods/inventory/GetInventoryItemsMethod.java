package com.notronix.lw.methods.inventory;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.GetInventoryItemsResponse;
import com.notronix.lw.model.InventoryView;

import java.util.Collections;
import java.util.List;

public class GetInventoryItemsMethod extends InventoryMethod<GetInventoryItemsResponse>
{
    private InventoryView view;
    private List<String> stockLocationIds;
    private Integer startIndex;
    private Integer pageSize;
    private Boolean preloadChilds;

    @Override
    public GetInventoryItemsResponse getResponse()
            throws LinnworksAPIException
    {
        GetInventoryItemsResponse response = new Gson().fromJson(getJsonResult(), GetInventoryItemsResponse.class);
        response.setBatchSize(pageSize);

        return response;
    }

    @Override
    public String getPayload()
    {
        Gson gson = new Gson();
        String payload = "view=" + gson.toJson(view);
        payload += "&stockLocationIds=" + gson.toJson(stockLocationIds == null ? Collections.emptyList().toArray() : stockLocationIds.toArray());
        payload += "&startIndex=" + (startIndex == null ? 1 : startIndex) + "&itemsCount=" + (pageSize == null ? 1 : pageSize);
        payload += "&preloadChilds=" + (preloadChilds == null ? "false" : preloadChilds.toString());

        return payload;
    }

    @Override
    public String getName()
    {
        return "GetInventoryItems";
    }

    public InventoryView getView()
    {
        return view;
    }

    public void setView(InventoryView view)
    {
        this.view = view;
    }

    public GetInventoryItemsMethod withView(InventoryView view)
    {
        this.view = view;
        return this;
    }

    public List<String> getStockLocationIds()
    {
        return stockLocationIds;
    }

    public void setStockLocationIds(List<String> stockLocationIds)
    {
        this.stockLocationIds = stockLocationIds;
    }

    public GetInventoryItemsMethod withStockLocationIds(List<String> stockLocationIds)
    {
        this.stockLocationIds = stockLocationIds;
        return this;
    }

    public Integer getStartIndex()
    {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex)
    {
        this.startIndex = startIndex;
    }

    public GetInventoryItemsMethod withStartIndex(Integer startIndex)
    {
        if (startIndex < 1)
        {
            this.startIndex = 1;
        }
        else
        {
            this.startIndex = startIndex;
        }

        return this;
    }

    public Integer getPageSize()
    {
        return pageSize;
    }

    public void setPageSize(Integer pageSize)
    {
        this.pageSize = pageSize;
    }

    public GetInventoryItemsMethod withPageSize(Integer pageSize)
    {
        this.pageSize = pageSize;
        return this;
    }

    public Boolean getPreloadChilds()
    {
        return preloadChilds;
    }

    public void setPreloadChilds(Boolean preloadChilds)
    {
        this.preloadChilds = preloadChilds;
    }

    public GetInventoryItemsMethod withPreloadChilds(Boolean preloadChilds)
    {
        this.preloadChilds = preloadChilds;
        return this;
    }
}
