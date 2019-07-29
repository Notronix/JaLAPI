package com.notronix.lw.impl.method.inventory;

import com.google.gson.Gson;
import com.notronix.lw.api.model.Supplier;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.Arrays;
import java.util.List;

public class GetSuppliersMethod extends AbstractLinnworksAPIMethod<List<Supplier>>
{
    @Override
    public String getURI() {
        return "Inventory/GetSuppliers";
    }

    @Override
    public List<Supplier> getResponse(Gson gson, String jsonPayload) {
        return Arrays.asList(gson.fromJson(jsonPayload, Supplier[].class));
    }
}
