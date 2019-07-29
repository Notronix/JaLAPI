package com.notronix.lw.impl.method.purchaseorder;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.AddPurchaseOrderItemParameter;
import com.notronix.lw.api.model.UpdatePurchaseOrderItemResponse;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class AddPurchaseOrderItemMethod extends AbstractLinnworksAPIMethod<UpdatePurchaseOrderItemResponse>
{
    private AddPurchaseOrderItemParameter addItemParameter;

    @Override
    public String getURI() {
        return "PurchaseOrder/Add_PurchaseOrderItem";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        return urlEncode("addItemParameter", gson.toJson(requireNonNull(addItemParameter)));
    }

    @Override
    public UpdatePurchaseOrderItemResponse getResponse(Gson gson, String jsonPayload) {
        return gson.fromJson(jsonPayload, UpdatePurchaseOrderItemResponse.class);
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
