package com.notronix.lw.methods.stock;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.gson.InstantDeserializer;
import com.notronix.lw.model.GetStockLevelBatchRequest;
import com.notronix.lw.model.GetStockLevelBatchResponse;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;

import static java.util.Objects.requireNonNull;

public class GetStockLevelBatchMethod extends StockMethod<List<GetStockLevelBatchResponse>>
{
    private GetStockLevelBatchRequest request;

    @Override
    public String getName() {
        return "GetStockLevel_Batch";
    }

    @Override
    public String getPayload() {
        return "request=" + new Gson().toJson(requireNonNull(request));
    }

    @Override
    public List<GetStockLevelBatchResponse> getResponse() throws LinnworksAPIException {
        Gson gson = new GsonBuilder().registerTypeAdapter(Instant.class, new InstantDeserializer()).create();

        return Arrays.asList(gson.fromJson(getJsonResult(), GetStockLevelBatchResponse[].class));
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
