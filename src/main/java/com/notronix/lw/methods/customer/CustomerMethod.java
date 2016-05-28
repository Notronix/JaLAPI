package com.notronix.lw.methods.customer;

import com.notronix.lw.methods.BaseMethod;

abstract class CustomerMethod<T> extends BaseMethod<T>
{
    @Override
    public String getModule()
    {
        return "Customer";
    }
}
