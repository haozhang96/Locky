package org.haozhang.locky;

import org.hamcrest.Matchers;
import org.haozhang.locky.support.LockyTestSupport;
import org.haozhang.locky.utils.TaskRunner;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.atomic.AtomicIntegerArray;

public class LockyTest extends LockyTestSupport {
    private static final Logger LOGGER = LoggerFactory.getLogger(LockyTest.class);

    private static final int CONCURRENT_THREADS = 100;
    private static final int KEY_RANGE = 10;
    private static final int AT_MOST = 3;

    private final Locky locky = new Locky();
    private final AtomicIntegerArray doOnceCounters = new AtomicIntegerArray(KEY_RANGE);
    private final AtomicIntegerArray doAtMostCounters = new AtomicIntegerArray(KEY_RANGE);

    //==============================================================================================
    // Tests
    //==============================================================================================

    @Test
    public void doOnce() {
        TaskRunner
            .withTasks(() -> doOnce(randomInt(KEY_RANGE)))
            .withCount(CONCURRENT_THREADS)
            .withDelay(1000)
            .run();

        for (int i = 0; i < KEY_RANGE; i++) {
            assertThat(doOnceCounters.get(i), Matchers.lessThanOrEqualTo(1));
        }
    }

    @Test
    public void doAtMost() {
        TaskRunner
            .withTasks(() -> doAtMost(randomInt(KEY_RANGE), AT_MOST))
            .withCount(CONCURRENT_THREADS)
            .withDelay(1000)
            .run();

        for (int i = 0; i < KEY_RANGE; i++) {
            assertThat(doAtMostCounters.get(i), Matchers.lessThanOrEqualTo(AT_MOST));
        }
    }

    //==============================================================================================
    // Test Helper Methods
    //==============================================================================================

    private void doOnce(int key) {
        locky.doOnce(key, () -> {
            LOGGER.info("{}: Once", key);
            doOnceCounters.incrementAndGet(key);
        });
    }

    private void doAtMost(int key, int count) {
        locky.doAtMost(key, count, () -> {
            LOGGER.info("{}: At most {}", key, count);
            doAtMostCounters.incrementAndGet(key);
        });
    }
}
