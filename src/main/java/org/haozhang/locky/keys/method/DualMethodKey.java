package org.haozhang.locky.keys.method;

import org.haozhang.locky.keys.CompositeKey;

public class DualMethodKey<X extends MethodKey, Y extends MethodKey> extends CompositeKey<X, Y> {
    public DualMethodKey(X firstMethodKey, Y secondMethodKey) {
        super(firstMethodKey, secondMethodKey);
    }

    public X getFirstMethodKey() {
        return getX();
    }

    public Y getSecondMethodKey() {
        return getY();
    }
}
