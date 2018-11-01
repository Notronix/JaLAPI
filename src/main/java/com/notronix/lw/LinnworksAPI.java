package com.notronix.lw;

import com.notronix.lw.client.LinnworksAPIClient;
import com.notronix.lw.model.*;

import java.time.Instant;
import java.util.List;
import java.util.Map;

public interface LinnworksAPI {
    SessionToken authenticateApplication(LinnworksAPIClient client, String appId, String appSecret, String authToken)
            throws LinnworksAPIException, WrongTokenException;

    List<StockLocation> getLocations(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException, WrongTokenException;

    List<Channel> getChannels(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException, WrongTokenException;

    List<Category> getCategories(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException, WrongTokenException;

    List<String> getExtendedPropertyNames(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException, WrongTokenException;

    GetInventoryItemsResponse getInventoryItems(LinnworksAPIClient client, SessionToken token, InventoryView view, List<StockLocation> locations, Integer pageSize, Integer startIndex, Boolean preloadChilds)
            throws LinnworksAPIException, WrongTokenException;

    StockItemInv getInventoryItem(LinnworksAPIClient client, SessionToken token, String itemId)
            throws LinnworksAPIException, WrongTokenException;

    List<StockItemComposition> getCompositions(LinnworksAPIClient client, SessionToken token, String itemId, boolean fullDetails)
            throws LinnworksAPIException, WrongTokenException;

    List<StockItemEbayCompatibility> getEbayCompatibility(LinnworksAPIClient client, SessionToken token, String itemId)
            throws LinnworksAPIException, WrongTokenException;

    List<StockItemPrice> getPrices(LinnworksAPIClient client, SessionToken token, String itemId)
            throws LinnworksAPIException, WrongTokenException;

    List<StockItemExtendedProperty> getExtendedProperties(LinnworksAPIClient client, SessionToken token, String itemId)
            throws LinnworksAPIException, WrongTokenException;

    List<StockItemExtendedProperty> createExtendedProperties(LinnworksAPIClient client, SessionToken token,
                                                             List<StockItemExtendedProperty> extendedProperties)
            throws LinnworksAPIException, WrongTokenException;

    List<StockItemExtendedProperty> updateExtendedProperties(LinnworksAPIClient client, SessionToken token,
                                                             List<StockItemExtendedProperty> extendedProperties)
            throws LinnworksAPIException, WrongTokenException;

    List<Country> getCountries(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException, WrongTokenException;

    List<StockItemImage> getImages(LinnworksAPIClient client, SessionToken token, String itemId)
            throws LinnworksAPIException, WrongTokenException;

    GenericPagedResult<StockItem> getStockItems(LinnworksAPIClient client, SessionToken token, Integer pageSize)
            throws LinnworksAPIException, WrongTokenException;

    List<StockItemLevel> getLevels(LinnworksAPIClient client, SessionToken token, String itemId)
            throws LinnworksAPIException, WrongTokenException;

    List<StockItemLevel> setLevels(LinnworksAPIClient client, SessionToken token, List<StockLevelUpdate> updates)
            throws LinnworksAPIException, WrongTokenException;

    Map<String, Object> updateInventoryField(LinnworksAPIClient client, SessionToken token, String itemId,
                                             InventoryField field, String value)
            throws LinnworksAPIException, WrongTokenException;

    Map<String, Object> updateStockField(LinnworksAPIClient client, SessionToken token, String itemId,
                                         InventoryStockField field, String value, String locationId)
            throws LinnworksAPIException, WrongTokenException;

    List<UserOrderView> getOrderViews(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException, WrongTokenException;

    List<SearchField> getSearchFields(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException, WrongTokenException;

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
            throws LinnworksAPIException, WrongTokenException;

    GenericPagedResult<OpenOrder> getOpenOrders(LinnworksAPIClient client, SessionToken token, int pageNum,
                                                int pageSize, String locationId)
            throws LinnworksAPIException, WrongTokenException;

    OrderDetails getOrderById(LinnworksAPIClient client, SessionToken token, String orderId)
            throws LinnworksAPIException, WrongTokenException;

    List<OrderDetails> getOrdersById(LinnworksAPIClient client, SessionToken token, List<String> orderIds)
            throws LinnworksAPIException, WrongTokenException;

    OpenOrder createNewOrder(LinnworksAPIClient client, SessionToken token, String fulfilmentCenterId)
            throws LinnworksAPIException, WrongTokenException;

    String cancelOrder(LinnworksAPIClient client, SessionToken token, String orderId, String fulfilmentCenterId,
                       Double refund, String note)
            throws LinnworksAPIException, WrongTokenException;

    String deleteOrder(LinnworksAPIClient client, SessionToken token, String orderId)
            throws LinnworksAPIException, WrongTokenException;

    OrderGeneralInfo updateOrderGeneralInfo(LinnworksAPIClient client, SessionToken token,
                                            OrderGeneralInfo info, String orderId, boolean wasDraft)
            throws LinnworksAPIException, WrongTokenException;

    OrderTotalsInfo updateOrderCustomerInfo(LinnworksAPIClient client, SessionToken token,
                                            OrderCustomerInfo info, String orderId, boolean saveToCrm)
            throws LinnworksAPIException, WrongTokenException;

    String createPurchaseOrder(LinnworksAPIClient client, SessionToken token, CreatePurchaseOrderParameters parameters)
            throws LinnworksAPIException, WrongTokenException;

    List<Supplier> getSuppliers(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException, WrongTokenException;

    String deletePurchaseOrder(LinnworksAPIClient client, SessionToken token, String purchaseOrderId)
            throws LinnworksAPIException, WrongTokenException;

    List<StockItemSupplierStat> getStockSupplierStat(LinnworksAPIClient client, SessionToken token, String inventoryItemId)
            throws LinnworksAPIException, WrongTokenException;

    List<StockItemChannelSKU> getChannelSKUs(LinnworksAPIClient client, SessionToken token, String itemId)
            throws LinnworksAPIException, WrongTokenException;

    Object createChannelSKU(LinnworksAPIClient client, SessionToken token, StockItemChannelSKU channelSKU)
            throws LinnworksAPIException, WrongTokenException;

    List<CurrencyConversionRate> getCurrencyConversionRates(LinnworksAPIClient client, SessionToken token, boolean getCurrenciesFromOrders, String currency)
            throws LinnworksAPIException, WrongTokenException;

    String getNewItemNumber(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException, WrongTokenException;

    StockItemInv addNewInventoryItem(LinnworksAPIClient client, SessionToken token, StockItemInv stockItem)
            throws LinnworksAPIException, WrongTokenException;

    StockItemInv updateInventoryItem(LinnworksAPIClient client, SessionToken token, StockItemInv stockItem)
            throws LinnworksAPIException, WrongTokenException;

    List<PostalService> getPostalServices(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException, WrongTokenException;

    List<KeyGuidValue> getPackageGroups(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException, WrongTokenException;

    AddImageToInventoryItemResponse addImageToInventoryItem(LinnworksAPIClient client, SessionToken token,
                                                            String sku, String itemId, String imageURL, boolean isMain)
            throws LinnworksAPIException, WrongTokenException;

    String addOrderNote(LinnworksAPIClient client, SessionToken token, String orderId, String noteText, boolean isInternal)
            throws LinnworksAPIException, WrongTokenException;

    SearchPurchaseOrderResult searchPurchaseOrders(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException, WrongTokenException;

    GetPurchaseOrderResponse getPurchaseOrder(LinnworksAPIClient client, SessionToken token, String purchaseOrderId)
            throws LinnworksAPIException, WrongTokenException;

    MoveToLocationResult moveOrders(LinnworksAPIClient client, SessionToken token, List<String> orderIds, String locationId)
            throws LinnworksAPIException, WrongTokenException;

    UpdateOrderItemResult removeOrderItem(LinnworksAPIClient client, SessionToken token,
                                          String orderId, String rowId, String fulfilmentCenterId)
            throws LinnworksAPIException, WrongTokenException;

    UpdateOrderItemResult addOrderItem(LinnworksAPIClient client, SessionToken token, String orderId, String itemId,
                                       String channelSKU, String fulfilmentCenterId, int quantity,
                                       LinePricingRequest linePricingRequest)
            throws LinnworksAPIException, WrongTokenException;

    UpdateOrderItemResult updateOrderItem(LinnworksAPIClient client, SessionToken token, String orderId,
                                          String fulfilmentCenterId, String source, String subSource, OrderItem orderItem)
            throws LinnworksAPIException, WrongTokenException;

    Map<String, List<String>> getAllExtendedPropertyNames(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException, WrongTokenException;
}
