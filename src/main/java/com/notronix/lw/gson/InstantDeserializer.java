package com.notronix.lw.gson;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.time.Instant;
import java.time.format.DateTimeParseException;

public class InstantDeserializer implements JsonDeserializer<Instant>
{
    @Override
    public Instant deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        try {
            return Instant.parse(json.getAsString());
        }
        catch (DateTimeParseException ex) {
            throw new JsonParseException("Unable to convert date string to Instant.", ex);
        }
    }
}
