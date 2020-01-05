package org.haozhang.locky.support.method;

import org.haozhang.locky.support.method.Method.*;

public final class GenericMethods {
    private GenericMethods() { }

    //==============================================================================================
    // Void Methods as Objects
    //==============================================================================================

    public static ZeroArgsVoid ZERO_ARGS_VOID = GenericMethods::zeroArgsVoid;
    public static OneArgVoid<Void> ONE_ARG_VOID = GenericMethods::oneArgVoid;
    public static TwoArgsVoid<Void, Void> TWO_ARGS_VOID = GenericMethods::twoArgsVoid;
    public static ThreeArgsVoid<Void, Void, Void> THREE_ARGS_VOID = GenericMethods::threeArgsVoid;
    public static FourArgsVoid<Void, Void, Void, Void> FOUR_ARGS_VOID = GenericMethods::fourArgsVoid;
    public static FiveArgsVoid<Void, Void, Void, Void, Void> FIVE_ARGS_VOID = GenericMethods::fiveArgsVoid;
    public static SixArgsVoid<Void, Void, Void, Void, Void, Void> SIX_ARGS_VOID = GenericMethods::sixArgsVoid;
    public static SevenArgsVoid<Void, Void, Void, Void, Void, Void, Void> SEVEN_ARGS_VOID = GenericMethods::sevenArgsVoid;
    public static EightArgsVoid<Void, Void, Void, Void, Void, Void, Void, Void> EIGHT_ARGS_VOID = GenericMethods::eightArgsVoid;
    public static NineArgsVoid<Void, Void, Void, Void, Void, Void, Void, Void, Void> NINE_ARGS_VOID = GenericMethods::nineArgsVoid;
    public static TenArgsVoid<Void, Void, Void, Void, Void, Void, Void, Void, Void, Void> TEN_ARGS_VOID = GenericMethods::tenArgsVoid;

    //==============================================================================================
    // Returning Methods as Objects
    //==============================================================================================

    public static ZeroArgs<Void> ZERO_ARGS = GenericMethods::zeroArgs;
    public static OneArg<Void, Void> ONE_ARG = GenericMethods::oneArg;
    public static TwoArgs<Void, Void, Void> TWO_ARGS = GenericMethods::twoArgs;
    public static ThreeArgs<Void, Void, Void, Void> THREE_ARGS = GenericMethods::threeArgs;
    public static FourArgs<Void, Void, Void, Void, Void> FOUR_ARGS = GenericMethods::fourArgs;
    public static FiveArgs<Void, Void, Void, Void, Void, Void> FIVE_ARGS = GenericMethods::fiveArgs;
    public static SixArgs<Void, Void, Void, Void, Void, Void, Void> SIX_ARGS = GenericMethods::sixArgs;
    public static SevenArgs<Void, Void, Void, Void, Void, Void, Void, Void> SEVEN_ARGS = GenericMethods::sevenArgs;
    public static EightArgs<Void, Void, Void, Void, Void, Void, Void, Void, Void> EIGHT_ARGS = GenericMethods::eightArgs;
    public static NineArgs<Void, Void, Void, Void, Void, Void, Void, Void, Void, Void> NINE_ARGS = GenericMethods::nineArgs;
    public static TenArgs<Void, Void, Void, Void, Void, Void, Void, Void, Void, Void, Void> TEN_ARGS = GenericMethods::tenArgs;

    //==============================================================================================
    // Void Methods
    //==============================================================================================

    public static <T> void zeroArgsVoid() { }
    public static <T> void oneArgVoid(T a) { }
    public static <T> void twoArgsVoid(T a, T b) { }
    public static <T> void threeArgsVoid(T a, T b, T c) { }
    public static <T> void fourArgsVoid(T a, T b, T c, T d) { }
    public static <T> void fiveArgsVoid(T a, T b, T c, T d, T e) { }
    public static <T> void sixArgsVoid(T a, T b, T c, T d, T e, T f) { }
    public static <T> void sevenArgsVoid(T a, T b, T c, T d, T e, T f, T g) { }
    public static <T> void eightArgsVoid(T a, T b, T c, T d, T e, T f, T g, T h) { }
    public static <T> void nineArgsVoid(T a, T b, T c, T d, T e, T f, T g, T h, T i) { }
    public static <T> void tenArgsVoid(T a, T b, T c, T d, T e, T f, T g, T h, T i, T j) { }

    //==============================================================================================
    // Returning Methods
    //==============================================================================================

    public static <T> T zeroArgs() { return null; }
    public static <T> T oneArg(T a) { return null; }
    public static <T> T twoArgs(T a, T b) { return null; }
    public static <T> T threeArgs(T a, T b, T c) { return null; }
    public static <T> T fourArgs(T a, T b, T c, T d) { return null; }
    public static <T> T fiveArgs(T a, T b, T c, T d, T e) { return null; }
    public static <T> T sixArgs(T a, T b, T c, T d, T e, T f) { return null; }
    public static <T> T sevenArgs(T a, T b, T c, T d, T e, T f, T g) { return null; }
    public static <T> T eightArgs(T a, T b, T c, T d, T e, T f, T g, T h) { return null; }
    public static <T> T nineArgs(T a, T b, T c, T d, T e, T f, T g, T h, T i) { return null; }
    public static <T> T tenArgs(T a, T b, T c, T d, T e, T f, T g, T h, T i, T j) { return null; }
}
