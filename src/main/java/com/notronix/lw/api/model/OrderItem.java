package com.notronix.lw.api.model;

import java.util.List;
import java.util.UUID;

public class OrderItem
{
    private UUID ItemId;
    private String ItemNumber;
    private String SKU;
    private String ItemSource;
    private String Title;
    private Integer Quantity;
    private UUID CategoryId;
    private String CategoryName;
    private Integer CompositeAvailablity;
    private Boolean StockLevelsSpecified;
    private Integer OnOrder;
    private OrderItemOnOrder OnPurchaseOrder;
    private Integer InOrderBook;
    private Integer Level;
    private Integer MinimumLevel;
    private Integer AvailableStock;
    private Double PricePerUnit;
    private Double UnitCost;
    private Double DespatchStockUnitCost;
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
    private UUID ImageId;
    private List<OrderItemOption> AdditionalInfo;
    private Integer StockLevelIndicator;
    private Boolean BatchNumberScanRequired;
    private Boolean SerialNumberScanRequired;
    private String BinRack;
    private List<OrderItemBinRack> BinRacks;
    private Integer InventoryTrackingType;
    private Boolean isBatchedStockItem;
    private Boolean IsWarehouseManaged;
    private Boolean HasPurchaseOrders;
    private Boolean CanPurchaseOrderFulfil;
    private Boolean IsUnlinked;
    private UUID ParentItemId;
    private UUID RowId;
    private UUID OrderId;
    private UUID StockItemId;
    private UUID StockId;

    public UUID getItemId() {
        return ItemId;
    }

    public void setItemId(UUID itemId) {
        ItemId = itemId;
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

    public UUID getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(UUID categoryId) {
        CategoryId = categoryId;
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

    public OrderItemOnOrder getOnPurchaseOrder() {
        return OnPurchaseOrder;
    }

    public void setOnPurchaseOrder(OrderItemOnOrder onPurchaseOrder) {
        OnPurchaseOrder = onPurchaseOrder;
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

    public Double getDespatchStockUnitCost() {
        return DespatchStockUnitCost;
    }

    public void setDespatchStockUnitCost(Double despatchStockUnitCost) {
        DespatchStockUnitCost = despatchStockUnitCost;
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

    public Double getDiscountValue() {
        return DiscountValue;
    }

    public void setDiscountValue(Double discountValue) {
        DiscountValue = discountValue;
    }

    public Boolean getHasImage() {
        return HasImage;
    }

    public void setHasImage(Boolean hasImage) {
        HasImage = hasImage;
    }

    public UUID getImageId() {
        return ImageId;
    }

    public void setImageId(UUID imageId) {
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

    public String getBinRack() {
        return BinRack;
    }

    public void setBinRack(String binRack) {
        BinRack = binRack;
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

    public Boolean getWarehouseManaged() {
        return IsWarehouseManaged;
    }

    public void setWarehouseManaged(Boolean warehouseManaged) {
        IsWarehouseManaged = warehouseManaged;
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

    public UUID getParentItemId() {
        return ParentItemId;
    }

    public void setParentItemId(UUID parentItemId) {
        ParentItemId = parentItemId;
    }

    public UUID getRowId() {
        return RowId;
    }

    public void setRowId(UUID rowId) {
        RowId = rowId;
    }

    public UUID getOrderId() {
        return OrderId;
    }

    public void setOrderId(UUID orderId) {
        OrderId = orderId;
    }

    public UUID getStockItemId() {
        return StockItemId;
    }

    public void setStockItemId(UUID stockItemId) {
        StockItemId = stockItemId;
    }

    public UUID getStockId() {
        return StockId;
    }

    public void setStockId(UUID stockId) {
        StockId = stockId;
    }
}
