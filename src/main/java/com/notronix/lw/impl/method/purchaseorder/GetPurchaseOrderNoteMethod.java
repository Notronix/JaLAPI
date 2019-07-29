package com.notronix.lw.impl.method.purchaseorder;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.PurchaseOrderNote;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class GetPurchaseOrderNoteMethod extends AbstractLinnworksAPIMethod<List<PurchaseOrderNote>>
{
    private UUID pkPurchaseId;

    @Override
    public String getURI() {
        return "PurchaseOrder/Get_PurchaseOrderNote";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        return urlEncode("pkPurchaseId", requireNonNull(pkPurchaseId));
    }

    @Override
    public List<PurchaseOrderNote> getResponse(Gson gson, String jsonPayload) {
        return Arrays.asList(gson.fromJson(jsonPayload, PurchaseOrderNote[].class));
    }

    public UUID getPkPurchaseId() {
        return pkPurchaseId;
    }

    public void setPkPurchaseId(UUID pkPurchaseId) {
        this.pkPurchaseId = pkPurchaseId;
    }

    public GetPurchaseOrderNoteMethod withPkPurchaseId(UUID pkPurchaseId) {
        this.pkPurchaseId = pkPurchaseId;
        return this;
    }
}
