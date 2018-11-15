package com.notronix.lw.methods.returnsrefunds;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.GetRefundOptionsRequest;
import com.notronix.lw.model.GetRefundOptionsResponse;

public class GetRefundOptionsMethod extends ReturnsRefundsMethod<GetRefundOptionsResponse>
{
    private GetRefundOptionsRequest request;

    @Override
    public String getName() {
        return "GetRefundOptions";
    }

    @Override
    public String getPayload() {
        return "request=" + new Gson().toJson(request);
    }

    @Override
    public GetRefundOptionsResponse getResponse() throws LinnworksAPIException {
        return new Gson().fromJson(getJsonResult(), GetRefundOptionsResponse.class);
    }

    public GetRefundOptionsRequest getRequest() {
        return request;
    }

    public void setRequest(GetRefundOptionsRequest request) {
        this.request = request;
    }

    public GetRefundOptionsMethod withRequest(GetRefundOptionsRequest request) {
        this.request = request;
        return this;
    }
}
