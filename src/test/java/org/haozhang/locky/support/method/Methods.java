package org.haozhang.locky.support.method;

import org.haozhang.locky.support.method.Method.*;

public final class Methods {
    private Methods() { }

    //==============================================================================================
    // Void Methods as Objects
    //==============================================================================================

    public static ZeroArgsVoid ZERO_ARGS_VOID = Methods::zeroArgsVoid;
    public static OneArgVoid<Void> ONE_ARG_VOID = Methods::oneArgVoid;
    public static TwoArgsVoid<Void, Void> TWO_ARGS_VOID = Methods::twoArgsVoid;
    public static ThreeArgsVoid<Void, Void, Void> THREE_ARGS_VOID = Methods::threeArgsVoid;
    public static FourArgsVoid<Void, Void, Void, Void> FOUR_ARGS_VOID = Methods::fourArgsVoid;
    public static FiveArgsVoid<Void, Void, Void, Void, Void> FIVE_ARGS_VOID = Methods::fiveArgsVoid;
    public static SixArgsVoid<Void, Void, Void, Void, Void, Void> SIX_ARGS_VOID = Methods::sixArgsVoid;
    public static SevenArgsVoid<Void, Void, Void, Void, Void, Void, Void> SEVEN_ARGS_VOID = Methods::sevenArgsVoid;
    public static EightArgsVoid<Void, Void, Void, Void, Void, Void, Void, Void> EIGHT_ARGS_VOID = Methods::eightArgsVoid;
    public static NineArgsVoid<Void, Void, Void, Void, Void, Void, Void, Void, Void> NINE_ARGS_VOID = Methods::nineArgsVoid;
    public static TenArgsVoid<Void, Void, Void, Void, Void, Void, Void, Void, Void, Void> TEN_ARGS_VOID = Methods::tenArgsVoid;

    //==============================================================================================
    // Returning Methods as Objects
    //==============================================================================================

    public static ZeroArgs<Void> ZERO_ARGS = Methods::zeroArgs;
    public static OneArg<Void, Void> ONE_ARG = Methods::oneArg;
    public static TwoArgs<Void, Void, Void> TWO_ARGS = Methods::twoArgs;
    public static ThreeArgs<Void, Void, Void, Void> THREE_ARGS = Methods::threeArgs;
    public static FourArgs<Void, Void, Void, Void, Void> FOUR_ARGS = Methods::fourArgs;
    public static FiveArgs<Void, Void, Void, Void, Void, Void> FIVE_ARGS = Methods::fiveArgs;
    public static SixArgs<Void, Void, Void, Void, Void, Void, Void> SIX_ARGS = Methods::sixArgs;
    public static SevenArgs<Void, Void, Void, Void, Void, Void, Void, Void> SEVEN_ARGS = Methods::sevenArgs;
    public static EightArgs<Void, Void, Void, Void, Void, Void, Void, Void, Void> EIGHT_ARGS = Methods::eightArgs;
    public static NineArgs<Void, Void, Void, Void, Void, Void, Void, Void, Void, Void> NINE_ARGS = Methods::nineArgs;
    public static TenArgs<Void, Void, Void, Void, Void, Void, Void, Void, Void, Void, Void> TEN_ARGS = Methods::tenArgs;

    //==============================================================================================
    // Void Methods
    //==============================================================================================

    public static void zeroArgsVoid() { }
    public static void oneArgVoid(Void a) { }
    public static void twoArgsVoid(Void a, Void b) { }
    public static void threeArgsVoid(Void a, Void b, Void c) { }
    public static void fourArgsVoid(Void a, Void b, Void c, Void d) { }
    public static void fiveArgsVoid(Void a, Void b, Void c, Void d, Void e) { }
    public static void sixArgsVoid(Void a, Void b, Void c, Void d, Void e, Void f) { }
    public static void sevenArgsVoid(Void a, Void b, Void c, Void d, Void e, Void f, Void g) { }
    public static void eightArgsVoid(Void a, Void b, Void c, Void d, Void e, Void f, Void g, Void h) { }
    public static void nineArgsVoid(Void a, Void b, Void c, Void d, Void e, Void f, Void g, Void h, Void i) { }
    public static void tenArgsVoid(Void a, Void b, Void c, Void d, Void e, Void f, Void g, Void h, Void i, Void j) { }

    //==============================================================================================
    // Returning Methods
    //==============================================================================================

    public static Void zeroArgs() { return null; }
    public static Void oneArg(Void a) { return null; }
    public static Void twoArgs(Void a, Void b) { return null; }
    public static Void threeArgs(Void a, Void b, Void c) { return null; }
    public static Void fourArgs(Void a, Void b, Void c, Void d) { return null; }
    public static Void fiveArgs(Void a, Void b, Void c, Void d, Void e) { return null; }
    public static Void sixArgs(Void a, Void b, Void c, Void d, Void e, Void f) { return null; }
    public static Void sevenArgs(Void a, Void b, Void c, Void d, Void e, Void f, Void g) { return null; }
    public static Void eightArgs(Void a, Void b, Void c, Void d, Void e, Void f, Void g, Void h) { return null; }
    public static Void nineArgs(Void a, Void b, Void c, Void d, Void e, Void f, Void g, Void h, Void i) { return null; }
    public static Void tenArgs(Void a, Void b, Void c, Void d, Void e, Void f, Void g, Void h, Void i, Void j) { return null; }
}
