package com.notronix.lw.methods.purchaseorder;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.gson.InstantDeserializer;
import com.notronix.lw.model.ChangePurchaseOrderStatusParameter;
import com.notronix.lw.model.PurchaseOrderHeader;

import java.time.Instant;

public class ChangePurchaseOrderStatusMethod extends PurchaseOrderMethod<PurchaseOrderHeader>
{
    private ChangePurchaseOrderStatusParameter changeStatusParameter;

    @Override
    public String getName() {
        return "Change_PurchaseOrderStatus";
    }

    @Override
    public String getPayload() {
        return "changeStatusParameter=" + new Gson().toJson(changeStatusParameter);
    }

    @Override
    public PurchaseOrderHeader getResponse() throws LinnworksAPIException {
        Gson gson = new GsonBuilder().registerTypeAdapter(Instant.class, new InstantDeserializer()).create();

        return gson.fromJson(getJsonResult(), PurchaseOrderHeader.class);
    }

    public ChangePurchaseOrderStatusParameter getChangeStatusParameter() {
        return changeStatusParameter;
    }

    public void setChangeStatusParameter(ChangePurchaseOrderStatusParameter changeStatusParameter) {
        this.changeStatusParameter = changeStatusParameter;
    }

    public ChangePurchaseOrderStatusMethod withChangeStatusParameter(ChangePurchaseOrderStatusParameter changeStatusParameter) {
        this.changeStatusParameter = changeStatusParameter;
        return this;
    }
}
