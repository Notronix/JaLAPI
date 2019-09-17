package com.notronix.lw.api.model;

import java.time.Instant;
import java.util.List;

public class AnyConfig
{
    private ConfigItem<String> SourceVersion;
    private ConfigItem<Boolean> Enabled;
    private ConfigItem<String> ChannelTag;
    private ConfigChannelLocationBinding ChannelLocationBinding;
    private ConfigItem<Boolean> IsMultiLocation;
    private ConfigItem<Boolean> AutoPopulatedLocations;
    private ConfigItem<Boolean> DespatchNotes;
    private ConfigItem<Boolean> CancellationNotes;
    private ConfigItem<Boolean> RefundNotes;
    private ConfigItem<Boolean> ReturnNotes;
    private ConfigItem<Instant> OrderSyncDate;
    private ConfigPropertySelectionList OrderSaveLocation;
    private ConfigPropertySelectionList ConfigDiscount;
    private ConfigProperty<Boolean> HidesHeaderAttributes;
    private ConfigItem<Boolean> InventorySync;
    private ConfigStockLocationBinding StockLocationBinding;
    private ConfigItem<Integer> MaxListed;
    private ConfigItem<Double> StockPercentage;
    private ConfigItem<Integer> EndWhen;
    private ConfigItem<Boolean> PriceChange;
    private ConfigItem<Boolean> IsListingScanRunning;
    private ConfigItem<Instant> ListingScanStartUpdateDate;
    private ConfigItem<Instant> LastListingUpdateDate;
    private ConfigItem<Instant> EstimatedInventoryScanComplete;
    private Boolean IsHeaderOnly;
    private Boolean IsHidden;
    private List<ConfigItemExternal> DynamicProperties;
    private DiscountType ConfigDiscountTyped;
    private ConfigPostalServiceMapping PostalServiceMapping;
    private ConfigPaymentMethodMapping PaymentMethodMapping;
    private Integer PkChannelId;
    private String Source;
    private String SourceType;
    private List<ConfigRule> Rules;
    private List<ConfigButton> Buttons;
    private String SubSource;
    private List<SystemChannelSettingProperty> HeaderAuditValues;

    private ConfigItem<String> MarketplaceId;
    private ConfigItem<String> MerchantId;
    private ConfigItem<String> Token;
    private ConfigItem<String> TokenSecret;
    private ConfigItem<String> ShopIdOrName;

    public ConfigItem<String> getSourceVersion() {
        return SourceVersion;
    }

    public void setSourceVersion(ConfigItem<String> sourceVersion) {
        SourceVersion = sourceVersion;
    }

    public ConfigItem<Boolean> getEnabled() {
        return Enabled;
    }

    public void setEnabled(ConfigItem<Boolean> enabled) {
        Enabled = enabled;
    }

    public ConfigItem<String> getChannelTag() {
        return ChannelTag;
    }

    public void setChannelTag(ConfigItem<String> channelTag) {
        ChannelTag = channelTag;
    }

    public ConfigChannelLocationBinding getChannelLocationBinding() {
        return ChannelLocationBinding;
    }

    public void setChannelLocationBinding(ConfigChannelLocationBinding channelLocationBinding) {
        ChannelLocationBinding = channelLocationBinding;
    }

    public ConfigItem<Boolean> getIsMultiLocation() {
        return IsMultiLocation;
    }

    public void setIsMultiLocation(ConfigItem<Boolean> isMultiLocation) {
        IsMultiLocation = isMultiLocation;
    }

    public ConfigItem<Boolean> getAutoPopulatedLocations() {
        return AutoPopulatedLocations;
    }

    public void setAutoPopulatedLocations(ConfigItem<Boolean> autoPopulatedLocations) {
        AutoPopulatedLocations = autoPopulatedLocations;
    }

    public ConfigItem<Boolean> getDespatchNotes() {
        return DespatchNotes;
    }

    public void setDespatchNotes(ConfigItem<Boolean> despatchNotes) {
        DespatchNotes = despatchNotes;
    }

    public ConfigItem<Boolean> getCancellationNotes() {
        return CancellationNotes;
    }

    public void setCancellationNotes(ConfigItem<Boolean> cancellationNotes) {
        CancellationNotes = cancellationNotes;
    }

    public ConfigItem<Boolean> getRefundNotes() {
        return RefundNotes;
    }

    public void setRefundNotes(ConfigItem<Boolean> refundNotes) {
        RefundNotes = refundNotes;
    }

    public ConfigItem<Boolean> getReturnNotes() {
        return ReturnNotes;
    }

    public void setReturnNotes(ConfigItem<Boolean> returnNotes) {
        ReturnNotes = returnNotes;
    }

    public ConfigItem<Instant> getOrderSyncDate() {
        return OrderSyncDate;
    }

    public void setOrderSyncDate(ConfigItem<Instant> orderSyncDate) {
        OrderSyncDate = orderSyncDate;
    }

    public ConfigPropertySelectionList getOrderSaveLocation() {
        return OrderSaveLocation;
    }

    public void setOrderSaveLocation(ConfigPropertySelectionList orderSaveLocation) {
        OrderSaveLocation = orderSaveLocation;
    }

    public ConfigPropertySelectionList getConfigDiscount() {
        return ConfigDiscount;
    }

    public void setConfigDiscount(ConfigPropertySelectionList configDiscount) {
        ConfigDiscount = configDiscount;
    }

    public ConfigProperty<Boolean> getHidesHeaderAttributes() {
        return HidesHeaderAttributes;
    }

    public void setHidesHeaderAttributes(ConfigProperty<Boolean> hidesHeaderAttributes) {
        HidesHeaderAttributes = hidesHeaderAttributes;
    }

    public ConfigItem<Boolean> getInventorySync() {
        return InventorySync;
    }

