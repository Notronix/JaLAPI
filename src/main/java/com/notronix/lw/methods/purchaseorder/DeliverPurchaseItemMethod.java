package com.notronix.lw.methods.purchaseorder;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.gson.InstantDeserializer;
import com.notronix.lw.model.DeliverPurchaseItemParameter;
import com.notronix.lw.model.UpdatePurchaseOrderItemResponse;

import java.time.Instant;

public class DeliverPurchaseItemMethod extends PurchaseOrderMethod<UpdatePurchaseOrderItemResponse>
{
    private DeliverPurchaseItemParameter parameters;

    @Override
    public String getName() {
        return "Deliver_PurchaseItem";
    }

    @Override
    public String getPayload() {
        return "deliverItemParameter=" + new GsonBuilder()/*.serializeNulls()*/.create().toJson(parameters);
    }

    @Override
    public UpdatePurchaseOrderItemResponse getResponse() throws LinnworksAPIException {
        Gson gson = new GsonBuilder().registerTypeAdapter(Instant.class, new InstantDeserializer()).create();

        return gson.fromJson(getJsonResult(), UpdatePurchaseOrderItemResponse.class);
    }

    public DeliverPurchaseItemParameter getParameters() {
        return parameters;
    }

    public void setParameters(DeliverPurchaseItemParameter parameters) {
        this.parameters = parameters;
    }

    public DeliverPurchaseItemMethod withParameters(DeliverPurchaseItemParameter parameters) {
        this.parameters = parameters;
        return this;
    }
}
