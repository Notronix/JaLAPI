package com.notronix.lw.methods.postalservices;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.PostalService;

import java.util.List;

public class GetPostalServicesMethod extends PostalServicesMethod<List<PostalService>>
{
    @Override
    public String getName() {
        return "GetPostalServices";
    }

    @Override
    public String getPayload() {
        return "";
    }

    @Override
    public List<PostalService> getResponse() throws LinnworksAPIException {
        return new Gson().fromJson(getJsonResult(), new TypeToken<List<PostalService>>(){}.getType());
    }
}
