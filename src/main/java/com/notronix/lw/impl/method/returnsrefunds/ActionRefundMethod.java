package com.notronix.lw.impl.method.returnsrefunds;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.ActionRefundRequest;
import com.notronix.lw.api.model.ActionRefundResponse;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class ActionRefundMethod extends AbstractLinnworksAPIMethod<ActionRefundResponse>
{
    private ActionRefundRequest request;

    @Override
    public String getURI() {
        return "ReturnsRefunds/ActionRefund";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        return urlEncode("request", gson.toJson(requireNonNull(request)));
    }

    @Override
    public ActionRefundResponse getResponse(Gson gson, String jsonPayload) {
        return gson.fromJson(jsonPayload, ActionRefundResponse.class);
    }

    public ActionRefundRequest getRequest() {
        return request;
    }

    public void setRequest(ActionRefundRequest request) {
        this.request = request;
    }

    public ActionRefundMethod withRequest(ActionRefundRequest request) {
        this.request = request;
        return this;
    }
}
