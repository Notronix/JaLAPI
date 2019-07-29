package com.notronix.lw.impl.method.purchaseorder;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.DeliverPurchaseItemParameter;
import com.notronix.lw.api.model.UpdatePurchaseOrderItemResponse;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class DeliverPurchaseItemMethod extends AbstractLinnworksAPIMethod<UpdatePurchaseOrderItemResponse>
{
    private DeliverPurchaseItemParameter deliverItemParameter;

    @Override
    public String getURI() {
        return "PurchaseOrder/Deliver_PurchaseItem";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        return urlEncode("deliverItemParameter", gson.toJson(requireNonNull(deliverItemParameter)));
    }

    @Override
    public UpdatePurchaseOrderItemResponse getResponse(Gson gson, String jsonPayload) {
        return gson.fromJson(jsonPayload, UpdatePurchaseOrderItemResponse.class);
    }

    public DeliverPurchaseItemParameter getDeliverItemParameter() {
        return deliverItemParameter;
    }

    public void setDeliverItemParameter(DeliverPurchaseItemParameter deliverItemParameter) {
        this.deliverItemParameter = deliverItemParameter;
    }

    public DeliverPurchaseItemMethod withDeliverItemParameter(DeliverPurchaseItemParameter deliverItemParameter) {
        this.deliverItemParameter = deliverItemParameter;
        return this;
    }
}
