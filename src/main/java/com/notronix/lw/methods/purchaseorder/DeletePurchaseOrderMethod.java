package com.notronix.lw.methods.purchaseorder;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;

public class DeletePurchaseOrderMethod extends PurchaseOrderMethod<String>
{
    private String purchaseOrderId;

    @Override
    public String getName()
    {
        return "Delete_PurchaseOrder";
    }

    @Override
    public String getPayload()
    {
        return "pkPurchaseId=" + purchaseOrderId;
    }

    @Override
    public String getResponse() throws LinnworksAPIException
    {
        return new Gson().fromJson(getJsonResult(), String.class);
    }

    public String getPurchaseOrderId()
    {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(String purchaseOrderId)
    {
        this.purchaseOrderId = purchaseOrderId;
    }

    public DeletePurchaseOrderMethod withPurchaseOrderId(String purchaseOrderId)
    {
        this.purchaseOrderId = purchaseOrderId;
        return this;
    }
}
