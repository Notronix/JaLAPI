package com.notronix.lw.impl;

import com.google.api.client.http.*;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.notronix.lw.api.LinnworksAPI;
import com.notronix.lw.api.LinnworksAPIException;
import com.notronix.lw.api.method.LinnworksAPIMethod;
import com.notronix.lw.api.model.*;
import com.notronix.lw.impl.json.InstantAdaptor;
import com.notronix.lw.impl.json.ListSortDirectionAdaptor;
import com.notronix.lw.impl.method.auth.AuthorizeByApplicationMethod;
import com.notronix.lw.impl.method.auth.GetServerUTCTimeMethod;
import com.notronix.lw.impl.method.inventory.*;
import com.notronix.lw.impl.method.orders.*;
import com.notronix.lw.impl.method.postalservices.GetPostalServicesMethod;
import com.notronix.lw.impl.method.processedorders.AddOrderNoteMethod;
import com.notronix.lw.impl.method.processedorders.GetRefundsMethod;
import com.notronix.lw.impl.method.processedorders.SearchProcessedOrdersPagedMethod;
import com.notronix.lw.impl.method.purchaseorder.*;
import com.notronix.lw.impl.method.returnsrefunds.*;
import com.notronix.lw.impl.method.settings.GetCurrencyConversionRatesMethod;
import com.notronix.lw.impl.method.stock.*;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import static java.util.Objects.requireNonNull;
import static org.apache.http.HttpStatus.*;

public class LinnworksDataService implements LinnworksAPI
{
    private final Object lock = new Object();
    private HttpRequestFactory requestFactory;
    private Gson updatingGSON;
    private Gson receivingGSON;

    @Override
    public BaseSession authorizeByApplication(Credentials credentials) throws LinnworksAPIException {
        return execute(new AuthorizeByApplicationMethod().withCredentials(credentials));
    }

    @Override
    public Instant getServerUTCTime(BaseSession session) throws LinnworksAPIException {
        return execute(new GetServerUTCTimeMethod().withSession(session));
    }

    @Override
    public List<StockLocation> getStockLocations(BaseSession session) throws LinnworksAPIException {
        return execute(new GetStockLocationsMethod().withSession(session));
    }

    @Override
    public List<Country> getCountries(BaseSession session) throws LinnworksAPIException {
        return execute(new GetCountriesMethod().withSession(session));
    }

    @Override
    public List<Channel> getChannels(BaseSession session) throws LinnworksAPIException {
        return execute(new GetChannelsMethod().withSession(session));
    }

    @Override
    public List<Channel> getChannelsBySource(BaseSession session, String source) throws LinnworksAPIException {
        return execute(new GetChannelsBySourceMethod().withSource(source).withSession(session));
    }

    @Override
    public List<Category> getCategories(BaseSession session) throws LinnworksAPIException {
        return execute(new GetCategoriesMethod().withSession(session));
    }

    @Override
    public List<String> getExtendedPropertyNames(BaseSession session, String propertyType)
            throws LinnworksAPIException {
        return execute(new GetExtendedPropertyNamesMethod().withPropertyType(propertyType).withSession(session));
    }

    @Override
    public StockItemInv getInventoryItemById(BaseSession session, UUID id) throws LinnworksAPIException {
        return execute(new GetInventoryItemByIdMethod().withId(id).withSession(session));
    }

    @Override
    public List<StockItemComposition> getInventoryItemCompositions(BaseSession session, UUID inventoryItemId, Boolean getFullDetail)
            throws LinnworksAPIException {
        return execute(new GetInventoryItemCompositionsMethod()
                .withInventoryItemId(inventoryItemId)
                .withGetFullDetail(getFullDetail)
                .withSession(session));
    }

    @Override
    public Void createInventoryItemCompositions(BaseSession session, List<StockItemComposition> inventoryItemCompositions)
            throws LinnworksAPIException {
        return execute(new CreateInventoryItemCompositionsMethod()
                .withInventoryItemCompositions(inventoryItemCompositions)
                .withSession(session));
    }

    @Override
    public Void deleteInventoryItemCompositions(BaseSession session, UUID stockItemId, List<UUID> inventoryItemCompositionIds)
            throws LinnworksAPIException {
        return execute(new DeleteInventoryItemCompositionsMethod()
                .withStockItemId(stockItemId)
                .withInventoryItemCompositionIds(inventoryItemCompositionIds)
                .withSession(session));
    }

