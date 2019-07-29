package com.notronix.lw.api.model;

import java.util.UUID;

public class ConfigPaymentMethodMappingItem
{
    private Integer fkChannelId;
    private Integer pkRowId;
    private String Tag;
    private UUID fkBankId;
    private String PaymentMethodName;
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

    public UUID getFkBankId() {
        return fkBankId;
    }

    public void setFkBankId(UUID fkBankId) {
        this.fkBankId = fkBankId;
    }

    public String getPaymentMethodName() {
        return PaymentMethodName;
    }

    public void setPaymentMethodName(String paymentMethodName) {
        PaymentMethodName = paymentMethodName;
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
