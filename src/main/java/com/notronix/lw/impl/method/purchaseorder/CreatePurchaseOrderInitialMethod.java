package com.notronix.lw.impl.method.purchaseorder;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.CreatePurchaseOrderInitialParameter;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.UUID;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class CreatePurchaseOrderInitialMethod extends AbstractLinnworksAPIMethod<UUID>
{
    private CreatePurchaseOrderInitialParameter createParameters;

    @Override
    public String getURI() {
        return "PurchaseOrder/Create_PurchaseOrder_Initial";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        return urlEncode("createParameters", gson.toJson(requireNonNull(createParameters)));
    }

    @Override
    public UUID getResponse(Gson gson, String jsonPayload) {
        return UUID.fromString(gson.fromJson(jsonPayload, String.class));
    }

    public CreatePurchaseOrderInitialParameter getCreateParameters() {
        return createParameters;
    }

    public void setCreateParameters(CreatePurchaseOrderInitialParameter createParameters) {
        this.createParameters = createParameters;
    }

    public CreatePurchaseOrderInitialMethod withCreateParameters(CreatePurchaseOrderInitialParameter createParameters) {
        this.createParameters = createParameters;
        return this;
    }
}