    @Override
    public List<StockItemEbayCompatibility> getEbayCompatibilityList(BaseSession session, UUID stockItemId)
            throws LinnworksAPIException {
        return execute(new GetEbayCompatibilityListMethod()
                .withStockItemId(stockItemId)
                .withSession(session));
    }

    @Override
    public Void createInventoryItemPrices(BaseSession session, List<StockItemPrice> inventoryItemPrices)
            throws LinnworksAPIException {
        return execute(new CreateInventoryItemPricesMethod()
                .withInventoryItemPrices(inventoryItemPrices)
                .withSession(session));
    }

    @Override
    public List<StockItemPrice> getInventoryItemPrices(BaseSession session, UUID inventoryItemId)
            throws LinnworksAPIException {
        return execute(new GetInventoryItemPricesMethod()
                .withInventoryItemId(inventoryItemId)
                .withSession(session));
    }

    @Override
    public Void deleteInventoryItemPrices(BaseSession session, List<UUID> inventoryItemPriceIds)
            throws LinnworksAPIException {
        return execute(new DeleteInventoryItemPricesMethod()
                .withInventoryItemPriceIds(inventoryItemPriceIds)
                .withSession(session));
    }

    @Override
    public Void createInventoryItemTitles(BaseSession session, List<StockItemTitle> inventoryItemTitles)
            throws LinnworksAPIException {
        return execute(new CreateInventoryItemTitlesMethod()
                .withInventoryItemTitles(inventoryItemTitles)
                .withSession(session));
    }

    @Override
    public List<StockItemTitle> getInventoryItemTitles(BaseSession session, UUID inventoryItemId)
            throws LinnworksAPIException {
        return execute(new GetInventoryItemTitlesMethod()
                .withInventoryItemId(inventoryItemId)
                .withSession(session));
    }

    @Override
    public Void deleteInventoryItemTitles(BaseSession session, List<UUID> inventoryItemTitleIds)
            throws LinnworksAPIException {
        return execute(new DeleteInventoryItemTitlesMethod()
                .withInventoryItemTitleIds(inventoryItemTitleIds)
                .withSession(session));
    }

    @Override
    public Void createInventoryItemDescriptions(BaseSession session, List<StockItemDescription> inventoryItemDescriptions)
            throws LinnworksAPIException {
        return execute(new CreateInventoryItemDescriptionsMethod()
                .withInventoryItemDescriptions(inventoryItemDescriptions)
                .withSession(session));
    }

    @Override
    public List<StockItemDescription> getInventoryItemDescriptions(BaseSession session, UUID inventoryItemId)
            throws LinnworksAPIException {
        return execute(new GetInventoryItemDescriptionsMethod()
                .withInventoryItemId(inventoryItemId)
                .withSession(session));
    }

    @Override
    public Void deleteInventoryItemDescriptions(BaseSession session, List<UUID> inventoryItemDescriptionIds)
            throws LinnworksAPIException {
        return execute(new DeleteInventoryItemDescriptionsMethod()
                .withInventoryItemDescriptionIds(inventoryItemDescriptionIds)
                .withSession(session));
    }

    @Override
    public Void createInventoryItemExtendedProperties(BaseSession session,
                                                      List<StockItemExtendedProperty> inventoryItemExtendedProperties)
            throws LinnworksAPIException {
        return execute(new CreateInventoryItemExtendedPropertiesMethod()
                .withInventoryItemExtendedProperties(inventoryItemExtendedProperties)
                .withSession(session));
    }

    @Override
    public List<StockItemExtendedProperty> getInventoryItemExtendedProperties(BaseSession session,
                                                                              UUID inventoryItemId,
                                                                              GetExtendedPropertyFilter propertyParams)
            throws LinnworksAPIException {
        return execute(new GetInventoryItemExtendedPropertiesMethod()
                .withInventoryItemId(inventoryItemId)
                .withPropertyParams(propertyParams)
                .withSession(session));
    }

    @Override
    public Void deleteInventoryItemExtendedProperties(BaseSession session, UUID inventoryItemId,
                                                      List<UUID> inventoryItemExtendedPropertyIds)
            throws LinnworksAPIException {
        return execute(new DeleteInventoryItemExtendedPropertiesMethod()
                .withInventoryItemId(inventoryItemId)
                .withInventoryItemExtendedPropertyIds(inventoryItemExtendedPropertyIds)
                .withSession(session));
    }

