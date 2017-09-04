package com.notronix.lw.methods.stock;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.StockItemLevel;
import com.notronix.lw.model.StockLevelUpdate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetStockLevelMethod extends StockMethod<List<StockItemLevel>>
{
    private List<StockLevelUpdate> stockLevels = new ArrayList<>();

    @Override
    public String getName() {
        return "SetStockLevel";
    }

    @Override
    public String getPayload() {
        return "stockLevels=" + new Gson().toJson(stockLevels);
    }

    @Override
    public List<StockItemLevel> getResponse() throws LinnworksAPIException {
        return Arrays.asList(new Gson().fromJson(getJsonResult(), StockItemLevel[].class));
    }

    public List<StockLevelUpdate> getStockLevels() {
        return stockLevels;
    }

    public void setStockLevels(List<StockLevelUpdate> stockLevels) {
        this.stockLevels = stockLevels;
    }

    public SetStockLevelMethod withUpdates(List<StockLevelUpdate> stockLevels)
    {
        this.stockLevels = stockLevels;
        return this;
    }

    public void addUpdate(StockLevelUpdate stockLevelUpdate)
    {
        if (stockLevels == null)
        {
            stockLevels = new ArrayList<>();
        }

        stockLevels.add(stockLevelUpdate);
    }
}
