package com.notronix.lw.methods.postalservices;

import com.notronix.lw.methods.BaseMethod;

abstract public class PostalServicesMethod<T> extends BaseMethod<T>
{
    @Override
    public String getModule()
    {
        return "PostalServices";
    }
}
