package com.notronix.lw.api.model;

import java.time.Instant;
import java.util.UUID;

public class StockItemChannelSKU
{
    private UUID ChannelSKURowId;
    private String SKU;
    private String Source;
    private String SubSource;
    private String UpdateStatus;
    private String ChannelReferenceId;
    private Instant LastUpdate;
    private Integer MaxListedQuantity;
    private Integer EndWhenStock;
    private Integer SubmittedQuantity;
    private Integer ListedQuantity;
    private Double StockPercentage;
    private Boolean IgnoreSync;
    private Boolean IgnoreSyncMultiLocation;
    private Boolean IsMultiLocation;
    private UUID StockItemId;

    public UUID getStockItemId() {
        return StockItemId;
    }

    public void setStockItemId(UUID stockItemId) {
        StockItemId = stockItemId;
    }

    public UUID getChannelSKURowId() {
        return ChannelSKURowId;
    }

    public void setChannelSKURowId(UUID channelSKURowId) {
        ChannelSKURowId = channelSKURowId;
    }

    public String getChannelReferenceId() {
        return ChannelReferenceId;
    }

    public void setChannelReferenceId(String channelReferenceId) {
        ChannelReferenceId = channelReferenceId;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    public String getSubSource() {
        return SubSource;
    }

    public void setSubSource(String subSource) {
        SubSource = subSource;
    }

    public Integer getSubmittedQuantity() {
        return SubmittedQuantity;
    }

    public void setSubmittedQuantity(Integer submittedQuantity) {
        SubmittedQuantity = submittedQuantity;
    }

    public Integer getListedQuantity() {
        return ListedQuantity;
    }

    public void setListedQuantity(Integer listedQuantity) {
        ListedQuantity = listedQuantity;
    }

    public Integer getMaxListedQuantity() {
        return MaxListedQuantity;
    }

    public void setMaxListedQuantity(Integer maxListedQuantity) {
        MaxListedQuantity = maxListedQuantity;
    }

    public String getUpdateStatus() {
        return UpdateStatus;
    }

    public void setUpdateStatus(String updateStatus) {
        UpdateStatus = updateStatus;
    }

    public Instant getLastUpdate() {
        return LastUpdate;
    }

    public void setLastUpdate(Instant lastUpdate) {
        LastUpdate = lastUpdate;
    }

    public Integer getEndWhenStock() {
        return EndWhenStock;
    }

    public void setEndWhenStock(Integer endWhenStock) {
        EndWhenStock = endWhenStock;
    }

    public Double getStockPercentage() {
        return StockPercentage;
    }

    public void setStockPercentage(Double stockPercentage) {
        StockPercentage = stockPercentage;
    }

    public Boolean getIgnoreSync() {
        return IgnoreSync;
    }

    public void setIgnoreSync(Boolean ignoreSync) {
        IgnoreSync = ignoreSync;
    }

    public Boolean getIgnoreSyncMultiLocation() {
        return IgnoreSyncMultiLocation;
    }

    public void setIgnoreSyncMultiLocation(Boolean ignoreSyncMultiLocation) {
        IgnoreSyncMultiLocation = ignoreSyncMultiLocation;
    }

    public Boolean getMultiLocation() {
        return IsMultiLocation;
    }

    public void setMultiLocation(Boolean multiLocation) {
        IsMultiLocation = multiLocation;
    }
}
