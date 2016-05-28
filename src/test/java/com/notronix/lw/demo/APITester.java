package com.notronix.lw.demo;

import com.notronix.lw.LinnworksAPI;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.LinnworksAPIImpl;
import com.notronix.lw.client.LinnworksAPIClient;
import com.notronix.lw.client.LinnworksAPIClientImpl;
import com.notronix.lw.model.*;

import java.util.*;

public class APITester
{
    public static void main(String[] args)
    {
        try
        {
            new APITester().run(args[0], args[1], args[2]);
        }
        catch (LinnworksAPIException lapie)
        {
            lapie.printStackTrace();
        }
    }

    private APITester()
    {
    }

    private void run(String appId, String appSecret, String authToken)
            throws LinnworksAPIException
    {
        LinnworksAPI lwapi = new LinnworksAPIImpl();
        LinnworksAPIClient client = new LinnworksAPIClientImpl();

        SessionToken sessionToken = lwapi.authenticateApplication(client, appId, appSecret, authToken);
        if (sessionToken == null)
        {
            System.out.println("null sessionToken");
            System.exit(1);
        }

        List<StockLocation> stockLocations = lwapi.getLocations(client, sessionToken);
        List<Channel> channels = lwapi.getChannels(client, sessionToken);
        List<Category> categories = lwapi.getCategories(client, sessionToken);
        List<String> extendedPropertyNames = lwapi.getExtendedPropertyNames(client, sessionToken);
        List<Column> columns = lwapi.getColumns(client, sessionToken);
        List<Country> countries = lwapi.getCountries(client, sessionToken);
        GenericPagedResult genericPagedResult = lwapi.getStockItems(client, sessionToken, 50);

        List<StockItem> stockItems = genericPagedResult == null ? null : genericPagedResult.getData();
        List<InventoryItem> inventoryItems = lwapi.getInventoryItems(client, sessionToken, createView(), 50).getItems();

        StockItemInv stockItemInv = lwapi.getInventoryItem(client, sessionToken, "d6c4db80-dda1-4230-9b8b-000e322b51d9");
        List<StockItemLevel> stockItemLevels = lwapi.getLevels(client, sessionToken, "d6c4db80-dda1-4230-9b8b-000e322b51d9");
        List<StockItemExtendedProperty> extendedProperties = lwapi.getExtendedProperties(client, sessionToken, "d6c4db80-dda1-4230-9b8b-000e322b51d9");
        List<StockItemImage> images = lwapi.getImages(client, sessionToken, "d6c4db80-dda1-4230-9b8b-000e322b51d9");

        lwapi = null;
        client = null;
    }

    private static InventoryView createView()
    {
        InventoryView view = new InventoryView();
        view.setFilters(Collections.emptyList());
        view.setChannels(Collections.emptyList());
        view.setShowOnlyChanged(false);
        view.setColumns(new ArrayList<>());
        view.getColumns().add(new Column().withColumnName("SKU"));
        view.getColumns().add(new Column().withColumnName("Title"));
        view.getColumns().add(new Column().withColumnName("RetailPrice"));
        view.getColumns().add(new Column().withColumnName("PurchasePrice"));
        view.getColumns().add(new Column().withColumnName("Available"));
        view.getColumns().add(new Column().withColumnName("StockLevel"));
        view.getColumns().add(new Column().withColumnName("Barcode"));
        view.getColumns().add(new Column().withColumnName("Category"));
        view.getColumns().add(new Column().withColumnName("Due"));
        view.getColumns().add(new Column().withColumnName("InOrder"));
        view.getColumns().add(new Column().withColumnName("BinRack"));

        return view;
    }
}
