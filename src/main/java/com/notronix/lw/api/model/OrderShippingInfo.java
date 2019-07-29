package com.notronix.lw.api.model;

import java.util.UUID;

public class OrderShippingInfo
{
    private String Vendor;
    private UUID PostalServiceId;
    private String PostalServiceName;
    private Double TotalWeight;
    private Double ItemWeight;
    private UUID PackageCategoryId;
    private String PackageCategory;
    private UUID PackageTypeId;
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

    public UUID getPostalServiceId()
    {
        return PostalServiceId;
    }

    public void setPostalServiceId(UUID postalServiceId)
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

    public UUID getPackageCategoryId()
    {
        return PackageCategoryId;
    }

    public void setPackageCategoryId(UUID packageCategoryId)
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

    public UUID getPackageTypeId()
    {
        return PackageTypeId;
    }

    public void setPackageTypeId(UUID packageTypeId)
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
