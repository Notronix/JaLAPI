package com.notronix.lw.methods.inventory;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.notronix.lw.LinnworksAPIException;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

public class GetAllExtendedPropertyNamesMethod extends InventoryMethod<Map<String, List<String>>>
{
    private static final Type EXTENDED_PROPERTY_NAME_MAP = new TypeToken<Map<String, List<String>>>(){}.getType();

    @Override
    public String getName() {
        return "GetAllExtendedPropertyNames";
    }

    @Override
    public String getPayload() {
        return null;
    }

    @Override
    public Map<String, List<String>> getResponse() throws LinnworksAPIException {
        return new Gson().fromJson(getJsonResult(), EXTENDED_PROPERTY_NAME_MAP);
    }
}
