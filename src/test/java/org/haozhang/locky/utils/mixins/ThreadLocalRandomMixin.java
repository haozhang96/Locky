package org.haozhang.locky.utils.mixins;

import java.util.concurrent.ThreadLocalRandom;

public interface ThreadLocalRandomMixin {
    default boolean randomBoolean() {
        return ThreadLocalRandom.current().nextBoolean();
    }

    //==============================================================================================
    // Integer
    //==============================================================================================
    
    default int randomInt() {
        return ThreadLocalRandom.current().nextInt();
    }

    default int randomInt(int exclusiveMax) {
        return ThreadLocalRandom.current().nextInt(exclusiveMax);
    }

    default int randomInt(int min, int exclusiveMax) {
        return ThreadLocalRandom.current().nextInt(min, exclusiveMax);
    }

    //==============================================================================================
    // Long
    //==============================================================================================

    default long randomLong() {
        return ThreadLocalRandom.current().nextLong();
    }

    default long randomLong(long exclusiveMax) {
        return ThreadLocalRandom.current().nextLong(exclusiveMax);
    }

    default long randomLong(long min, long exclusiveMax) {
        return ThreadLocalRandom.current().nextLong(min, exclusiveMax);
    }

    //==============================================================================================
    // Float
    //==============================================================================================

    default float randomFloat() {
        return ThreadLocalRandom.current().nextFloat();
    }

    default float randomFloat(float exclusiveMax) {
        return (float) randomDouble(exclusiveMax);
    }

    default float randomFloat(float min, float exclusiveMax) {
        return (float) randomDouble(min, exclusiveMax);
    }

    //==============================================================================================
    // Double
    //==============================================================================================

    default double randomDouble() {
        return ThreadLocalRandom.current().nextDouble();
    }

    default double randomDouble(double exclusiveMax) {
        return ThreadLocalRandom.current().nextDouble(exclusiveMax);
    }

    default double randomDouble(double min, double exclusiveMax) {
        return ThreadLocalRandom.current().nextDouble(min, exclusiveMax);
    }
}
