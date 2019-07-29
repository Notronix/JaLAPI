package com.notronix.lw.api.model;

import java.util.UUID;

public class CountryRegion
{
    private Integer pkRegionRowId;
    private String RegionCode;
    private String RegionName;
    private Double TaxRate;
    private UUID fkCountryId;
    private CountryRegionReplaceWith ReplaceWith;
    private Boolean IsHomeRegion;
    private Integer TagsCount;

    public Integer getPkRegionRowId()
    {
        return pkRegionRowId;
    }

    public void setPkRegionRowId(Integer pkRegionRowId)
    {
        this.pkRegionRowId = pkRegionRowId;
    }

    public UUID getFkCountryId()
    {
        return fkCountryId;
    }

    public void setFkCountryId(UUID fkCountryId)
    {
        this.fkCountryId = fkCountryId;
    }

    public String getRegionCode()
    {
        return RegionCode;
    }

    public void setRegionCode(String regionCode)
    {
        RegionCode = regionCode;
    }

    public String getRegionName()
    {
        return RegionName;
    }

    public void setRegionName(String regionName)
    {
        RegionName = regionName;
    }

    public Double getTaxRate()
    {
        return TaxRate;
    }

    public void setTaxRate(Double taxRate)
    {
        TaxRate = taxRate;
    }

    public CountryRegionReplaceWith getReplaceWith()
    {
        return ReplaceWith;
    }

    public void setReplaceWith(CountryRegionReplaceWith replaceWith)
    {
        ReplaceWith = replaceWith;
    }

    public Boolean getHomeRegion() {
        return IsHomeRegion;
    }

    public void setHomeRegion(Boolean homeRegion) {
        IsHomeRegion = homeRegion;
    }

    public Integer getTagsCount() {
        return TagsCount;
    }

    public void setTagsCount(Integer tagsCount) {
        TagsCount = tagsCount;
    }
}
