package org.haozhang.locky.support.method;

import org.haozhang.locky.support.method.Method.*;

public final class VariadicMethods {
    private VariadicMethods() { }

    //==============================================================================================
    // Void Methods as Objects
    //==============================================================================================

    public static ZeroArgsVoid ZERO_ARGS_VOID = VariadicMethods::zeroArgsVoid;
    public static OneArgVoid<Void> ONE_ARG_VOID = VariadicMethods::oneArgVoid;
    public static TwoArgsVoid<Void, Void> TWO_ARGS_VOID = VariadicMethods::twoArgsVoid;
    public static ThreeArgsVoid<Void, Void, Void> THREE_ARGS_VOID = VariadicMethods::threeArgsVoid;
    public static FourArgsVoid<Void, Void, Void, Void> FOUR_ARGS_VOID = VariadicMethods::fourArgsVoid;
    public static FiveArgsVoid<Void, Void, Void, Void, Void> FIVE_ARGS_VOID = VariadicMethods::fiveArgsVoid;
    public static SixArgsVoid<Void, Void, Void, Void, Void, Void> SIX_ARGS_VOID = VariadicMethods::sixArgsVoid;
    public static SevenArgsVoid<Void, Void, Void, Void, Void, Void, Void> SEVEN_ARGS_VOID = VariadicMethods::sevenArgsVoid;
    public static EightArgsVoid<Void, Void, Void, Void, Void, Void, Void, Void> EIGHT_ARGS_VOID = VariadicMethods::eightArgsVoid;
    public static NineArgsVoid<Void, Void, Void, Void, Void, Void, Void, Void, Void> NINE_ARGS_VOID = VariadicMethods::nineArgsVoid;
    public static TenArgsVoid<Void, Void, Void, Void, Void, Void, Void, Void, Void, Void> TEN_ARGS_VOID = VariadicMethods::tenArgsVoid;

    //==============================================================================================
    // Returning Methods as Objects
    //==============================================================================================

    public static ZeroArgs<Void> ZERO_ARGS = VariadicMethods::zeroArgs;
    public static OneArg<Void, Void> ONE_ARG = VariadicMethods::oneArg;
    public static TwoArgs<Void, Void, Void> TWO_ARGS = VariadicMethods::twoArgs;
    public static ThreeArgs<Void, Void, Void, Void> THREE_ARGS = VariadicMethods::threeArgs;
    public static FourArgs<Void, Void, Void, Void, Void> FOUR_ARGS = VariadicMethods::fourArgs;
    public static FiveArgs<Void, Void, Void, Void, Void, Void> FIVE_ARGS = VariadicMethods::fiveArgs;
    public static SixArgs<Void, Void, Void, Void, Void, Void, Void> SIX_ARGS = VariadicMethods::sixArgs;
    public static SevenArgs<Void, Void, Void, Void, Void, Void, Void, Void> SEVEN_ARGS = VariadicMethods::sevenArgs;
    public static EightArgs<Void, Void, Void, Void, Void, Void, Void, Void, Void> EIGHT_ARGS = VariadicMethods::eightArgs;
    public static NineArgs<Void, Void, Void, Void, Void, Void, Void, Void, Void, Void> NINE_ARGS = VariadicMethods::nineArgs;
    public static TenArgs<Void, Void, Void, Void, Void, Void, Void, Void, Void, Void, Void> TEN_ARGS = VariadicMethods::tenArgs;

    //==============================================================================================
    // Void Methods
    //==============================================================================================

    public static void zeroArgsVoid() { }
    public static void oneArgVoid(Void... v) { }
    public static void twoArgsVoid(Void a, Void... v) { }
    public static void threeArgsVoid(Void a, Void b, Void... v) { }
    public static void fourArgsVoid(Void a, Void b, Void c, Void... v) { }
    public static void fiveArgsVoid(Void a, Void b, Void c, Void d, Void... v) { }
    public static void sixArgsVoid(Void a, Void b, Void c, Void d, Void e, Void... v) { }
    public static void sevenArgsVoid(Void a, Void b, Void c, Void d, Void e, Void f, Void... v) { }
    public static void eightArgsVoid(Void a, Void b, Void c, Void d, Void e, Void f, Void g, Void... v) { }
    public static void nineArgsVoid(Void a, Void b, Void c, Void d, Void e, Void f, Void g, Void h, Void... v) { }
    public static void tenArgsVoid(Void a, Void b, Void c, Void d, Void e, Void f, Void g, Void h, Void i, Void... v) { }

    //==============================================================================================
    // Returning Methods
    //==============================================================================================

    public static Void zeroArgs() { return null; }
    public static Void oneArg(Void... v) { return null; }
    public static Void twoArgs(Void a, Void... v) { return null; }
    public static Void threeArgs(Void a, Void b, Void... v) { return null; }
    public static Void fourArgs(Void a, Void b, Void c, Void... v) { return null; }
    public static Void fiveArgs(Void a, Void b, Void c, Void d, Void... v) { return null; }
    public static Void sixArgs(Void a, Void b, Void c, Void d, Void e, Void... v) { return null; }
    public static Void sevenArgs(Void a, Void b, Void c, Void d, Void e, Void f, Void... v) { return null; }
    public static Void eightArgs(Void a, Void b, Void c, Void d, Void e, Void f, Void g, Void... v) { return null; }
    public static Void nineArgs(Void a, Void b, Void c, Void d, Void e, Void f, Void g, Void h, Void... v) { return null; }
    public static Void tenArgs(Void a, Void b, Void c, Void d, Void e, Void f, Void g, Void h, Void i, Void... v) { return null; }
}
