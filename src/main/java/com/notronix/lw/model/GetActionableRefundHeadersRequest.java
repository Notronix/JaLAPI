package com.notronix.lw.model;

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

    public ActionablePostSaleSearchFilters getFilters() {
        return Filters;
    }

    public void setFilters(ActionablePostSaleSearchFilters filters) {
        Filters = filters;
    }
}
