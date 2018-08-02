package com.notronix.lw.methods.purchaseorder;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.gson.InstantDeserializer;
import com.notronix.lw.model.PurchaseOrderSearchParameters;
import com.notronix.lw.model.SearchPurchaseOrderResult;

import java.time.Instant;

public class SearchPurchaseOrdersMethod extends PurchaseOrderMethod<SearchPurchaseOrderResult>
{
    @Override
    public String getName() {
        return "Search_PurchaseOrders";
    }

    @Override
    public String getPayload() {
        return "searchParameter=" + new Gson().toJson(new PurchaseOrderSearchParameters());
    }

    @Override
    public SearchPurchaseOrderResult getResponse() throws LinnworksAPIException {
        Gson gson = new GsonBuilder().registerTypeAdapter(Instant.class, new InstantDeserializer()).create();
        return gson.fromJson(getJsonResult(), SearchPurchaseOrderResult.class);
    }
}
