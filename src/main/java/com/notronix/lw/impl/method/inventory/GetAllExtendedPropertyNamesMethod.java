package com.notronix.lw.impl.method.inventory;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

public class GetAllExtendedPropertyNamesMethod extends AbstractLinnworksAPIMethod<Map<String, List<String>>>
{
    private static final Type EXTENDED_PROPERTY_NAME_MAP = new TypeToken<Map<String, List<String>>>(){}.getType();

    @Override
    public String getURI() {
        return "Inventory/GetAllExtendedPropertyNames";
    }

    @Override
    public Map<String, List<String>> getResponse(Gson gson, String jsonPayload) {
        return gson.fromJson(jsonPayload, EXTENDED_PROPERTY_NAME_MAP);
    }
}
