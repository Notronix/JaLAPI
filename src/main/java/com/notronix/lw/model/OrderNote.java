package com.notronix.lw.model;

public class OrderNote
{
    private String OrderNoteId;
    private String OrderId;
    private String NoteDate;
    private Boolean Internal;
    private String Note;
    private String CreatedBy;
    private Byte NoteTypeId;

    public String getOrderNoteId()
    {
        return OrderNoteId;
    }

    public void setOrderNoteId(String orderNoteId)
    {
        OrderNoteId = orderNoteId;
    }

    public String getNoteDate()
    {
        return NoteDate;
    }

    public void setNoteDate(String noteDate)
    {
        NoteDate = noteDate;
    }

    public Boolean getInternal()
    {
        return Internal;
    }

    public void setInternal(Boolean internal)
    {
        Internal = internal;
    }

    public String getNote()
    {
        return Note;
    }

    public void setNote(String note)
    {
        Note = note;
    }

    public String getCreatedBy()
    {
        return CreatedBy;
    }

    public void setCreatedBy(String createdBy)
    {
        CreatedBy = createdBy;
    }

    public String getOrderId() {
        return OrderId;
    }

    public void setOrderId(String orderId) {
        OrderId = orderId;
    }

    public Byte getNoteTypeId() {
        return NoteTypeId;
    }

    public void setNoteTypeId(Byte noteTypeId) {
        NoteTypeId = noteTypeId;
    }
}
