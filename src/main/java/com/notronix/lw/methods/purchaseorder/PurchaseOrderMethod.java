package com.notronix.lw.methods.purchaseorder;

import com.notronix.lw.methods.BaseMethod;

abstract public class PurchaseOrderMethod<T> extends BaseMethod<T>
{
    @Override
    public String getModule()
    {
        return "PurchaseOrder";
    }
}
