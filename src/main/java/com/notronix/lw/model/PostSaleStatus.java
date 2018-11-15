package com.notronix.lw.model;

public class PostSaleStatus
{
    private PostSaleStatusType StatusHeader;
    private PostSaleSubStatus StatusDetail;

    public PostSaleStatusType getStatusHeader() {
        return StatusHeader;
    }

    public void setStatusHeader(PostSaleStatusType statusHeader) {
        StatusHeader = statusHeader;
    }

    public PostSaleSubStatus getStatusDetail() {
        return StatusDetail;
    }

    public void setStatusDetail(PostSaleSubStatus statusDetail) {
        StatusDetail = statusDetail;
    }
}
