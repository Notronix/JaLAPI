package com.notronix.lw.api.model;

import java.time.Instant;
import java.util.UUID;

public class PurchaseOrderHeader
{
    private UUID pkPurchaseID;
    private UUID fkSupplierId;
    private UUID fkLocationId;
    private String ExternalInvoiceNumber;
    private PurchaseOrderStatus Status;
    private String Currency;
    private String SupplierReferenceNumber;
    private Boolean Locked;
    private Integer LineCount;
    private Integer DeliveredLinesCount;
    private Integer UnitAmountTaxIncludedType;
    private Instant DateOfPurchase;
    private Instant DateOfDelivery;
    private Instant QuotedDeliveryDate;
    private Double PostagePaid;
    private Double TotalCost;
    private Double taxPaid;
    private Double ShippingTaxRate;
    private Double ConversionRate;
    private Double ConvertedShippingCost;
    private Double ConvertedShippingTax;
    private Double ConvertedOtherCost;
    private Double ConvertedOtherTax;
    private Double ConvertedGrandTotal;

    public UUID getPkPurchaseID() {
        return pkPurchaseID;
    }

    public void setPkPurchaseID(UUID pkPurchaseID) {
        this.pkPurchaseID = pkPurchaseID;
    }

    public UUID getFkSupplierId() {
        return fkSupplierId;
    }

    public void setFkSupplierId(UUID fkSupplierId) {
        this.fkSupplierId = fkSupplierId;
    }

    public UUID getFkLocationId() {
        return fkLocationId;
    }

    public void setFkLocationId(UUID fkLocationId) {
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

    public Integer getUnitAmountTaxIncludedType() {
        return UnitAmountTaxIncludedType;
    }

    public void setUnitAmountTaxIncludedType(Integer unitAmountTaxIncludedType) {
        UnitAmountTaxIncludedType = unitAmountTaxIncludedType;
    }

    public Double getConvertedShippingCost() {
        return ConvertedShippingCost;
    }

    public void setConvertedShippingCost(Double convertedShippingCost) {
        ConvertedShippingCost = convertedShippingCost;
    }

    public Double getConvertedShippingTax() {
        return ConvertedShippingTax;
    }

    public void setConvertedShippingTax(Double convertedShippingTax) {
        ConvertedShippingTax = convertedShippingTax;
    }

    public Double getConvertedOtherCost() {
        return ConvertedOtherCost;
    }

    public void setConvertedOtherCost(Double convertedOtherCost) {
        ConvertedOtherCost = convertedOtherCost;
    }

    public Double getConvertedOtherTax() {
        return ConvertedOtherTax;
    }

    public void setConvertedOtherTax(Double convertedOtherTax) {
        ConvertedOtherTax = convertedOtherTax;
    }

    public Double getConvertedGrandTotal() {
        return ConvertedGrandTotal;
    }

    public void setConvertedGrandTotal(Double convertedGrandTotal) {
        ConvertedGrandTotal = convertedGrandTotal;
    }
}
