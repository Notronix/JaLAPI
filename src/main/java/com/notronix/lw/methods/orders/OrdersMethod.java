package com.notronix.lw.methods.orders;

import com.notronix.lw.methods.BaseMethod;

abstract public class OrdersMethod<T> extends BaseMethod<T>
{
    @Override
    public String getModule()
    {
        return "Orders";
    }
}
