package com.notronix.lw.methods.processedorders;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;

import static java.util.Objects.requireNonNull;

public class AddOrderNoteMethod extends ProcessedOrdersMethod<String>
{
    private String orderId;
    private String noteText;
    private Boolean isInternal;

    @Override
    public String getName() {
        return "AddOrderNote";
    }

    @Override
    public String getPayload() {
        return "pkOrderID=" + orderId + "&noteText=" + noteText + "&isInternal=" + isInternal.toString();
    }

    @Override
    public String getResponse() throws LinnworksAPIException {
        return new Gson().fromJson(getJsonResult(), String.class);
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = requireNonNull(orderId);
    }

    public AddOrderNoteMethod withOrderId(String orderId) {
        this.orderId = requireNonNull(orderId);
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
