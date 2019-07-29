package com.notronix.lw.impl.method.stock;

import com.google.api.client.http.HttpContent;
import com.google.api.client.http.UrlEncodedContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.StockItemLevel;
import com.notronix.lw.api.model.StockLevelUpdate;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.*;

import static com.notronix.lw.impl.method.MethodUtils.putIfProvided;
import static java.util.Objects.requireNonNull;

public class SetStockLevelMethod extends AbstractLinnworksAPIMethod<List<StockItemLevel>>
{
    private List<StockLevelUpdate> stockLevels = new ArrayList<>();
    private String changeSource;

    @Override
    public String getURI() {
        return "Stock/SetStockLevel";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        Map<String, Object> params = new HashMap<>();
        params.put("stockLevels", gson.toJson(requireNonNull(stockLevels)));
        putIfProvided(params, "changeSource", changeSource);

        return new UrlEncodedContent(params);
    }

    @Override
    public List<StockItemLevel> getResponse(Gson gson, String jsonPayload) {
        return Arrays.asList(gson.fromJson(jsonPayload, StockItemLevel[].class));
    }

    public List<StockLevelUpdate> getStockLevels() {
        return stockLevels;
    }

    public void setStockLevels(List<StockLevelUpdate> stockLevels) {
        this.stockLevels = stockLevels;
    }

    public SetStockLevelMethod withStockLevels(List<StockLevelUpdate> stockLevels) {
        this.stockLevels = stockLevels;
        return this;
    }

    public String getChangeSource() {
        return changeSource;
    }

    public void setChangeSource(String changeSource) {
        this.changeSource = changeSource;
    }

    public SetStockLevelMethod withChangeSource(String changeSource) {
        this.changeSource = changeSource;
        return this;
    }
}
