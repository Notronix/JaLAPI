package com.notronix.lw.model;

public class OrderCustomerInfo
{
    private String ChannelBuyerName;
    private CustomerAddress	Address;
    private Address BillingAddress;

    public String getChannelBuyerName()
    {
        return ChannelBuyerName;
    }

    public void setChannelBuyerName(String channelBuyerName)
    {
        ChannelBuyerName = channelBuyerName;
    }

    public CustomerAddress getAddress()
    {
        return Address;
    }

    public void setAddress(CustomerAddress address)
    {
        Address = address;
    }

    public com.notronix.lw.model.Address getBillingAddress()
    {
        return BillingAddress;
    }

    public void setBillingAddress(com.notronix.lw.model.Address billingAddress)
    {
        BillingAddress = billingAddress;
    }
}
