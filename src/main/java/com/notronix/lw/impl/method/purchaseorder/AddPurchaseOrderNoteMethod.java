package com.notronix.lw.impl.method.purchaseorder;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.PurchaseOrderNote;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class AddPurchaseOrderNoteMethod extends AbstractLinnworksAPIMethod<PurchaseOrderNote>
{
    private UUID pkPurchaseId;
    private String Note;

    @Override
    public String getURI() {
        return "PurchaseOrder/Add_PurchaseOrderNote";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        Map<String, Object> params = new HashMap<>();
        params.put("pkPurchaseId", requireNonNull(pkPurchaseId));
        params.put("Note", requireNonNull(Note));

        return urlEncode(params);
    }

    @Override
    public PurchaseOrderNote getResponse(Gson gson, String jsonPayload) {
        return gson.fromJson(jsonPayload, PurchaseOrderNote.class);
    }

    public UUID getPkPurchaseId() {
        return pkPurchaseId;
    }

    public void setPkPurchaseId(UUID pkPurchaseId) {
        this.pkPurchaseId = pkPurchaseId;
    }

    public AddPurchaseOrderNoteMethod withPkPurchaseId(UUID pkPurchaseId) {
        this.pkPurchaseId = pkPurchaseId;
        return this;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String note) {
        Note = note;
    }

    public AddPurchaseOrderNoteMethod withNote(String note) {
        Note = note;
        return this;
    }
}
