package com.notronix.lw.api.model;

import java.util.List;

public class GetActionableRefundHeadersResponse extends GenericPagedResult<OrderRefundHeader>
{
    private Integer Page;
    private Integer TotalHeaders;
    private Integer HeadersPerPage;
    private List<OrderRefundHeader> RefundHeaders;

    public Integer getPage() {
        return Page;
    }

    public void setPage(Integer page) {
        Page = page;
    }

    public Integer getTotalHeaders() {
        return TotalHeaders;
    }

    public void setTotalHeaders(Integer totalHeaders) {
        TotalHeaders = totalHeaders;
    }

    public Integer getHeadersPerPage() {
        return HeadersPerPage;
    }

    public void setHeadersPerPage(Integer headersPerPage) {
        HeadersPerPage = headersPerPage;
    }

    public List<OrderRefundHeader> getRefundHeaders() {
        return RefundHeaders;
    }

    public void setRefundHeaders(List<OrderRefundHeader> refundHeaders) {
        RefundHeaders = refundHeaders;
    }

    @Override
    public Integer getPageNumber() {
        return Page;
    }

    @Override
    public void setPageNumber(Integer pageNumber) {
        Page = pageNumber;
    }

    @Override
    public Integer getEntriesPerPage() {
        return HeadersPerPage;
    }

    @Override
    public void setEntriesPerPage(Integer entriesPerPage) {
        HeadersPerPage = entriesPerPage;
    }

    @Override
    public Integer getTotalEntries() {
        return TotalHeaders;
    }

    @Override
    public void setTotalEntries(Integer totalEntries) {
        TotalHeaders = totalEntries;
    }

    @Override
    public Integer getTotalPages() {
        Integer pageSize = getEntriesPerPage();
        Integer totalItems = getTotalEntries();

        if (pageSize == null || totalItems == null) {
            return 1;
        }

        if (totalItems == 0) {
            return 0;
        }

        return (totalItems + pageSize - 1) / pageSize;
    }

    @Override
    public void setTotalPages(Integer totalPages) {
        throw new RuntimeException("method not supported.");
    }

    @Override
    public List<OrderRefundHeader> getData() {
        return RefundHeaders;
    }

    @Override
    public void setData(List<OrderRefundHeader> data) {
        RefundHeaders = data;
    }
}
