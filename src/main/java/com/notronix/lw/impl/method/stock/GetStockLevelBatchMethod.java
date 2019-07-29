package com.notronix.lw.impl.method.stock;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.GetStockLevelBatchRequest;
import com.notronix.lw.api.model.GetStockLevelBatchResponse;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.Arrays;
import java.util.List;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class GetStockLevelBatchMethod extends AbstractLinnworksAPIMethod<List<GetStockLevelBatchResponse>>
{
    private GetStockLevelBatchRequest request;

    @Override
    public String getURI() {
        return "Stock/GetStockLevel_Batch";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        return urlEncode("request", gson.toJson(requireNonNull(request)));
    }

    @Override
    public List<GetStockLevelBatchResponse> getResponse(Gson gson, String jsonPayload) {
        return Arrays.asList(gson.fromJson(jsonPayload, GetStockLevelBatchResponse[].class));
    }

    public GetStockLevelBatchRequest getRequest() {
        return request;
    }

    public void setRequest(GetStockLevelBatchRequest request) {
        this.request = request;
    }

    public GetStockLevelBatchMethod withRequest(GetStockLevelBatchRequest request) {
        this.request = request;
        return this;
    }
}
