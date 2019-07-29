package com.notronix.lw.api.model;

import java.util.List;

public class ConfigRuleCollection
{
    private ConfigRule Item;
    private List<ConfigRule> Items;

    public ConfigRule getItem() {
        return Item;
    }

    public void setItem(ConfigRule item) {
        Item = item;
    }

    public List<ConfigRule> getItems() {
        return Items;
    }

    public void setItems(List<ConfigRule> items) {
        Items = items;
    }
}
