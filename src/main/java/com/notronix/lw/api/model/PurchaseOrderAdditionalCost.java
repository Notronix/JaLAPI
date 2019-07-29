package com.notronix.lw.api.model;

import java.util.List;

public class PurchaseOrderAdditionalCost
{
    private Integer PurchaseAdditionalCostItemId;
    private Integer AdditionalCostTypeId;
    private String Reference;
    private Double SubTotalLineCost;
    private Double TaxRate;
    private Double Tax;
    private String Currency;
    private Double ConversionRate;
    private Double TotalLineCost;
    private List<PurchaseOrderAdditionalCostAllocation> CostAllocation;
    private Boolean AllocationLocked;
    private String AdditionalCostTypeName;
    private Boolean AdditionalCostTypeIsShippingType;
    private Boolean AdditionalCostTypeIsPartialAllocation;
    private Boolean Print;
    private AllocationMethods AllocationMethod;

    public Integer getPurchaseAdditionalCostItemId() {
        return PurchaseAdditionalCostItemId;
    }

    public void setPurchaseAdditionalCostItemId(Integer purchaseAdditionalCostItemId) {
        PurchaseAdditionalCostItemId = purchaseAdditionalCostItemId;
    }

    public Integer getAdditionalCostTypeId() {
        return AdditionalCostTypeId;
    }

    public void setAdditionalCostTypeId(Integer additionalCostTypeId) {
        AdditionalCostTypeId = additionalCostTypeId;
    }

    public String getReference() {
        return Reference;
    }

    public void setReference(String reference) {
        Reference = reference;
    }

    public Double getSubTotalLineCost() {
        return SubTotalLineCost;
    }

    public void setSubTotalLineCost(Double subTotalLineCost) {
        SubTotalLineCost = subTotalLineCost;
    }

    public Double getTaxRate() {
        return TaxRate;
    }

    public void setTaxRate(Double taxRate) {
        TaxRate = taxRate;
    }

    public Double getTax() {
        return Tax;
    }

    public void setTax(Double tax) {
        Tax = tax;
    }

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

    public Double getTotalLineCost() {
        return TotalLineCost;
    }

    public void setTotalLineCost(Double totalLineCost) {
        TotalLineCost = totalLineCost;
    }

    public List<PurchaseOrderAdditionalCostAllocation> getCostAllocation() {
        return CostAllocation;
    }

    public void setCostAllocation(List<PurchaseOrderAdditionalCostAllocation> costAllocation) {
        CostAllocation = costAllocation;
    }

    public Boolean getAllocationLocked() {
        return AllocationLocked;
    }

    public void setAllocationLocked(Boolean allocationLocked) {
        AllocationLocked = allocationLocked;
    }

    public String getAdditionalCostTypeName() {
        return AdditionalCostTypeName;
    }

    public void setAdditionalCostTypeName(String additionalCostTypeName) {
        AdditionalCostTypeName = additionalCostTypeName;
    }

    public Boolean getAdditionalCostTypeIsShippingType() {
        return AdditionalCostTypeIsShippingType;
    }

    public void setAdditionalCostTypeIsShippingType(Boolean additionalCostTypeIsShippingType) {
        AdditionalCostTypeIsShippingType = additionalCostTypeIsShippingType;
    }

    public Boolean getAdditionalCostTypeIsPartialAllocation() {
        return AdditionalCostTypeIsPartialAllocation;
    }

    public void setAdditionalCostTypeIsPartialAllocation(Boolean additionalCostTypeIsPartialAllocation) {
        AdditionalCostTypeIsPartialAllocation = additionalCostTypeIsPartialAllocation;
    }

    public Boolean getPrint() {
        return Print;
    }

    public void setPrint(Boolean print) {
        Print = print;
    }

    public AllocationMethods getAllocationMethod() {
        return AllocationMethod;
    }

    public void setAllocationMethod(AllocationMethods allocationMethod) {
        AllocationMethod = allocationMethod;
    }
}