    public void setInventorySync(ConfigItem<Boolean> inventorySync) {
        InventorySync = inventorySync;
    }

    public ConfigStockLocationBinding getStockLocationBinding() {
        return StockLocationBinding;
    }

    public void setStockLocationBinding(ConfigStockLocationBinding stockLocationBinding) {
        StockLocationBinding = stockLocationBinding;
    }

    public ConfigItem<Integer> getMaxListed() {
        return MaxListed;
    }

    public void setMaxListed(ConfigItem<Integer> maxListed) {
        MaxListed = maxListed;
    }

    public ConfigItem<Double> getStockPercentage() {
        return StockPercentage;
    }

    public void setStockPercentage(ConfigItem<Double> stockPercentage) {
        StockPercentage = stockPercentage;
    }

    public ConfigItem<Integer> getEndWhen() {
        return EndWhen;
    }

    public void setEndWhen(ConfigItem<Integer> endWhen) {
        EndWhen = endWhen;
    }

    public ConfigItem<Boolean> getPriceChange() {
        return PriceChange;
    }

    public void setPriceChange(ConfigItem<Boolean> priceChange) {
        PriceChange = priceChange;
    }

    public ConfigItem<Boolean> getIsListingScanRunning() {
        return IsListingScanRunning;
    }

    public void setIsListingScanRunning(ConfigItem<Boolean> isListingScanRunning) {
        IsListingScanRunning = isListingScanRunning;
    }

    public ConfigItem<Instant> getListingScanStartUpdateDate() {
        return ListingScanStartUpdateDate;
    }

    public void setListingScanStartUpdateDate(ConfigItem<Instant> listingScanStartUpdateDate) {
        ListingScanStartUpdateDate = listingScanStartUpdateDate;
    }

    public ConfigItem<Instant> getLastListingUpdateDate() {
        return LastListingUpdateDate;
    }

    public void setLastListingUpdateDate(ConfigItem<Instant> lastListingUpdateDate) {
        LastListingUpdateDate = lastListingUpdateDate;
    }

    public ConfigItem<Instant> getEstimatedInventoryScanComplete() {
        return EstimatedInventoryScanComplete;
    }

    public void setEstimatedInventoryScanComplete(ConfigItem<Instant> estimatedInventoryScanComplete) {
        EstimatedInventoryScanComplete = estimatedInventoryScanComplete;
    }

    public Boolean getHeaderOnly() {
        return IsHeaderOnly;
    }

    public void setHeaderOnly(Boolean headerOnly) {
        IsHeaderOnly = headerOnly;
    }

    public Boolean getHidden() {
        return IsHidden;
    }

    public void setHidden(Boolean hidden) {
        IsHidden = hidden;
    }

    public List<ConfigItemExternal> getDynamicProperties() {
        return DynamicProperties;
    }

    public void setDynamicProperties(List<ConfigItemExternal> dynamicProperties) {
        DynamicProperties = dynamicProperties;
    }

    public DiscountType getConfigDiscountTyped() {
        return ConfigDiscountTyped;
    }

    public void setConfigDiscountTyped(DiscountType configDiscountTyped) {
        ConfigDiscountTyped = configDiscountTyped;
    }

    public ConfigPostalServiceMapping getPostalServiceMapping() {
        return PostalServiceMapping;
    }

    public void setPostalServiceMapping(ConfigPostalServiceMapping postalServiceMapping) {
        PostalServiceMapping = postalServiceMapping;
    }

    public ConfigPaymentMethodMapping getPaymentMethodMapping() {
        return PaymentMethodMapping;
    }

    public void setPaymentMethodMapping(ConfigPaymentMethodMapping paymentMethodMapping) {
        PaymentMethodMapping = paymentMethodMapping;
    }

    public Integer getPkChannelId() {
        return PkChannelId;
    }

    public void setPkChannelId(Integer pkChannelId) {
        PkChannelId = pkChannelId;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    public String getSourceType() {
        return SourceType;
    }

    public void setSourceType(String sourceType) {
        SourceType = sourceType;
    }

    public List<ConfigRule> getRules() {
        return Rules;
    }

    public void setRules(List<ConfigRule> rules) {
        Rules = rules;
    }

    public List<ConfigButton> getButtons() {
        return Buttons;
    }

    public void setButtons(List<ConfigButton> buttons) {
        Buttons = buttons;
    }

    public String getSubSource() {
        return SubSource;
    }

    public void setSubSource(String subSource) {
        SubSource = subSource;
    }

    public List<SystemChannelSettingProperty> getHeaderAuditValues() {
        return HeaderAuditValues;
    }

    public void setHeaderAuditValues(List<SystemChannelSettingProperty> headerAuditValues) {
        HeaderAuditValues = headerAuditValues;
    }

    public ConfigItem<String> getMarketplaceId() {
        return MarketplaceId;
    }

    public void setMarketplaceId(ConfigItem<String> marketplaceId) {
        MarketplaceId = marketplaceId;
    }

    public ConfigItem<String> getMerchantId() {
        return MerchantId;
    }

    public void setMerchantId(ConfigItem<String> merchantId) {
        MerchantId = merchantId;
    }

    public ConfigItem<String> getToken() {
        return Token;
    }

    public void setToken(ConfigItem<String> token) {
        Token = token;
    }

    public ConfigItem<String> getTokenSecret() {
        return TokenSecret;
    }

    public void setTokenSecret(ConfigItem<String> tokenSecret) {
        TokenSecret = tokenSecret;
    }

    public ConfigItem<String> getShopIdOrName() {
        return ShopIdOrName;
    }

    public void setShopIdOrName(ConfigItem<String> shopIdOrName) {
        ShopIdOrName = shopIdOrName;
    }
}
