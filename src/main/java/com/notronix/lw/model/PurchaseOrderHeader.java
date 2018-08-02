package com.notronix.lw.model;

import java.time.Instant;

public class PurchaseOrderHeader
{
    private String pkPurchaseID;
    private String fkSupplierId;
    private String fkLocationId;
    private String ExternalInvoiceNumber;
    private PurchaseOrderStatus Status;
    private String Currency;
    private String SupplierReferenceNumber;
    private Boolean Locked;
    private Integer LineCount;
    private Integer DeliveredLinesCount;
    private Instant DateOfPurchase;
    private Instant DateOfDelivery;
    private Instant QuotedDeliveryDate;
    private Double PostagePaid;
    private Double TotalCost;
    private Double taxPaid;
    private Double ShippingTaxRate;
    private Double ConversionRate;

    public String getPkPurchaseID() {
        return pkPurchaseID;
    }

    public void setPkPurchaseID(String pkPurchaseID) {
        this.pkPurchaseID = pkPurchaseID;
    }

    public String getFkSupplierId() {
        return fkSupplierId;
    }

    public void setFkSupplierId(String fkSupplierId) {
        this.fkSupplierId = fkSupplierId;
    }

    public String getFkLocationId() {
        return fkLocationId;
    }

    public void setFkLocationId(String fkLocationId) {
        this.fkLocationId = fkLocationId;
    }

    public String getExternalInvoiceNumber() {
        return ExternalInvoiceNumber;
    }

    public void setExternalInvoiceNumber(String externalInvoiceNumber) {
        ExternalInvoiceNumber = externalInvoiceNumber;
    }

    public PurchaseOrderStatus getStatus() {
        return Status;
    }

    public void setStatus(PurchaseOrderStatus status) {
        Status = status;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }

    public String getSupplierReferenceNumber() {
        return SupplierReferenceNumber;
    }

    public void setSupplierReferenceNumber(String supplierReferenceNumber) {
        SupplierReferenceNumber = supplierReferenceNumber;
    }

    public Boolean getLocked() {
        return Locked;
    }

    public void setLocked(Boolean locked) {
        Locked = locked;
    }

    public Integer getLineCount() {
        return LineCount;
    }

    public void setLineCount(Integer lineCount) {
        LineCount = lineCount;
    }

    public Integer getDeliveredLinesCount() {
        return DeliveredLinesCount;
    }

    public void setDeliveredLinesCount(Integer deliveredLinesCount) {
        DeliveredLinesCount = deliveredLinesCount;
    }

    public Instant getDateOfPurchase() {
        return DateOfPurchase;
    }

    public void setDateOfPurchase(Instant dateOfPurchase) {
        DateOfPurchase = dateOfPurchase;
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

    public Double getPostagePaid() {
        return PostagePaid;
    }

    public void setPostagePaid(Double postagePaid) {
        PostagePaid = postagePaid;
    }

    public Double getTotalCost() {
        return TotalCost;
    }

    public void setTotalCost(Double totalCost) {
        TotalCost = totalCost;
    }

    public Double getTaxPaid() {
        return taxPaid;
    }

    public void setTaxPaid(Double taxPaid) {
        this.taxPaid = taxPaid;
    }

    public Double getShippingTaxRate() {
        return ShippingTaxRate;
    }

    public void setShippingTaxRate(Double shippingTaxRate) {
        ShippingTaxRate = shippingTaxRate;
    }

    public Double getConversionRate() {
        return ConversionRate;
    }

    public void setConversionRate(Double conversionRate) {
        ConversionRate = conversionRate;
    }
}
