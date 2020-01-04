package org.haozhang.locky.support.method;

import org.haozhang.locky.keys.method.MethodKey;
import org.haozhang.locky.utils.ExceptionUtils;

public interface Method {
    default MethodKey asKey() {
        return MethodKey.of(this);
    }

    default void to(OneArgVoid<Method> doWith) {
        to((OneArg<Method, Void>) doWith);
    }

    default <R> R to(OneArg<Method, R> doWith) {
        try {
            return doWith.apply(this);
        } catch (Exception exception) {
            throw ExceptionUtils.toRuntimeException(exception);
        }
    }

    //==============================================================================================
    // Void Methods
    //==============================================================================================

    // void method()
    @FunctionalInterface
    interface ZeroArgsVoid extends Method {
        void call() throws Exception;
    }

    // void method(A)
    @FunctionalInterface
    interface OneArgVoid<A> extends Method {
        void accept(A a) throws Exception;
    }

    // void method(A, B)
    @FunctionalInterface
    interface TwoArgsVoid<A, B> extends Method {
        void accept(A a, B b) throws Exception;
    }

    // void method(A, B, C)
    @FunctionalInterface
    interface ThreeArgsVoid<A, B, C> extends Method {
        void accept(A a, B b, C c) throws Exception;
    }

    // void method(A, B, C, D)
    @FunctionalInterface
    interface FourArgsVoid<A, B, C, D> extends Method {
        void accept(A a, B b, C c, D d) throws Exception;
    }

    // void method(A, B, C, D, E)
    @FunctionalInterface
    interface FiveArgsVoid<A, B, C, D, E> extends Method {
        void accept(A a, B b, C c, D d, E e) throws Exception;
    }

    // void method(A, B, C, D, E, F)
    @FunctionalInterface
    interface SixArgsVoid<A, B, C, D, E, F> extends Method {
        void accept(A a, B b, C c, D d, E e, F f) throws Exception;
    }

    // void method(A, B, C, D, E, F, G)
    @FunctionalInterface
    interface SevenArgsVoid<A, B, C, D, E, F, G> extends Method {
        void accept(A a, B b, C c, D d, E e, F f, G g) throws Exception;
    }

    // void method(A, B, C, D, E, F, G, H)
    @FunctionalInterface
    interface EightArgsVoid<A, B, C, D, E, F, G, H> extends Method {
        void accept(A a, B b, C c, D d, E e, F f, G g, H h) throws Exception;
    }

    // void method(A, B, C, D, E, F, G, H, I)
    @FunctionalInterface
    interface NineArgsVoid<A, B, C, D, E, F, G, H, I> extends Method {
        void accept(A a, B b, C c, D d, E e, F f, G g, H h, I i) throws Exception;
    }

    // void method(A, B, C, D, E, F, G, H, I, J)
    @FunctionalInterface
    interface TenArgsVoid<A, B, C, D, E, F, G, H, I, J> extends Method {
        void accept(A a, B b, C c, D d, E e, F f, G g, H h, I i, J j) throws Exception;
    }

    //==============================================================================================
    // Returning Methods
    //==============================================================================================

    // R method()
    @FunctionalInterface
    interface ZeroArgs<R> extends Method {
        R get() throws Exception;
    }

    // R method(A)
    @FunctionalInterface
    interface OneArg<A, R> extends Method {
        R apply(A a) throws Exception;
    }

    // R method(A, B)
    @FunctionalInterface
    interface TwoArgs<A, B, R> extends Method {
        R apply(A a, B b) throws Exception;
    }

    // R method(A, B, C)
    @FunctionalInterface
    interface ThreeArgs<A, B, C, R> extends Method {
        R apply(A a, B b, C c) throws Exception;
    }

    // R method(A, B, C, D)
    @FunctionalInterface
    interface FourArgs<A, B, C, D, R> extends Method {
        R apply(A a, B b, C c, D d) throws Exception;
    }

    // R method(A, B, C, D, E)
    @FunctionalInterface
    interface FiveArgs<A, B, C, D, E, R> extends Method {
        R apply(A a, B b, C c, D d, E e) throws Exception;
    }

    // R method(A, B, C, D, E, F)
    @FunctionalInterface
    interface SixArgs<A, B, C, D, E, F, R> extends Method {
        R apply(A a, B b, C c, D d, E e, F f) throws Exception;
    }

    // R method(A, B, C, D, E, F, G)
    @FunctionalInterface
    interface SevenArgs<A, B, C, D, E, F, G, R> extends Method {
        R apply(A a, B b, C c, D d, E e, F f, G g) throws Exception;
    }

