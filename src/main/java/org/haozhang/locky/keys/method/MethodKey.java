package org.haozhang.locky.keys.method;

import org.haozhang.locky.keys.Key;
import org.haozhang.locky.support.method.Method;
import org.haozhang.locky.support.method.Method.*;

public class MethodKey extends Key {
    private final Method method;

    public MethodKey(Method method) {
        this(nonNull(method, "method"), method.getClass().hashCode());
    }

    protected MethodKey(Method method, int hash) {
        super(hash);
        this.method = method;
    }

    public Method getMethod() {
        return method;
    }

    //==============================================================================================
    // Factory Methods - Void Methods
    //==============================================================================================

    public static MethodKey of(ZeroArgsVoid method) {
        return new MethodKey(method);
    }

    public static <A> MethodKey of(OneArgVoid<A> method) {
        return new MethodKey(method);
    }

    public static <A, B> MethodKey of(TwoArgsVoid<A, B> method) {
        return new MethodKey(method);
    }

    public static <A, B, C> MethodKey of(ThreeArgsVoid<A, B, C> method) {
        return new MethodKey(method);
    }

    public static <A, B, C, D> MethodKey of(FourArgsVoid<A, B, C, D> method) {
        return new MethodKey(method);
    }

    public static <A, B, C, D, E> MethodKey of(FiveArgsVoid<A, B, C, D, E> method) {
        return new MethodKey(method);
    }

    public static <A, B, C, D, E, F> MethodKey of(SixArgsVoid<A, B, C, D, E, F> method) {
        return new MethodKey(method);
    }

    public static <A, B, C, D, E, F, G> MethodKey of(SevenArgsVoid<A, B, C, D, E, F, G> method) {
        return new MethodKey(method);
    }

    public static <A, B, C, D, E, F, G, H> MethodKey of(EightArgsVoid<A, B, C, D, E, F, G, H> method) {
        return new MethodKey(method);
    }

    public static <A, B, C, D, E, F, G, H, I> MethodKey of(NineArgsVoid<A, B, C, D, E, F, G, H, I> method) {
        return new MethodKey(method);
    }

    public static <A, B, C, D, E, F, G, H, I, J> MethodKey of(TenArgsVoid<A, B, C, D, E, F, G, H, I, J> method) {
        return new MethodKey(method);
    }

    //==============================================================================================
    // Factory Methods - Returning Methods
    //==============================================================================================

    public static <R> MethodKey of(ZeroArgs<R> method) {
        return new MethodKey(method);
    }

    public static <A, R> MethodKey of(OneArg<A, R> method) {
        return new MethodKey(method);
    }

    public static <A, B, R> MethodKey of(TwoArgs<A, B, R> method) {
        return new MethodKey(method);
    }

    public static <A, B, C, R> MethodKey of(ThreeArgs<A, B, C, R> method) {
        return new MethodKey(method);
    }

    public static <A, B, C, D, R> MethodKey of(FourArgs<A, B, C, D, R> method) {
        return new MethodKey(method);
    }

    public static <A, B, C, D, E, R> MethodKey of(FiveArgs<A, B, C, D, E, R> method) {
        return new MethodKey(method);
    }

    public static <A, B, C, D, E, F, R> MethodKey of(SixArgs<A, B, C, D, E, F, R> method) {
        return new MethodKey(method);
    }

    public static <A, B, C, D, E, F, G, R> MethodKey of(SevenArgs<A, B, C, D, E, F, G, R> method) {
        return new MethodKey(method);
    }

    public static <A, B, C, D, E, F, G, H, R> MethodKey of(EightArgs<A, B, C, D, E, F, G, H, R> method) {
        return new MethodKey(method);
    }

    public static <A, B, C, D, E, F, G, H, I, R> MethodKey of(NineArgs<A, B, C, D, E, F, G, H, I, R> method) {
        return new MethodKey(method);
    }

    public static <A, B, C, D, E, F, G, H, I, J, R> MethodKey of(TenArgs<A, B, C, D, E, F, G, H, I, J, R> method) {
        return new MethodKey(method);
    }
}
