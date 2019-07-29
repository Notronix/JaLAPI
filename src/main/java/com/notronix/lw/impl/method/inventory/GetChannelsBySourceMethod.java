package com.notronix.lw.impl.method.inventory;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.Channel;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.Arrays;
import java.util.List;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class GetChannelsBySourceMethod extends AbstractLinnworksAPIMethod<List<Channel>>
{
    private String source;

    @Override
    public String getURI() {
        return "Inventory/GetChannelsBySource";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        return urlEncode("source", requireNonNull(source));
    }

    @Override
    public List<Channel> getResponse(Gson gson, String jsonPayload) {
        return Arrays.asList(gson.fromJson(jsonPayload, Channel[].class));
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
