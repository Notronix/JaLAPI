package com.notronix.lw.model;

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

    public Double getDiscountPercentage() {
        return DiscountPercentage;
    }

    public void setDiscountPercentage(Double discountPercentage) {
        DiscountPercentage = discountPercentage;
    }

    public Double getTaxRatePercentage() {
        return TaxRatePercentage;
    }

    public void setTaxRatePercentage(Double taxRatePercentage) {
        TaxRatePercentage = taxRatePercentage;
    }

    public Boolean getTaxInclusive() {
        return TaxInclusive;
    }

    public void setTaxInclusive(Boolean taxInclusive) {
        TaxInclusive = taxInclusive;
    }
}
