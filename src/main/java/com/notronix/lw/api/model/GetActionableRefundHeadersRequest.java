package com.notronix.lw.api.model;

public class GetActionableRefundHeadersRequest
{
    private Integer Page;
    private ActionablePostSaleSearchFilters Filters;

    public Integer getPage() {
        return Page;
    }

    public void setPage(Integer page) {
        Page = page;
    }

    public GetActionableRefundHeadersRequest withPage(Integer page) {
        Page = page;
        return this;
    }

    public ActionablePostSaleSearchFilters getFilters() {
        return Filters;
    }

    public void setFilters(ActionablePostSaleSearchFilters filters) {
        Filters = filters;
    }

    public GetActionableRefundHeadersRequest withFilters(ActionablePostSaleSearchFilters filters) {
        Filters = filters;
        return this;
    }
}
