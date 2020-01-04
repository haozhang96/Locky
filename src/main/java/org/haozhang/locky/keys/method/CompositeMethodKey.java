package org.haozhang.locky.keys.method;

import org.haozhang.locky.keys.CompositeKey;
import org.haozhang.locky.keys.Key;

public class CompositeMethodKey<X extends MethodKey, Y extends Key<?>> extends CompositeKey<X, Y> {
    public CompositeMethodKey(X methodKey, Y otherKey) {
        super(methodKey, otherKey);
    }

    public X getMethodKey() {
        return getX();
    }

    public Y getOtherKey() {
        return getY();
    }
}
