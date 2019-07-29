package com.notronix.lw.impl.method.returnsrefunds;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.HistoryType;
import com.notronix.lw.api.model.SearchField;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.Arrays;
import java.util.List;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class GetSearchTypesMethod extends AbstractLinnworksAPIMethod<List<SearchField>>
{
    private HistoryType historyType;

    @Override
    public String getURI() {
        return "ReturnsRefunds/GetSearchTypes";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        return urlEncode("historyType", requireNonNull(historyType).ordinal());
    }

    @Override
    public List<SearchField> getResponse(Gson gson, String jsonPayload) {
        return Arrays.asList(gson.fromJson(jsonPayload, SearchField[].class));
    }

    public HistoryType getHistoryType() {
        return historyType;
    }

    public void setHistoryType(HistoryType historyType) {
        this.historyType = historyType;
    }

    public GetSearchTypesMethod withHistoryType(HistoryType historyType) {
        this.historyType = historyType;
        return this;
    }
}
