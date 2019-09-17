package com.notronix.lw.api.model;

import java.util.UUID;

public class OrderXML
{
    private UUID pkOrderId;
    private String LineTag;
    private String Type;
    private Object Document;

    public UUID getPkOrderId() {
        return pkOrderId;
    }

    public void setPkOrderId(UUID pkOrderId) {
        this.pkOrderId = pkOrderId;
    }

    public String getLineTag() {
        return LineTag;
    }

    public void setLineTag(String lineTag) {
        LineTag = lineTag;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public Object getDocument() {
        return Document;
    }

    public void setDocument(Object document) {
        Document = document;
    }
}
