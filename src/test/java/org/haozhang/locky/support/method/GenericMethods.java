package org.haozhang.locky.support.method;

public final class GenericMethods {
    private GenericMethods() { }

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
