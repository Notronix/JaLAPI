package com.notronix.lw.methods.inventory;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.Channel;

import java.util.Arrays;
import java.util.List;

public class GetChannelsMethod extends InventoryMethod<List<Channel>>
{
    @Override
    public String getName()
    {
        return "GetChannels";
    }

    @Override
    public String getPayload()
    {
        return null;
    }

    @Override
    public List<Channel> getResponse()
            throws LinnworksAPIException
    {
        return Arrays.asList(new Gson().fromJson(getJsonResult(), Channel[].class));
    }
}
