package com.notronix.lw;

import com.notronix.lw.client.LinnworksAPIClient;
import com.notronix.lw.methods.Method;
import com.notronix.lw.methods.auth.AuthorizeByApplicationMethod;
import com.notronix.lw.methods.inventory.*;
import com.notronix.lw.methods.orders.*;
import com.notronix.lw.methods.postalservices.GetPostalServicesMethod;
import com.notronix.lw.methods.processedorders.AddOrderNoteMethod;
import com.notronix.lw.methods.processedorders.SearchProcessedOrdersPagedMethod;
import com.notronix.lw.methods.purchaseorder.CreatePurchaseOrderInitialMethod;
import com.notronix.lw.methods.purchaseorder.DeletePurchaseOrderMethod;
import com.notronix.lw.methods.purchaseorder.GetPurchaseOrderMethod;
import com.notronix.lw.methods.purchaseorder.SearchPurchaseOrdersMethod;
import com.notronix.lw.methods.returnsrefunds.GetSearchTypesMethod;
import com.notronix.lw.methods.settings.GetCurrencyConversionRatesMethod;
import com.notronix.lw.methods.stock.GetStockItemsMethod;
import com.notronix.lw.methods.stock.GetStockLevelMethod;
import com.notronix.lw.methods.stock.SetStockLevelMethod;
import com.notronix.lw.model.*;

import java.time.Instant;
import java.util.List;
import java.util.Map;

import static java.util.Objects.requireNonNull;

public class LinnworksAPIImpl implements LinnworksAPI
{
    @Override
    public SessionToken authenticateApplication(LinnworksAPIClient client, String appId, String appSecret, String authToken)
            throws LinnworksAPIException, WrongTokenException {
        AuthorizeByApplicationMethod method = new AuthorizeByApplicationMethod();
        method.setHost("https://api.linnworks.net");
        method.setAppId(appId);
        method.setAppSecret(appSecret);
        method.setAuthToken(authToken);

        return client.executeMethod(method);
    }

