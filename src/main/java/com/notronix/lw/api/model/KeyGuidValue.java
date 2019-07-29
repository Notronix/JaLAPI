package com.notronix.lw.api.model;

import java.util.UUID;

public class KeyGuidValue
{
    private String Key;
    private UUID Value;

    public String getKey() {
        return Key;
    }

    public void setKey(String key) {
        Key = key;
    }

    public UUID getValue() {
        return Value;
    }

    public void setValue(UUID value) {
        Value = value;
    }
}