    @Override
    public Void updateInventoryItemExtendedProperties(BaseSession session,
                                                      List<StockItemExtendedProperty> inventoryItemExtendedProperties)
            throws LinnworksAPIException {
        return execute(new UpdateInventoryItemExtendedPropertiesMethod()
                .withInventoryItemExtendedProperties(inventoryItemExtendedProperties)
                .withSession(session));
    }

    @Override
    public Map<String, List<String>> getAllExtendedPropertyNames(BaseSession session) throws LinnworksAPIException {
        return execute(new GetAllExtendedPropertyNamesMethod().withSession(session));
    }

    @Override
    public Void duplicateInventoryItem(BaseSession session, StockItem inventoryItem, UUID sourceItemId, Boolean copyImages)
            throws LinnworksAPIException {
        return execute(new DuplicateInventoryItemMethod()
                .withInventoryItem(inventoryItem)
                .withSourceItemId(sourceItemId)
                .withCopyImages(copyImages)
                .withSession(session));
    }

    @Override
    public Void deleteInventoryItems(BaseSession session, List<UUID> inventoryItemIds) throws LinnworksAPIException {
        return execute(new DeleteInventoryItemsMethod().withInventoryItemIds(inventoryItemIds).withSession(session));
    }

    @Override
    public List<StockItemImage> getInventoryItemImages(BaseSession session, UUID inventoryItemId)
            throws LinnworksAPIException {
        return execute(new GetInventoryItemImagesMethod().withInventoryItemId(inventoryItemId).withSession(session));
    }

    @Override
    public List<StockItemLevel> getStockLevel(BaseSession session, UUID stockItemId) throws LinnworksAPIException {
        return execute(new GetStockLevelMethod().withStockItemId(stockItemId).withSession(session));
    }

    @Override
    public List<GetStockLevelBatchResponse> getStockLevelBatch(BaseSession session, GetStockLevelBatchRequest request)
            throws LinnworksAPIException {
        return execute(new GetStockLevelBatchMethod().withRequest(request).withSession(session));
    }

    @Override
    public List<StockItemLevel> setStockLevel(BaseSession session, List<StockLevelUpdate> stockLevels, String changeSource)
            throws LinnworksAPIException {
        return execute(new SetStockLevelMethod()
                .withStockLevels(stockLevels)
                .withChangeSource(changeSource)
                .withSession(session));
    }

    @Override
    public GenericPagedResult<StockItem> getStockItems(BaseSession session, String keyWord, UUID locationId,
                                                       Integer entriesPerPage, Integer pageNumber, Boolean excludeComposites,
                                                       Boolean excludeVariations, Boolean excludeBatches)
            throws LinnworksAPIException {
        return execute(new GetStockItemsMethod()
                .withKeyWord(keyWord)
                .withLocationId(locationId)
                .withEntriesPerPage(entriesPerPage)
                .withPageNumber(pageNumber)
                .withExcludeComposites(excludeComposites)
                .withExcludeVariations(excludeVariations)
                .withExcludeBatches(excludeBatches)
                .withSession(session));
    }

    @Override
    public GenericPagedResult<StockItem> getStockItemsNext(BaseSession session, GenericPagedResult<StockItem> pager)
            throws LinnworksAPIException {
        return execute(requireNonNull(pager).getNextPage(new GetStockItemsMethod().withSession(session)));
    }

    @Override
    public Map<String, Object> updateInventoryItemField(BaseSession session, UUID inventoryItemId,
                                                        ColumnNameType fieldName, String fieldValue)
            throws LinnworksAPIException {
        return execute(new UpdateInventoryItemFieldMethod()
                .withInventoryItemId(inventoryItemId)
                .withFieldName(fieldName)
                .withFieldValue(fieldValue)
                .withSession(session));
    }

    @Override
    public Map<String, Object> updateInventoryItemStockField(BaseSession session, UUID inventoryItemId,
                                                             ColumnNameType fieldName, String fieldValue,
                                                             UUID locationId, String changeSource)
            throws LinnworksAPIException {
        return execute(new UpdateInventoryItemStockFieldMethod()
                .withInventoryItemId(inventoryItemId)
                .withFieldName(fieldName)
                .withFieldValue(fieldValue)
                .withLocationId(locationId)
                .withChangeSource(changeSource)
                .withSession(session));
    }

    @Override
    public List<UserOrderView> getOrderViews(BaseSession session) throws LinnworksAPIException {
        return execute(new GetOrderViewsMethod().withSession(session));
    }

