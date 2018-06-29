package com.notronix.lw.methods.inventory;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.KeyGuidValue;

import java.util.List;

public class GetPackageGroupsMethod extends InventoryMethod<List<KeyGuidValue>>
{
    @Override
    public String getName() {
        return "GetPackageGroups";
    }

    @Override
    public String getPayload() {
        return "";
    }

    @Override
    public List<KeyGuidValue> getResponse() throws LinnworksAPIException {
        return new Gson().fromJson(getJsonResult(), new TypeToken<List<KeyGuidValue>>(){}.getType());
    }
}
