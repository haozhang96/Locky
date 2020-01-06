package org.haozhang.locky.keys;

import java.util.Objects;

public class CompositeKey<A extends Key, B extends Key> extends Key {
    private final A keyA;
    private final B keyB;

    public CompositeKey(A keyA, B keyB) {
        this(
            nonNull(keyA, "key A (first key)"),
            nonNull(keyB, "key B (second key)"),
            Objects.hash(keyA, keyB)
        );
    }

    protected CompositeKey(A keyA, B keyB, int hash) {
        super(hash);
        this.keyA = keyA;
        this.keyB = keyB;
    }

    public A getKeyA() {
        return keyA;
    }

    public B getKeyB() {
        return keyB;
    }
}
