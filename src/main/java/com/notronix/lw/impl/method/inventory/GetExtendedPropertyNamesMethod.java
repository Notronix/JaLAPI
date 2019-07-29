package com.notronix.lw.impl.method.inventory;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.Arrays;
import java.util.List;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class GetExtendedPropertyNamesMethod extends AbstractLinnworksAPIMethod<List<String>>
{
    private String propertyType;

    @Override
    public String getURI() {
        return "Inventory/GetExtendedPropertyNames";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        return urlEncode("propertyType", requireNonNull(propertyType));
    }

    @Override
    public List<String> getResponse(Gson gson, String jsonPayload) {
        return Arrays.asList(gson.fromJson(jsonPayload, String[].class));
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public GetExtendedPropertyNamesMethod withPropertyType(String propertyType) {
        this.propertyType = propertyType;
        return this;
    }
}
