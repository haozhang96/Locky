package org.haozhang.locky.keys.method;

import org.haozhang.locky.keys.Key;
import org.haozhang.locky.support.method.Method;
import org.haozhang.locky.support.method.Method.*;

public class MethodKey extends Key<Method> {
    private MethodKey(Method method) {
        super(nonNullValue(method, "method"), method.getClass().hashCode());
    }

    //==============================================================================================
    // Factory Methods
    //==============================================================================================

    public static MethodKey of(Method method) {
        return new MethodKey(method);
    }

    //==============================================================================================
    // Factory Methods - Void Methods
    //==============================================================================================

    public static MethodKey of(ZeroArgsVoid method) {
        return of((Method) method);
    }

    public static <A> MethodKey of(OneArgVoid<A> method) {
        return of((Method) method);
    }

    public static <A, B> MethodKey of(TwoArgsVoid<A, B> method) {
        return of((Method) method);
    }

    public static <A, B, C> MethodKey of(ThreeArgsVoid<A, B, C> method) {
        return of((Method) method);
    }

    public static <A, B, C, D> MethodKey of(FourArgsVoid<A, B, C, D> method) {
        return of((Method) method);
    }

    public static <A, B, C, D, E> MethodKey of(FiveArgsVoid<A, B, C, D, E> method) {
        return of((Method) method);
    }

    public static <A, B, C, D, E, F> MethodKey of(SixArgsVoid<A, B, C, D, E, F> method) {
        return of((Method) method);
    }

    public static <A, B, C, D, E, F, G> MethodKey of(SevenArgsVoid<A, B, C, D, E, F, G> method) {
        return of((Method) method);
    }

    public static <A, B, C, D, E, F, G, H> MethodKey of(EightArgsVoid<A, B, C, D, E, F, G, H> method) {
        return of((Method) method);
    }

    public static <A, B, C, D, E, F, G, H, I> MethodKey of(NineArgsVoid<A, B, C, D, E, F, G, H, I> method) {
        return of((Method) method);
    }

    public static <A, B, C, D, E, F, G, H, I, J> MethodKey of(TenArgsVoid<A, B, C, D, E, F, G, H, I, J> method) {
        return of((Method) method);
    }

    //==============================================================================================
    // Factory Methods - Returning Methods
    //==============================================================================================

    public static <R> MethodKey of(ZeroArgs<R> method) {
        return of((Method) method);
    }

    public static <A, R> MethodKey of(OneArg<A, R> method) {
        return of((Method) method);
    }

    public static <A, B, R> MethodKey of(TwoArgs<A, B, R> method) {
        return of((Method) method);
    }

    public static <A, B, C, R> MethodKey of(ThreeArgs<A, B, C, R> method) {
        return of((Method) method);
    }

    public static <A, B, C, D, R> MethodKey of(FourArgs<A, B, C, D, R> method) {
        return of((Method) method);
    }

    public static <A, B, C, D, E, R> MethodKey of(FiveArgs<A, B, C, D, E, R> method) {
        return of((Method) method);
    }

    public static <A, B, C, D, E, F, R> MethodKey of(SixArgs<A, B, C, D, E, F, R> method) {
        return of((Method) method);
    }

    public static <A, B, C, D, E, F, G, R> MethodKey of(SevenArgs<A, B, C, D, E, F, G, R> method) {
        return of((Method) method);
    }

    public static <A, B, C, D, E, F, G, H, R> MethodKey of(EightArgs<A, B, C, D, E, F, G, H, R> method) {
        return of((Method) method);
    }

    public static <A, B, C, D, E, F, G, H, I, R> MethodKey of(NineArgs<A, B, C, D, E, F, G, H, I, R> method) {
        return of((Method) method);
    }

    public static <A, B, C, D, E, F, G, H, I, J, R> MethodKey of(TenArgs<A, B, C, D, E, F, G, H, I, J, R> method) {
        return of((Method) method);
    }
}
