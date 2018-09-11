package com.notronix.lw.methods.inventory;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;

import java.util.Arrays;
import java.util.List;

import static java.util.Objects.requireNonNull;

public class GetExtendedPropertyNamesMethod extends InventoryMethod<List<String>>
{
    private String propertyType;

    @Override
    public String getName()
    {
        return "GetExtendedPropertyNames";
    }

    @Override
    public String getPayload()
    {
        return "propertyType=" + requireNonNull(propertyType);
    }

    @Override
    public List<String> getResponse()
            throws LinnworksAPIException
    {
        return Arrays.asList(new Gson().fromJson(getJsonResult(), String[].class));
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }
}
