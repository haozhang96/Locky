package org.haozhang.locky;

import org.haozhang.locky.keys.Key;
import org.haozhang.locky.support.method.DoWith;
import org.haozhang.locky.utils.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ConcurrentHashMap;

public class Locky {
    private static final Logger LOGGER = LoggerFactory.getLogger(Locky.class);
    private static final int DEFAULT_EXPECTED_CONCURRENCY_LEVEL =
        Integer.getInteger(Locky.class.getPackage().getName() + ".expectedConcurrencyLevel", 32);

    protected final ConcurrentHashMap<Key<?>, Integer> locks;

    public Locky() {
        this(DEFAULT_EXPECTED_CONCURRENCY_LEVEL);
    }

    public Locky(int expectedConcurrencyLevel) {
        this.locks = new ConcurrentHashMap<>(expectedConcurrencyLevel);
    }

    //==============================================================================================
    // Do-once Methods
    //==============================================================================================

    public void doOnce(Object key, DoWith doWith) {
        doOnce(new Key<>(key), doWith);
    }

    public void doOnce(Key<?> key, DoWith doWith) {
        locks.computeIfAbsent(key, __ -> {
            try {
                doWith.call();
                return 1;
            } catch (Exception exception) {
                throw ExceptionUtils.toRuntimeException(exception);
            }
        });
    }

    //==============================================================================================
    // Do-at-most Methods
    //==============================================================================================

    public void doAtMost(Object key, int count, DoWith doWith) {
        doAtMost(new Key<>(key), count, doWith);
    }

    public void doAtMost(Key<?> key, int count, DoWith doWith) {
        locks.compute(key, (__, currentCount) -> {
            if (currentCount == null) {
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
