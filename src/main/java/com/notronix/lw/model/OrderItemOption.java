package com.notronix.lw.model;

public class OrderItemOption {
    private String pkOptionId;
    private String Property;
    private String Value;

    public String getPkOptionId() {
        return pkOptionId;
    }

    public void setPkOptionId(String pkOptionId) {
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