    @Override
    public List<SearchField> getSearchTypes(BaseSession session, HistoryType historyType) throws LinnworksAPIException {
        return execute(new GetSearchTypesMethod().withHistoryType(historyType).withSession(session));
    }

    @Override
    public GenericPagedResult<ProcessedOrderWeb> searchProcessedOrdersPaged(BaseSession session, Instant from, Instant to,
                                                                            SearchDateType dateType, SearchField searchField,
                                                                            Boolean exactMatch, String searchTerm,
                                                                            Integer pageNum, Integer numEntriesPerPage)
            throws LinnworksAPIException {
        return execute(new SearchProcessedOrdersPagedMethod()
                .withFrom(from).withTo(to).withDateType(dateType)
                .withSearchField(searchField).withExactMatch(exactMatch).withSearchTerm(searchTerm)
                .withPageNum(pageNum).withNumEntriesPerPage(numEntriesPerPage)
                .withSession(session));
    }

    @Override
    public GenericPagedResult<ProcessedOrderWeb> searchProcessedOrdersPagedNext(BaseSession session,
                                                                                GenericPagedResult<ProcessedOrderWeb> pager)
            throws LinnworksAPIException {
        return execute(requireNonNull(pager).getNextPage(new SearchProcessedOrdersPagedMethod().withSession(session)));
    }

    @Override
    public GenericPagedResult<OpenOrder> getOpenOrders(BaseSession session, Integer entriesPerPage, Integer pageNumber,
                                                       FieldsFilter filters, List<FieldSorting> sorting,
                                                       UUID fulfilmentCenter, String additionalFilter)
            throws LinnworksAPIException {
        return execute(new GetOpenOrdersMethod()
                .withEntriesPerPage(entriesPerPage)
                .withPageNumber(pageNumber)
                .withFilters(filters)
                .withSorting(sorting)
                .withFulfilmentCenter(fulfilmentCenter)
                .withAdditionalFilter(additionalFilter)
                .withSession(session));
    }

    @Override
    public GenericPagedResult<OpenOrder> getOpenOrdersNext(BaseSession session, GenericPagedResult<OpenOrder> pager)
            throws LinnworksAPIException {
        return execute(requireNonNull(pager).getNextPage(new GetOpenOrdersMethod().withSession(session)));
    }

    @Override
    public OrderDetails getOrderById(BaseSession session, UUID pkOrderId) throws LinnworksAPIException {
        return execute(new GetOrderByIdMethod().withPkOrderId(pkOrderId).withSession(session));
    }

    @Override
    public List<OrderDetails> getOrdersById(BaseSession session, List<UUID> pkOrderIds) throws LinnworksAPIException {
        return execute(new GetOrdersByIdMethod().withPkOrderIds(pkOrderIds).withSession(session));
    }

    @Override
    public List<Supplier> getSuppliers(BaseSession session) throws LinnworksAPIException {
        return execute(new GetSuppliersMethod().withSession(session));
    }

    @Override
    public List<StockItemSupplierStat> getStockSupplierStat(BaseSession session, UUID inventoryItemId)
            throws LinnworksAPIException {
        return execute(new GetStockSupplierStatMethod().withInventoryItemId(inventoryItemId).withSession(session));
    }

    @Override
    public List<StockItemChannelSKU> getInventoryItemChannelSKUs(BaseSession session, UUID inventoryItemId)
            throws LinnworksAPIException {
        return execute(new GetInventoryItemChannelSKUsMethod().withInventoryItemId(inventoryItemId).withSession(session));
    }

    @Override
    public Void createInventoryItemChannelSKUs(BaseSession session, List<StockItemChannelSKU> inventoryItemChannelSKUs)
            throws LinnworksAPIException {
        return execute(new CreateInventoryItemChannelSKUsMethod()
                .withInventoryItemChannelSKUs(inventoryItemChannelSKUs)
                .withSession(session));
    }

    @Override
    public Void deleteInventoryItemChannelSKUs(BaseSession session, List<UUID> inventoryItemChannelSKUIds)
            throws LinnworksAPIException {
        return execute(new DeleteInventoryItemChannelSKUsMethod()
                .withInventoryItemChannelSKUIds(inventoryItemChannelSKUIds)
                .withSession(session));
    }

    @Override
    public List<CurrencyConversionRate> getCurrencyConversionRates(BaseSession session,
                                                                   GetConversionRatesRequest requestParams)
            throws LinnworksAPIException {
        return execute(new GetCurrencyConversionRatesMethod().withRequestParams(requestParams).withSession(session));
    }

