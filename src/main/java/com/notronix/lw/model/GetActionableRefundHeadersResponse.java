package com.notronix.lw.model;

import java.util.List;

public class GetActionableRefundHeadersResponse
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
}
