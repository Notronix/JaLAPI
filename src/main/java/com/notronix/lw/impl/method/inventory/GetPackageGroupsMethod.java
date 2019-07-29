package com.notronix.lw.impl.method.inventory;

import com.google.gson.Gson;
import com.notronix.lw.api.model.KeyGuidValue;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.Arrays;
import java.util.List;

public class GetPackageGroupsMethod extends AbstractLinnworksAPIMethod<List<KeyGuidValue>>
{
    @Override
    public String getURI() {
        return "Inventory/GetPackageGroups";
    }

    @Override
    public List<KeyGuidValue> getResponse(Gson gson, String jsonPayload) {
        return Arrays.asList(gson.fromJson(jsonPayload, KeyGuidValue[].class));
    }
}
