package org.haozhang.locky.keys;

import java.util.Objects;

public class PlainKey<T> extends Key {
    private final T value;

    public PlainKey(T value) {
        this(nonNull(value), Objects.hash(value, value.getClass()));
    }

    protected PlainKey(T value, int hash) {
        super(hash);
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
