package org.haozhang.locky.keys;

import java.util.Objects;

public class CompositeKey<X extends Key<?>, Y extends Key<?>> extends Key<X> {
    private final Y y;

    public CompositeKey(X x, Y y) {
        super(
            x,
            Objects.hash(
                nonNullValue(x, "first value (x)"), x.getClass(),
                nonNullValue(y, "second value (y)"), y.getClass()
            )
        );
        this.y = y;
    }

    public X getX() {
        return getValue();
    }

    public Y getY() {
        return y;
    }
}
