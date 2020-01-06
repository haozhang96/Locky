package org.haozhang.locky.keys;

import java.util.Objects;

public class CompositeKey<X extends Key<?>, Y extends Key<?>> extends Key<X> {
    private final Y secondKey;

    public CompositeKey(X firstKey, Y secondKey) {
        super(
            firstKey,
            Objects.hash(
                nonNullValue(firstKey, "first key"), firstKey.getClass(),
                nonNullValue(secondKey, "second key"), secondKey.getClass()
            )
        );
        this.secondKey = secondKey;
    }

    public X getFirstKey() {
        return getValue();
    }

    public Y getSecondKey() {
        return secondKey;
    }
}
