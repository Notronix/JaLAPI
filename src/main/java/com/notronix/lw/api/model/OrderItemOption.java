package com.notronix.lw.api.model;

import java.util.UUID;

public class OrderItemOption
{
    private UUID pkOptionId;
    private String Property;
    private String Value;

    public UUID getPkOptionId() {
        return pkOptionId;
    }

    public void setPkOptionId(UUID pkOptionId) {
        this.pkOptionId = pkOptionId;
    }

    public String getProperty() {
        return Property;
    }

    public void setProperty(String property) {
        Property = property;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String value) {
        Value = value;
    }
}
