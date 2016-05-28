package com.notronix.lw.methods.inventory;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.Category;

import java.util.Arrays;
import java.util.List;

public class GetCategoriesMethod extends InventoryMethod<List<Category>>
{
    @Override
    public String getName()
    {
        return "GetCategories";
    }

    @Override
    public String getPayload()
    {
        return null;
    }

    @Override
    public List<Category> getResponse()
            throws LinnworksAPIException
    {
        return Arrays.asList(new Gson().fromJson(getJsonResult(), Category[].class));
    }
}
