package com.notronix.lw.methods.orders;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.GenericPagedResult;
import com.notronix.lw.model.OpenOrder;

public class GetOpenOrdersMethod extends OrdersMethod<GenericPagedResult<OpenOrder>>
{
    private Integer pageSize = 200;
    private Integer pageNum = 1;

    @Override
    public String getName() {
        return "GetOpenOrders";
    }

    @Override
    public String getPayload() {
        return "entriesPerPage=" + pageSize + "&pageNumber=" + pageNum
                + "&fulfilmentCenter=&sorting=&additionalFilter=";
    }

    @Override
    public GenericPagedResult<OpenOrder> getResponse() throws LinnworksAPIException {
        return new Gson().fromJson(getJsonResult(), new TypeToken<GenericPagedResult<OpenOrder>>(){}.getType());
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public GetOpenOrdersMethod withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public GetOpenOrdersMethod withPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
}
