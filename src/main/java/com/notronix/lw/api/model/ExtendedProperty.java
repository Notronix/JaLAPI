package com.notronix.lw.api.model;

import java.util.UUID;

public class ExtendedProperty
{
    private UUID RowId;
    private String Name;
    private String Value;
    private String Type;

    public UUID getRowId() {
        return RowId;
    }

    public void setRowId(UUID rowId) {
        RowId = rowId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String value) {
        Value = value;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }
}
