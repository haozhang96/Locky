package org.haozhang.locky;

import org.haozhang.locky.keys.Key;
import org.haozhang.locky.keys.method.CompositeMethodKey;
import org.haozhang.locky.keys.method.MethodKey;
import org.haozhang.locky.support.method.DoWith;
import org.haozhang.locky.support.method.Method;

public class MethodLocky extends Locky {
    public MethodLocky() {
        super();
    }

    public MethodLocky(int initialCapacity) {
        super(initialCapacity);
    }

    //==============================================================================================
    // Do-once Methods
    //==============================================================================================

    public void doOnce(Method method, DoWith doWith) {
        doOnce(MethodKey.of(method), doWith);
    }

    public void doOnce(Method method, Object key, DoWith doWith) {
        doOnce(MethodKey.of(method), key, doWith);
    }

    public void doOnce(Method method, Key<?> key, DoWith doWith) {
        doOnce(MethodKey.of(method), key, doWith);
    }

    public void doOnce(MethodKey methodKey, Object otherKey, DoWith doWith) {
        doOnce(methodKey, new Key<>(otherKey), doWith);
    }

    public void doOnce(MethodKey methodKey, Key<?> otherKey, DoWith doWith) {
        doOnce(new CompositeMethodKey<>(methodKey, otherKey), doWith);
    }

    //==============================================================================================
    // Do-at-most Methods
    //==============================================================================================

    public void doAtMost(Method method, int count, DoWith doWith) {
        doAtMost(MethodKey.of(method), count, doWith);
    }

    public void doAtMost(Method method, Object key, int count, DoWith doWith) {
        doAtMost(MethodKey.of(method), key, count, doWith);
    }

    public void doAtMost(Method method, Key<?> key, int count, DoWith doWith) {
        doAtMost(MethodKey.of(method), key, count, doWith);
    }

    public void doAtMost(MethodKey methodKey, Object otherKey, int count, DoWith doWith) {
        doAtMost(methodKey, new Key<>(otherKey), count, doWith);
    }

    public void doAtMost(MethodKey methodKey, Key<?> otherKey, int count, DoWith doWith) {
        doAtMost(new CompositeMethodKey<>(methodKey, otherKey), count, doWith);
    }
}
