package com.notronix.lw.model;

public class ShippingService
{
    private String pkPostalServiceId;
    private String PostalServiceName;
    private String vendor;
    private String accountid;

    public String getPkPostalServiceId() {
        return pkPostalServiceId;
    }

    public void setPkPostalServiceId(String pkPostalServiceId) {
        this.pkPostalServiceId = pkPostalServiceId;
    }

    public String getPostalServiceName() {
        return PostalServiceName;
    }

    public void setPostalServiceName(String postalServiceName) {
        PostalServiceName = postalServiceName;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getAccountid() {
        return accountid;
    }

    public void setAccountid(String accountid) {
        this.accountid = accountid;
    }
}
