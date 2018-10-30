package com.notronix.lw.model;

public class OrderTotalsInfo
{
    private Double Subtotal;
    private Double PostageCost;
    private Double Tax;
    private Double TotalCharge;
    private String PaymentMethod;
    private String PaymentMethodId;
    private Double ProfitMargin;
    private Double TotalDiscount;
    private String Currency;
    private Double CountryTaxRate;
    private Double ConversionRate;

    public Double getSubtotal()
    {
        return Subtotal;
    }

    public void setSubtotal(Double subtotal)
    {
        Subtotal = subtotal;
    }

    public Double getPostageCost()
    {
        return PostageCost;
    }

    public void setPostageCost(Double postageCost)
    {
        PostageCost = postageCost;
    }

    public Double getTax()
    {
        return Tax;
    }

    public void setTax(Double tax)
    {
        Tax = tax;
    }

    public Double getTotalCharge()
    {
        return TotalCharge;
    }

    public void setTotalCharge(Double totalCharge)
    {
        TotalCharge = totalCharge;
    }

    public String getPaymentMethod()
    {
        return PaymentMethod;
    }

    public void setPaymentMethod(String paymentMethod)
    {
        PaymentMethod = paymentMethod;
    }

    public String getPaymentMethodId()
    {
        return PaymentMethodId;
    }

    public void setPaymentMethodId(String paymentMethodId)
    {
        PaymentMethodId = paymentMethodId;
    }

    public Double getProfitMargin()
    {
        return ProfitMargin;
    }

    public void setProfitMargin(Double profitMargin)
    {
        ProfitMargin = profitMargin;
    }

    public Double getTotalDiscount()
    {
        return TotalDiscount;
    }

    public void setTotalDiscount(Double totalDiscount)
    {
        TotalDiscount = totalDiscount;
    }

    public String getCurrency()
    {
        return Currency;
    }

    public void setCurrency(String currency)
    {
        Currency = currency;
    }

    public Double getCountryTaxRate()
    {
        return CountryTaxRate;
    }

    public void setCountryTaxRate(Double countryTaxRate)
    {
        CountryTaxRate = countryTaxRate;
    }

    public Double getConversionRate() {
        return ConversionRate;
    }

    public void setConversionRate(Double conversionRate) {
        ConversionRate = conversionRate;
    }
}
