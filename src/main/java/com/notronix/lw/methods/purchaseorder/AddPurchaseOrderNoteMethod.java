package com.notronix.lw.methods.purchaseorder;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.gson.InstantDeserializer;
import com.notronix.lw.model.PurchaseOrderNote;

import java.time.Instant;

import static java.util.Objects.requireNonNull;

public class AddPurchaseOrderNoteMethod extends PurchaseOrderMethod<PurchaseOrderNote>
{
    private String pkPurchaseId	;
    private String Note;

    @Override
    public String getName() {
        return "Add_PurchaseOrderNote";
    }

    @Override
    public String getPayload() {
        return "pkPurchaseId=" + requireNonNull(pkPurchaseId) + "&Note=" + requireNonNull(Note);
    }

    @Override
    public PurchaseOrderNote getResponse() throws LinnworksAPIException {
        Gson gson = new GsonBuilder().registerTypeAdapter(Instant.class, new InstantDeserializer()).create();

        return gson.fromJson(getJsonResult(), PurchaseOrderNote.class);
    }

    public String getPkPurchaseId() {
        return pkPurchaseId;
    }

    public void setPkPurchaseId(String pkPurchaseId) {
        this.pkPurchaseId = pkPurchaseId;
    }

    public AddPurchaseOrderNoteMethod withPkPurchaseId(String pkPurchaseId) {
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
