package com.notronix.lw.methods.inventory;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.Channel;

import java.util.Arrays;
import java.util.List;

public class GetChannelsBySourceMethod extends InventoryMethod<List<Channel>>
{
    private String source;

    @Override
    public String getName() {
        return "GetChannelsBySource";
    }

    @Override
    public String getPayload() {
        return "source=" + source;
    }

    @Override
    public List<Channel> getResponse() throws LinnworksAPIException {
        return Arrays.asList(new Gson().fromJson(getJsonResult(), Channel[].class));
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public GetChannelsBySourceMethod withSource(String source) {
        this.source = source;
        return this;
    }
}
