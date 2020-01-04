package org.haozhang.locky;

import org.haozhang.locky.keys.Key;
import org.haozhang.locky.support.method.Method.ZeroArgsVoid;
import org.haozhang.locky.utils.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ConcurrentHashMap;

public class Locky {
    private static final Logger LOGGER = LoggerFactory.getLogger(Locky.class);
    private static final int DEFAULT_INITIAL_CAPACITY = 32;

    protected final ConcurrentHashMap<Key, Integer> locks;

    public Locky() {
        this(DEFAULT_INITIAL_CAPACITY);
    }

    public Locky(int initialCapacity) {
        this.locks = new ConcurrentHashMap<>(initialCapacity);
    }

    public void doOnce(Key key, ZeroArgsVoid doWith) {
        locks.computeIfAbsent(key, __ -> {
            try {
                doWith.call();
                return 1;
            } catch (Exception exception) {
                throw ExceptionUtils.toRuntimeException(exception);
            }
        });
    }

    public void doAtMost(Key key, int count, ZeroArgsVoid doWith) {
        locks.compute(key, (__, currentCount) -> {
            if (null == currentCount) {
                currentCount = 0;
            }

            if (currentCount == count) {
                return currentCount;
            }

            try {
                doWith.call();
                return currentCount + 1;
            } catch (Exception exception) {
                throw ExceptionUtils.toRuntimeException(exception);
            }
        });
    }
}
