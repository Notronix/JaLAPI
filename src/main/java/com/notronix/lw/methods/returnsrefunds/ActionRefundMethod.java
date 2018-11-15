package com.notronix.lw.methods.returnsrefunds;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.ActionRefundRequest;
import com.notronix.lw.model.ActionRefundResponse;

import static java.util.Objects.requireNonNull;

public class ActionRefundMethod extends ReturnsRefundsMethod<ActionRefundResponse>
{
    private ActionRefundRequest request;

    @Override
    public String getName() {
        return "ActionRefund";
    }

    @Override
    public String getPayload() {
        return "request=" + new Gson().toJson(requireNonNull(request));
    }

    @Override
    public ActionRefundResponse getResponse() throws LinnworksAPIException {
        return new Gson().fromJson(getJsonResult(), ActionRefundResponse.class);
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
