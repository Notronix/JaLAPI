package com.notronix.lw.impl.method.inventory;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.AddImageToInventoryItemRequest;
import com.notronix.lw.api.model.AddImageToInventoryItemResponse;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class AddImageToInventoryItemMethod extends AbstractLinnworksAPIMethod<AddImageToInventoryItemResponse>
{
    private AddImageToInventoryItemRequest request;

    @Override
    public String getURI() {
        return "Inventory/AddImageToInventoryItem";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        return urlEncode("request", gson.toJson(requireNonNull(request)));
    }

    @Override
    public AddImageToInventoryItemResponse getResponse(Gson gson, String jsonPayload) {
        return gson.fromJson(jsonPayload, AddImageToInventoryItemResponse.class);
    }

    public AddImageToInventoryItemRequest getRequest() {
        return request;
    }

    public void setRequest(AddImageToInventoryItemRequest request) {
        this.request = request;
    }

    public AddImageToInventoryItemMethod withRequest(AddImageToInventoryItemRequest request) {
        this.request = request;
        return this;
    }
}
