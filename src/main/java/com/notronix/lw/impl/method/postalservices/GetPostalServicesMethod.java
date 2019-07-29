package com.notronix.lw.impl.method.postalservices;

import com.google.gson.Gson;
import com.notronix.lw.api.model.PostalServiceWithChannelAndShippingLinks;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.Arrays;
import java.util.List;

public class GetPostalServicesMethod extends AbstractLinnworksAPIMethod<List<PostalServiceWithChannelAndShippingLinks>>
{
    @Override
    public String getURI() {
        return "PostalServices/GetPostalServices";
    }

    @Override
    public List<PostalServiceWithChannelAndShippingLinks> getResponse(Gson gson, String jsonPayload) {
        return Arrays.asList(gson.fromJson(jsonPayload, PostalServiceWithChannelAndShippingLinks[].class));
    }
}
