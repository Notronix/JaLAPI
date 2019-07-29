package com.notronix.lw.api.model;

import java.util.List;
import java.util.UUID;

public class DeleteVariationGroupsRequest
{
    private List<UUID> VariationGroupsIdList;

    public List<UUID> getVariationGroupsIdList() {
        return VariationGroupsIdList;
    }

    public void setVariationGroupsIdList(List<UUID> variationGroupsIdList) {
        VariationGroupsIdList = variationGroupsIdList;
    }

    public DeleteVariationGroupsRequest withVariationGroupsIdList(List<UUID> variationGroupsIdList) {
        VariationGroupsIdList = variationGroupsIdList;
        return this;
    }
}
