package org.haozhang.locky.support;

import org.haozhang.locky.support.method.MethodHandlersMixin;
import org.haozhang.locky.utils.mixins.ThreadLocalRandomMixin;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class LockyTestSupport extends Assert
    implements MethodHandlersMixin, ThreadLocalRandomMixin
{
    private static final Logger LOGGER = LoggerFactory.getLogger(LockyTestSupport.class);

    protected static void sleep(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException exception) { }
    }
}
