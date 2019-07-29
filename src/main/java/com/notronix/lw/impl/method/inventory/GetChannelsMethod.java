package com.notronix.lw.impl.method.inventory;

import com.google.gson.Gson;
import com.notronix.lw.api.model.Channel;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.Arrays;
import java.util.List;

public class GetChannelsMethod extends AbstractLinnworksAPIMethod<List<Channel>>
{
    @Override
    public String getURI() {
        return "Inventory/GetChannels";
    }

    @Override
    public List<Channel> getResponse(Gson gson, String jsonPayload) {
        return Arrays.asList(gson.fromJson(jsonPayload, Channel[].class));
    }
}
