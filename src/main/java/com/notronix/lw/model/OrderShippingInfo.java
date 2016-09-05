package com.notronix.lw.model;

public class OrderShippingInfo
{
    private String Vendor;
    private String PostalServiceId;
    private String PostalServiceName;
    private Double TotalWeight;
    private Double ItemWeight;
    private String PackageCategoryId;
    private String PackageCategory;
    private String PackageTypeId;
    private String PackageType;
    private Double PostageCost;
    private Double PostageCostExTax;
    private String TrackingNumber;
    private Boolean ManualAdjust;

    public String getVendor()
    {
        return Vendor;
    }

    public void setVendor(String vendor)
    {
        Vendor = vendor;
    }

    public String getPostalServiceId()
    {
        return PostalServiceId;
    }

    public void setPostalServiceId(String postalServiceId)
    {
        PostalServiceId = postalServiceId;
    }

    public String getPostalServiceName()
    {
        return PostalServiceName;
    }

    public void setPostalServiceName(String postalServiceName)
    {
        PostalServiceName = postalServiceName;
    }

    public Double getTotalWeight()
    {
        return TotalWeight;
    }

    public void setTotalWeight(Double totalWeight)
    {
        TotalWeight = totalWeight;
    }

    public Double getItemWeight()
    {
        return ItemWeight;
    }

    public void setItemWeight(Double itemWeight)
    {
        ItemWeight = itemWeight;
    }

    public String getPackageCategoryId()
    {
        return PackageCategoryId;
    }

    public void setPackageCategoryId(String packageCategoryId)
    {
        PackageCategoryId = packageCategoryId;
    }

    public String getPackageCategory()
    {
        return PackageCategory;
    }

    public void setPackageCategory(String packageCategory)
    {
        PackageCategory = packageCategory;
    }

    public String getPackageTypeId()
    {
        return PackageTypeId;
    }

    public void setPackageTypeId(String packageTypeId)
    {
        PackageTypeId = packageTypeId;
    }

    public String getPackageType()
    {
        return PackageType;
    }

    public void setPackageType(String packageType)
    {
        PackageType = packageType;
    }

    public Double getPostageCost()
    {
        return PostageCost;
    }

    public void setPostageCost(Double postageCost)
    {
        PostageCost = postageCost;
    }

    public Double getPostageCostExTax()
    {
        return PostageCostExTax;
    }

    public void setPostageCostExTax(Double postageCostExTax)
    {
        PostageCostExTax = postageCostExTax;
    }

    public String getTrackingNumber()
    {
        return TrackingNumber;
    }

    public void setTrackingNumber(String trackingNumber)
    {
        TrackingNumber = trackingNumber;
    }

    public Boolean getManualAdjust()
    {
        return ManualAdjust;
    }

    public void setManualAdjust(Boolean manualAdjust)
    {
        ManualAdjust = manualAdjust;
    }
}
