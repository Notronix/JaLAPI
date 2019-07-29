package com.notronix.lw.impl.method.inventory;

import com.google.gson.Gson;
import com.notronix.lw.api.model.Category;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.Arrays;
import java.util.List;

public class GetCategoriesMethod extends AbstractLinnworksAPIMethod<List<Category>>
{
    @Override
    public String getURI() {
        return "Inventory/GetCategories";
    }

    @Override
    public List<Category> getResponse(Gson gson, String jsonPayload) {
        return Arrays.asList(gson.fromJson(jsonPayload, Category[].class));
    }
}
