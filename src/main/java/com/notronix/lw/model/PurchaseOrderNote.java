package com.notronix.lw.model;

import java.time.Instant;

public class PurchaseOrderNote
{
    private String pkPurchaseOrderNoteId;
    private String Note;
    private Instant NoteDateTime;
    private String UserName;
    private String NoteDate	;
    private String NoteTime;

    public String getPkPurchaseOrderNoteId() {
        return pkPurchaseOrderNoteId;
    }

    public void setPkPurchaseOrderNoteId(String pkPurchaseOrderNoteId) {
        this.pkPurchaseOrderNoteId = pkPurchaseOrderNoteId;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String note) {
        Note = note;
    }

    public Instant getNoteDateTime() {
        return NoteDateTime;
    }

    public void setNoteDateTime(Instant noteDateTime) {
        NoteDateTime = noteDateTime;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getNoteDate() {
        return NoteDate;
    }

    public void setNoteDate(String noteDate) {
        NoteDate = noteDate;
    }

    public String getNoteTime() {
        return NoteTime;
    }

    public void setNoteTime(String noteTime) {
        NoteTime = noteTime;
    }
}
