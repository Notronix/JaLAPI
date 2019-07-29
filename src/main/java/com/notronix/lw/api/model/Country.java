package com.notronix.lw.api.model;

import java.util.List;
import java.util.UUID;

public class Country
{
    private UUID CountryId;
    private String CountryName;
    private String CountryCode;
    private String Continent;
    private String Currency;
    private Boolean CustomsRequired;
    private Double TaxRate;
    private String AddressFormat;
    private List<CountryRegion> Regions;
    private Integer RegionsCount;

    public UUID getCountryId()
    {
        return CountryId;
    }

    public void setCountryId(UUID countryId)
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

    public List<CountryRegion> getRegions()
    {
        return Regions;
    }

    public void setRegions(List<CountryRegion> regions)
    {
        Regions = regions;
    }

    public Integer getRegionsCount() {
        return RegionsCount;
    }

    public void setRegionsCount(Integer regionsCount) {
        RegionsCount = regionsCount;
    }
}
