package org.haozhang.locky.support;

import org.haozhang.locky.utils.mixins.MethodHandlersMixin;
import org.haozhang.locky.utils.mixins.ThreadLocalRandomMixin;
import org.junit.Assert;

public abstract class LockyTestSupport extends Assert
    implements MethodHandlersMixin, ThreadLocalRandomMixin
{
    protected static void sleep(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException exception) {
            // Just ignore it.
        }
    }
}
