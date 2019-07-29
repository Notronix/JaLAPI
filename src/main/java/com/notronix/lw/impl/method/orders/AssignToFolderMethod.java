package com.notronix.lw.impl.method.orders;

import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;
import com.notronix.lw.impl.method.AbstractLinnworksAPIMethod;

import java.util.*;

import static com.notronix.lw.impl.method.MethodUtils.urlEncode;
import static java.util.Objects.requireNonNull;

public class AssignToFolderMethod extends AbstractLinnworksAPIMethod<List<UUID>>
{
    private List<UUID> orderIds;
    private String folder;

    @Override
    public String getURI() {
        return "Orders/AssignToFolder";
    }

    @Override
    public HttpContent getContent(Gson gson) {
        Map<String, Object> params = new HashMap<>();
        params.put("orderIds", gson.toJson(requireNonNull(orderIds)));
        params.put("folder", requireNonNull(folder));

        return urlEncode(params);
    }

    @Override
    public List<UUID> getResponse(Gson gson, String jsonPayload) {
        return Arrays.asList(gson.fromJson(jsonPayload, UUID[].class));
    }

    public List<UUID> getOrderIds() {
        return orderIds;
    }

    public void setOrderIds(List<UUID> orderIds) {
        this.orderIds = orderIds;
    }

    public AssignToFolderMethod withOrderIds(List<UUID> orderIds) {
        this.orderIds = orderIds;
        return this;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public AssignToFolderMethod withFolder(String folder) {
        this.folder = folder;
        return this;
    }
}
