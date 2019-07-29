package com.notronix.lw.impl.method.processedorders;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class AddOrderNoteMethod extends AbstractLinnworksAPIMethod<UUID>
{
    private UUID pkOrderId;
    private String noteText;
    private Boolean isInternal;

    @Override
    public String getURI() {
        return "ProcessedOrders/AddOrderNote";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        Map<String, Object> params = new HashMap<>();
        params.put("pkOrderId", requireNonNull(pkOrderId));
        params.put("noteText", requireNonNull(noteText));
        params.put("isInternal", requireNonNull(isInternal));

        return urlEncode(params);
    }

    @Override
    public UUID getResponse(Gson gson, String jsonPayload) {
        return UUID.fromString(gson.fromJson(jsonPayload, String.class));
    }

    public UUID getPkOrderId() {
        return pkOrderId;
    }

    public void setPkOrderId(UUID pkOrderId) {
        this.pkOrderId = pkOrderId;
    }

    public AddOrderNoteMethod withPkOrderId(UUID pkOrderId) {
        this.pkOrderId = pkOrderId;
        return this;
    }

    public String getNoteText() {
        return noteText;
    }

    public void setNoteText(String noteText) {
        this.noteText = requireNonNull(noteText);
    }

    public AddOrderNoteMethod withNoteText(String noteText) {
        this.noteText = requireNonNull(noteText);
        return this;
    }

    public Boolean getInternal() {
        return isInternal;
    }

    public void setInternal(Boolean internal) {
        isInternal = requireNonNull(internal);
    }

    public AddOrderNoteMethod withIsInternal(Boolean internal) {
        isInternal = requireNonNull(internal);
        return this;
    }
}
