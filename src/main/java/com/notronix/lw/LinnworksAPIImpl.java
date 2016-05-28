package com.notronix.lw;

import com.notronix.lw.client.LinnworksAPIClient;
import com.notronix.lw.methods.inventory.GetInventoryItemsMethod;
import com.notronix.lw.methods.Method;
import com.notronix.lw.methods.auth.AuthorizeByApplicationMethod;
import com.notronix.lw.methods.inventory.*;
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
    public GenericPagedResult getStockItems(LinnworksAPIClient client, SessionToken token, Integer pageSize)
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

    private static <T extends Method> T prepareMethod(Class<T> clazz, SessionToken token) throws LinnworksAPIException
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