    @Override
    public String getNewItemNumber(BaseSession session) throws LinnworksAPIException {
        return execute(new GetNewItemNumberMethod().withSession(session));
    }

    @Override
    public List<KeyGuidValue> getPackageGroups(BaseSession session) throws LinnworksAPIException {
        return execute(new GetPackageGroupsMethod().withSession(session));
    }

    @Override
    public List<PostalServiceWithChannelAndShippingLinks> getPostalServices(BaseSession session)
            throws LinnworksAPIException {
        return execute(new GetPostalServicesMethod().withSession(session));
    }

    @Override
    public SearchPurchaseOrdersResult searchPurchaseOrders(BaseSession session,
                                                           SearchPurchaseOrderParameter searchParameter)
            throws LinnworksAPIException {
        return execute(new SearchPurchaseOrdersMethod().withSearchParameter(searchParameter).withSession(session));
    }

    @Override
    public SearchPurchaseOrdersResult searchPurchaseOrdersNext(BaseSession session, SearchPurchaseOrdersResult pager)
            throws LinnworksAPIException {
        return execute(requireNonNull(pager).getNextPage(new SearchPurchaseOrdersMethod().withSession(session)));
    }

    @Override
    public GetPurchaseOrderResponse getPurchaseOrder(BaseSession session, UUID pkPurchaseId)
            throws LinnworksAPIException {
        return execute(new GetPurchaseOrderMethod().withPkPurchaseId(pkPurchaseId).withSession(session));
    }

    @Override
    public UUID createPurchaseOrderInitial(BaseSession session, CreatePurchaseOrderInitialParameter createParameters)
            throws LinnworksAPIException {
        return execute(new CreatePurchaseOrderInitialMethod()
                .withCreateParameters(createParameters)
                .withSession(session));
    }

    @Override
    public UpdatePurchaseOrderItemResponse addPurchaseOrderItem(BaseSession session,
                                                                AddPurchaseOrderItemParameter addItemParameter)
            throws LinnworksAPIException {
        return execute(new AddPurchaseOrderItemMethod().withAddItemParameter(addItemParameter).withSession(session));
    }

    @Override
    public PurchaseOrderHeader changePurchaseOrderStatus(BaseSession session,
                                                         ChangePurchaseOrderStatusParameter changeStatusParameter)
            throws LinnworksAPIException {
        return execute(new ChangePurchaseOrderStatusMethod()
                .withChangeStatusParameter(changeStatusParameter)
                .withSession(session));
    }

    @Override
    public UpdatePurchaseOrderItemResponse deliverPurchaseItem(BaseSession session,
                                                               DeliverPurchaseItemParameter deliverItemParameter)
            throws LinnworksAPIException {
        return execute(new DeliverPurchaseItemMethod()
                .withDeliverItemParameter(deliverItemParameter)
                .withSession(session));
    }

    @Override
    public PurchaseOrderNote addPurchaseOrderNote(BaseSession session, UUID pkPurchaseId, String note)
            throws LinnworksAPIException {
        return execute(new AddPurchaseOrderNoteMethod().withPkPurchaseId(pkPurchaseId).withNote(note).withSession(session));
    }

    @Override
    public List<PurchaseOrderNote> getPurchaseOrderNote(BaseSession session, UUID pkPurchaseId)
            throws LinnworksAPIException {
        return execute(new GetPurchaseOrderNoteMethod().withPkPurchaseId(pkPurchaseId).withSession(session));
    }

    @Override
    public Void deletePurchaseOrder(BaseSession session, UUID pkPurchaseId) throws LinnworksAPIException {
        return execute(new DeletePurchaseOrderMethod().withPkPurchaseId(pkPurchaseId).withSession(session));
    }

    @Override
    public List<RefundInfo> getRefunds(BaseSession session, UUID pkOrderId) throws LinnworksAPIException {
        return execute(new GetRefundsMethod().withPkOrderId(pkOrderId).withSession(session));
    }

    @Override
    public GetRefundOptionsResponse getRefundOptions(BaseSession session, GetRefundOptionsRequest request)
            throws LinnworksAPIException {
        return execute(new GetRefundOptionsMethod().withRequest(request).withSession(session));
    }

    @Override
    public GetRefundHeadersByOrderIdResponse getRefundHeadersByOrderId(BaseSession session,
                                                                       GetRefundHeadersByOrderIdRequest request)
            throws LinnworksAPIException {
        return execute(new GetRefundHeadersByOrderIdMethod().withRequest(request).withSession(session));
    }

