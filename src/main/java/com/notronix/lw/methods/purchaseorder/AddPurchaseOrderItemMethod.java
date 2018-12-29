package com.notronix.lw.methods.purchaseorder;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.gson.InstantDeserializer;
import com.notronix.lw.model.AddPurchaseOrderItemParameter;
import com.notronix.lw.model.UpdatePurchaseOrderItemResponse;

import java.time.Instant;

public class AddPurchaseOrderItemMethod extends PurchaseOrderMethod<UpdatePurchaseOrderItemResponse>
{
    private AddPurchaseOrderItemParameter addItemParameter;

    @Override
    public String getName() {
        return "Add_PurchaseOrderItem";
    }

    @Override
    public String getPayload() {
        return "addItemParameter=" + new Gson().toJson(addItemParameter);
    }

    @Override
    public UpdatePurchaseOrderItemResponse getResponse() throws LinnworksAPIException {
        Gson gson = new GsonBuilder().registerTypeAdapter(Instant.class, new InstantDeserializer()).create();

        return gson.fromJson(getJsonResult(), UpdatePurchaseOrderItemResponse.class);
    }

    public AddPurchaseOrderItemParameter getAddItemParameter() {
        return addItemParameter;
    }

    public void setAddItemParameter(AddPurchaseOrderItemParameter addItemParameter) {
        this.addItemParameter = addItemParameter;
    }

    public AddPurchaseOrderItemMethod withAddItemParameter(AddPurchaseOrderItemParameter addItemParameter) {
        this.addItemParameter = addItemParameter;
        return this;
    }
}
