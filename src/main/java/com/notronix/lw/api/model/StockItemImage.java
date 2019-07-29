package com.notronix.lw.api.model;

import java.util.UUID;

public class StockItemImage
{
    private String Source;
    private String FullSource;
    private String CheckSumValue;
    private UUID pkRowId;
    private Boolean IsMain;
    private Integer SortOrder;
    private String ChecksumValue;
    private String RawChecksum;
    private UUID StockItemId;

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    public String getFullSource() {
        return FullSource;
    }

    public void setFullSource(String fullSource) {
        FullSource = fullSource;
    }

    public String getCheckSumValue() {
        return CheckSumValue;
    }

    public void setCheckSumValue(String checkSumValue) {
        CheckSumValue = checkSumValue;
    }

    public UUID getPkRowId() {
        return pkRowId;
    }

    public void setPkRowId(UUID pkRowId) {
        this.pkRowId = pkRowId;
    }

    public Boolean getMain() {
        return IsMain;
    }

    public void setMain(Boolean main) {
        IsMain = main;
    }

    public Integer getSortOrder() {
        return SortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        SortOrder = sortOrder;
    }

    public String getChecksumValue() {
        return ChecksumValue;
    }

    public void setChecksumValue(String checksumValue) {
        ChecksumValue = checksumValue;
    }

    public String getRawChecksum() {
        return RawChecksum;
    }

    public void setRawChecksum(String rawChecksum) {
        RawChecksum = rawChecksum;
    }

    public UUID getStockItemId() {
        return StockItemId;
    }

    public void setStockItemId(UUID stockItemId) {
        StockItemId = stockItemId;
    }
}
