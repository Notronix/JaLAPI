package com.notronix.lw.model;

import java.util.List;

class AnyConfig
{
    private Boolean IsHeaderOnly;
    private Boolean IsHidden;
    private ConfigPostalServiceMapping PostalServiceMapping;
    private ConfigPaymentMethodMapping PaymentMethodMapping;
    private Integer PkChannelId;
    private String Source;
    private String SourceType;
    private List<Rule> Rules;
    private List<Button> Buttons;
    private String SubSource;
    private List<HeaderAuditValue> HeaderAuditValues;
    private ConfigItem Enabled;
    private ConfigItem ChannelTag;
    private ConfigItem DespatchNotes;
    private ConfigItem OrderSyncDate;
    private ConfigItem InventorySync;
    private ConfigStockLocationBinding StockLocationBinding;
    private ConfigItem PriceChange;
    private ConfigItem MaxListed;
    private ConfigItem StockPercentage;
    private ConfigItem EndWhen;
    private ConfigItem IsListingScanRunning;
    private ConfigItem ListingScanStartUpdateDate;
    private ConfigItem LastListingUpdateDate;
    private ConfigItem EstimatedInventoryScanComplete;

    public Boolean getHeaderOnly()
    {
        return IsHeaderOnly;
    }

    public void setHeaderOnly(Boolean headerOnly)
    {
        IsHeaderOnly = headerOnly;
    }

    public Boolean getHidden()
    {
        return IsHidden;
    }

    public void setHidden(Boolean hidden)
    {
        IsHidden = hidden;
    }

    public ConfigPostalServiceMapping getPostalServiceMapping()
    {
        return PostalServiceMapping;
    }

    public void setPostalServiceMapping(ConfigPostalServiceMapping postalServiceMapping)
    {
        PostalServiceMapping = postalServiceMapping;
    }

    public ConfigPaymentMethodMapping getPaymentMethodMapping()
    {
        return PaymentMethodMapping;
    }

    public void setPaymentMethodMapping(ConfigPaymentMethodMapping paymentMethodMapping)
    {
        PaymentMethodMapping = paymentMethodMapping;
    }

    public Integer getPkChannelId()
    {
        return PkChannelId;
    }

    public void setPkChannelId(Integer pkChannelId)
    {
        PkChannelId = pkChannelId;
    }

    public String getSource()
    {
        return Source;
    }

    public void setSource(String source)
    {
        Source = source;
    }

    public String getSourceType()
    {
        return SourceType;
    }

    public void setSourceType(String sourceType)
    {
        SourceType = sourceType;
    }

    public List<Rule> getRules()
    {
        return Rules;
    }

    public void setRules(List<Rule> rules)
    {
        Rules = rules;
    }

    public List<Button> getButtons()
    {
        return Buttons;
    }

    public void setButtons(List<Button> buttons)
    {
        Buttons = buttons;
    }

    public String getSubSource()
    {
        return SubSource;
    }

    public void setSubSource(String subSource)
    {
        SubSource = subSource;
    }

    public List<HeaderAuditValue> getHeaderAuditValues()
    {
        return HeaderAuditValues;
    }

    public void setHeaderAuditValues(List<HeaderAuditValue> headerAuditValues)
    {
        HeaderAuditValues = headerAuditValues;
    }

    public ConfigItem getEnabled()
    {
        return Enabled;
    }

    public void setEnabled(ConfigItem enabled)
    {
        Enabled = enabled;
    }

    public ConfigItem getChannelTag()
    {
        return ChannelTag;
    }

    public void setChannelTag(ConfigItem channelTag)
    {
        ChannelTag = channelTag;
    }

    public ConfigItem getDespatchNotes()
    {
        return DespatchNotes;
    }

    public void setDespatchNotes(ConfigItem despatchNotes)
    {
        DespatchNotes = despatchNotes;
    }

    public ConfigItem getOrderSyncDate()
    {
        return OrderSyncDate;
    }

    public void setOrderSyncDate(ConfigItem orderSyncDate)
    {
        OrderSyncDate = orderSyncDate;
    }

    public ConfigItem getInventorySync()
    {
        return InventorySync;
    }

    public void setInventorySync(ConfigItem inventorySync)
    {
        InventorySync = inventorySync;
    }

    public ConfigStockLocationBinding getStockLocationBinding()
    {
        return StockLocationBinding;
    }

    public void setStockLocationBinding(ConfigStockLocationBinding stockLocationBinding)
    {
        StockLocationBinding = stockLocationBinding;
    }

    public ConfigItem getPriceChange()
    {
        return PriceChange;
    }

    public void setPriceChange(ConfigItem priceChange)
    {
        PriceChange = priceChange;
    }

    public ConfigItem getMaxListed()
    {
        return MaxListed;
    }

    public void setMaxListed(ConfigItem maxListed)
    {
        MaxListed = maxListed;
    }

    public ConfigItem getStockPercentage()
    {
        return StockPercentage;
    }

    public void setStockPercentage(ConfigItem stockPercentage)
    {
        StockPercentage = stockPercentage;
    }

    public ConfigItem getEndWhen()
    {
        return EndWhen;
    }

    public void setEndWhen(ConfigItem endWhen)
    {
        EndWhen = endWhen;
    }

    public ConfigItem getIsListingScanRunning()
    {
        return IsListingScanRunning;
    }

    public void setIsListingScanRunning(ConfigItem isListingScanRunning)
    {
        IsListingScanRunning = isListingScanRunning;
    }

    public ConfigItem getListingScanStartUpdateDate()
    {
        return ListingScanStartUpdateDate;
    }

    public void setListingScanStartUpdateDate(ConfigItem listingScanStartUpdateDate)
    {
        ListingScanStartUpdateDate = listingScanStartUpdateDate;
    }

    public ConfigItem getLastListingUpdateDate()
    {
        return LastListingUpdateDate;
    }

    public void setLastListingUpdateDate(ConfigItem lastListingUpdateDate)
    {
        LastListingUpdateDate = lastListingUpdateDate;
    }

    public ConfigItem getEstimatedInventoryScanComplete()
    {
        return EstimatedInventoryScanComplete;
    }

    public void setEstimatedInventoryScanComplete(ConfigItem estimatedInventoryScanComplete)
    {
        EstimatedInventoryScanComplete = estimatedInventoryScanComplete;
    }
}
