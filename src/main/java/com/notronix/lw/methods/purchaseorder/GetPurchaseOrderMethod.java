package com.notronix.lw.methods.purchaseorder;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.gson.InstantDeserializer;
import com.notronix.lw.model.GetPurchaseOrderResponse;

import java.time.Instant;

public class GetPurchaseOrderMethod extends PurchaseOrderMethod<GetPurchaseOrderResponse>
{
    private String id;

    @Override
    public String getName() {
        return "Get_PurchaseOrder";
    }

    @Override
    public String getPayload() {
        return "pkPurchaseId=" + id;
    }

    @Override
    public GetPurchaseOrderResponse getResponse() throws LinnworksAPIException {
        Gson gson = new GsonBuilder().registerTypeAdapter(Instant.class, new InstantDeserializer()).create();

        return gson.fromJson(getJsonResult(), GetPurchaseOrderResponse.class);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GetPurchaseOrderMethod withId(String id) {
        this.id = id;
        return this;
    }
}
