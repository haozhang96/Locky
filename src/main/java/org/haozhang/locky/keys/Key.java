package org.haozhang.locky.keys;

import java.util.Objects;

public class Key<T> {
    private final T key;
    private final int hash;

    public Key(T key) {
        this.key = Objects.requireNonNull(key, "The key cannot be null.");
        this.hash = key.hashCode();
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
}
