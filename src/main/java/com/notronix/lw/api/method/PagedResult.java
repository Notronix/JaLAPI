package com.notronix.lw.api.method;

import java.util.List;
import java.util.function.Consumer;

public interface PagedResult<T>
{
    Integer getPageNumber();
    Integer getEntriesPerPage();
    Integer getTotalEntries();
    Integer getTotalPages();
    List<T> getData();

    Consumer<LinnworksAPIMethod<? extends PagedResult<T>>> getNextBuilder();

    default <M extends LinnworksAPIMethod<? extends PagedResult<T>>> M getNextPage(M method) {
        if (getNextBuilder() != null) {
            getNextBuilder().accept(method);
        }

        return method;
    }
}
