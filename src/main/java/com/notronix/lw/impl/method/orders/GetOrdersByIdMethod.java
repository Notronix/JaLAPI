package com.notronix.lw.impl.method.orders;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.OrderDetails;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class GetOrdersByIdMethod extends AbstractLinnworksAPIMethod<List<OrderDetails>>
{
    private List<UUID> pkOrderIds;

    @Override
    public String getURI() {
        return "Orders/GetOrdersById";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        return urlEncode("pkOrderIds", gson.toJson(requireNonNull(pkOrderIds)));
    }

    @Override
    public List<OrderDetails> getResponse(Gson gson, String jsonPayload) {
        return Arrays.asList(gson.fromJson(jsonPayload, OrderDetails[].class));
    }

    public List<UUID> getPkOrderIds() {
        return pkOrderIds;
    }

    public void setPkOrderIds(List<UUID> pkOrderIds) {
        this.pkOrderIds = pkOrderIds;
    }

    public GetOrdersByIdMethod withPkOrderIds(List<UUID> pkOrderIds) {
        this.pkOrderIds = pkOrderIds;
        return this;
    }
}
