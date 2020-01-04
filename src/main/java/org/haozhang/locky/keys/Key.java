package org.haozhang.locky.keys;

import java.util.Objects;

public class Key<T> {
    private final T key;
    private final int hash;

    public Key(T key) {
        this(nonNullKey(key), key.hashCode());
    }

    protected Key(T key, int hash) {
        this.key = key;
        this.hash = hash;
    }

    public T getKey() {
        return key;
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

    protected static <T> T nonNullKey(T key) {
        return nonNullKey(key, "key");
    }

    protected static <T> T nonNullKey(T key, String name) {
        return Objects.requireNonNull(key, "The " + name + " cannot be null.");
    }
}
