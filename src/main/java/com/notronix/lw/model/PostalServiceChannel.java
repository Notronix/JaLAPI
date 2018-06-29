package com.notronix.lw.model;

public class PostalServiceChannel
{
    private String pkPostalServiceId;
    private String PostalServiceName;
    private String Source;
    private String SubSource;

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

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    public String getSubSource() {
        return SubSource;
    }

    public void setSubSource(String subSource) {
        SubSource = subSource;
    }
}
