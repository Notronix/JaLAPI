package com.notronix.lw.impl.json;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.time.Instant;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InstantAdaptor extends TypeAdapter<Instant>
{
    private static Pattern MISSING_Z_FORMAT = Pattern.compile("[\\d]{4}-[\\d]{2}-[\\d]{2}T[\\d]{2}:[\\d]{2}:[\\d]{2}[.\\d]*$");

    @Override
    public void write(JsonWriter out, Instant value) throws IOException {
        if (value == null) {
            out.value("");
        }
        else {
            out.value(value.toString());
        }
    }

    @Override
    public Instant read(JsonReader in) throws IOException {
        JsonToken token = in.peek();

        if (token == JsonToken.NULL) {
            in.nextNull();
            return null;
        }

        String value = in.nextString().replaceFirst("\\+00:00$", "Z");
        Matcher matcher = MISSING_Z_FORMAT.matcher(value);
        if (matcher.matches()) {
            value += "Z";
        }

        return Instant.parse(value);
    }
}
