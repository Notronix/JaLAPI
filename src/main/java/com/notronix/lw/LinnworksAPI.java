package com.notronix.lw;

import com.notronix.lw.client.LinnworksAPIClient;
import com.notronix.lw.model.*;

import java.time.LocalDateTime;
import java.util.List;

public interface LinnworksAPI
{
    SessionToken authenticateApplication(LinnworksAPIClient client, String appId, String appSecret, String authToken)
            throws LinnworksAPIException;

    List<StockLocation> getLocations(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException;

    List<Channel> getChannels(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException;

    List<Category> getCategories(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException;

    List<String> getExtendedPropertyNames(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException;

    List<Column> getColumns(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException;

    GetInventoryItemsResponse getInventoryItems(LinnworksAPIClient client, SessionToken token, InventoryView view, List<String> locations, Integer pageSize, Integer startIndex, Boolean preloadChilds)
            throws LinnworksAPIException;

    StockItemInv getInventoryItem(LinnworksAPIClient client, SessionToken token, String itemId)
            throws LinnworksAPIException;

    List<StockItemExtendedProperty> getExtendedProperties(LinnworksAPIClient client, SessionToken token, String itemId)
            throws LinnworksAPIException;

    List<Country> getCountries(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException;

    List<StockItemImage> getImages(LinnworksAPIClient client, SessionToken token, String itemId)
            throws LinnworksAPIException;

    GenericPagedResult<StockItem> getStockItems(LinnworksAPIClient client, SessionToken token, Integer pageSize)
            throws LinnworksAPIException;

    List<StockItemLevel> getLevels(LinnworksAPIClient client, SessionToken token, String itemId)
            throws LinnworksAPIException;

    List<UserOrderView> getOrderViews(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException;

    List<SearchField> getSearchFields(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException;

    GenericPagedResult<ProcessedOrderWeb> searchProcessedOrdersPaged(LinnworksAPIClient client, SessionToken token, LocalDateTime from,
                                                                     LocalDateTime to, SearchDateType dateType, SearchField searchField,
                                                                     boolean exactMatch, String searchTerm, int pageNum, int pageSize)
            throws LinnworksAPIException;

    List<OrderDetails> getOrdersById(LinnworksAPIClient client, SessionToken token, List<String> orderIds)
            throws LinnworksAPIException;

    String createPurchaseOrder(LinnworksAPIClient client, SessionToken token, CreatePurchaseOrderParameters parameters)
            throws LinnworksAPIException;

    List<Supplier> getSuppliers(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException;

    String  deletePurchaseOrder(LinnworksAPIClient client, SessionToken token, String purchaseOrderId)
            throws LinnworksAPIException;

    List<StockItemSupplierStat> getStockSupplierStat(LinnworksAPIClient client, SessionToken token, String inventoryItemId)
            throws LinnworksAPIException;

    List<StockItemChannelSKU> getChannelSKUs(LinnworksAPIClient client, SessionToken token, String itemId)
            throws LinnworksAPIException;
}