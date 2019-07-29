package com.notronix.lw.impl.method.returnsrefunds;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.GetRefundHeadersByOrderIdRequest;
import com.notronix.lw.api.model.GetRefundHeadersByOrderIdResponse;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class GetRefundHeadersByOrderIdMethod extends AbstractLinnworksAPIMethod<GetRefundHeadersByOrderIdResponse>
{
    private GetRefundHeadersByOrderIdRequest request;

    @Override
    public String getURI() {
        return "ReturnsRefunds/GetRefundHeadersByOrderId";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        return urlEncode("request", gson.toJson(requireNonNull(request)));
    }

    @Override
    public GetRefundHeadersByOrderIdResponse getResponse(Gson gson, String jsonPayload) {
        return gson.fromJson(jsonPayload, GetRefundHeadersByOrderIdResponse.class);
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
