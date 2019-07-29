package com.notronix.lw.api.model;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

public class SearchPurchaseOrderParameter
{
    private Instant DateFrom;
    private Instant DateTo;
    private PurchaseOrderStatus Status;
    private String ReferenceLike;
    private Integer EntriesPerPage;
    private Integer PageNumber;
    private List<UUID> Location;
    private List<UUID> Supplier;

    public Instant getDateFrom() {
        return DateFrom;
    }

    public void setDateFrom(Instant dateFrom) {
        DateFrom = dateFrom;
    }

    public SearchPurchaseOrderParameter withDateFrom(Instant dateFrom) {
        DateFrom = dateFrom;
        return this;
    }

    public Instant getDateTo() {
        return DateTo;
    }

    public void setDateTo(Instant dateTo) {
        DateTo = dateTo;
    }

    public SearchPurchaseOrderParameter withDateTo(Instant dateTo) {
        DateTo = dateTo;
        return this;
    }

    public PurchaseOrderStatus getStatus() {
        return Status;
    }

    public void setStatus(PurchaseOrderStatus status) {
        Status = status;
    }

    public SearchPurchaseOrderParameter withStatus(PurchaseOrderStatus status) {
        Status = status;
        return this;
    }

    public String getReferenceLike() {
        return ReferenceLike;
    }

    public void setReferenceLike(String referenceLike) {
        ReferenceLike = referenceLike;
    }

    public SearchPurchaseOrderParameter withReferenceLike(String referenceLike) {
        ReferenceLike = referenceLike;
        return this;
    }

    public Integer getEntriesPerPage() {
        return EntriesPerPage;
    }

    public void setEntriesPerPage(Integer entriesPerPage) {
        EntriesPerPage = entriesPerPage;
    }

    public SearchPurchaseOrderParameter withEntriesPerPage(Integer entriesPerPage) {
        EntriesPerPage = entriesPerPage;
        return this;
    }

    public Integer getPageNumber() {
        return PageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        PageNumber = pageNumber;
    }

    public SearchPurchaseOrderParameter withPageNumber(Integer pageNumber) {
        PageNumber = pageNumber;
        return this;
    }

    public List<UUID> getLocation() {
        return Location;
    }

    public void setLocation(List<UUID> location) {
        Location = location;
    }

    public SearchPurchaseOrderParameter withLocation(List<UUID> location) {
        Location = location;
        return this;
    }

    public List<UUID> getSupplier() {
        return Supplier;
    }

    public void setSupplier(List<UUID> supplier) {
        Supplier = supplier;
    }

    public SearchPurchaseOrderParameter withSupplier(List<UUID> supplier) {
        Supplier = supplier;
        return this;
    }
}
