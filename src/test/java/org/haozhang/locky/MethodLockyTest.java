package org.haozhang.locky;

import org.haozhang.locky.support.LockyTestSupport;
import org.haozhang.locky.support.method.Method;
import org.haozhang.locky.utils.TaskRunner;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ThreadLocalRandom;

public class MethodLockyTest extends LockyTestSupport {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodLockyTest.class);
    private static final int KEY_RANGE = 2;

    private final MethodLocky methodLocky = new MethodLocky();

    //==============================================================================================
    // Tests
    //==============================================================================================

    @Test
    public void doOnce() {
        TaskRunner
            .batch(
                () -> doOnceA(getRandomKey()),
                () -> doOnceB(getRandomKey()),
                () -> doOnceC(getRandomKey())
            )
            .withCount(100)
            .withDelay(1000)
            .runRandomly();
    }

    @Test
    public void doAtMost() {
        final int atMost = 3;

        TaskRunner
            .batch(
                () -> doAtMostA(getRandomKey(), atMost),
                () -> doAtMostB(getRandomKey(), atMost),
                () -> doAtMostC(getRandomKey(), atMost)
            )
            .withCount(100)
            .withDelay(1000)
            .runRandomly();
    }

    //==============================================================================================
    // Do-once Testing Methods
    //==============================================================================================

    private void doOnceA(int key) {
        methodLocky.doOnce(Method.of(this::doOnceA), key, () -> {
            LOGGER.info("a({}): Once", key);
            doOnceB(key);
        });
    }

    private void doOnceB(int key) {
        methodLocky.doOnce(Method.of(this::doOnceB), key, () -> {
            LOGGER.info("b({}): Once", key);
            doOnceC(key);
        });
    }

    private void doOnceC(int key) {
        methodLocky.doOnce(Method.of(this::doOnceC), key, () -> {
            LOGGER.info("c({}): Once", key);
        });
    }

    //==============================================================================================
    // Do-at-most Testing Methods
    //==============================================================================================

    private void doAtMostA(int key, int count) {
        methodLocky.doAtMost(Method.of(this::doAtMostA), key, count, () -> {
            LOGGER.info("a({}): At most {}", key, count);
            doAtMostB(key, count);
        });
    }

    private void doAtMostB(int key, int count) {
        methodLocky.doAtMost(Method.of(this::doAtMostB), key, count, () -> {
            LOGGER.info("b({}): At most {}", key, count);
            doAtMostC(key, count);
        });
    }

    private void doAtMostC(int key, int count) {
        methodLocky.doAtMost(Method.of(this::doAtMostC), key, count, () -> {
            LOGGER.info("c({}): At most {}", key, count);
        });
    }

    //==============================================================================================
    // Helper Methods
    //==============================================================================================

    private int getRandomKey() {
        return ThreadLocalRandom.current().nextInt(KEY_RANGE);
    }
}