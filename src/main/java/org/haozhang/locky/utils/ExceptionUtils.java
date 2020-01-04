package org.haozhang.locky.utils;

public final class ExceptionUtils {
    private ExceptionUtils() { }

    public static RuntimeException toRuntimeException(Exception exception) {
        if (exception instanceof RuntimeException) {
            return (RuntimeException) exception;
        }
        return new RuntimeException(exception);
    }
}
