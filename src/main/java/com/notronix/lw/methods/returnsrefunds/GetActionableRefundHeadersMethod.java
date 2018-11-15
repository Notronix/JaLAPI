package com.notronix.lw.methods.returnsrefunds;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.GetActionableRefundHeadersRequest;
import com.notronix.lw.model.GetActionableRefundHeadersResponse;

import static java.util.Objects.requireNonNull;

public class GetActionableRefundHeadersMethod extends ReturnsRefundsMethod<GetActionableRefundHeadersResponse>
{
    private GetActionableRefundHeadersRequest getActionableRefundHeadersRequest;

    @Override
    public String getName() {
        return "GetActionableRefundHeaders";
    }

    @Override
    public String getPayload() {
        return "request=" + new Gson().toJson(requireNonNull(getActionableRefundHeadersRequest));
    }

    @Override
    public GetActionableRefundHeadersResponse getResponse() throws LinnworksAPIException {
        return new Gson().fromJson(getJsonResult(), GetActionableRefundHeadersResponse.class);
    }

    public GetActionableRefundHeadersRequest getGetActionableRefundHeadersRequest() {
        return getActionableRefundHeadersRequest;
    }

    public void setGetActionableRefundHeadersRequest(GetActionableRefundHeadersRequest getActionableRefundHeadersRequest) {
        this.getActionableRefundHeadersRequest = getActionableRefundHeadersRequest;
    }

    public GetActionableRefundHeadersMethod withGetActionableRefundHeadersRequest(GetActionableRefundHeadersRequest getActionableRefundHeadersRequest) {
        this.getActionableRefundHeadersRequest = getActionableRefundHeadersRequest;
        return this;
    }
}
