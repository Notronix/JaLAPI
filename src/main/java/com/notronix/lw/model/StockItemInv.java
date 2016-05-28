package com.notronix.lw.model;

public class StockItemInv extends BaseStockItem
{
    private String VariationGroupName;
    private String MetaData;
    private String CategoryId;
    private String PackageGroupId;
    private String PostalServiceId;
    private Double Weight;
    private Double Width;
    private Double Height;
    private Double Depth;

    public String getVariationGroupName()
    {
        return VariationGroupName;
    }

    public void setVariationGroupName(String variationGroupName)
    {
        VariationGroupName = variationGroupName;
    }

    public String getMetaData()
    {
        return MetaData;
    }

    public void setMetaData(String metaData)
    {
        MetaData = metaData;
    }

    public String getCategoryId()
    {
        return CategoryId;
    }

    public void setCategoryId(String categoryId)
    {
        CategoryId = categoryId;
    }

    public String getPackageGroupId()
    {
        return PackageGroupId;
    }

    public void setPackageGroupId(String packageGroupId)
    {
        PackageGroupId = packageGroupId;
    }

    public String getPostalServiceId()
    {
        return PostalServiceId;
    }

    public void setPostalServiceId(String postalServiceId)
    {
        PostalServiceId = postalServiceId;
    }

    public Double getWeight()
    {
        return Weight;
    }

    public void setWeight(Double weight)
    {
        Weight = weight;
    }

    public Double getWidth()
    {
        return Width;
    }

    public void setWidth(Double width)
    {
        Width = width;
    }

    public Double getHeight()
    {
        return Height;
    }

    public void setHeight(Double height)
    {
        Height = height;
    }

    public Double getDepth()
    {
        return Depth;
    }

    public void setDepth(Double depth)
    {
        Depth = depth;
    }
}
