package com.notronix.lw.methods.inventory;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.Supplier;

import java.util.Arrays;
import java.util.List;

public class GetSuppliersMethod extends InventoryMethod<List<Supplier>>
{
    @Override
    public String getName()
    {
        return "GetSuppliers";
    }

    @Override
    public String getPayload()
    {
        return null;
    }

    @Override
    public List<Supplier> getResponse() throws LinnworksAPIException
    {
        return Arrays.asList(new Gson().fromJson(getJsonResult(), Supplier[].class));
    }
}
