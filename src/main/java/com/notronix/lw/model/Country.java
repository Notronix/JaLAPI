package com.notronix.lw.model;

import java.util.List;

public class Country
{
    private String CountryId;
    private String CountryName;
    private String CountryCode;
    private String Continent;
    private String Currency;
    private Boolean CustomsRequired;
    private Double TaxRate;
    private String AddressFormat;
    private List<Region> Regions;

    public String getCountryId()
    {
        return CountryId;
    }

    public void setCountryId(String countryId)
    {
        CountryId = countryId;
    }

    public String getCountryName()
    {
        return CountryName;
    }

    public void setCountryName(String countryName)
    {
        CountryName = countryName;
    }

    public String getCountryCode()
    {
        return CountryCode;
    }

    public void setCountryCode(String countryCode)
    {
        CountryCode = countryCode;
    }

    public String getContinent()
    {
        return Continent;
    }

    public void setContinent(String continent)
    {
        Continent = continent;
    }

    public String getCurrency()
    {
        return Currency;
    }

    public void setCurrency(String currency)
    {
        Currency = currency;
    }

    public Boolean getCustomsRequired()
    {
        return CustomsRequired;
    }

    public void setCustomsRequired(Boolean customsRequired)
    {
        CustomsRequired = customsRequired;
    }

    public Double getTaxRate()
    {
        return TaxRate;
    }

    public void setTaxRate(Double taxRate)
    {
        TaxRate = taxRate;
    }

    public String getAddressFormat()
    {
        return AddressFormat;
    }

    public void setAddressFormat(String addressFormat)
    {
        AddressFormat = addressFormat;
    }

    public List<Region> getRegions()
    {
        return Regions;
    }

    public void setRegions(List<Region> regions)
    {
        Regions = regions;
    }
}
