package com.notronix.lw.api.model;

import java.time.Instant;

public class ChannelOrderNote
{
    private String Note;
    private Instant NoteEntryDate;
    private String NoteUserName;
    private Boolean Internal;

    public String getNote() {
        return Note;
    }

    public void setNote(String note) {
        Note = note;
    }

    public Instant getNoteEntryDate() {
        return NoteEntryDate;
    }

    public void setNoteEntryDate(Instant noteEntryDate) {
        NoteEntryDate = noteEntryDate;
    }

    public String getNoteUserName() {
        return NoteUserName;
    }

    public void setNoteUserName(String noteUserName) {
        NoteUserName = noteUserName;
    }

    public Boolean getInternal() {
        return Internal;
    }

    public void setInternal(Boolean internal) {
        Internal = internal;
    }
}
