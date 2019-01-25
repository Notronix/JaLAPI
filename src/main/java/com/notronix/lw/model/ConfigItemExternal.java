package com.notronix.lw.model;

public class ConfigItemExternal
{
    private Integer Length;
    private Long LongLength;
    private Integer Rank;
    private Object SyncRoot;
    private Boolean IsReadOnly;
    private Boolean IsFixedSize	;
    private Boolean IsSynchronized;

    public Integer getLength() {
        return Length;
    }

    public void setLength(Integer length) {
        Length = length;
    }

    public Long getLongLength() {
        return LongLength;
    }

    public void setLongLength(Long longLength) {
        LongLength = longLength;
    }

    public Integer getRank() {
        return Rank;
    }

    public void setRank(Integer rank) {
        Rank = rank;
    }

    public Object getSyncRoot() {
        return SyncRoot;
    }

    public void setSyncRoot(Object syncRoot) {
        SyncRoot = syncRoot;
    }

    public Boolean getReadOnly() {
        return IsReadOnly;
    }

    public void setReadOnly(Boolean readOnly) {
        IsReadOnly = readOnly;
    }

    public Boolean getFixedSize() {
        return IsFixedSize;
    }

    public void setFixedSize(Boolean fixedSize) {
        IsFixedSize = fixedSize;
    }

    public Boolean getSynchronized() {
        return IsSynchronized;
    }

    public void setSynchronized(Boolean aSynchronized) {
        IsSynchronized = aSynchronized;
    }
}
