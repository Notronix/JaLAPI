package com.notronix.lw.model;

public class Region
{
    private Integer pkRegionRowId;
    private String fkCountryId;
    private String RegionCode;
    private String RegionName;
    private Double TaxRate;
    private Integer ReplaceWith;

    public Integer getPkRegionRowId()
    {
        return pkRegionRowId;
    }

    public void setPkRegionRowId(Integer pkRegionRowId)
    {
        this.pkRegionRowId = pkRegionRowId;
    }

    public String getFkCountryId()
    {
        return fkCountryId;
    }

    public void setFkCountryId(String fkCountryId)
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

    public Integer getReplaceWith()
    {
        return ReplaceWith;
    }

    public void setReplaceWith(Integer replaceWith)
    {
        ReplaceWith = replaceWith;
    }
}
