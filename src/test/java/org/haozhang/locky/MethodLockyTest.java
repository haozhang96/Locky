package org.haozhang.locky;

import org.haozhang.locky.support.LockyTestSupport;
import org.haozhang.locky.support.method.Method;
import org.haozhang.locky.utils.TaskRunner;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.atomic.AtomicIntegerArray;

public class MethodLockyTest extends LockyTestSupport {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodLockyTest.class);
    private static final int KEY_RANGE = 2;

    private final MethodLocky methodLocky = new MethodLocky();
    private final AtomicIntegerArray doOnceACounters = new AtomicIntegerArray(KEY_RANGE);
    private final AtomicIntegerArray doOnceBCounters = new AtomicIntegerArray(KEY_RANGE);
    private final AtomicIntegerArray doOnceCCounters = new AtomicIntegerArray(KEY_RANGE);
    private final AtomicIntegerArray doAtMostACounters = new AtomicIntegerArray(KEY_RANGE);
    private final AtomicIntegerArray doAtMostBCounters = new AtomicIntegerArray(KEY_RANGE);
    private final AtomicIntegerArray doAtMostCCounters = new AtomicIntegerArray(KEY_RANGE);

    //==============================================================================================
    // Tests
    //==============================================================================================

    @Test
    public void doOnce() {
        TaskRunner
            .withTasks(
                () -> doOnceA(randomInt(KEY_RANGE)),
                () -> doOnceB(randomInt(KEY_RANGE)),
                () -> doOnceC(randomInt(KEY_RANGE))
            )
            .withCount(100)
            .withDelay(1000)
            .runRandomly();

        for (int i = 0; i < KEY_RANGE; i++) {
            assertTrue(doOnceACounters.get(i) <= 1);
            assertTrue(doOnceBCounters.get(i) <= 1);
            assertTrue(doOnceCCounters.get(i) <= 1);
        }
    }

    @Test
    public void doAtMost() {
        final int atMost = 3;

        TaskRunner
            .withTasks(
                () -> doAtMostA(randomInt(KEY_RANGE), atMost),
                () -> doAtMostB(randomInt(KEY_RANGE), atMost),
                () -> doAtMostC(randomInt(KEY_RANGE), atMost)
            )
            .withCount(100)
            .withDelay(1000)
            .runRandomly();

        for (int i = 0; i < KEY_RANGE; i++) {
            assertTrue(doAtMostACounters.get(i) <= atMost);
            assertTrue(doAtMostBCounters.get(i) <= atMost);
            assertTrue(doAtMostCCounters.get(i) <= atMost);
        }
    }

    //==============================================================================================
    // Do-once Test Helper Methods
    //==============================================================================================

    private void doOnceA(int key) {
        methodLocky.doOnce(Method.of(this::doOnceA), key, () -> {
            LOGGER.info("a({}): Once", key);
            doOnceACounters.incrementAndGet(key);
            doOnceB(key);
        });
    }

    private void doOnceB(int key) {
        methodLocky.doOnce(Method.of(this::doOnceB), key, () -> {
            LOGGER.info("b({}): Once", key);
            doOnceBCounters.incrementAndGet(key);
            doOnceC(key);
        });
    }

    private void doOnceC(int key) {
        methodLocky.doOnce(Method.of(this::doOnceC), key, () -> {
            LOGGER.info("c({}): Once", key);
            doOnceCCounters.incrementAndGet(key);
        });
    }

    //==============================================================================================
    // Do-at-most Test Helper Methods
    //==============================================================================================

    private void doAtMostA(int key, int count) {
        methodLocky.doAtMost(Method.of(this::doAtMostA), key, count, () -> {
            LOGGER.info("a({}): At most {}", key, count);
            doAtMostACounters.incrementAndGet(key);
            doAtMostB(key, count);
        });
    }

    private void doAtMostB(int key, int count) {
        methodLocky.doAtMost(Method.of(this::doAtMostB), key, count, () -> {
            LOGGER.info("b({}): At most {}", key, count);
            doAtMostBCounters.incrementAndGet(key);
            doAtMostC(key, count);
        });
    }

    private void doAtMostC(int key, int count) {
        methodLocky.doAtMost(Method.of(this::doAtMostC), key, count, () -> {
            LOGGER.info("c({}): At most {}", key, count);
            doAtMostCCounters.incrementAndGet(key);
        });
    }
}
