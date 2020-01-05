package org.haozhang.locky;

import org.haozhang.locky.support.LockyTestSupport;
import org.haozhang.locky.utils.TaskRunner;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LockyTest extends LockyTestSupport {
    private static final Logger LOGGER = LoggerFactory.getLogger(LockyTest.class);
    private static final int KEY_RANGE = 10;

    private final Locky locky = new Locky();

    //==============================================================================================
    // Tests
    //==============================================================================================

    @Test
    public void doOnce() {
        TaskRunner
            .withTasks(() -> doOnce(randomInt(KEY_RANGE)))
            .withCount(100)
            .withDelay(1000)
            .run();
    }

    @Test
    public void doAtMost() {
        final int atMost = 3;

        TaskRunner
            .withTasks(() -> doAtMost(randomInt(KEY_RANGE), atMost))
            .withCount(100)
            .withDelay(1000)
            .run();
    }

    //==============================================================================================
    // Testing Methods
    //==============================================================================================

    private void doOnce(int key) {
        locky.doOnce(key, () -> LOGGER.info("{}: Once", key));
    }

    private void doAtMost(int key, int count) {
        locky.doAtMost(key, count, () -> LOGGER.info("{}: At most {}", key, count));
    }
}
