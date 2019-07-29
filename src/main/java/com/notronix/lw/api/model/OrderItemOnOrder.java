package com.notronix.lw.api.model;

import java.time.Instant;
import java.util.UUID;

public class OrderItemOnOrder
{
    private UUID pkPurchaseItemId;
    private UUID Rowid;
    private UUID pkPurchaseId;
    private String ExternalInvoiceNumber;
    private UUID fkSupplierId;
    private Instant DateOfDelivery;
    private Instant QuotedDeliveryDate;
    private String SupplierName;
    private UUID fkLocationId;

    public UUID getPkPurchaseItemId() {
        return pkPurchaseItemId;
    }

    public void setPkPurchaseItemId(UUID pkPurchaseItemId) {
        this.pkPurchaseItemId = pkPurchaseItemId;
    }

    public UUID getRowid() {
        return Rowid;
    }

    public void setRowid(UUID rowid) {
        Rowid = rowid;
    }

    public UUID getPkPurchaseId() {
        return pkPurchaseId;
    }

    public void setPkPurchaseId(UUID pkPurchaseId) {
        this.pkPurchaseId = pkPurchaseId;
    }

    public String getExternalInvoiceNumber() {
        return ExternalInvoiceNumber;
    }

    public void setExternalInvoiceNumber(String externalInvoiceNumber) {
        ExternalInvoiceNumber = externalInvoiceNumber;
    }

    public UUID getFkSupplierId() {
        return fkSupplierId;
    }

    public void setFkSupplierId(UUID fkSupplierId) {
        this.fkSupplierId = fkSupplierId;
    }

    public Instant getDateOfDelivery() {
        return DateOfDelivery;
    }

    public void setDateOfDelivery(Instant dateOfDelivery) {
        DateOfDelivery = dateOfDelivery;
    }

    public Instant getQuotedDeliveryDate() {
        return QuotedDeliveryDate;
    }

    public void setQuotedDeliveryDate(Instant quotedDeliveryDate) {
        QuotedDeliveryDate = quotedDeliveryDate;
    }

    public String getSupplierName() {
        return SupplierName;
    }

    public void setSupplierName(String supplierName) {
        SupplierName = supplierName;
    }

    public UUID getFkLocationId() {
        return fkLocationId;
    }

    public void setFkLocationId(UUID fkLocationId) {
        this.fkLocationId = fkLocationId;
    }
}
