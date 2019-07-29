package com.notronix.lw.impl.method.purchaseorder;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.ChangePurchaseOrderStatusParameter;
import com.notronix.lw.api.model.PurchaseOrderHeader;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class ChangePurchaseOrderStatusMethod extends AbstractLinnworksAPIMethod<PurchaseOrderHeader>
{
    private ChangePurchaseOrderStatusParameter changeStatusParameter;

    @Override
    public String getURI() {
        return "PurchaseOrder/Change_PurchaseOrderStatus";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        return urlEncode("changeStatusParameter", gson.toJson(requireNonNull(changeStatusParameter)));
    }

    @Override
    public PurchaseOrderHeader getResponse(Gson gson, String jsonPayload) {
        return gson.fromJson(jsonPayload, PurchaseOrderHeader.class);
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
