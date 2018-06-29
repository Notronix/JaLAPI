package com.notronix.lw.methods.inventory;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;

public class GetNewItemNumberMethod extends InventoryMethod<String>
{
    @Override
    public String getName() {
        return "GetNewItemNumber";
    }

    @Override
    public String getPayload() {
        return "";
    }

    @Override
    public String getResponse() throws LinnworksAPIException {
        return new Gson().fromJson(getJsonResult(), String.class);
    }
}
