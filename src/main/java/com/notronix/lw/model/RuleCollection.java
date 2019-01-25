package com.notronix.lw.model;

import java.util.ArrayList;
import java.util.List;

public class RuleCollection<T> extends ArrayList<T>
{
    private T Item;
    private List<T> Items;

    public T getItem() {
        return Item;
    }

    public void setItem(T item) {
        Item = item;
    }

    public List<T> getItems() {
        return Items;
    }

    public void setItems(List<T> items) {
        Items = items;
    }
}
