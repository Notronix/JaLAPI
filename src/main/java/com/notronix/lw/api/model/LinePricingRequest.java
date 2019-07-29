package com.notronix.lw.api.model;

public class LinePricingRequest
{
    private Double PricePerUnit	;
    private Double DiscountPercentage;
    private Double TaxRatePercentage;
    private Boolean TaxInclusive;

    public Double getPricePerUnit() {
        return PricePerUnit;
    }

    public void setPricePerUnit(Double pricePerUnit) {
        PricePerUnit = pricePerUnit;
    }

    public LinePricingRequest withPricePerUnit(Double pricePerUnit) {
        PricePerUnit = pricePerUnit;
        return this;
    }

    public Double getDiscountPercentage() {
        return DiscountPercentage;
    }

    public void setDiscountPercentage(Double discountPercentage) {
        DiscountPercentage = discountPercentage;
    }

    public LinePricingRequest withDiscountPercentage(Double discountPercentage) {
        DiscountPercentage = discountPercentage;
        return this;
    }

    public Double getTaxRatePercentage() {
        return TaxRatePercentage;
    }

    public void setTaxRatePercentage(Double taxRatePercentage) {
        TaxRatePercentage = taxRatePercentage;
    }

    public LinePricingRequest withTaxRatePercentage(Double taxRatePercentage) {
        TaxRatePercentage = taxRatePercentage;
        return this;
    }

    public Boolean getTaxInclusive() {
        return TaxInclusive;
    }

    public void setTaxInclusive(Boolean taxInclusive) {
        TaxInclusive = taxInclusive;
    }

    public LinePricingRequest withTaxInclusive(Boolean taxInclusive) {
        TaxInclusive = taxInclusive;
        return this;
    }
}
