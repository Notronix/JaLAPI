package com.notronix.lw.api.model;

import java.time.Instant;

public class PurchaseOrderPaymentStatement
{
    private Integer PurchasePaymentStatementId;
    private Double LineCost;
    private Double ConversionRate;
    private String Currency;
    private String Reference;
    private Instant CreationDate;
    private Instant PaymentDate;
    private Integer fkPurchaseAdditionalCostItemId;

    public Integer getPurchasePaymentStatementId() {
        return PurchasePaymentStatementId;
    }

    public void setPurchasePaymentStatementId(Integer purchasePaymentStatementId) {
        PurchasePaymentStatementId = purchasePaymentStatementId;
    }

    public Double getLineCost() {
        return LineCost;
    }

    public void setLineCost(Double lineCost) {
        LineCost = lineCost;
    }

    public Double getConversionRate() {
        return ConversionRate;
    }

    public void setConversionRate(Double conversionRate) {
        ConversionRate = conversionRate;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }

    public String getReference() {
        return Reference;
    }

    public void setReference(String reference) {
        Reference = reference;
    }

    public Instant getCreationDate() {
        return CreationDate;
    }

    public void setCreationDate(Instant creationDate) {
        CreationDate = creationDate;
    }

    public Instant getPaymentDate() {
        return PaymentDate;
    }

    public void setPaymentDate(Instant paymentDate) {
        PaymentDate = paymentDate;
    }

    public Integer getFkPurchaseAdditionalCostItemId() {
        return fkPurchaseAdditionalCostItemId;
    }

    public void setFkPurchaseAdditionalCostItemId(Integer fkPurchaseAdditionalCostItemId) {
        this.fkPurchaseAdditionalCostItemId = fkPurchaseAdditionalCostItemId;
    }
}
