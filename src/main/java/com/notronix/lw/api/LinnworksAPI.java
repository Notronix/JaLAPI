package com.notronix.lw.api;

import com.notronix.lw.api.model.*;
import com.notronix.lw.api.model.AddImageToInventoryItemResponse;
import com.notronix.lw.api.model.ActionRefundRequest;
import com.notronix.lw.api.model.ActionRefundResponse;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@SuppressWarnings({"unused", "UnusedReturnValue"})
public interface LinnworksAPI
{
    BaseSession authorizeByApplication(Credentials credentials) throws LinnworksAPIException;

    Instant getServerUTCTime(BaseSession session) throws LinnworksAPIException;

    List<StockLocation> getStockLocations(BaseSession session) throws LinnworksAPIException;

    List<Country> getCountries(BaseSession session) throws LinnworksAPIException;

    List<Channel> getChannels(BaseSession session) throws LinnworksAPIException;

    List<Channel> getChannelsBySource(BaseSession session, String source) throws LinnworksAPIException;

    List<Category> getCategories(BaseSession session) throws LinnworksAPIException;

    List<String> getExtendedPropertyNames(BaseSession session, String propertyType) throws LinnworksAPIException;

    StockItemInv getInventoryItemById(BaseSession session, UUID id) throws LinnworksAPIException;

    List<StockItemComposition> getInventoryItemCompositions(BaseSession session, UUID inventoryItemId, Boolean getFullDetail)
            throws LinnworksAPIException;

    Void createInventoryItemCompositions(BaseSession session, List<StockItemComposition> inventoryItemCompositions)
            throws LinnworksAPIException;

    Void deleteInventoryItemCompositions(BaseSession session, UUID stockItemId, List<UUID> inventoryItemCompositionIds)
            throws LinnworksAPIException;

    List<StockItemEbayCompatibility> getEbayCompatibilityList(BaseSession session, UUID stockItemId)
            throws LinnworksAPIException;

    Void createInventoryItemPrices(BaseSession session, List<StockItemPrice> inventoryItemPrices) throws LinnworksAPIException;

    List<StockItemPrice> getInventoryItemPrices(BaseSession session, UUID inventoryItemId) throws LinnworksAPIException;

    Void deleteInventoryItemPrices(BaseSession session, List<UUID> inventoryItemPriceIds) throws LinnworksAPIException;

    Void createInventoryItemTitles(BaseSession session, List<StockItemTitle> inventoryItemTitles) throws LinnworksAPIException;

    List<StockItemTitle> getInventoryItemTitles(BaseSession session, UUID inventoryItemId) throws LinnworksAPIException;

    Void deleteInventoryItemTitles(BaseSession session, List<UUID> inventoryItemTitleIds) throws LinnworksAPIException;

    Void createInventoryItemDescriptions(BaseSession session, List<StockItemDescription> inventoryItemDescriptions)
            throws LinnworksAPIException;

    List<StockItemDescription> getInventoryItemDescriptions(BaseSession session, UUID inventoryItemId)
            throws LinnworksAPIException;

    Void deleteInventoryItemDescriptions(BaseSession session, List<UUID> inventoryItemDescriptionIds)
            throws LinnworksAPIException;

    Void createInventoryItemExtendedProperties(BaseSession session,
                                               List<StockItemExtendedProperty> inventoryItemExtendedProperties)
            throws LinnworksAPIException;

    List<StockItemExtendedProperty> getInventoryItemExtendedProperties(BaseSession session, UUID inventoryItemId,
                                                                       GetExtendedPropertyFilter propertyParams)
            throws LinnworksAPIException;

    Void deleteInventoryItemExtendedProperties(BaseSession session, UUID inventoryItemId,
                                               List<UUID> inventoryItemExtendedPropertyIds)
            throws LinnworksAPIException;

    Void updateInventoryItemExtendedProperties(BaseSession session,
                                               List<StockItemExtendedProperty> inventoryItemExtendedProperties)
            throws LinnworksAPIException;

    Map<String, List<String>> getAllExtendedPropertyNames(BaseSession session) throws LinnworksAPIException;

    Void duplicateInventoryItem(BaseSession session, StockItem inventoryItem, UUID sourceItemId, Boolean copyImages)
            throws LinnworksAPIException;

    Void deleteInventoryItems(BaseSession session, List<UUID> inventoryItemIds) throws LinnworksAPIException;

    List<StockItemImage> getInventoryItemImages(BaseSession session, UUID inventoryItemId) throws LinnworksAPIException;

    List<StockItemLevel> getStockLevel(BaseSession session, UUID stockItemId) throws LinnworksAPIException;

    List<GetStockLevelBatchResponse> getStockLevelBatch(BaseSession session, GetStockLevelBatchRequest request)
            throws LinnworksAPIException;

    List<StockItemLevel> setStockLevel(BaseSession session, List<StockLevelUpdate> stockLevels, String changeSource)
            throws LinnworksAPIException;

