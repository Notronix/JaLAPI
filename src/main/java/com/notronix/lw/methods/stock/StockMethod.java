package com.notronix.lw.methods.stock;

import com.notronix.lw.methods.BaseMethod;

abstract class StockMethod<T> extends BaseMethod<T>
{
    @Override
    public String getModule()
    {
        return "Stock";
    }
}
