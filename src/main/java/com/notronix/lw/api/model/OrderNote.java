package com.notronix.lw.api.model;

import java.time.Instant;
import java.util.UUID;

public class OrderNote
{
    private UUID OrderNoteId;
    private UUID OrderId;
    private Instant NoteDate;
    private Boolean Internal;
    private String Note;
    private String CreatedBy;
    private Byte NoteTypeId;

    public UUID getOrderNoteId() {
        return OrderNoteId;
    }

    public void setOrderNoteId(UUID orderNoteId) {
        OrderNoteId = orderNoteId;
    }

    public Instant getNoteDate() {
        return NoteDate;
    }

    public void setNoteDate(Instant noteDate) {
        NoteDate = noteDate;
    }

    public Boolean getInternal() {
        return Internal;
    }

    public void setInternal(Boolean internal) {
        Internal = internal;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String note) {
        Note = note;
    }

    public String getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(String createdBy) {
        CreatedBy = createdBy;
    }

    public UUID getOrderId() {
        return OrderId;
    }

    public void setOrderId(UUID orderId) {
        OrderId = orderId;
    }

    public Byte getNoteTypeId() {
        return NoteTypeId;
    }

    public void setNoteTypeId(Byte noteTypeId) {
        NoteTypeId = noteTypeId;
    }
}
