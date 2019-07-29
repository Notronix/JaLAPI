package com.notronix.lw.impl.method.inventory;

import com.google.gson.Gson;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

public class GetNewItemNumberMethod extends AbstractLinnworksAPIMethod<String>
{
    @Override
    public String getURI() {
        return "Inventory/GetNewItemNumber";
    }

    @Override
    public String getResponse(Gson gson, String jsonPayload) {
        return gson.fromJson(jsonPayload, String.class);
    }
}
