package com.notronix.lw.impl.method.stock;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.DeleteVariationGroupsRequest;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class DeleteVariationGroupsMethod extends AbstractLinnworksAPIMethod<Void>
{
    private DeleteVariationGroupsRequest request;

    @Override
    public String getURI() {
        return "Stock/DeleteVariationGroups";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        return urlEncode("request", gson.toJson(requireNonNull(request)));
    }

    @Override
    public Void getResponse(Gson gson, String jsonPayload) {
        return null;
    }

    public DeleteVariationGroupsRequest getRequest() {
        return request;
    }

    public void setRequest(DeleteVariationGroupsRequest request) {
        this.request = request;
    }

    public DeleteVariationGroupsMethod withRequest(DeleteVariationGroupsRequest request) {
        this.request = request;
        return this;
    }
}
