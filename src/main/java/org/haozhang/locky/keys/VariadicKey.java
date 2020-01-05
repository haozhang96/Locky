package org.haozhang.locky.keys;

import java.util.Arrays;

public class VariadicKey<T> extends Key<T[]> {
    public VariadicKey(T... values) {
        super(nonNullValue(values, "values"), Arrays.hashCode(values));
    }
}
