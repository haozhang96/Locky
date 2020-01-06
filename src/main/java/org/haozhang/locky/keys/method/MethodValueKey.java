package org.haozhang.locky.keys.method;

import org.haozhang.locky.support.method.Method;

import java.util.Objects;

public class MethodValueKey<V> extends MethodKey {
    private final V value;

    public MethodValueKey(Method method, V value) {
        this(
            nonNull(method, "method"),
            nonNull(value, "value"),
            Objects.hash(method.getClass(), value)
        );
    }

    protected MethodValueKey(Method method, V value, int hash) {
        super(method, hash);
        this.value = value;
    }

    public V getValue() {
        return value;
    }
}
