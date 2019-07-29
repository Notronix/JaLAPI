package com.notronix.lw.impl.method.inventory;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.StockItemInv;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.UUID;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class GetInventoryItemByIdMethod extends AbstractLinnworksAPIMethod<StockItemInv>
{
    private UUID id;

    @Override
    public String getURI() {
        return "Inventory/GetInventoryItemById";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        return urlEncode("id", requireNonNull(id));
    }

    @Override
    public StockItemInv getResponse(Gson gson, String jsonPayload) {
        return gson.fromJson(jsonPayload, StockItemInv.class);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public GetInventoryItemByIdMethod withId(UUID id) {
        this.id = id;
        return this;
    }
}
