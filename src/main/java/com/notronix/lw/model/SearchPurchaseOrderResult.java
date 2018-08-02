package com.notronix.lw.model;

import java.util.List;

public class SearchPurchaseOrderResult
{
    private List<PurchaseOrderHeader> Result;
    private Integer TotalPages;
    private Integer CurrentPageNumber;
    private Integer EntriesPerPage;
    private Integer TotalNumberOfRecords;

    public List<PurchaseOrderHeader> getResult() {
        return Result;
    }

    public void setResult(List<PurchaseOrderHeader> result) {
        Result = result;
    }

    public Integer getTotalPages() {
        return TotalPages;
    }

    public void setTotalPages(Integer totalPages) {
        TotalPages = totalPages;
    }

    public Integer getCurrentPageNumber() {
        return CurrentPageNumber;
    }

    public void setCurrentPageNumber(Integer currentPageNumber) {
        CurrentPageNumber = currentPageNumber;
    }

    public Integer getEntriesPerPage() {
        return EntriesPerPage;
    }

    public void setEntriesPerPage(Integer entriesPerPage) {
        EntriesPerPage = entriesPerPage;
    }

    public Integer getTotalNumberOfRecords() {
        return TotalNumberOfRecords;
    }

    public void setTotalNumberOfRecords(Integer totalNumberOfRecords) {
        TotalNumberOfRecords = totalNumberOfRecords;
    }
}
