package com.notronix.lw.api.model;

public class ChannelPaymentMethod
{
    private Integer fkChannelId;
    private Integer pkRowId;
    private String FriendlyName;
    private String Tag;
    private String Site;
    private Boolean IsChanged;

    public Integer getFkChannelId() {
        return fkChannelId;
    }

    public void setFkChannelId(Integer fkChannelId) {
        this.fkChannelId = fkChannelId;
    }

    public Integer getPkRowId() {
        return pkRowId;
    }

    public void setPkRowId(Integer pkRowId) {
        this.pkRowId = pkRowId;
    }

    public String getFriendlyName() {
        return FriendlyName;
    }

    public void setFriendlyName(String friendlyName) {
        FriendlyName = friendlyName;
    }

    public String getTag() {
        return Tag;
    }

    public void setTag(String tag) {
        Tag = tag;
    }

    public String getSite() {
        return Site;
    }

    public void setSite(String site) {
        Site = site;
    }

    public Boolean getChanged() {
        return IsChanged;
    }

    public void setChanged(Boolean changed) {
        IsChanged = changed;
    }
}
