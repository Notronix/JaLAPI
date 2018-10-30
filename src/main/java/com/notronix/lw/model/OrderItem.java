package com.notronix.lw.model;

import java.util.List;

public class OrderItem {
    private String OrderId;
    private String ItemId;
    private String StockItemId;
    private String ItemNumber;
    private String SKU;
    private String ItemSource;
    private String Title;
    private Integer Quantity;
    private String CategoryId;
    private String CategoryName;
    private Integer CompositeAvailablity;
    private String RowId;
    private Boolean StockLevelsSpecified;
    private Integer OnOrder;
    private Integer InOrderBook;
    private Integer Level;
    private Integer MinimumLevel;
    private Integer AvailableStock;
    private Double PricePerUnit;
    private Double UnitCost;
    private Double Discount;
    private Double Tax;
    private Double TaxRate;
    private Double Cost;
    private Double CostIncTax;
    private List<OrderItem> CompositeSubItems;
    private Boolean IsService;
    private Double SalesTax;
    private Boolean TaxCostInclusive;
    private Boolean PartShipped;
    private Double Weight;
    private String BarcodeNumber;
    private Integer Market;
    private String ChannelSKU;
    private String ChannelTitle;
    private Double DiscountValue;
    private Boolean HasImage;
    private String ImageId;
    private List<OrderItemOption> AdditionalInfo;
    private Integer StockLevelIndicator;
    private String BinRack;
    private Boolean BatchNumberScanRequired;
    private Boolean SerialNumberScanRequired;
    private List<OrderItemBinRack> BinRacks;
    private Integer InventoryTrackingType;
    private Boolean isBatchedStockItem;
    private Boolean HasPurchaseOrders;
    private Boolean CanPurchaseOrderFulfil;
    private Boolean IsUnlinked;
    private String ParentItemId;
    private String StockId;

    public String getOrderId() {
        return OrderId;
    }

    public void setOrderId(String orderId) {
        OrderId = orderId;
    }

    public String getItemId() {
        return ItemId;
    }

    public void setItemId(String itemId) {
        ItemId = itemId;
    }

    public String getStockItemId() {
        return StockItemId;
    }

    public void setStockItemId(String stockItemId) {
        StockItemId = stockItemId;
    }

    public String getItemNumber() {
        return ItemNumber;
    }

