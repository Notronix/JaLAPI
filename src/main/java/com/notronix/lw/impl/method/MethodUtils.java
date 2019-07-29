package com.notronix.lw.impl.method;

import com.google.api.client.http.UrlEncodedContent;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

import static com.notronix.albacore.ContainerUtils.thereAreNo;
import static java.util.Collections.singletonMap;
import static java.util.Objects.requireNonNull;
import static org.apache.commons.lang3.StringUtils.isBlank;

public abstract class MethodUtils
{
    public static char getDelimiter(String uri) {
        return (uri != null && uri.contains("?")) ? '&' : '?';
    }

    public static String add(String uri, String key, Object value) {
        return add(uri, key, value, null);
    }

    public static <T> String add(String uri, String key, T value, Function<T, String> converter) {
        requireNonNull(key);
        requireNonNull(value);
        String convertedValue = (converter == null ? value.toString() : converter.apply(value));
        String result = (uri == null ? "" : uri);

        return result + getDelimiter(result) + key + "=" + convertedValue;
    }

    public static <T> String addIfProvided(String uri, String key, T value, Function<T, String> converter) {
        return (value == null) ? uri : add(uri, key, value, converter);
    }

    public static String addIfProvided(String uri, String key, Object value) {
        return (value == null) ? uri : add(uri, key, value, null);
    }

    public static void putIfProvided(Map<String, Object> parameters, String key, Object value) {
        putIfProvided(parameters, key, value, null);
    }

    public static <T> void putIfProvided(Map<String, Object> parameters, String key, T value, Function<T, ?> converter) {
        if (value == null) {
            return;
        }

        Object convertedValue = converter == null ? value : converter.apply(value);

        if (convertedValue instanceof CharSequence && isBlank((CharSequence) convertedValue)) {
            return;
        }

        if ((convertedValue instanceof Collection) && thereAreNo((Collection<?>) convertedValue)) {
            return;
        }

        if (convertedValue instanceof Map && thereAreNo((Map<?, ?>) convertedValue)) {
            return;
        }

        parameters.put(key, convertedValue);
    }

    public static UrlEncodedContent urlEncode(Map<String, Object> params) {
        return new UrlEncodedContent(params);
    }

    public static UrlEncodedContent urlEncode(String name, Object value) {
        return new UrlEncodedContent(singletonMap(name, value));
    }
}
