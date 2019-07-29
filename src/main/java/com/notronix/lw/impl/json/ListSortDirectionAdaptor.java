package com.notronix.lw.impl.json;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.notronix.lw.api.model.ListSortDirection;

import java.io.IOException;

public class ListSortDirectionAdaptor extends TypeAdapter<ListSortDirection>
{
    @Override
    public void write(JsonWriter out, ListSortDirection value) throws IOException {
        out.value(value.ordinal());
    }

    @Override
    public ListSortDirection read(JsonReader in) throws IOException {
        return ListSortDirection.values()[in.nextInt()];
    }
}
