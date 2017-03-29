package com.notronix.lw.model;

public class CurrencyConversionRate
{
    private String Currency;
    private Double ConversionRate;

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }

    public Double getConversionRate() {
        return ConversionRate;
    }

    public void setConversionRate(Double conversionRate) {
        ConversionRate = conversionRate;
    }
}
