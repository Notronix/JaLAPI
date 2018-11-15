package com.notronix.lw.methods.orders;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;

import java.util.List;

import static java.util.Objects.requireNonNull;

public class UnassignToFolderMethod extends OrdersMethod<List<String>>
{
    private List<String> orderIds;
    private String folder;

    @Override
    public String getName() {
        return "UnassignToFolder";
    }

    @Override
    public String getPayload() {
        return "orderIds=" + new Gson().toJson(requireNonNull(orderIds)) + "&folder=" + requireNonNull(folder);
    }

    @Override
    public List<String> getResponse() throws LinnworksAPIException {
        return new Gson().fromJson(getJsonResult(), LIST_OF_STRINGS);
    }

    public List<String> getOrderIds() {
        return orderIds;
    }

    public void setOrderIds(List<String> orderIds) {
        this.orderIds = orderIds;
    }

    public UnassignToFolderMethod withOrderIds(List<String> orderIds) {
        this.orderIds = orderIds;
        return this;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public UnassignToFolderMethod withFolder(String folder) {
        this.folder = folder;
        return this;
    }
}
