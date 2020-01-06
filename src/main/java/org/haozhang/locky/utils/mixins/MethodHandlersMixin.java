package org.haozhang.locky.utils.mixins;

import org.haozhang.locky.support.method.Method.*;

public interface MethodHandlersMixin {
    //==============================================================================================
    // Void Methods
    //==============================================================================================

    default ZeroArgsVoid method(ZeroArgsVoid method) {
        return method;
    }

    default <A> OneArgVoid<A> method(OneArgVoid<A> method) {
        return method;
    }

    default <A, B> TwoArgsVoid<A, B> method(TwoArgsVoid<A, B> method) {
        return method;
    }

    default <A, B, C> ThreeArgsVoid<A, B, C> method(ThreeArgsVoid<A, B, C> method) {
        return method;
    }

    default <A, B, C, D> FourArgsVoid<A, B, C, D> method(FourArgsVoid<A, B, C, D> method) {
        return method;
    }

    default <A, B, C, D, E> FiveArgsVoid<A, B, C, D, E> method(FiveArgsVoid<A, B, C, D, E> method) {
        return method;
    }

    default <A, B, C, D, E, F> SixArgsVoid<A, B, C, D, E, F> method(SixArgsVoid<A, B, C, D, E, F> method) {
        return method;
    }

    default <A, B, C, D, E, F, G> SevenArgsVoid<A, B, C, D, E, F, G> method(SevenArgsVoid<A, B, C, D, E, F, G> method) {
        return method;
    }

    default <A, B, C, D, E, F, G, H> EightArgsVoid<A, B, C, D, E, F, G, H> method(EightArgsVoid<A, B, C, D, E, F, G, H> method) {
        return method;
    }

    default <A, B, C, D, E, F, G, H, I> NineArgsVoid<A, B, C, D, E, F, G, H, I> method(NineArgsVoid<A, B, C, D, E, F, G, H, I> method) {
        return method;
    }

    default <A, B, C, D, E, F, G, H, I, J> TenArgsVoid<A, B, C, D, E, F, G, H, I, J> method(TenArgsVoid<A, B, C, D, E, F, G, H, I, J> method) {
        return method;
    }

    //==============================================================================================
    // Returning Methods
    //==============================================================================================

    default <R> ZeroArgs<R> method(ZeroArgs<R> method) {
        return method;
    }

    default <A, R> OneArg<A, R> method(OneArg<A, R> method) {
        return method;
    }

    default <A, B, R> TwoArgs<A, B, R> method(TwoArgs<A, B, R> method) {
        return method;
    }

    default <A, B, C, R> ThreeArgs<A, B, C, R> method(ThreeArgs<A, B, C, R> method) {
        return method;
    }

    default <A, B, C, D, R> FourArgs<A, B, C, D, R> method(FourArgs<A, B, C, D, R> method) {
        return method;
    }

    default <A, B, C, D, E, R> FiveArgs<A, B, C, D, E, R> method(FiveArgs<A, B, C, D, E, R> method) {
        return method;
    }

    default <A, B, C, D, E, F, R> SixArgs<A, B, C, D, E, F, R> method(SixArgs<A, B, C, D, E, F, R> method) {
        return method;
    }

    default <A, B, C, D, E, F, G, R> SevenArgs<A, B, C, D, E, F, G, R> method(SevenArgs<A, B, C, D, E, F, G, R> method) {
        return method;
    }

    default <A, B, C, D, E, F, G, H, R> EightArgs<A, B, C, D, E, F, G, H, R> method(EightArgs<A, B, C, D, E, F, G, H, R> method) {
        return method;
    }

    default <A, B, C, D, E, F, G, H, I, R> NineArgs<A, B, C, D, E, F, G, H, I, R> method(NineArgs<A, B, C, D, E, F, G, H, I, R> method) {
        return method;
    }

    default <A, B, C, D, E, F, G, H, I, J, R> TenArgs<A, B, C, D, E, F, G, H, I, J, R> method(TenArgs<A, B, C, D, E, F, G, H, I, J, R> method) {
        return method;
    }
}
