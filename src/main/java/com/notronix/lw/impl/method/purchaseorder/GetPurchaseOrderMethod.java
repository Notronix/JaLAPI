package com.notronix.lw.impl.method.purchaseorder;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.GetPurchaseOrderResponse;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.UUID;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class GetPurchaseOrderMethod extends AbstractLinnworksAPIMethod<GetPurchaseOrderResponse>
{
    private UUID pkPurchaseId;

    @Override
    public String getURI() {
        return "PurchaseOrder/Get_PurchaseOrder";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        return urlEncode("pkPurchaseId", requireNonNull(pkPurchaseId));
    }

    @Override
    public GetPurchaseOrderResponse getResponse(Gson gson, String jsonPayload) {
        return gson.fromJson(jsonPayload, GetPurchaseOrderResponse.class);
    }

    public UUID getPkPurchaseId() {
        return pkPurchaseId;
    }

    public void setPkPurchaseId(UUID pkPurchaseId) {
        this.pkPurchaseId = pkPurchaseId;
    }

    public GetPurchaseOrderMethod withPkPurchaseId(UUID pkPurchaseId) {
        this.pkPurchaseId = pkPurchaseId;
        return this;
    }
}
