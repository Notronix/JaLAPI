package com.notronix.lw.methods.orders;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.GenericPagedResult;
import com.notronix.lw.model.OpenOrder;

import static org.apache.http.util.TextUtils.isBlank;

public class GetOpenOrdersMethod extends OrdersMethod<GenericPagedResult<OpenOrder>>
{
    private Integer pageSize = 200;
    private Integer pageNum = 1;
    private String fulfillmentCenterId;

    @Override
    public String getName() {
        return "GetOpenOrders";
    }

    @Override
    public String getPayload() {
        return "entriesPerPage=" + pageSize + "&pageNumber=" + pageNum
                + "&fulfilmentCenter=" + (isBlank(fulfillmentCenterId) ? "" : fulfillmentCenterId) + "&sorting=&additionalFilter=";
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

    public String getFulfillmentCenterId() {
        return fulfillmentCenterId;
    }

    public void setFulfillmentCenterId(String fulfillmentCenterId) {
        this.fulfillmentCenterId = fulfillmentCenterId;
    }

    public GetOpenOrdersMethod withFulfillmentCenterId(String fulfillmentCenterId) {
        this.fulfillmentCenterId = fulfillmentCenterId;
        return this;
    }
}
