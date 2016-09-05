package com.notronix.lw.methods.orders;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.UserOrderView;

import java.util.Arrays;
import java.util.List;

public class GetOrderViewsMethod extends OrdersMethod<List<UserOrderView>>
{
    @Override
    public String getName()
    {
        return "GetOrderViews";
    }

    @Override
    public String getPayload()
    {
        return null;
    }

    @Override
    public List<UserOrderView> getResponse() throws LinnworksAPIException
    {
        return Arrays.asList(new Gson().fromJson(getJsonResult(), UserOrderView[].class));
    }
}
