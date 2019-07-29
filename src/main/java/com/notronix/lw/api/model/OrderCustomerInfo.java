package com.notronix.lw.api.model;

public class OrderCustomerInfo
{
    private String ChannelBuyerName;
    private CustomerAddress Address;
    private CustomerAddress BillingAddress;

    public String getChannelBuyerName() {
        return ChannelBuyerName;
    }

    public void setChannelBuyerName(String channelBuyerName) {
        ChannelBuyerName = channelBuyerName;
    }

    public CustomerAddress getAddress() {
        return Address;
    }

    public void setAddress(CustomerAddress address) {
        Address = address;
    }

    public CustomerAddress getBillingAddress() {
        return BillingAddress;
    }

    public void setBillingAddress(CustomerAddress billingAddress) {
        BillingAddress = billingAddress;
    }
}
