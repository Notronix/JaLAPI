package com.notronix.lw.model;

import java.time.Instant;

public class StockItemLevel
{
    private String StockItemId;
    private StockLocation Location;
    private Integer StockLevel;
    private Double StockValue;
    private Integer MinimumLevel;
    private Integer InOrders;
    private Integer Available;
    private Integer Due;
    private Double UnitCost;
    private Integer InOrderBook;
    private Boolean JIT;
    private String SKU;
    private Boolean AutoAdjust;
    private Instant LastUpdateDate;
    private String LastUpdateOperation;
    private String rowid;
    private Boolean PendingUpdate;
    private Double StockItemPurchasePrice;


    public String getStockItemId()
    {
        return StockItemId;
    }

    public void setStockItemId(String stockItemId)
    {
        StockItemId = stockItemId;
    }

    public StockLocation getLocation()
    {
        return Location;
    }

    public void setLocation(StockLocation location)
    {
        Location = location;
    }

    public Integer getStockLevel()
    {
        return StockLevel;
    }

    public void setStockLevel(Integer stockLevel)
    {
        StockLevel = stockLevel;
    }

    public Double getStockValue()
    {
        return StockValue;
    }

    public void setStockValue(Double stockValue)
    {
        StockValue = stockValue;
    }

    public Integer getMinimumLevel()
    {
        return MinimumLevel;
    }

    public void setMinimumLevel(Integer minimumLevel)
    {
        MinimumLevel = minimumLevel;
    }

    public Integer getInOrders()
    {
        return InOrders;
    }

    public void setInOrders(Integer inOrders)
    {
        InOrders = inOrders;
    }

    public Integer getAvailable()
    {
        return Available;
    }

    public void setAvailable(Integer available)
    {
        Available = available;
    }

    public Integer getDue()
    {
        return Due;
    }

    public void setDue(Integer due)
    {
        Due = due;
    }

    public Double getUnitCost()
    {
        return UnitCost;
    }

    public void setUnitCost(Double unitCost)
    {
        UnitCost = unitCost;
    }

    public Integer getInOrderBook() {
        return InOrderBook;
    }

    public void setInOrderBook(Integer inOrderBook) {
        InOrderBook = inOrderBook;
    }

    public Boolean getJIT() {
        return JIT;
    }

    public void setJIT(Boolean JIT) {
        this.JIT = JIT;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public Boolean getAutoAdjust() {
        return AutoAdjust;
    }

    public void setAutoAdjust(Boolean autoAdjust) {
        AutoAdjust = autoAdjust;
    }

    public Instant getLastUpdateDate() {
        return LastUpdateDate;
    }

    public void setLastUpdateDate(Instant lastUpdateDate) {
        LastUpdateDate = lastUpdateDate;
    }

    public String getLastUpdateOperation() {
        return LastUpdateOperation;
    }

    public void setLastUpdateOperation(String lastUpdateOperation) {
        LastUpdateOperation = lastUpdateOperation;
    }

    public String getRowid() {
        return rowid;
    }

    public void setRowid(String rowid) {
        this.rowid = rowid;
    }

    public Boolean getPendingUpdate() {
        return PendingUpdate;
    }

    public void setPendingUpdate(Boolean pendingUpdate) {
        PendingUpdate = pendingUpdate;
    }

    public Double getStockItemPurchasePrice() {
        return StockItemPurchasePrice;
    }

    public void setStockItemPurchasePrice(Double stockItemPurchasePrice) {
        StockItemPurchasePrice = stockItemPurchasePrice;
    }
}
