package com.notronix.lw.impl.method.orders;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.OpenOrder;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static com.notronix.lw.impl.method.MethodUtils.putIfProvided;
import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class CreateNewOrderMethod extends AbstractLinnworksAPIMethod<OpenOrder>
{
    private UUID fulfilmentCenter;
    private Boolean createAsDraft;

    @Override
    public String getURI() {
        return "Orders/CreateNewOrder";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        Map<String, Object> params = new HashMap<>();
        params.put("fulfilmentCenter", requireNonNull(fulfilmentCenter));
        putIfProvided(params, "createAsDraft", createAsDraft);

        return urlEncode(params);
    }

    @Override
    public OpenOrder getResponse(Gson gson, String jsonPayload) {
        return gson.fromJson(jsonPayload, OpenOrder.class);
    }

    public UUID getFulfilmentCenter() {
        return fulfilmentCenter;
    }

    public void setFulfilmentCenter(UUID fulfilmentCenter) {
        this.fulfilmentCenter = fulfilmentCenter;
    }

    public CreateNewOrderMethod withFulfilmentCenter(UUID fulfilmentCenter) {
        this.fulfilmentCenter = fulfilmentCenter;
        return this;
    }

    public Boolean getCreateAsDraft() {
        return createAsDraft;
    }

    public void setCreateAsDraft(Boolean createAsDraft) {
        this.createAsDraft = createAsDraft;
    }

    public CreateNewOrderMethod withCreateAsDraft(Boolean createAsDraft) {
        this.createAsDraft = createAsDraft;
        return this;
    }
}
