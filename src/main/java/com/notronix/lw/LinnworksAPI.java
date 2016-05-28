package com.notronix.lw;

import com.notronix.lw.client.LinnworksAPIClient;
import com.notronix.lw.model.*;

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

    GetInventoryItemsResponse getInventoryItems(LinnworksAPIClient client, SessionToken token, InventoryView view, Integer pageSize)
            throws LinnworksAPIException;

    StockItemInv getInventoryItem(LinnworksAPIClient client, SessionToken token, String itemId)
            throws LinnworksAPIException;

    List<StockItemExtendedProperty> getExtendedProperties(LinnworksAPIClient client, SessionToken token, String itemId)
            throws LinnworksAPIException;

    List<Country> getCountries(LinnworksAPIClient client, SessionToken token)
            throws LinnworksAPIException;

    List<StockItemImage> getImages(LinnworksAPIClient client, SessionToken token, String itemId)
            throws LinnworksAPIException;

    GenericPagedResult getStockItems(LinnworksAPIClient client, SessionToken token, Integer pageSize)
            throws LinnworksAPIException;

    List<StockItemLevel> getLevels(LinnworksAPIClient client, SessionToken token, String itemId)
            throws LinnworksAPIException;
}
