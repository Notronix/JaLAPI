package com.notronix.lw.methods.orders;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.OrderDetails;

import java.util.Arrays;
import java.util.List;

public class GetOrdersByIdMethod extends OrdersMethod<List<OrderDetails>>
{
    private List<String> orderIds;

    @Override
    public String getName()
    {
        return "GetOrdersById";
    }

    @Override
    public String getPayload()
    {
        String ids = "";

        if (orderIds != null)
        {
            for (String orderId : orderIds)
            {
                if (ids.trim().length() > 0)
                {
                    ids += ",";
                }

                ids += "\"" + orderId + "\"";
            }
        }

        return "pkOrderIds=[" + ids + "]";
    }

    @Override
    public List<OrderDetails> getResponse() throws LinnworksAPIException
    {
        return Arrays.asList(new Gson().fromJson(getJsonResult(), OrderDetails[].class));
    }

    public List<String> getOrderIds()
    {
        return orderIds;
    }

    public void setOrderIds(List<String> orderIds)
    {
        this.orderIds = orderIds;
    }

    public GetOrdersByIdMethod withOrderIds(List<String> orderIds)
    {
        this.orderIds = orderIds;
        return this;
    }
}