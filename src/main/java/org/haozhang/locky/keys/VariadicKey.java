package org.haozhang.locky.keys;

import java.util.Arrays;

public class VariadicKey<T> extends Key<T[]> {
    public VariadicKey(T... keys) {
        super(nonNullKey(keys, "keys"), Arrays.hashCode(keys));
    }

    public T[] getKeys() {
        return getKey();
    }
}
