package com.notronix.lw;

import com.notronix.lw.client.LinnworksAPIClient;
import com.notronix.lw.methods.inventory.GetInventoryItemsMethod;
import com.notronix.lw.methods.Method;
import com.notronix.lw.methods.auth.AuthorizeByApplicationMethod;
import com.notronix.lw.methods.inventory.*;
import com.notronix.lw.methods.orders.GetOrderViewsMethod;
import com.notronix.lw.methods.orders.GetOrdersByIdMethod;
import com.notronix.lw.methods.processedorders.SearchProcessedOrdersPagedMethod;
import com.notronix.lw.methods.returnsrefunds.GetSearchTypesMethod;
import com.notronix.lw.methods.stock.GetStockItemsMethod;
import com.notronix.lw.methods.stock.GetStockLevelMethod;
import com.notronix.lw.model.*;

import java.util.List;

public class LinnworksAPIImpl implements LinnworksAPI
{
    @Override
    public SessionToken authenticateApplication(LinnworksAPIClient client, String appId, String appSecret, String authToken)
            throws LinnworksAPIException
    {
        AuthorizeByApplicationMethod abam = new AuthorizeByApplicationMethod();
        abam.setHost("https://api.linnworks.net");
        abam.setAppId(appId);
        abam.setAppSecret(appSecret);
        abam.setAuthToken(authToken);

        return client.executeMethod(abam);
    }

    @Override
    public List<StockLocation> getLocations(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException
    {
        return client.executeMethod(prepareMethod(GetStockLocationsMethod.class, token));
    }

    @Override
    public List<Channel> getChannels(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException
    {
        return client.executeMethod(prepareMethod(GetChannelsMethod.class, token));
    }

    @Override
    public List<Category> getCategories(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException
    {
        return client.executeMethod(prepareMethod(GetCategoriesMethod.class, token));
    }

    @Override
    public List<String> getExtendedPropertyNames(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException
    {
        return client.executeMethod(prepareMethod(GetExtendedPropertyNamesMethod.class, token));
    }

    @Override
    public List<Column> getColumns(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException
    {
        return client.executeMethod(prepareMethod(GetInventoryColumnTypesMethod.class, token));
    }

    @Override
    public GetInventoryItemsResponse getInventoryItems(LinnworksAPIClient client, SessionToken token, InventoryView view, Integer pageSize)
            throws LinnworksAPIException
    {
        return client.executeMethod(prepareMethod(GetInventoryItemsMethod.class, token).withView(view).withPageSize(pageSize));
    }

    @Override
    public StockItemInv getInventoryItem(LinnworksAPIClient client, SessionToken token, String itemId)
            throws LinnworksAPIException
    {
        return client.executeMethod(prepareMethod(GetInventoryItemByIdMethod.class, token).withItemId(itemId));
    }

    @Override
    public List<StockItemExtendedProperty> getExtendedProperties(LinnworksAPIClient client, SessionToken token, String itemId)
            throws LinnworksAPIException
    {
        return client.executeMethod(prepareMethod(GetInventoryItemExtendedPropertiesMethod.class, token).withItemId(itemId));
    }

    @Override
    public List<Country> getCountries(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException
    {
        return client.executeMethod(prepareMethod(GetCountriesMethod.class, token));
    }

    @Override
    public GenericPagedResult<StockItem> getStockItems(LinnworksAPIClient client, SessionToken token, Integer pageSize)
            throws LinnworksAPIException
    {
        return client.executeMethod(prepareMethod(GetStockItemsMethod.class, token).withPageSize(pageSize));
    }

    @Override
    public List<StockItemLevel> getLevels(LinnworksAPIClient client, SessionToken token, String itemId)
            throws LinnworksAPIException
    {
        return client.executeMethod(prepareMethod(GetStockLevelMethod.class, token).withItemId(itemId));
    }

    @Override
    public List<StockItemImage> getImages(LinnworksAPIClient client, SessionToken token, String itemId)
            throws LinnworksAPIException
    {
        return client.executeMethod(prepareMethod(GetInventoryItemImagesMethod.class, token).withItemId(itemId));
    }

    @Override
    public List<UserOrderView> getOrderViews(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException
    {
        return client.executeMethod(prepareMethod(GetOrderViewsMethod.class, token));
    }

    @Override
    public List<SearchField> getSearchFields(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException
    {
        return client.executeMethod(prepareMethod(GetSearchTypesMethod.class, token));
    }

    @Override
    public GenericPagedResult<ProcessedOrderWeb> searchProcessedOrdersPaged(LinnworksAPIClient client, SessionToken token, String from,
                                                         String to, SearchDateType dateType, SearchField searchField,
                                                         boolean exactMatch, String searchTerm, int pageNum, int pageSize)
            throws LinnworksAPIException
    {
        SearchProcessedOrdersPagedMethod method = prepareMethod(SearchProcessedOrdersPagedMethod.class, token);
        method.from(from).to(to).withDateType(dateType).withSearchField(searchField);

        if (exactMatch)
        {
            method.withExactMatch();
        }
        else
        {
            try
            {
                method.withPartialMatch();
            }
            catch (IllegalArgumentException|IllegalAccessException e)
            {
                throw new LinnworksAPIException("Error setting partial match.", e);
            }
        }

        return client.executeMethod(method.withSearchTerm(searchTerm).withPageNum(pageNum).withPageSize(pageSize));
    }

    @Override
    public List<OrderDetails> getOrdersById(LinnworksAPIClient client, SessionToken token, List<String> orderIds)
            throws LinnworksAPIException
    {
        return client.executeMethod(prepareMethod(GetOrdersByIdMethod.class, token).withOrderIds(orderIds));
    }

    private static <T extends Method> T prepareMethod(Class<T> clazz, SessionToken token)
            throws LinnworksAPIException
    {
        try
        {
            T method = clazz.newInstance();
            method.setHost(token.getServer());
            method.setSessionToken(token.getSessionToken());

            return method;
        }
        catch (InstantiationException | IllegalAccessException e)
        {
            throw new LinnworksAPIException("Unable to create method of type: " + clazz.getSimpleName(), e);
        }
    }
}
