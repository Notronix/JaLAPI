package com.notronix.lw.impl.method.stock;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.DeleteVariationItemsRequest;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class DeleteVariationItemsMethod extends AbstractLinnworksAPIMethod<Void>
{
    private DeleteVariationItemsRequest request;

    @Override
    public String getURI() {
        return "Stock/DeleteVariationItems";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        return urlEncode("request", gson.toJson(requireNonNull(request)));
    }

    @Override
    public Void getResponse(Gson gson, String jsonPayload) {
        return null;
    }

    public DeleteVariationItemsRequest getRequest() {
        return request;
    }

    public void setRequest(DeleteVariationItemsRequest request) {
        this.request = request;
    }

    public DeleteVariationItemsMethod withRequest(DeleteVariationItemsRequest request) {
        this.request = request;
        return this;
    }
}
