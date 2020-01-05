package org.haozhang.locky.keys;

import java.util.Objects;

public class Key<T> {
    private final T value;
    private final int hash;

    public Key(T value) {
        this(nonNullValue(value), Objects.hash(value, value.getClass()));
    }

    protected Key(T value, int hash) {
        this.value = value;
        this.hash = hash;
    }

    public T getValue() {
        return value;
    }

    @Override
    public int hashCode() {
        return hash;
    }

    @Override
    public boolean equals(Object other) {
        return other == this || other instanceof Key && other.hashCode() == hashCode();
    }

    //==============================================================================================
    // Helper Methods
    //==============================================================================================

    protected static <T> T nonNullValue(T value) {
        return nonNullValue(value, "value");
    }

    protected static <T> T nonNullValue(T value, String name) {
        if (value == null) {
            throw new IllegalArgumentException("The " + name + " cannot be null.");
        }
        return value;
    }
}
