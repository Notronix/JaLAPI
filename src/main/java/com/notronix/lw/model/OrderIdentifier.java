package com.notronix.lw.model;

public class OrderIdentifier
{
    private Byte IdentifierId;
    private String Name;
    private String Tag;

    public Byte getIdentifierId() {
        return IdentifierId;
    }

    public void setIdentifierId(Byte identifierId) {
        IdentifierId = identifierId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTag() {
        return Tag;
    }

    public void setTag(String tag) {
        Tag = tag;
    }
}
