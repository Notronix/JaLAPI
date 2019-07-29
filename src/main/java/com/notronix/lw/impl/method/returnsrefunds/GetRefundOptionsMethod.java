package com.notronix.lw.impl.method.returnsrefunds;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.GetRefundOptionsRequest;
import com.notronix.lw.api.model.GetRefundOptionsResponse;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class GetRefundOptionsMethod extends AbstractLinnworksAPIMethod<GetRefundOptionsResponse>
{
    private GetRefundOptionsRequest request;

    @Override
    public String getURI() {
        return "ReturnsRefunds/GetRefundOptions";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        return urlEncode("request", gson.toJson(requireNonNull(request)));
    }

    @Override
    public GetRefundOptionsResponse getResponse(Gson gson, String jsonPayload) {
        return gson.fromJson(jsonPayload, GetRefundOptionsResponse.class);
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
