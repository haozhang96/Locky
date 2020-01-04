package org.haozhang.locky.support.method;

public final class GenericVariadicMethods {
    private GenericVariadicMethods() { }

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