    @Override
    public GetActionableRefundHeadersResponse getActionableRefundHeaders(BaseSession session,
                                                                         GetActionableRefundHeadersRequest request)
            throws LinnworksAPIException {
        return execute(new GetActionableRefundHeadersMethod().withRequest(request).withSession(session));
    }

    @Override
    public GetActionableRefundHeadersResponse getActionableRefundHeadersNext(BaseSession session,
                                                                             GetActionableRefundHeadersResponse pager)
            throws LinnworksAPIException {
        return execute(requireNonNull(pager).getNextPage(new GetActionableRefundHeadersMethod().withSession(session)));
    }

    @Override
    public OpenOrder createNewOrder(BaseSession session, UUID fulfilmentCenter, Boolean createAsDraft)
            throws LinnworksAPIException {
        return execute(new CreateNewOrderMethod()
                .withFulfilmentCenter(fulfilmentCenter).withCreateAsDraft(createAsDraft).withSession(session));
    }

    @Override
    public List<UUID> createOrders(BaseSession session, String location, List<ChannelOrder> orders)
            throws LinnworksAPIException {
        return execute(new CreateOrdersMethod()
                .withLocation(location).withOrders(orders).withSession(session));
    }

    @Override
    public String completeOrder(BaseSession session, UUID orderId) throws LinnworksAPIException {
        return execute(new CompleteOrderMethod().withOrderId(orderId).withSession(session));
    }

    @Override
    public Void setOrderGeneralInfo(BaseSession session, UUID orderId, OrderGeneralInfo info, Boolean wasDraft)
            throws LinnworksAPIException {
        return execute(new SetOrderGeneralInfoMethod()
                .withOrderId(orderId).withInfo(info).withWasDraft(wasDraft).withSession(session));
    }

    @Override
    public OrderTotalsInfo setOrderCustomerInfo(BaseSession session, UUID orderId, OrderCustomerInfo info, Boolean saveToCrm)
            throws LinnworksAPIException {
        return execute(new SetOrderCustomerInfoMethod()
                .withOrderId(orderId).withInfo(info).withSaveToCrm(saveToCrm).withSession(session));
    }

    @Override
    public List<UUID> changeOrderTag(BaseSession session, List<UUID> orderIds, Integer tag)
            throws LinnworksAPIException {
        return execute(new ChangeOrderTagMethod().withOrderIds(orderIds).withTag(tag).withSession(session));
    }

    @Override
    public List<UUID> changeStatus(BaseSession session, List<UUID> orderIds, Integer status)
            throws LinnworksAPIException {
        return execute(new ChangeStatusMethod().withOrderIds(orderIds).withStatus(status).withSession(session));
    }

    @Override
    public Void lockOrder(BaseSession session, List<UUID> orderIds, Boolean lockOrder)
            throws LinnworksAPIException {
        return execute(new LockOrderMethod().withOrderIds(orderIds).withLockOrder(lockOrder).withSession(session));
    }

    @Override
    public List<UUID> assignToFolder(BaseSession session, List<UUID> orderIds, String folder)
            throws LinnworksAPIException {
        return execute(new AssignToFolderMethod().withOrderIds(orderIds).withFolder(folder).withSession(session));
    }

    @Override
    public List<UUID> unassignToFolder(BaseSession session, List<UUID> orderIds, String folder)
            throws LinnworksAPIException {
        return execute(new UnassignToFolderMethod().withOrderIds(orderIds).withFolder(folder).withSession(session));
    }

    @Override
    public UUID addOrderNote(BaseSession session, UUID pkOrderID, String noteText, Boolean isInternal)
            throws LinnworksAPIException {
        return execute(new AddOrderNoteMethod()
                .withPkOrderId(pkOrderID).withNoteText(noteText).withIsInternal(isInternal).withSession(session));
    }

    @Override
    public UpdateOrderItemResult addOrderItem(BaseSession session, UUID orderId, UUID itemId, String channelSKU,
                                              UUID fulfilmentCenter, Integer quantity, LinePricingRequest linePricing)
            throws LinnworksAPIException {
        return execute(new AddOrderItemMethod().withOrderId(orderId).withItemId(itemId).withChannelSKU(channelSKU)
                .withFulfilmentCenter(fulfilmentCenter).withQuantity(quantity).withLinePricing(linePricing)
                .withSession(session));
    }

