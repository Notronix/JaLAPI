package com.notronix.lw.impl.method.purchaseorder;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.SearchPurchaseOrderParameter;
import com.notronix.lw.api.model.SearchPurchaseOrdersResult;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class SearchPurchaseOrdersMethod extends AbstractLinnworksAPIMethod<SearchPurchaseOrdersResult>
{
    private SearchPurchaseOrderParameter searchParameter;

    @Override
    public String getURI() {
        return "PurchaseOrder/Search_PurchaseOrders";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        return urlEncode("searchParameter", gson.toJson(requireNonNull(searchParameter)));
    }

    @Override
    public SearchPurchaseOrdersResult getResponse(Gson gson, String jsonPayload) {
        SearchPurchaseOrdersResult result = gson.fromJson(jsonPayload, SearchPurchaseOrdersResult.class);

        if (result.hasNextPage()) {
            result.setNextBuilder(method -> {
                if (!(method instanceof SearchPurchaseOrdersMethod)) {
                    throw new IllegalArgumentException("invalid method");
                }

                ((SearchPurchaseOrdersMethod) method).withSearchParameter(new SearchPurchaseOrderParameter()
                        .withDateFrom(searchParameter.getDateFrom())
                        .withDateTo(searchParameter.getDateTo())
                        .withEntriesPerPage(searchParameter.getEntriesPerPage())
                        .withLocation(searchParameter.getLocation())
                        .withReferenceLike(searchParameter.getReferenceLike())
                        .withStatus(searchParameter.getStatus())
                        .withSupplier(searchParameter.getSupplier())
                        .withPageNumber(result.getNextPageNumber()));
            });
        }

        return result;
    }

    public SearchPurchaseOrderParameter getSearchParameter() {
        return searchParameter;
    }

    public void setSearchParameter(SearchPurchaseOrderParameter searchParameter) {
        this.searchParameter = searchParameter;
    }

    public SearchPurchaseOrdersMethod withSearchParameter(SearchPurchaseOrderParameter searchParameter) {
        this.searchParameter = searchParameter;
        return this;
    }
}
