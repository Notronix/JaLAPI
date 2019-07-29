package com.notronix.lw.impl.method.stock;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.notronix.lw.api.method.PagedResult;
import com.notronix.lw.api.model.GenericPagedResult;
import com.notronix.lw.api.model.StockItem;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static com.notronix.lw.impl.method.MethodUtils.putIfProvided;
import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class GetStockItemsMethod extends AbstractLinnworksAPIMethod<GenericPagedResult<StockItem>>
{
    private String keyWord;
    private UUID locationId;
    private Integer entriesPerPage;
    private Integer pageNumber;
    private Boolean excludeComposites;
    private Boolean excludeVariations;
    private Boolean excludeBatches;

    @Override
    public String getURI() {
        return "Stock/GetStockItems";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        Map<String, Object> params = new HashMap<>();
        params.put("entriesPerPage", requireNonNull(entriesPerPage));
        params.put("pageNumber", requireNonNull(pageNumber));

        putIfProvided(params, "keyWord", keyWord);
        putIfProvided(params, "locationId", locationId);
        putIfProvided(params, "excludeComposites", excludeComposites);
        putIfProvided(params, "excludeVariations", excludeVariations);
        putIfProvided(params, "excludeBatches", excludeBatches);

        return urlEncode(params);
    }

    @Override
    public GenericPagedResult<StockItem> getResponse(Gson gson, String jsonPayload) {
        GenericPagedResult<StockItem> result =
                gson.fromJson(jsonPayload, new TypeToken<GenericPagedResult<StockItem>>(){}.getType());

        if (result.hasNextPage()) {
            result.setNextBuilder(method -> {
                if (!(method instanceof GetStockItemsMethod)) {
                    throw new IllegalArgumentException("Invalid method");
                }

                ((GetStockItemsMethod) method).withKeyWord(keyWord).withLocationId(locationId)
                        .withExcludeComposites(excludeComposites).withExcludeVariations(excludeVariations)
                        .withExcludeBatches(excludeBatches).withEntriesPerPage(entriesPerPage)
                        .withPageNumber(result.getNextPageNumber());
            });
        }

        return result;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public GetStockItemsMethod withKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }

    public UUID getLocationId() {
        return locationId;
    }

    public void setLocationId(UUID locationId) {
        this.locationId = locationId;
    }

    public GetStockItemsMethod withLocationId(UUID locationId) {
        this.locationId = locationId;
        return this;
    }

    public Integer getEntriesPerPage() {
        return entriesPerPage;
    }

    public void setEntriesPerPage(Integer entriesPerPage) {
        this.entriesPerPage = entriesPerPage;
    }

    public GetStockItemsMethod withEntriesPerPage(Integer entriesPerPage) {
        this.entriesPerPage = entriesPerPage;
        return this;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public GetStockItemsMethod withPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    public Boolean getExcludeComposites() {
        return excludeComposites;
    }

    public void setExcludeComposites(Boolean excludeComposites) {
        this.excludeComposites = excludeComposites;
    }

    public GetStockItemsMethod withExcludeComposites(Boolean excludeComposites) {
        this.excludeComposites = excludeComposites;
        return this;
    }

    public Boolean getExcludeVariations() {
        return excludeVariations;
    }

    public void setExcludeVariations(Boolean excludeVariations) {
        this.excludeVariations = excludeVariations;
    }

    public GetStockItemsMethod withExcludeVariations(Boolean excludeVariations) {
        this.excludeVariations = excludeVariations;
        return this;
    }

    public Boolean getExcludeBatches() {
        return excludeBatches;
    }

    public void setExcludeBatches(Boolean excludeBatches) {
        this.excludeBatches = excludeBatches;
    }

    public GetStockItemsMethod withExcludeBatches(Boolean excludeBatches) {
        this.excludeBatches = excludeBatches;
        return this;
    }
}