    @Override
    public UpdateOrderItemResult updateOrderItem(BaseSession session, UUID orderId, OrderItem orderItem,
                                                 UUID fulfilmentCenter, String source, String subSource)
            throws LinnworksAPIException {
        return execute(new UpdateOrderItemMethod().withOrderId(orderId).withOrderItem(orderItem)
                .withFulfilmentCenter(fulfilmentCenter).withSource(source).withSubSource(subSource).withSession(session));
    }

    @Override
    public UpdateOrderItemResult removeOrderItem(BaseSession session, UUID orderId, UUID rowId, UUID fulfilmentCenter)
            throws LinnworksAPIException {
        return execute(new RemoveOrderItemMethod().withOrderId(orderId).withRowId(rowId)
                .withFulfilmentCenter(fulfilmentCenter).withSession(session));
    }

    @Override
    public MoveToLocationResult moveToLocation(BaseSession session, List<UUID> orderIds, UUID pkStockLocationId)
            throws LinnworksAPIException {
        return execute(new MoveToLocationMethod().withOrderIds(orderIds).withPkStockLocationId(pkStockLocationId)
                .withSession(session));
    }

    @Override
    public String cancelOrder(BaseSession session, UUID orderId, UUID fulfilmentCenter, Double refund, String note)
            throws LinnworksAPIException {
        return execute(new CancelOrderMethod().withOrderId(orderId).withFulfilmentCenter(fulfilmentCenter)
                .withRefund(refund).withNote(note).withSession(session));
    }

    @Override
    public Void deleteOrder(BaseSession session, UUID orderId) throws LinnworksAPIException {
        return execute(new DeleteOrderMethod().withOrderId(orderId).withSession(session));
    }

    @Override
    public GenericPagedResult<VariationGroup> searchVariationGroups(BaseSession session, VariationSearchType searchType,
                                                                    String searchText, Integer pageNumber,
                                                                    Integer entriesPerPage)
            throws LinnworksAPIException {
        return execute(new SearchVariationGroupsMethod().withSearchType(searchType).withSearchText(searchText)
                .withPageNumber(pageNumber).withEntriesPerPage(entriesPerPage).withSession(session));
    }

    @Override
    public GenericPagedResult<VariationGroup> searchVariationGroupsNext(BaseSession session,
                                                                        GenericPagedResult<VariationGroup> pager)
            throws LinnworksAPIException {
        return execute(requireNonNull(pager).getNextPage(new SearchVariationGroupsMethod().withSession(session)));
    }

    @Override
    public VariationGroup createVariationGroup(BaseSession session, VariationGroupTemplate template)
            throws LinnworksAPIException {
        return execute(new CreateVariationGroupMethod().withTemplate(template).withSession(session));
    }

    @Override
    public List<VariationItem> getVariationItems(BaseSession session, UUID pkVariationItemId)
            throws LinnworksAPIException {
        return execute(new GetVariationItemsMethod().withPkVariationItemId(pkVariationItemId).withSession(session));
    }

    @Override
    public List<VariationItem> addVariationItems(BaseSession session, UUID pkVariationItemId, List<UUID> pkStockItemIds)
            throws LinnworksAPIException {
        return execute(new AddVariationItemsMethod().withPkVariationItemId(pkVariationItemId)
                .withPkStockItemIds(pkStockItemIds).withSession(session));
    }

    @Override
    public Void deleteVariationItem(BaseSession session, UUID pkVariationItemId, UUID pkStockItemId)
            throws LinnworksAPIException {
        return execute(new DeleteVariationItemMethod().withPkVariationItemId(pkVariationItemId)
                .withPkStockItemId(pkStockItemId).withSession(session));
    }

    @Override
    public Void deleteVariationItems(BaseSession session, DeleteVariationItemsRequest request)
            throws LinnworksAPIException {
        return execute(new DeleteVariationItemsMethod().withRequest(request).withSession(session));
    }

    @Override
    public Void deleteVariationGroup(BaseSession session, UUID pkVariationGroupId) throws LinnworksAPIException {
        return execute(new DeleteVariationGroupMethod().withPkVariationGroupId(pkVariationGroupId).withSession(session));
    }

    @Override
    public Void deleteVariationGroups(BaseSession session, DeleteVariationGroupsRequest request)
            throws LinnworksAPIException {
        return execute(new DeleteVariationGroupsMethod().withRequest(request).withSession(session));
    }

