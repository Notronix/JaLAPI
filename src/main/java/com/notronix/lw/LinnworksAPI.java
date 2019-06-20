package com.notronix.lw;

import com.notronix.lw.client.LinnworksAPIClient;
import com.notronix.lw.model.*;

import java.time.Instant;
import java.util.List;
import java.util.Map;

public interface LinnworksAPI
{
    SessionToken authenticateApplication(LinnworksAPIClient client, String appId, String appSecret, String authToken)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    List<StockLocation> getLocations(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    List<Channel> getChannels(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    List<Channel> getChannelsBySource(LinnworksAPIClient client, SessionToken token, String source)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    List<Category> getCategories(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    List<String> getExtendedPropertyNames(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    GetInventoryItemsResponse getInventoryItems(LinnworksAPIClient client, SessionToken token, InventoryView view, List<StockLocation> locations, Integer pageSize, Integer startIndex, Boolean preloadChilds)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    StockItemInv getInventoryItem(LinnworksAPIClient client, SessionToken token, String itemId)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    List<StockItemComposition> getCompositions(LinnworksAPIClient client, SessionToken token, String itemId, boolean fullDetails)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    List<StockItemEbayCompatibility> getEbayCompatibility(LinnworksAPIClient client, SessionToken token, String itemId)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    List<StockItemPrice> getPrices(LinnworksAPIClient client, SessionToken token, String itemId)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    List<StockItemExtendedProperty> getExtendedProperties(LinnworksAPIClient client, SessionToken token, String itemId)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    List<StockItemExtendedProperty> createExtendedProperties(LinnworksAPIClient client, SessionToken token,
                                                             List<StockItemExtendedProperty> extendedProperties)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    List<StockItemComposition> createCompositions(LinnworksAPIClient client, SessionToken token,
                                                  List<StockItemComposition> inventoryItemCompositions)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    StockItem duplicateInventoryItem(LinnworksAPIClient client, SessionToken token,
                                     StockItem newItem, String sourceItemId, boolean copyImages)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    List<StockItemExtendedProperty> updateExtendedProperties(LinnworksAPIClient client, SessionToken token,
                                                             List<StockItemExtendedProperty> extendedProperties)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    List<Country> getCountries(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    List<StockItemImage> getImages(LinnworksAPIClient client, SessionToken token, String itemId)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    GenericPagedResult<StockItem> getStockItems(LinnworksAPIClient client, SessionToken token, Integer pageSize)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    List<StockItemLevel> getLevels(LinnworksAPIClient client, SessionToken token, String itemId)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    List<GetStockLevelBatchResponse> getLevels(LinnworksAPIClient client, SessionToken token, List<String> itemIds)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    List<StockItemLevel> setLevels(LinnworksAPIClient client, SessionToken token, List<StockLevelUpdate> updates)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    Map<String, Object> updateInventoryField(LinnworksAPIClient client, SessionToken token, String itemId,
                                             InventoryField field, String value)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    Map<String, Object> updateStockField(LinnworksAPIClient client, SessionToken token, String itemId,
                                         InventoryStockField field, String value, String locationId)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    List<UserOrderView> getOrderViews(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    List<SearchField> getSearchFields(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    GenericPagedResult<ProcessedOrderWeb> searchProcessedOrdersPaged(LinnworksAPIClient client,
                                                                     SessionToken token,
                                                                     Instant from,
                                                                     Instant to,
                                                                     SearchDateType dateType,
                                                                     SearchField searchField,
                                                                     boolean exactMatch,
                                                                     String searchTerm,
                                                                     int pageNum,
                                                                     int pageSize)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    GenericPagedResult<OpenOrder> getOpenOrders(LinnworksAPIClient client, SessionToken token, int pageNum,
                                                int pageSize, String locationId)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    OrderDetails getOrderById(LinnworksAPIClient client, SessionToken token, String orderId)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    List<OrderDetails> getOrdersById(LinnworksAPIClient client, SessionToken token, List<String> orderIds)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    OpenOrder createNewOrder(LinnworksAPIClient client, SessionToken token, String fulfilmentCenterId)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    String cancelOrder(LinnworksAPIClient client, SessionToken token, String orderId, String fulfilmentCenterId,
                       Double refund, String note)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    List<RefundInfo> getRefunds(LinnworksAPIClient client, SessionToken token, String orderId)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    GetRefundOptionsResponse getRefundOptions(LinnworksAPIClient client, SessionToken token,
                                              GetRefundOptionsRequest request)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    GetRefundHeadersByOrderIdResponse getRefundHeadersByOrderId(LinnworksAPIClient client, SessionToken token,
                                                                GetRefundHeadersByOrderIdRequest request)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    GetActionableRefundHeadersResponse getActionableRefundHeaders(LinnworksAPIClient client, SessionToken token,
                                                                  GetActionableRefundHeadersRequest request)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    ActionRefundResponse actionRefund(LinnworksAPIClient client, SessionToken token, ActionRefundRequest request)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    String deleteOrder(LinnworksAPIClient client, SessionToken token, String orderId)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    OrderGeneralInfo updateOrderGeneralInfo(LinnworksAPIClient client, SessionToken token,
                                            OrderGeneralInfo info, String orderId, boolean wasDraft)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    List<String> changeOrderTag(LinnworksAPIClient client, SessionToken token, List<String> orderIds, Integer tag)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    List<String> changeOrderStatus(LinnworksAPIClient client, SessionToken token,
                                   List<String> orderIds, OrderStatus status)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    List<String> assignToFolder(LinnworksAPIClient client, SessionToken token, List<String> orderIds, String folder)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    List<String> removeFromFolder(LinnworksAPIClient client, SessionToken token, List<String> orderIds, String folder)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    OrderTotalsInfo updateOrderCustomerInfo(LinnworksAPIClient client, SessionToken token,
                                            OrderCustomerInfo info, String orderId, boolean saveToCrm)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    String createPurchaseOrder(LinnworksAPIClient client, SessionToken token, CreatePurchaseOrderParameters parameters)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    UpdatePurchaseOrderItemResponse addPurchaseOrderItem(LinnworksAPIClient client, SessionToken token,
                                                         AddPurchaseOrderItemParameter params)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    PurchaseOrderHeader changePurchaseOrderStatus(LinnworksAPIClient client, SessionToken token,
                                                  ChangePurchaseOrderStatusParameter parameters)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    UpdatePurchaseOrderItemResponse deliverPurchaseItem(LinnworksAPIClient client, SessionToken token,
                                                        DeliverPurchaseItemParameter parameters)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    PurchaseOrderNote addPurchaseOrderNote(LinnworksAPIClient client, SessionToken token, String purchaseOrderId, String note)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    List<PurchaseOrderNote> getPurchaseOrderNotes(LinnworksAPIClient client, SessionToken token, String purchaseId)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    List<Supplier> getSuppliers(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    String deletePurchaseOrder(LinnworksAPIClient client, SessionToken token, String purchaseOrderId)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    List<StockItemSupplierStat> getStockSupplierStat(LinnworksAPIClient client, SessionToken token, String inventoryItemId)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    List<StockItemChannelSKU> getChannelSKUs(LinnworksAPIClient client, SessionToken token, String itemId)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    Object createChannelSKU(LinnworksAPIClient client, SessionToken token, StockItemChannelSKU channelSKU)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    List<CurrencyConversionRate> getCurrencyConversionRates(LinnworksAPIClient client, SessionToken token,
                                                            boolean getCurrenciesFromOrders, String currency)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    VariationGroup createVariationGroup(LinnworksAPIClient client, SessionToken token, VariationGroupTemplate template)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    List<VariationItem> addVariationItems(LinnworksAPIClient client, SessionToken token, String groupId, List<String> itemIds)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    String getNewItemNumber(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    StockItemInv addNewInventoryItem(LinnworksAPIClient client, SessionToken token, StockItemInv stockItem)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    StockItemInv updateInventoryItem(LinnworksAPIClient client, SessionToken token, StockItemInv stockItem)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    List<PostalService> getPostalServices(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    List<KeyGuidValue> getPackageGroups(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    AddImageToInventoryItemResponse addImageToInventoryItem(LinnworksAPIClient client, SessionToken token,
                                                            String sku, String itemId, String imageURL, boolean isMain)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    String addOrderNote(LinnworksAPIClient client, SessionToken token, String orderId, String noteText, boolean isInternal)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    SearchPurchaseOrderResult searchPurchaseOrders(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    GetPurchaseOrderResponse getPurchaseOrder(LinnworksAPIClient client, SessionToken token, String purchaseOrderId)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    MoveToLocationResult moveOrders(LinnworksAPIClient client, SessionToken token, List<String> orderIds, String locationId)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    UpdateOrderItemResult removeOrderItem(LinnworksAPIClient client, SessionToken token,
                                          String orderId, String rowId, String fulfilmentCenterId)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    UpdateOrderItemResult addOrderItem(LinnworksAPIClient client, SessionToken token, String orderId, String itemId,
                                       String channelSKU, String fulfilmentCenterId, int quantity,
                                       LinePricingRequest linePricingRequest)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    UpdateOrderItemResult updateOrderItem(LinnworksAPIClient client, SessionToken token, String orderId,
                                          String fulfilmentCenterId, String source, String subSource, OrderItem orderItem)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;

    Map<String, List<String>> getAllExtendedPropertyNames(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException, WrongTokenException, ThrottlingException;
}