    @Override
    public List<StockLocation> getLocations(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(GetStockLocationsMethod.class, token));
    }

    @Override
    public List<Channel> getChannels(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(GetChannelsMethod.class, token));
    }

    @Override
    public List<Category> getCategories(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(GetCategoriesMethod.class, token));
    }

    @Override
    public List<String> getExtendedPropertyNames(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(GetExtendedPropertyNamesMethod.class, token));
    }

    @Override
    public GetInventoryItemsResponse getInventoryItems(LinnworksAPIClient client, SessionToken token, InventoryView view,
                                                       List<StockLocation> locations, Integer pageSize, Integer startIndex,
                                                       Boolean preloadChilds)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(GetInventoryItemsMethod.class, token)
                .withView(view)
                .withStockLocations(locations)
                .withPageSize(pageSize)
                .withStartIndex(startIndex)
                .withPreloadChilds(preloadChilds));
    }

    @Override
    public StockItemInv getInventoryItem(LinnworksAPIClient client, SessionToken token, String itemId)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(GetInventoryItemByIdMethod.class, token).withItemId(itemId));
    }

    @Override
    public List<StockItemComposition> getCompositions(LinnworksAPIClient client, SessionToken token, String itemId,
                                                      boolean fullDetail)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(GetInventoryItemCompositionsMethod.class, token)
                .withInventoryItemId(itemId).withFullDetail(fullDetail));
    }

    @Override
    public List<StockItemEbayCompatibility> getEbayCompatibility(LinnworksAPIClient client, SessionToken token, String itemId)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(GetEbayCompatibilityListMethod.class, token).withItemId(itemId));
    }

    @Override
    public List<StockItemPrice> getPrices(LinnworksAPIClient client, SessionToken token, String itemId)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(GetInventoryItemPricesMethod.class, token).withItemId(itemId));
    }

    @Override
    public List<StockItemExtendedProperty> getExtendedProperties(LinnworksAPIClient client, SessionToken token, String itemId)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(GetInventoryItemExtendedPropertiesMethod.class, token).withItemId(itemId));
    }

    @Override
    public List<StockItemExtendedProperty> createExtendedProperties(LinnworksAPIClient client,
                                                                    SessionToken token,
                                                                    List<StockItemExtendedProperty> extendedProperties)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(CreateInventoryItemExtendedPropertiesMethod.class, token)
                .withExtendedProperties(extendedProperties));
    }

    @Override
    public List<StockItemExtendedProperty> updateExtendedProperties(LinnworksAPIClient client,
                                                                    SessionToken token,
                                                                    List<StockItemExtendedProperty> extendedProperties)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(UpdateInventoryItemExtendedPropertiesMethod.class, token)
                .withExtendedProperties(extendedProperties));
    }

    @Override
    public List<Country> getCountries(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(GetCountriesMethod.class, token));
    }

    @Override
    public GenericPagedResult<StockItem> getStockItems(LinnworksAPIClient client, SessionToken token, Integer pageSize)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(GetStockItemsMethod.class, token).withPageSize(pageSize));
    }

    @Override
    public List<StockItemLevel> getLevels(LinnworksAPIClient client, SessionToken token, String itemId)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(GetStockLevelMethod.class, token).withItemId(itemId));
    }

    @Override
    public List<StockItemLevel> setLevels(LinnworksAPIClient client, SessionToken token, List<StockLevelUpdate> updates)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(SetStockLevelMethod.class, token).withUpdates(updates));
    }

    @Override
    public Map<String, Object> updateInventoryField(LinnworksAPIClient client,
                                                    SessionToken token,
                                                    String itemId,
                                                    InventoryField field,
                                                    String value)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(UpdateInventoryItemFieldMethod.class, token).withItemId(itemId)
                .withField(field).withValue(value));
    }

    @Override
    public Map<String, Object> updateStockField(LinnworksAPIClient client,
                                                SessionToken token,
                                                String itemId,
                                                InventoryStockField field,
                                                String value,
                                                String locationId)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(UpdateInventoryItemStockFieldMethod.class, token).withItemId(itemId)
                .withField(field).withValue(value).withLocationId(locationId));
    }

    @Override
    public List<StockItemChannelSKU> getChannelSKUs(LinnworksAPIClient client, SessionToken token, String itemId)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(GetInventoryItemChannelSKUsMethod.class, token).withItemId(itemId));
    }

    @Override
    public Object createChannelSKU(LinnworksAPIClient client, SessionToken token, StockItemChannelSKU channelSKU)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(CreateInventoryItemChannelSKUsMethod.class, token)
                .withChannelSKU(channelSKU));
    }

    @Override
    public List<CurrencyConversionRate> getCurrencyConversionRates(LinnworksAPIClient client, SessionToken token,
                                                                   boolean getCurrenciesFromOrders, String currency)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(GetCurrencyConversionRatesMethod.class, token)
                .withGetCurrenciesFromOrders(getCurrenciesFromOrders)
                .forCurrency(currency)
        );
    }

    @Override
    public String getNewItemNumber(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(GetNewItemNumberMethod.class, token));
    }

    @Override
    public StockItemInv addNewInventoryItem(LinnworksAPIClient client, SessionToken token, StockItemInv stockItem)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(AddInventoryItemMethod.class, token).withStockItem(stockItem));
    }

    @Override
    public StockItemInv updateInventoryItem(LinnworksAPIClient client, SessionToken token, StockItemInv stockItem)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(UpdateInventoryItemMethod.class, token).withStockItem(stockItem));
    }

    @Override
    public List<PostalService> getPostalServices(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(GetPostalServicesMethod.class, token));
    }

    @Override
    public List<KeyGuidValue> getPackageGroups(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(GetPackageGroupsMethod.class, token));
    }

    @Override
    public AddImageToInventoryItemResponse addImageToInventoryItem(LinnworksAPIClient client, SessionToken token,
                                                                   String sku, String itemId, String imageURL,
                                                                   boolean isMain)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(AddImageToInventoryItemMethod.class, token)
                .withItemNumber(sku).withItemId(itemId).withImageURL(imageURL).withMain(isMain));
    }

    @Override
    public String addOrderNote(LinnworksAPIClient client, SessionToken token, String orderId, String noteText,
                               boolean isInternal) throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(AddOrderNoteMethod.class, token).withOrderId(orderId)
                .withNoteText(noteText).withIsInternal(isInternal));
    }

    @Override
    public SearchPurchaseOrderResult searchPurchaseOrders(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(SearchPurchaseOrdersMethod.class, token));
    }

    @Override
    public GetPurchaseOrderResponse getPurchaseOrder(LinnworksAPIClient client, SessionToken token, String purchaseOrderId)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(GetPurchaseOrderMethod.class, token).withId(purchaseOrderId));
    }

    @Override
    public MoveToLocationResult moveOrders(LinnworksAPIClient client, SessionToken token, List<String> orderIds, String locationId)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(MoveToLocationMethod.class, token)
                .withLocationId(requireNonNull(locationId))
                .withOrderIds(requireNonNull(orderIds)));
    }

    @Override
    public UpdateOrderItemResult removeOrderItem(LinnworksAPIClient client, SessionToken token,
                                                 String orderId, String rowId, String fulfilmentCenterId)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(RemoveOrderItemMethod.class, token)
                .withOrderId(requireNonNull(orderId))
                .withRowId(requireNonNull(rowId))
                .withFulfilmentCenterId(requireNonNull(fulfilmentCenterId)));
    }

    @Override
    public UpdateOrderItemResult addOrderItem(LinnworksAPIClient client, SessionToken token, String orderId,
                                              String itemId, String channelSKU, String fulfilmentCenterId,
                                              int quantity, LinePricingRequest linePricingRequest)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(AddOrderItemMethod.class, token)
                .withOrderId(requireNonNull(orderId))
                .withItemId(requireNonNull(itemId))
                .withChannelSKU(requireNonNull(channelSKU))
                .withFulfilmentCenterId(requireNonNull(fulfilmentCenterId))
                .withQuantity(quantity)
                .withLinePricing(linePricingRequest));
    }

    @Override
    public UpdateOrderItemResult updateOrderItem(LinnworksAPIClient client, SessionToken token, String orderId,
                                                 String fulfilmentCenterId, String source, String subSource,
                                                 OrderItem orderItem)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(UpdateOrderItemMethod.class, token)
                .withOrderId(requireNonNull(orderId))
                .withFulfilmentCenterId(requireNonNull(fulfilmentCenterId))
                .withSource(requireNonNull(source))
                .withSubSource(requireNonNull(subSource))
                .withOrderItem(requireNonNull(orderItem)));
    }

    @Override
    public Map<String, List<String>> getAllExtendedPropertyNames(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(GetAllExtendedPropertyNamesMethod.class, token));
    }

    @Override
    public List<StockItemImage> getImages(LinnworksAPIClient client, SessionToken token, String itemId)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(GetInventoryItemImagesMethod.class, token).withItemId(itemId));
    }

    @Override
    public List<UserOrderView> getOrderViews(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(GetOrderViewsMethod.class, token));
    }

    @Override
    public List<SearchField> getSearchFields(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(GetSearchTypesMethod.class, token));
    }

    @Override
    public GenericPagedResult<ProcessedOrderWeb> searchProcessedOrdersPaged(LinnworksAPIClient client,
                                                                            SessionToken token,
                                                                            Instant from,
                                                                            Instant to,
                                                                            SearchDateType dateType,
                                                                            SearchField searchField,
                                                                            boolean exactMatch,
                                                                            String searchTerm,
                                                                            int pageNum,
                                                                            int pageSize)
            throws LinnworksAPIException, WrongTokenException {
        SearchProcessedOrdersPagedMethod method = prepareMethod(SearchProcessedOrdersPagedMethod.class, token);
        method.from(from).to(to).withDateType(dateType).withSearchField(searchField);

        if (exactMatch) {
            method.withExactMatch();
        }
        else {
            try {
                method.withPartialMatch();
            }
            catch (IllegalArgumentException | IllegalAccessException e) {
                throw new LinnworksAPIException("Error setting partial match.", e);
            }
        }

        return client.executeMethod(method.withSearchTerm(searchTerm).withPageNum(pageNum).withPageSize(pageSize));
    }

    @Override
    public GenericPagedResult<OpenOrder> getOpenOrders(LinnworksAPIClient client,
                                                       SessionToken token,
                                                       int pageNum,
                                                       int pageSize,
                                                       String locationId)
            throws LinnworksAPIException, WrongTokenException {
        GetOpenOrdersMethod method = prepareMethod(GetOpenOrdersMethod.class, token);

        return client.executeMethod(method.withPageNum(pageNum).withPageSize(pageSize).withFulfillmentCenterId(locationId));
    }

    @Override
    public OrderDetails getOrderById(LinnworksAPIClient client, SessionToken token, String orderId)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(GetOrderByIdMethod.class, token).withOrderId(orderId));
    }

    @Override
    public List<OrderDetails> getOrdersById(LinnworksAPIClient client, SessionToken token, List<String> orderIds)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(GetOrdersByIdMethod.class, token).withOrderIds(orderIds));
    }

    @Override
    public OpenOrder createNewOrder(LinnworksAPIClient client, SessionToken token, String fulfilmentCenterId)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(CreateNewOrderMethod.class, token)
                .withFulfilmentCenterId(fulfilmentCenterId));
    }

    @Override
    public String cancelOrder(LinnworksAPIClient client, SessionToken token, String orderId, String fulfilmentCenterId,
                              Double refund, String note) throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(CancelOrderMethod.class, token)
                .withOrderId(orderId)
                .withFulfilmentCenterId(fulfilmentCenterId)
                .withRefund(refund)
                .withNote(note));
    }

    @Override
    public String deleteOrder(LinnworksAPIClient client, SessionToken token, String orderId)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(DeleteOrderMethod.class, token).withOrderId(orderId));
    }

    @Override
    public OrderGeneralInfo updateOrderGeneralInfo(LinnworksAPIClient client, SessionToken token,
                                                   OrderGeneralInfo info, String orderId, boolean wasDraft)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(SetOrderGeneralInfoMethod.class, token)
                .withInfo(info).withOrderId(orderId).withWasDraft(wasDraft));
    }

    @Override
    public List<String> changeOrderStatus(LinnworksAPIClient client, SessionToken token,
                                          List<String> orderIds, OrderStatus status)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(ChangeStatusMethod.class, token)
                .withOrderIds(orderIds).withStatus(status));
    }

    @Override
    public OrderTotalsInfo updateOrderCustomerInfo(LinnworksAPIClient client, SessionToken token,
                                                   OrderCustomerInfo info, String orderId, boolean saveToCrm)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(SetOrderCustomerInfoMethod.class, token)
                .withInfo(info).withOrderId(orderId).withSaveToCrm(saveToCrm));
    }

    @Override
    public String createPurchaseOrder(LinnworksAPIClient client,
                                      SessionToken token,
                                      CreatePurchaseOrderParameters parameters)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(CreatePurchaseOrderInitialMethod.class, token).withParameters(parameters));
    }

    @Override
    public List<Supplier> getSuppliers(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(GetSuppliersMethod.class, token));
    }

    @Override
    public String deletePurchaseOrder(LinnworksAPIClient client, SessionToken token, String purchaseOrderId)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(DeletePurchaseOrderMethod.class, token).withPurchaseOrderId(purchaseOrderId));
    }

    @Override
    public List<StockItemSupplierStat> getStockSupplierStat(LinnworksAPIClient client, SessionToken token, String inventoryItemId)
            throws LinnworksAPIException, WrongTokenException {
        return client.executeMethod(prepareMethod(GetStockSupplierStatMethod.class, token).withInventoryItemId(inventoryItemId));
    }

    private static <T extends Method> T prepareMethod(Class<T> clazz, SessionToken token)
            throws LinnworksAPIException {
        try {
            T method = clazz.newInstance();
            method.setHost(token.getServer());
            method.setSessionToken(token.getSessionToken());

            return method;
        }
        catch (InstantiationException | IllegalAccessException e) {
            throw new LinnworksAPIException("Unable to create method of type: " + clazz.getSimpleName(), e);
        }
    }
}
