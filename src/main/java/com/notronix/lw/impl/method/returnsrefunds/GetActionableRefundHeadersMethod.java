package com.notronix.lw.impl.method.returnsrefunds;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.GetActionableRefundHeadersRequest;
import com.notronix.lw.api.model.GetActionableRefundHeadersResponse;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class GetActionableRefundHeadersMethod extends AbstractLinnworksAPIMethod<GetActionableRefundHeadersResponse>
{
    private GetActionableRefundHeadersRequest request;

    @Override
    public String getURI() {
        return "ReturnsRefunds/GetActionableRefundHeaders";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        requireNonNull(requireNonNull(request).getPage());

        return urlEncode("request", gson.toJson(request));
    }

    @Override
    public GetActionableRefundHeadersResponse getResponse(Gson gson, String jsonPayload) {
        GetActionableRefundHeadersResponse response = gson.fromJson(jsonPayload, GetActionableRefundHeadersResponse.class);

        if (response.hasNextPage()) {
            response.setNextBuilder(method -> {
                if (!(method instanceof GetActionableRefundHeadersMethod)) {
                    throw new IllegalArgumentException("invalid method");
                }

                ((GetActionableRefundHeadersMethod) method)
                        .withRequest(new GetActionableRefundHeadersRequest()
                                .withFilters(request.getFilters()).withPage(response.getNextPageNumber()));
            });
        }

        return response;
    }

    public GetActionableRefundHeadersRequest getRequest() {
        return request;
    }

    public void setRequest(GetActionableRefundHeadersRequest request) {
        this.request = request;
    }

    public GetActionableRefundHeadersMethod withRequest(GetActionableRefundHeadersRequest request) {
        this.request = request;
        return this;
    }
}