    GenericPagedResult<StockItem> getStockItems(BaseSession session, String keyWord, UUID locationId,
                                                Integer entriesPerPage, Integer pageNumber, Boolean excludeComposites,
                                                Boolean excludeVariations, Boolean excludeBatches)
            throws LinnworksAPIException;

    GenericPagedResult<StockItem> getStockItemsNext(BaseSession session, GenericPagedResult<StockItem> pager)
            throws LinnworksAPIException;

    Map<String, Object> updateInventoryItemField(BaseSession session, UUID inventoryItemId, ColumnNameType fieldName,
                                                 String fieldValue) throws LinnworksAPIException;

    Map<String, Object> updateInventoryItemStockField(BaseSession session, UUID inventoryItemId, ColumnNameType fieldName,
                                                      String fieldValue, UUID locationId, String changeSource)
            throws LinnworksAPIException;

    List<UserOrderView> getOrderViews(BaseSession session) throws LinnworksAPIException;

    List<SearchField> getSearchTypes(BaseSession session, HistoryType historyType) throws LinnworksAPIException;

    GenericPagedResult<ProcessedOrderWeb> searchProcessedOrdersPaged(BaseSession session,
                                                                     Instant from, Instant to, SearchDateType dateType,
                                                                     SearchField searchField, Boolean exactMatch,
                                                                     String searchTerm, Integer pageNum,
                                                                     Integer numEntriesPerPage)
            throws LinnworksAPIException;

    GenericPagedResult<ProcessedOrderWeb> searchProcessedOrdersPagedNext(BaseSession session,
                                                                         GenericPagedResult<ProcessedOrderWeb> pager)
            throws LinnworksAPIException;

    GenericPagedResult<OpenOrder> getOpenOrders(BaseSession session, Integer entriesPerPage, Integer pageNumber,
                                                FieldsFilter filters, List<FieldSorting> sorting,
                                                UUID fulfilmentCenter, String additionalFilter)
            throws LinnworksAPIException;

    GenericPagedResult<OpenOrder> getOpenOrdersNext(BaseSession session, GenericPagedResult<OpenOrder> pager)
            throws LinnworksAPIException;

    OrderDetails getOrderById(BaseSession session, UUID pkOrderId) throws LinnworksAPIException;

    List<OrderDetails> getOrdersById(BaseSession session, List<UUID> pkOrderIds) throws LinnworksAPIException;

    List<Supplier> getSuppliers(BaseSession session) throws LinnworksAPIException;

    List<StockItemSupplierStat> getStockSupplierStat(BaseSession session, UUID inventoryItemId)
            throws LinnworksAPIException;

    List<StockItemChannelSKU> getInventoryItemChannelSKUs(BaseSession session, UUID inventoryItemId)
            throws LinnworksAPIException;

    Void createInventoryItemChannelSKUs(BaseSession session, List<StockItemChannelSKU> inventoryItemChannelSKUs)
            throws LinnworksAPIException;

    Void deleteInventoryItemChannelSKUs(BaseSession session, List<UUID> inventoryItemChannelSKUIds)
            throws LinnworksAPIException;

    List<CurrencyConversionRate> getCurrencyConversionRates(BaseSession session, GetConversionRatesRequest requestParams)
            throws LinnworksAPIException;

    String getNewItemNumber(BaseSession session) throws LinnworksAPIException;

    List<KeyGuidValue> getPackageGroups(BaseSession session) throws LinnworksAPIException;

    List<PostalServiceWithChannelAndShippingLinks> getPostalServices(BaseSession session) throws LinnworksAPIException;

    SearchPurchaseOrdersResult searchPurchaseOrders(BaseSession session, SearchPurchaseOrderParameter searchParameter)
            throws LinnworksAPIException;

    SearchPurchaseOrdersResult searchPurchaseOrdersNext(BaseSession session, SearchPurchaseOrdersResult pager)
            throws LinnworksAPIException;

    GetPurchaseOrderResponse getPurchaseOrder(BaseSession session, UUID pkPurchaseId) throws LinnworksAPIException;

    UUID createPurchaseOrderInitial(BaseSession session, CreatePurchaseOrderInitialParameter createParameters)
            throws LinnworksAPIException;

    UpdatePurchaseOrderItemResponse addPurchaseOrderItem(BaseSession session,
                                                         AddPurchaseOrderItemParameter addItemParameter)
            throws LinnworksAPIException;

    PurchaseOrderHeader changePurchaseOrderStatus(BaseSession session,
                                                  ChangePurchaseOrderStatusParameter changeStatusParameter)
            throws LinnworksAPIException;

    UpdatePurchaseOrderItemResponse deliverPurchaseItem(BaseSession session,
                                                        DeliverPurchaseItemParameter deliverItemParameter)
            throws LinnworksAPIException;

    PurchaseOrderNote addPurchaseOrderNote(BaseSession session, UUID pkPurchaseId, String note)
            throws LinnworksAPIException;

    List<PurchaseOrderNote> getPurchaseOrderNote(BaseSession session, UUID pkPurchaseId) throws LinnworksAPIException;

    Void deletePurchaseOrder(BaseSession session, UUID pkPurchaseId) throws LinnworksAPIException;

