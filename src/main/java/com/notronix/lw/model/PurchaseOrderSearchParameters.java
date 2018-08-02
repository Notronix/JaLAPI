package com.notronix.lw.model;

import java.util.ArrayList;
import java.util.List;

public class PurchaseOrderSearchParameters
{
    private String DateFrom = "";
    private String DateTo = "";
    private Integer Status = null; //1=Open, 2=Partial, 3=Delivered,
    private String ReferenceLike = "";
    private Integer EntriesPerPage = 1000000;
    private Integer PageNumber = 1;
    private List<String> Location = new ArrayList<>();
    private List<String> Supplier = new ArrayList<>();

    public String getDateFrom() {
        return DateFrom;
    }

    public void setDateFrom(String dateFrom) {
        DateFrom = dateFrom;
    }

    public String getDateTo() {
        return DateTo;
    }

    public void setDateTo(String dateTo) {
        DateTo = dateTo;
    }

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer status) {
        Status = status;
    }

    public String getReferenceLike() {
        return ReferenceLike;
    }

    public void setReferenceLike(String referenceLike) {
        ReferenceLike = referenceLike;
    }

    public Integer getEntriesPerPage() {
        return EntriesPerPage;
    }

    public void setEntriesPerPage(Integer entriesPerPage) {
        EntriesPerPage = entriesPerPage;
    }

    public Integer getPageNumber() {
        return PageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        PageNumber = pageNumber;
    }

    public List<String> getLocation() {
        return Location;
    }

    public void setLocation(List<String> location) {
        Location = location;
    }

    public List<String> getSupplier() {
        return Supplier;
    }

    public void setSupplier(List<String> supplier) {
        Supplier = supplier;
    }
}
