package org.haozhang.locky.keys;

import java.util.Arrays;

public class VariadicCompositeKey<T extends Key> extends Key {
    private final T[] keys;

    public VariadicCompositeKey(T... keys) {
        this(nonNull(keys, "keys"), Arrays.hashCode(keys));
    }

    protected VariadicCompositeKey(T[] keys, int hash) {
        super(hash);
        this.keys = keys;
    }

    public T[] getKeys() {
        return keys;
    }
}
