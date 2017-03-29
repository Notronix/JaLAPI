package com.notronix.lw.methods.settings;

import com.notronix.lw.methods.BaseMethod;

abstract class SettingsMethod<T> extends BaseMethod<T>
{
    @Override
    public String getModule()
    {
        return "Settings";
    }
}
