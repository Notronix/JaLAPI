package com.notronix.lw.impl.method.stock;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.api.model.VariationGroup;
import com.notronix.lw.api.model.VariationGroupTemplate;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class CreateVariationGroupMethod extends AbstractLinnworksAPIMethod<VariationGroup>
{
    private VariationGroupTemplate template;

    @Override
    public String getURI() {
        return "Stock/CreateVariationGroup";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        return urlEncode("template", gson.toJson(requireNonNull(template)));
    }

    @Override
    public VariationGroup getResponse(Gson gson, String jsonPayload) {
        return gson.fromJson(jsonPayload, VariationGroup.class);
    }

    public VariationGroupTemplate getTemplate() {
        return template;
    }

    public void setTemplate(VariationGroupTemplate template) {
        this.template = template;
    }

    public CreateVariationGroupMethod withTemplate(VariationGroupTemplate template) {
        this.template = template;
        return this;
    }
}
