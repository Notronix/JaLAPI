package com.notronix.lw.api.model;

import java.util.List;

public class SearchPurchaseOrdersResult extends GenericPagedResult<PurchaseOrderHeader>
{
    private List<PurchaseOrderHeader> Result;
    private Integer CurrentPageNumber;
    private Integer TotalNumberOfRecords;

    public List<PurchaseOrderHeader> getResult() {
        return Result;
    }

    public void setResult(List<PurchaseOrderHeader> result) {
        Result = result;
    }

    public Integer getCurrentPageNumber() {
        return CurrentPageNumber;
    }

    public void setCurrentPageNumber(Integer currentPageNumber) {
        CurrentPageNumber = currentPageNumber;
    }

    public Integer getTotalNumberOfRecords() {
        return TotalNumberOfRecords;
    }

    public void setTotalNumberOfRecords(Integer totalNumberOfRecords) {
        TotalNumberOfRecords = totalNumberOfRecords;
    }

    @Override
    public Integer getPageNumber() {
        return CurrentPageNumber;
    }

    @Override
    public void setPageNumber(Integer pageNumber) {
        CurrentPageNumber = pageNumber;
    }

    @Override
    public Integer getTotalEntries() {
        return TotalNumberOfRecords;
    }

    @Override
    public void setTotalEntries(Integer totalEntries) {
        TotalNumberOfRecords = totalEntries;
    }

    @Override
    public List<PurchaseOrderHeader> getData() {
        return Result;
    }

    @Override
    public void setData(List<PurchaseOrderHeader> data) {
        Result = data;
    }
}
