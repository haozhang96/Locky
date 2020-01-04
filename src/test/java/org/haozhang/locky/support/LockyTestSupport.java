package org.haozhang.locky.support;

import org.haozhang.locky.Locky;
import org.haozhang.locky.support.method.MethodHandlersMixin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class LockyTestSupport implements MethodHandlersMixin {
    private static final Logger LOGGER = LoggerFactory.getLogger(LockyTestSupport.class);

    protected final Locky locky = new Locky();

    protected static void sleep(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException exception) { }
    }
}