    public void setItemNumber(String itemNumber) {
        ItemNumber = itemNumber;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public String getItemSource() {
        return ItemSource;
    }

    public void setItemSource(String itemSource) {
        ItemSource = itemSource;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer quantity) {
        Quantity = quantity;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public Integer getCompositeAvailablity() {
        return CompositeAvailablity;
    }

    public void setCompositeAvailablity(Integer compositeAvailablity) {
        CompositeAvailablity = compositeAvailablity;
    }

    public String getRowId() {
        return RowId;
    }

    public void setRowId(String rowId) {
        RowId = rowId;
    }

    public Boolean getStockLevelsSpecified() {
        return StockLevelsSpecified;
    }

    public void setStockLevelsSpecified(Boolean stockLevelsSpecified) {
        StockLevelsSpecified = stockLevelsSpecified;
    }

    public Integer getOnOrder() {
        return OnOrder;
    }

    public void setOnOrder(Integer onOrder) {
        OnOrder = onOrder;
    }

    public Integer getInOrderBook() {
        return InOrderBook;
    }

    public void setInOrderBook(Integer inOrderBook) {
        InOrderBook = inOrderBook;
    }

    public Integer getLevel() {
        return Level;
    }

    public void setLevel(Integer level) {
        Level = level;
    }

    public Integer getMinimumLevel() {
        return MinimumLevel;
    }

    public void setMinimumLevel(Integer minimumLevel) {
        MinimumLevel = minimumLevel;
    }

    public Integer getAvailableStock() {
        return AvailableStock;
    }

    public void setAvailableStock(Integer availableStock) {
        AvailableStock = availableStock;
    }

    public Double getPricePerUnit() {
        return PricePerUnit;
    }

    public void setPricePerUnit(Double pricePerUnit) {
        PricePerUnit = pricePerUnit;
    }

    public Double getUnitCost() {
        return UnitCost;
    }

    public void setUnitCost(Double unitCost) {
        UnitCost = unitCost;
    }

    public Double getDiscount() {
        return Discount;
    }

    public void setDiscount(Double discount) {
        Discount = discount;
    }

    public Double getTax() {
        return Tax;
    }

    public void setTax(Double tax) {
        Tax = tax;
    }

    public Double getTaxRate() {
        return TaxRate;
    }

    public void setTaxRate(Double taxRate) {
        TaxRate = taxRate;
    }

    public Double getCost() {
        return Cost;
    }

    public void setCost(Double cost) {
        Cost = cost;
    }

    public Double getCostIncTax() {
        return CostIncTax;
    }

    public void setCostIncTax(Double costIncTax) {
        CostIncTax = costIncTax;
    }

    public List<OrderItem> getCompositeSubItems() {
        return CompositeSubItems;
    }

    public void setCompositeSubItems(List<OrderItem> compositeSubItems) {
        CompositeSubItems = compositeSubItems;
    }

    public Boolean getService() {
        return IsService;
    }

    public void setService(Boolean service) {
        IsService = service;
    }

    public Double getSalesTax() {
        return SalesTax;
    }

    public void setSalesTax(Double salesTax) {
        SalesTax = salesTax;
    }

    public Boolean getTaxCostInclusive() {
        return TaxCostInclusive;
    }

    public void setTaxCostInclusive(Boolean taxCostInclusive) {
        TaxCostInclusive = taxCostInclusive;
    }

    public Boolean getPartShipped() {
        return PartShipped;
    }

    public void setPartShipped(Boolean partShipped) {
        PartShipped = partShipped;
    }

    public Double getWeight() {
        return Weight;
    }

    public void setWeight(Double weight) {
        Weight = weight;
    }

    public String getBarcodeNumber() {
        return BarcodeNumber;
    }

    public void setBarcodeNumber(String barcodeNumber) {
        BarcodeNumber = barcodeNumber;
    }

    public Integer getMarket() {
        return Market;
    }

    public void setMarket(Integer market) {
        Market = market;
    }

    public String getChannelSKU() {
        return ChannelSKU;
    }

    public void setChannelSKU(String channelSKU) {
        ChannelSKU = channelSKU;
    }

    public String getChannelTitle() {
        return ChannelTitle;
    }

    public void setChannelTitle(String channelTitle) {
        ChannelTitle = channelTitle;
    }

    public Boolean getHasImage() {
        return HasImage;
    }

    public void setHasImage(Boolean hasImage) {
        HasImage = hasImage;
    }

    public String getImageId() {
        return ImageId;
    }

    public void setImageId(String imageId) {
        ImageId = imageId;
    }

    public List<OrderItemOption> getAdditionalInfo() {
        return AdditionalInfo;
    }

    public void setAdditionalInfo(List<OrderItemOption> additionalInfo) {
        AdditionalInfo = additionalInfo;
    }

    public Integer getStockLevelIndicator() {
        return StockLevelIndicator;
    }

    public void setStockLevelIndicator(Integer stockLevelIndicator) {
        StockLevelIndicator = stockLevelIndicator;
    }

    public String getBinRack() {
        return BinRack;
    }

    public void setBinRack(String binRack) {
        BinRack = binRack;
    }

    public String getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(String categoryId) {
        CategoryId = categoryId;
    }

    public Double getDiscountValue() {
        return DiscountValue;
    }

    public void setDiscountValue(Double discountValue) {
        DiscountValue = discountValue;
    }

    public Boolean getBatchNumberScanRequired() {
        return BatchNumberScanRequired;
    }

    public void setBatchNumberScanRequired(Boolean batchNumberScanRequired) {
        BatchNumberScanRequired = batchNumberScanRequired;
    }

    public Boolean getSerialNumberScanRequired() {
        return SerialNumberScanRequired;
    }

    public void setSerialNumberScanRequired(Boolean serialNumberScanRequired) {
        SerialNumberScanRequired = serialNumberScanRequired;
    }

    public List<OrderItemBinRack> getBinRacks() {
        return BinRacks;
    }

    public void setBinRacks(List<OrderItemBinRack> binRacks) {
        BinRacks = binRacks;
    }

    public Integer getInventoryTrackingType() {
        return InventoryTrackingType;
    }

    public void setInventoryTrackingType(Integer inventoryTrackingType) {
        InventoryTrackingType = inventoryTrackingType;
    }

    public Boolean getBatchedStockItem() {
        return isBatchedStockItem;
    }

    public void setBatchedStockItem(Boolean batchedStockItem) {
        isBatchedStockItem = batchedStockItem;
    }

    public Boolean getHasPurchaseOrders() {
        return HasPurchaseOrders;
    }

    public void setHasPurchaseOrders(Boolean hasPurchaseOrders) {
        HasPurchaseOrders = hasPurchaseOrders;
    }

    public Boolean getCanPurchaseOrderFulfil() {
        return CanPurchaseOrderFulfil;
    }

    public void setCanPurchaseOrderFulfil(Boolean canPurchaseOrderFulfil) {
        CanPurchaseOrderFulfil = canPurchaseOrderFulfil;
    }

    public Boolean getUnlinked() {
        return IsUnlinked;
    }

    public void setUnlinked(Boolean unlinked) {
        IsUnlinked = unlinked;
    }

    public String getParentItemId() {
        return ParentItemId;
    }

    public void setParentItemId(String parentItemId) {
        ParentItemId = parentItemId;
    }

    public String getStockId() {
        return StockId;
    }

    public void setStockId(String stockId) {
        StockId = stockId;
    }
}