    // R method(A, B, C, D, E, F, G, H)
    @FunctionalInterface
    interface EightArgs<A, B, C, D, E, F, G, H, R> extends Method {
        R apply(A a, B b, C c, D d, E e, F f, G g, H h) throws Exception;
    }

    // R method(A, B, C, D, E, F, G, H, I)
    @FunctionalInterface
    interface NineArgs<A, B, C, D, E, F, G, H, I, R> extends Method {
        R apply(A a, B b, C c, D d, E e, F f, G g, H h, I i) throws Exception;
    }

    // R method(A, B, C, D, E, F, G, H, I, J)
    @FunctionalInterface
    interface TenArgs<A, B, C, D, E, F, G, H, I, J, R> extends Method {
        R apply(A a, B b, C c, D d, E e, F f, G g, H h, I i, J j) throws Exception;
    }

    //==============================================================================================
    // Casting Methods for Void Methods
    //==============================================================================================

    static ZeroArgsVoid of(ZeroArgsVoid method) {
        return method;
    }

    static <A> OneArgVoid<A> of(OneArgVoid<A> method) {
        return method;
    }

    static <A, B> TwoArgsVoid<A, B> of(TwoArgsVoid<A, B> method) {
        return method;
    }

    static <A, B, C> ThreeArgsVoid<A, B, C> of(ThreeArgsVoid<A, B, C> method) {
        return method;
    }

    static <A, B, C, D> FourArgsVoid<A, B, C, D> of(FourArgsVoid<A, B, C, D> method) {
        return method;
    }

    static <A, B, C, D, E> FiveArgsVoid<A, B, C, D, E> of(FiveArgsVoid<A, B, C, D, E> method) {
        return method;
    }

    static <A, B, C, D, E, F> SixArgsVoid<A, B, C, D, E, F> of(SixArgsVoid<A, B, C, D, E, F> method) {
        return method;
    }

    static <A, B, C, D, E, F, G> SevenArgsVoid<A, B, C, D, E, F, G> of(SevenArgsVoid<A, B, C, D, E, F, G> method) {
        return method;
    }

    static <A, B, C, D, E, F, G, H> EightArgsVoid<A, B, C, D, E, F, G, H> of(EightArgsVoid<A, B, C, D, E, F, G, H> method) {
        return method;
    }

    static <A, B, C, D, E, F, G, H, I> NineArgsVoid<A, B, C, D, E, F, G, H, I> of(NineArgsVoid<A, B, C, D, E, F, G, H, I> method) {
        return method;
    }

    static <A, B, C, D, E, F, G, H, I, J> TenArgsVoid<A, B, C, D, E, F, G, H, I, J> of(TenArgsVoid<A, B, C, D, E, F, G, H, I, J> method) {
        return method;
    }

    //==============================================================================================
    // Casting Methods for Returning Method
    //==============================================================================================

    static <R> ZeroArgs<R> of(ZeroArgs<R> method) {
        return method;
    }

    static <A, R> OneArg<A, R> of(OneArg<A, R> method) {
        return method;
    }

    static <A, B, R> TwoArgs<A, B, R> of(TwoArgs<A, B, R> method) {
        return method;
    }

    static <A, B, C, R> ThreeArgs<A, B, C, R> of(ThreeArgs<A, B, C, R> method) {
        return method;
    }

    static <A, B, C, D, R> FourArgs<A, B, C, D, R> of(FourArgs<A, B, C, D, R> method) {
        return method;
    }

    static <A, B, C, D, E, R> FiveArgs<A, B, C, D, E, R> of(FiveArgs<A, B, C, D, E, R> method) {
        return method;
    }

    static <A, B, C, D, E, F, R> SixArgs<A, B, C, D, E, F, R> of(SixArgs<A, B, C, D, E, F, R> method) {
        return method;
    }

    static <A, B, C, D, E, F, G, R> SevenArgs<A, B, C, D, E, F, G, R> of(SevenArgs<A, B, C, D, E, F, G, R> method) {
        return method;
    }

    static <A, B, C, D, E, F, G, H, R> EightArgs<A, B, C, D, E, F, G, H, R> of(EightArgs<A, B, C, D, E, F, G, H, R> method) {
        return method;
    }

    static <A, B, C, D, E, F, G, H, I, R> NineArgs<A, B, C, D, E, F, G, H, I, R> of(NineArgs<A, B, C, D, E, F, G, H, I, R> method) {
        return method;
    }

    static <A, B, C, D, E, F, G, H, I, J, R> TenArgs<A, B, C, D, E, F, G, H, I, J, R> of(TenArgs<A, B, C, D, E, F, G, H, I, J, R> method) {
        return method;
    }
}
