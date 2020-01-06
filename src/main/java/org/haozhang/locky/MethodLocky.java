package org.haozhang.locky;

import org.haozhang.locky.keys.method.MethodKey;
import org.haozhang.locky.keys.method.MethodValueKey;
import org.haozhang.locky.support.method.DoWith;
import org.haozhang.locky.support.method.Method;

public class MethodLocky extends Locky {
    public MethodLocky() {
        super();
    }

    public MethodLocky(int expectedConcurrencyLevel) {
        super(expectedConcurrencyLevel);
    }

    //==============================================================================================
    // Do-once Methods
    //==============================================================================================

    public void doOnce(Method method, DoWith doWith) {
        doOnce(new MethodKey(method), doWith);
    }

    public void doOnce(Method method, Object key, DoWith doWith) {
        doOnce(new MethodValueKey<>(method, key), doWith);
    }

    //==============================================================================================
    // Do-at-most Methods
    //==============================================================================================

    public void doAtMost(Method method, int count, DoWith doWith) {
        doAtMost(new MethodKey(method), count, doWith);
    }

    public void doAtMost(Method method, Object key, int count, DoWith doWith) {
        doAtMost(new MethodValueKey<>(method, key), count, doWith);
    }
}
