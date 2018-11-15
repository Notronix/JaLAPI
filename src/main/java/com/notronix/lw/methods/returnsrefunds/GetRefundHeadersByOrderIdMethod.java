package com.notronix.lw.methods.returnsrefunds;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.GetRefundHeadersByOrderIdRequest;
import com.notronix.lw.model.GetRefundHeadersByOrderIdResponse;

public class GetRefundHeadersByOrderIdMethod extends ReturnsRefundsMethod<GetRefundHeadersByOrderIdResponse>
{
    private GetRefundHeadersByOrderIdRequest request;

    @Override
    public String getName() {
        return "GetRefundHeadersByOrderId";
    }

    @Override
    public String getPayload() {
        return "request=" + new Gson().toJson(request);
    }

    @Override
    public GetRefundHeadersByOrderIdResponse getResponse() throws LinnworksAPIException {
        return new Gson().fromJson(getJsonResult(), GetRefundHeadersByOrderIdResponse.class);
    }

    public GetRefundHeadersByOrderIdRequest getRequest() {
        return request;
    }

    public void setRequest(GetRefundHeadersByOrderIdRequest request) {
        this.request = request;
    }

    public GetRefundHeadersByOrderIdMethod withRequest(GetRefundHeadersByOrderIdRequest request) {
        this.request = request;
        return this;
    }
}
