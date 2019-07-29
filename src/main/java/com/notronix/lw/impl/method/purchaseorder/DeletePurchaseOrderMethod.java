package com.notronix.lw.impl.method.purchaseorder;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.UUID;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class DeletePurchaseOrderMethod extends AbstractLinnworksAPIMethod<Void>
{
    private UUID pkPurchaseId;

    @Override
    public String getURI() {
        return "PurchaseOrder/Delete_PurchaseOrder";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        return urlEncode("pkPurchaseId", requireNonNull(pkPurchaseId));
    }

    @Override
    public Void getResponse(Gson gson, String jsonPayload) {
        return null;
    }

    public UUID getPkPurchaseId() {
        return pkPurchaseId;
    }

    public void setPkPurchaseId(UUID pkPurchaseId) {
        this.pkPurchaseId = pkPurchaseId;
    }

    public DeletePurchaseOrderMethod withPkPurchaseId(UUID pkPurchaseId) {
        this.pkPurchaseId = pkPurchaseId;
        return this;
    }
}
