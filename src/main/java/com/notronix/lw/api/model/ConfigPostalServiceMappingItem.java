package com.notronix.lw.api.model;

import java.util.UUID;

public class ConfigPostalServiceMappingItem
{
    private Integer fkChannelId;
    private Integer pkRowId;
    private String Tag;
    private UUID fkPostalServiceId;
    private String PostalServiceName;
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

    public String getTag() {
        return Tag;
    }

    public void setTag(String tag) {
        Tag = tag;
    }

    public UUID getFkPostalServiceId() {
        return fkPostalServiceId;
    }

    public void setFkPostalServiceId(UUID fkPostalServiceId) {
        this.fkPostalServiceId = fkPostalServiceId;
    }

    public String getPostalServiceName() {
        return PostalServiceName;
    }

    public void setPostalServiceName(String postalServiceName) {
        PostalServiceName = postalServiceName;
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
