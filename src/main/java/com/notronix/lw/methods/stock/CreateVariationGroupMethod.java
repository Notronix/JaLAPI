package com.notronix.lw.methods.stock;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.VariationGroup;
import com.notronix.lw.model.VariationGroupTemplate;

public class CreateVariationGroupMethod extends StockMethod<VariationGroup>
{
    private VariationGroupTemplate template;

    @Override
    public String getName() {
        return "CreateVariationGroup";
    }

    @Override
    public String getPayload() {
        return "template=" + new Gson().toJson(template);
    }

    @Override
    public VariationGroup getResponse() throws LinnworksAPIException {
        return new Gson().fromJson(getJsonResult(), VariationGroup.class);
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
