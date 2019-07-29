package com.notronix.lw.api.model;

import java.time.Instant;
import java.util.UUID;

public class CreatePurchaseOrderInitialParameter
{
    private UUID fkSupplierId;
    private UUID fkLocationId;
    private String ExternalInvoiceNumber;
    private String Currency;
    private String SupplierReferenceNumber;
    private Integer UnitAmountTaxIncludedType;
    private Instant DateOfPurchase;
    private Instant QuotedDeliveryDate;
    private Double PostagePaid;
    private Double ShippingTaxRate;
    private Double ConversionRate;

    public UUID getFkSupplierId()
    {
        return fkSupplierId;
    }

    public void setFkSupplierId(UUID fkSupplierId)
    {
        this.fkSupplierId = fkSupplierId;
    }

    public UUID getFkLocationId()
    {
        return fkLocationId;
    }

    public void setFkLocationId(UUID fkLocationId)
    {
        this.fkLocationId = fkLocationId;
    }

    public String getExternalInvoiceNumber()
    {
        return ExternalInvoiceNumber;
    }

    public void setExternalInvoiceNumber(String externalInvoiceNumber)
    {
        ExternalInvoiceNumber = externalInvoiceNumber;
    }

    public String getCurrency()
    {
        return Currency;
    }

    public void setCurrency(String currency)
    {
        Currency = currency;
    }

    public String getSupplierReferenceNumber()
    {
        return SupplierReferenceNumber;
    }

    public void setSupplierReferenceNumber(String supplierReferenceNumber)
    {
        SupplierReferenceNumber = supplierReferenceNumber;
    }

    public Instant getDateOfPurchase()
    {
        return DateOfPurchase;
    }

    public void setDateOfPurchase(Instant dateOfPurchase)
    {
        DateOfPurchase = dateOfPurchase;
    }

    public Instant getQuotedDeliveryDate()
    {
        return QuotedDeliveryDate;
    }

    public void setQuotedDeliveryDate(Instant quotedDeliveryDate)
    {
        QuotedDeliveryDate = quotedDeliveryDate;
    }

    public Double getPostagePaid()
    {
        return PostagePaid;
    }

    public void setPostagePaid(Double postagePaid)
    {
        PostagePaid = postagePaid;
    }

    public Double getShippingTaxRate()
    {
        return ShippingTaxRate;
    }

    public void setShippingTaxRate(Double shippingTaxRate)
    {
        ShippingTaxRate = shippingTaxRate;
    }

    public Double getConversionRate()
    {
        return ConversionRate;
    }

    public void setConversionRate(Double conversionRate)
    {
        ConversionRate = conversionRate;
    }

    public Integer getUnitAmountTaxIncludedType() {
        return UnitAmountTaxIncludedType;
    }

    public void setUnitAmountTaxIncludedType(Integer unitAmountTaxIncludedType) {
        UnitAmountTaxIncludedType = unitAmountTaxIncludedType;
    }
}