    @Override
    public List<InventoryView> getUserSpecificViews(BaseSession session) throws LinnworksAPIException {
        return execute(new GetUserSpecificViewsMethod().withSession(session));
    }

    @Override
    public Void addNewInventoryItem(BaseSession session, StockItem inventoryItem) throws LinnworksAPIException {
        return execute(new AddNewInventoryItemMethod().withInventoryItem(inventoryItem).withSession(session));
    }

    @Override
    public Void updateInventoryItem(BaseSession session, StockItemInv inventoryItem) throws LinnworksAPIException {
        return execute(new UpdateInventoryItemMethod().withInventoryItem(inventoryItem).withSession(session));
    }

    @Override
    public AddImageToInventoryItemResponse addImageToInventoryItem(BaseSession session,
                                                                   AddImageToInventoryItemRequest request)
            throws LinnworksAPIException {
        return execute(new AddImageToInventoryItemMethod().withRequest(request).withSession(session));
    }

    @Override
    public ActionRefundResponse actionRefund(BaseSession session, ActionRefundRequest request)
            throws LinnworksAPIException {
        return execute(new ActionRefundMethod().withRequest(request).withSession(session));
    }

    private <Result> Result execute(LinnworksAPIMethod<Result> method) throws LinnworksAPIException {
        HttpRequest request = configureRequest(method);
        try {
            int statusCode;
            String reason;
            String payload;

            HttpResponse response = request.execute();

            try {
                response.setContentLoggingLimit(0);
                statusCode = response.getStatusCode();
                reason = response.getStatusMessage();
                payload = response.parseAsString();
            }
            finally {
                response.disconnect();
            }

            if (requestFailed(statusCode)) {
                if (payload != null && payload.toLowerCase().contains("token is wrong")) {
                    throw new LinnworksAPIException(payload).dueToWrongToken();
                }
                else if (payload != null && payload.toLowerCase().contains("api calls quota exceeded")) {
                    throw new LinnworksAPIException(payload).dueToThrottling();
                }
                else {
                    throw new LinnworksAPIException("API call failed" + ". Code: " + statusCode + ", Reason: " + reason
                            + ", Details: " + payload);
                }
            }

            return method.getResponse(getReceivingGSON(), payload);
        }
        catch (Exception ex) {
            throw new LinnworksAPIException("Linnworks request failed.", ex);
        }
    }

    private HttpRequest configureRequest(LinnworksAPIMethod method) throws LinnworksAPIException {
        try {
            BaseSession session = method.getSession();
            String httpMethod = method.getRequestMethod();
            HttpContent content = method.getContent(getUpdatingGSON());

            GenericUrl url = new GenericUrl(method.getURL());
            HttpRequest request = getRequestFactory().buildRequest(httpMethod, url, content);

            if (session != null) {
                request.getHeaders().setAuthorization(session.getToken());
            }

            return request;
        }
        catch (Exception ex) {
            throw new LinnworksAPIException("An error occurred trying to configure request.", ex);
        }
    }

    private boolean requestFailed(int statusCode) {
        return statusCode != SC_OK && statusCode != SC_CREATED && statusCode != SC_ACCEPTED && statusCode != SC_NO_CONTENT;
    }

    private HttpRequestFactory getRequestFactory() {
        if (requestFactory != null) {
            return requestFactory;
        }

        synchronized (lock) {
            if (requestFactory != null) {
                return requestFactory;
            }

            requestFactory = new NetHttpTransport().createRequestFactory();
        }

        return requestFactory;
    }

    private Gson getUpdatingGSON() {
        if (updatingGSON != null) {
            return updatingGSON;
        }

        synchronized (lock) {
            if (updatingGSON != null) {
                return updatingGSON;
            }

            updatingGSON = new GsonBuilder().setVersion(0)
                    .registerTypeAdapter(ListSortDirection.class, new ListSortDirectionAdaptor().nullSafe())
                    .registerTypeAdapter(Instant.class, new InstantAdaptor().nullSafe())
                    .create();
        }

        return updatingGSON;
    }

    private Gson getReceivingGSON() {
        if (receivingGSON != null) {
            return receivingGSON;
        }

        synchronized (lock) {
            if (receivingGSON != null) {
                return receivingGSON;
            }

            receivingGSON = new GsonBuilder()
                    .registerTypeAdapter(ListSortDirection.class, new ListSortDirectionAdaptor())
                    .registerTypeAdapter(Instant.class, new InstantAdaptor())
                    .create();
        }

        return receivingGSON;
    }
}