    List<RefundInfo> getRefunds(BaseSession session, UUID pkOrderId) throws LinnworksAPIException;

    GetRefundOptionsResponse getRefundOptions(BaseSession session, GetRefundOptionsRequest request)
            throws LinnworksAPIException;

    GetRefundHeadersByOrderIdResponse getRefundHeadersByOrderId(BaseSession session,
                                                                GetRefundHeadersByOrderIdRequest request)
            throws LinnworksAPIException;

    GetActionableRefundHeadersResponse getActionableRefundHeaders(BaseSession session,
                                                                  GetActionableRefundHeadersRequest request)
            throws LinnworksAPIException;

    GetActionableRefundHeadersResponse getActionableRefundHeadersNext(BaseSession session,
                                                                      GetActionableRefundHeadersResponse pager)
            throws LinnworksAPIException;

    OpenOrder createNewOrder(BaseSession session, UUID fulfilmentCenter, Boolean createAsDraft)
            throws LinnworksAPIException;

    Void setOrderGeneralInfo(BaseSession session, UUID orderId, OrderGeneralInfo info, Boolean wasDraft)
            throws LinnworksAPIException;

    OrderTotalsInfo setOrderCustomerInfo(BaseSession session, UUID orderId, OrderCustomerInfo info, Boolean saveToCrm)
            throws LinnworksAPIException;

    List<UUID> changeOrderTag(BaseSession session, List<UUID> orderIds, Integer tag)
            throws LinnworksAPIException;

    List<UUID> changeStatus(BaseSession session, List<UUID> orderIds, Integer status)
            throws LinnworksAPIException;

    Void lockOrder(BaseSession session, List<UUID> orderIds, Boolean lockOrder)
            throws LinnworksAPIException;

    List<UUID> assignToFolder(BaseSession session, List<UUID> orderIds, String folder)
            throws LinnworksAPIException;

    List<UUID> unassignToFolder(BaseSession session, List<UUID> orderIds, String folder)
            throws LinnworksAPIException;

    UUID addOrderNote(BaseSession session, UUID pkOrderID, String noteText, Boolean isInternal)
            throws LinnworksAPIException;

    UpdateOrderItemResult addOrderItem(BaseSession session, UUID orderId, UUID itemId, String channelSKU,
                                       UUID fulfilmentCenter, Integer quantity, LinePricingRequest linePricing)
            throws LinnworksAPIException;

    UpdateOrderItemResult updateOrderItem(BaseSession session, UUID orderId, OrderItem orderItem, UUID fulfilmentCenter,
                                          String source, String subSource)
            throws LinnworksAPIException;

    UpdateOrderItemResult removeOrderItem(BaseSession session, UUID orderId, UUID rowId, UUID fulfilmentCenter)
            throws LinnworksAPIException;

    MoveToLocationResult moveToLocation(BaseSession session, List<UUID> orderIds, UUID pkStockLocationId)
            throws LinnworksAPIException;

    String cancelOrder(BaseSession session, UUID orderId, UUID fulfilmentCenter, Double refund, String note)
            throws LinnworksAPIException;

    Void deleteOrder(BaseSession session, UUID orderId) throws LinnworksAPIException;

    GenericPagedResult<VariationGroup> searchVariationGroups(BaseSession session, VariationSearchType searchType,
                                                             String searchText, Integer pageNumber, Integer entriesPerPage)
            throws LinnworksAPIException;

    GenericPagedResult<VariationGroup> searchVariationGroupsNext(BaseSession session,
                                                                 GenericPagedResult<VariationGroup> pager)
            throws LinnworksAPIException;

    List<VariationItem> getVariationItems(BaseSession session, UUID pkVariationItemId)
            throws LinnworksAPIException;

    VariationGroup createVariationGroup(BaseSession session, VariationGroupTemplate template)
            throws LinnworksAPIException;

    List<VariationItem> addVariationItems(BaseSession session, UUID pkVariationItemId, List<UUID> pkStockItemIds)
            throws LinnworksAPIException;

    Void deleteVariationItem(BaseSession session, UUID pkVariationItemId, UUID pkStockItemId)
            throws LinnworksAPIException;

    Void deleteVariationItems(BaseSession session, DeleteVariationItemsRequest request)
            throws LinnworksAPIException;

    Void deleteVariationGroup(BaseSession session, UUID pkVariationGroupId)
            throws LinnworksAPIException;

    Void deleteVariationGroups(BaseSession session, DeleteVariationGroupsRequest request)
            throws LinnworksAPIException;

    List<InventoryView> getUserSpecificViews(BaseSession session) throws LinnworksAPIException;

    Void addNewInventoryItem(BaseSession session, StockItem inventoryItem) throws LinnworksAPIException;

    Void updateInventoryItem(BaseSession session, StockItemInv inventoryItem) throws LinnworksAPIException;

    AddImageToInventoryItemResponse addImageToInventoryItem(BaseSession session, AddImageToInventoryItemRequest request)
            throws LinnworksAPIException;

    ActionRefundResponse actionRefund(BaseSession session, ActionRefundRequest request)
            throws LinnworksAPIException;
}
