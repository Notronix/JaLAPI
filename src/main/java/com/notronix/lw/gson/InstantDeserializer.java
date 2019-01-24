package com.notronix.lw.gson;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.time.Instant;
import java.time.format.DateTimeParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InstantDeserializer implements JsonDeserializer<Instant>
{
    private static Pattern MISSING_Z_FORMAT = Pattern.compile("[\\d]{4}-[\\d]{2}-[\\d]{2}T[\\d]{2}:[\\d]{2}:[\\d]{2}[.\\d]*$");

    @Override
    public Instant deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        try {
            String date = json.getAsString().replaceFirst("\\+00:00$", "Z");
            Matcher matcher = MISSING_Z_FORMAT.matcher(date);
            if (matcher.matches()) {
                date += "Z";
            }

            return Instant.parse(date);
        }
        catch (DateTimeParseException ex) {
            throw new JsonParseException("Unable to convert date string to Instant.", ex);
        }
    }
}
