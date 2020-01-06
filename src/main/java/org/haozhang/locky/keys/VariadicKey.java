package org.haozhang.locky.keys;

import java.util.Arrays;

public class VariadicKey<T> extends Key<T[]> {
    /**
     * Construct a {@link VariadicKey} instance with the given values.
     * <br/><br/>
     *
     * Note that the ordering of the values affects the hashing, which in turn will affect the key
     *   used for locking.
     *
     * @param values The values to create the key with
     */
    public VariadicKey(T... values) {
        super(nonNullValue(values, "values"), Arrays.hashCode(values));
    }
}
