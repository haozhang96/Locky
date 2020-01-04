package org.haozhang.locky.keys;

import java.util.Objects;

public class CompositeKey<X extends Key<?>, Y extends Key<?>> extends Key<X> {
    private final Y y;

    public CompositeKey(X x, Y y) {
        super(
            x,
            Objects.hash(
                nonNullKey(x, "first key (x)"), x.getClass(),
                nonNullKey(y, "second key (y)"), y.getClass()
            )
        );
        this.y = y;
    }

    public X getX() {
        return getKey();
    }

    public Y getY() {
        return y;
    }
}
