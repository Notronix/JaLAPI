package com.notronix.lw.methods.inventory;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.StockItemChannelSKU;

import java.util.UUID;

public class CreateInventoryItemChannelSKUsMethod extends InventoryMethod<UUID>
{
    private StockItemChannelSKU channelSKU;

    @Override
    public String getName()
    {
        return "CreateInventoryItemChannelSKUs";
    }

    @Override
    public String getPayload()
    {
        if (channelSKU != null && channelSKU.getChannelSKURowId() == null)
        {
            channelSKU.setChannelSKURowId(UUID.randomUUID().toString());
        }

        return "inventoryItemChannelSKUs=[" + new Gson().toJson(channelSKU) + "]";
    }

    @Override
    public UUID getResponse() throws LinnworksAPIException
    {
        return UUID.fromString(channelSKU.getChannelSKURowId());
    }

    public StockItemChannelSKU getChannelSKU() {
        return channelSKU;
    }

    public void setChannelSKU(StockItemChannelSKU channelSKU) {
        this.channelSKU = channelSKU;
    }

    public CreateInventoryItemChannelSKUsMethod withChannelSKU(StockItemChannelSKU channelSKU) {
        this.channelSKU = channelSKU;
        return this;
    }
}
