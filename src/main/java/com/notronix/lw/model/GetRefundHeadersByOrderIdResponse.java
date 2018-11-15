package com.notronix.lw.model;

import java.util.List;

public class GetRefundHeadersByOrderIdResponse
{
    private List<OrderRefundHeader> RefundHeaders;

    public List<OrderRefundHeader> getRefundHeaders() {
        return RefundHeaders;
    }

    public void setRefundHeaders(List<OrderRefundHeader> refundHeaders) {
        RefundHeaders = refundHeaders;
    }
}
