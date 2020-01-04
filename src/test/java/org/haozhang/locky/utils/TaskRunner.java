package org.haozhang.locky.utils;

import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public final class TaskRunner {
    private static final ExecutorService THREAD_POOL = Executors.newCachedThreadPool();
    private static final long DEFAULT_TIMEOUT = Long.MAX_VALUE;

    private TaskRunner() { }

    //==============================================================================================
    // Batch Builder
    //==============================================================================================

    public static BatchBuilder batch(Runnable... runnables) {
        return new BatchBuilder(runnables);
    }

    public static final class BatchBuilder {
        private Runnable[] runnables;
        private int count = 1;
        private long timeout = DEFAULT_TIMEOUT;
        private long maxDelay;

        public BatchBuilder(Runnable... runnables) {
            withRunnables(runnables);
        }

        public BatchBuilder withRunnables(Runnable... runnables) {
            this.runnables = runnables;
            return this;
        }

        public BatchBuilder withCount(int count) {
            this.count = count;
            return this;
        }

        public BatchBuilder withTimeout(long timeout) {
            this.timeout = timeout;
            return this;
        }

        public BatchBuilder withDelay(long maxDelay) {
            this.maxDelay = maxDelay;
            return this;
        }

        public void run() {
            if (runnables.length == 1) {
                TaskRunner.run(runnables[0], count, timeout);
            } else {
                TaskRunner.runAll(timeout, runnables);
            }
        }

        public void runRandomly() {
            TaskRunner.runRandomlyWithDelay(count, timeout, maxDelay, runnables);
        }
    }

    //==============================================================================================
    // Single-task Runners
    //==============================================================================================

    public static void run(Runnable runnable) {
        runAll(runnable);
    }

    public static void run(Runnable runnable, int count) {
        run(runnable, count, DEFAULT_TIMEOUT);
    }

    public static void run(Runnable runnable, int count, long timeout) {
        runAll(timeout, IntStream.range(0, count).mapToObj(i -> runnable).toArray(Runnable[]::new));
    }

    //==============================================================================================
    // Multiple-task Runners
    //==============================================================================================

    public static void runAll(Runnable... runnables) {
        runAll(DEFAULT_TIMEOUT, runnables);
    }

    public static void runAll(long timeout, Runnable... runnables) {
        try {
            THREAD_POOL.invokeAll(
                Stream.of(runnables).map(TaskRunner::toCallable).collect(Collectors.toList()),
                timeout,
                TimeUnit.MILLISECONDS
            );
        } catch (InterruptedException exception) { }
    }

    //==============================================================================================
    // Random-task Runners
    //==============================================================================================

    public static void runRandomly(Runnable... runnables) {
        runRandomly(1, runnables);
    }

    public static void runRandomly(int count, Runnable... runnables) {
        runRandomly(count, DEFAULT_TIMEOUT, runnables);
    }

    public static void runRandomly(int count, long timeout, Runnable... runnables) {
        runAll(
            timeout,
            IntStream
                .generate(() -> ThreadLocalRandom.current().nextInt(runnables.length))
                .limit(count)
                .mapToObj(i -> runnables[i])
                .toArray(Runnable[]::new)
        );
    }

    //==============================================================================================
    // Random-task Runners with Delay
    //==============================================================================================

    public static void runRandomlyWithDelay(long maxDelay, Runnable... runnables) {
        runRandomlyWithDelay(1, maxDelay, runnables);
    }

    public static void runRandomlyWithDelay(int count, long maxDelay, Runnable... runnables) {
        runRandomlyWithDelay(count, DEFAULT_TIMEOUT, maxDelay, runnables);
    }

    public static void runRandomlyWithDelay(
        int count, long timeout, long maxDelay, Runnable... runnables
    ) {
        runRandomly(
            count,
            timeout,
            Stream.of(runnables).map(runnable -> (Runnable) () -> {
                try {
                    Thread.sleep(ThreadLocalRandom.current().nextLong(maxDelay));
                } catch (InterruptedException exception) { }
                runnable.run();
            }).toArray(Runnable[]::new)
        );
    }

    //==============================================================================================
    // Helper Methods
    //==============================================================================================

    private static Callable<Void> toCallable(Runnable runnable) {
        return () -> { runnable.run(); return null; };
    }
}
