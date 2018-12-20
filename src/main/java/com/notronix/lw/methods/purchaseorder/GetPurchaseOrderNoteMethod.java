package com.notronix.lw.methods.purchaseorder;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.gson.InstantDeserializer;
import com.notronix.lw.model.PurchaseOrderNote;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;

import static java.util.Objects.requireNonNull;

public class GetPurchaseOrderNoteMethod extends PurchaseOrderMethod<List<PurchaseOrderNote>>
{
    private String pkPurchaseId;

    @Override
    public String getName() {
        return "Get_PurchaseOrderNote";
    }

    @Override
    public String getPayload() {
        return "pkPurchaseId=" + requireNonNull(pkPurchaseId);
    }

    @Override
    public List<PurchaseOrderNote> getResponse() throws LinnworksAPIException {
        Gson gson = new GsonBuilder().registerTypeAdapter(Instant.class, new InstantDeserializer()).create();

        return Arrays.asList(gson.fromJson(getJsonResult(), PurchaseOrderNote[].class));
    }

    public String getPkPurchaseId() {
        return pkPurchaseId;
    }

    public void setPkPurchaseId(String pkPurchaseId) {
        this.pkPurchaseId = pkPurchaseId;
    }

    public GetPurchaseOrderNoteMethod withPkPurchaseId(String pkPurchaseId) {
        this.pkPurchaseId = pkPurchaseId;
        return this;
    }
}
