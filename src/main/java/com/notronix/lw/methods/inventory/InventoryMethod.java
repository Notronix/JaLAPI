package com.notronix.lw.methods.inventory;

import com.notronix.lw.methods.BaseMethod;

public abstract class InventoryMethod<T> extends BaseMethod<T>
{
    @Override
    public String getModule()
    {
        return "inventory";
    }
}
