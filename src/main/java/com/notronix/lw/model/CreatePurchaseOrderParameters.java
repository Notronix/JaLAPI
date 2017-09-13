package com.notronix.lw.model;

import java.time.Instant;

public class CreatePurchaseOrderParameters
{
    private String fkSupplierId;
    private String fkLocationId;
    private String ExternalInvoiceNumber;
    private String Currency;
    private String SupplierReferenceNumber;
    private Instant DateOfPurchase;
    private Instant QuotedDeliveryDate;
    private Double PostagePaid;
    private Double ShippingTaxRate;
    private Double ConversionRate;

    public String getFkSupplierId()
    {
        return fkSupplierId;
    }

    public void setFkSupplierId(String fkSupplierId)
    {
        this.fkSupplierId = fkSupplierId;
    }

    public String getFkLocationId()
    {
        return fkLocationId;
    }

    public void setFkLocationId(String fkLocationId)
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
}
