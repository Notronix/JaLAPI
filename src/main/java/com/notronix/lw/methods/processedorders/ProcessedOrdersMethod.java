package com.notronix.lw.methods.processedorders;

import com.notronix.lw.methods.BaseMethod;

abstract public class ProcessedOrdersMethod<T> extends BaseMethod<T>
{
    @Override
    public String getModule()
    {
        return "ProcessedOrders";
    }
}
