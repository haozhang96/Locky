package org.haozhang.locky.support.method;

import org.haozhang.locky.support.method.Method.*;

public final class GenericVariadicMethods {
    private GenericVariadicMethods() { }

    //==============================================================================================
    // Void Methods as Objects
    //==============================================================================================

    public static ZeroArgsVoid ZERO_ARGS_VOID = GenericVariadicMethods::zeroArgsVoid;
    public static OneArgVoid<Void> ONE_ARG_VOID = GenericVariadicMethods::oneArgVoid;
    public static TwoArgsVoid<Void, Void> TWO_ARGS_VOID = GenericVariadicMethods::twoArgsVoid;
    public static ThreeArgsVoid<Void, Void, Void> THREE_ARGS_VOID = GenericVariadicMethods::threeArgsVoid;
    public static FourArgsVoid<Void, Void, Void, Void> FOUR_ARGS_VOID = GenericVariadicMethods::fourArgsVoid;
    public static FiveArgsVoid<Void, Void, Void, Void, Void> FIVE_ARGS_VOID = GenericVariadicMethods::fiveArgsVoid;
    public static SixArgsVoid<Void, Void, Void, Void, Void, Void> SIX_ARGS_VOID = GenericVariadicMethods::sixArgsVoid;
    public static SevenArgsVoid<Void, Void, Void, Void, Void, Void, Void> SEVEN_ARGS_VOID = GenericVariadicMethods::sevenArgsVoid;
    public static EightArgsVoid<Void, Void, Void, Void, Void, Void, Void, Void> EIGHT_ARGS_VOID = GenericVariadicMethods::eightArgsVoid;
    public static NineArgsVoid<Void, Void, Void, Void, Void, Void, Void, Void, Void> NINE_ARGS_VOID = GenericVariadicMethods::nineArgsVoid;
    public static TenArgsVoid<Void, Void, Void, Void, Void, Void, Void, Void, Void, Void> TEN_ARGS_VOID = GenericVariadicMethods::tenArgsVoid;

    //==============================================================================================
    // Returning Methods as Objects
    //==============================================================================================

    public static ZeroArgs<Void> ZERO_ARGS = GenericVariadicMethods::zeroArgs;
    public static OneArg<Void, Void> ONE_ARG = GenericVariadicMethods::oneArg;
    public static TwoArgs<Void, Void, Void> TWO_ARGS = GenericVariadicMethods::twoArgs;
    public static ThreeArgs<Void, Void, Void, Void> THREE_ARGS = GenericVariadicMethods::threeArgs;
    public static FourArgs<Void, Void, Void, Void, Void> FOUR_ARGS = GenericVariadicMethods::fourArgs;
    public static FiveArgs<Void, Void, Void, Void, Void, Void> FIVE_ARGS = GenericVariadicMethods::fiveArgs;
    public static SixArgs<Void, Void, Void, Void, Void, Void, Void> SIX_ARGS = GenericVariadicMethods::sixArgs;
    public static SevenArgs<Void, Void, Void, Void, Void, Void, Void, Void> SEVEN_ARGS = GenericVariadicMethods::sevenArgs;
    public static EightArgs<Void, Void, Void, Void, Void, Void, Void, Void, Void> EIGHT_ARGS = GenericVariadicMethods::eightArgs;
    public static NineArgs<Void, Void, Void, Void, Void, Void, Void, Void, Void, Void> NINE_ARGS = GenericVariadicMethods::nineArgs;
    public static TenArgs<Void, Void, Void, Void, Void, Void, Void, Void, Void, Void, Void> TEN_ARGS = GenericVariadicMethods::tenArgs;

    //==============================================================================================
    // Void Methods
    //==============================================================================================

    public static <T> void zeroArgsVoid() { }
    public static <T> void oneArgVoid(Void... v) { }
    public static <T> void twoArgsVoid(T a, Void... v) { }
    public static <T> void threeArgsVoid(T a, T b, Void... v) { }
    public static <T> void fourArgsVoid(T a, T b, T c, Void... v) { }
    public static <T> void fiveArgsVoid(T a, T b, T c, T d, Void... v) { }
    public static <T> void sixArgsVoid(T a, T b, T c, T d, T e, Void... v) { }
    public static <T> void sevenArgsVoid(T a, T b, T c, T d, T e, T f, Void... v) { }
    public static <T> void eightArgsVoid(T a, T b, T c, T d, T e, T f, T g, Void... v) { }
    public static <T> void nineArgsVoid(T a, T b, T c, T d, T e, T f, T g, T h, Void... v) { }
    public static <T> void tenArgsVoid(T a, T b, T c, T d, T e, T f, T g, T h, T i, Void... v) { }

    //==============================================================================================
    // Returning Methods
    //==============================================================================================

    public static <T> T zeroArgs() { return null; }
    public static <T> T oneArg(Void... v) { return null; }
    public static <T> T twoArgs(T a, Void... v) { return null; }
    public static <T> T threeArgs(T a, T b, Void... v) { return null; }
    public static <T> T fourArgs(T a, T b, T c, Void... v) { return null; }
    public static <T> T fiveArgs(T a, T b, T c, T d, Void... v) { return null; }
    public static <T> T sixArgs(T a, T b, T c, T d, T e, Void... v) { return null; }
    public static <T> T sevenArgs(T a, T b, T c, T d, T e, T f, Void... v) { return null; }
    public static <T> T eightArgs(T a, T b, T c, T d, T e, T f, T g, Void... v) { return null; }
    public static <T> T nineArgs(T a, T b, T c, T d, T e, T f, T g, T h, Void... v) { return null; }
    public static <T> T tenArgs(T a, T b, T c, T d, T e, T f, T g, T h, T i, Void... v) { return null; }
}
