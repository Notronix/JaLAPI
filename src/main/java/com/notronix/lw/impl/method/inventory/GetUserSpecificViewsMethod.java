package com.notronix.lw.impl.method.inventory;

import com.google.gson.Gson;
import com.notronix.lw.api.model.InventoryView;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.Arrays;
import java.util.List;

public class GetUserSpecificViewsMethod extends AbstractLinnworksAPIMethod<List<InventoryView>>
{
    @Override
    public String getURI() {
        return "Inventory/GetUserSpecificViews";
    }

    @Override
    public List<InventoryView> getResponse(Gson gson, String jsonPayload) {
        return Arrays.asList(gson.fromJson(jsonPayload, InventoryView[].class));
    }
}
