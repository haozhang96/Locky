package org.haozhang.locky.support.method;

import org.haozhang.locky.support.LockyTestSupport;
import org.junit.Test;

public class MethodTest extends LockyTestSupport {
    private static final Method METHOD = Methods.ZERO_ARGS;

    //==============================================================================================
    // Default Interface Methods
    //==============================================================================================

    @Test
    public void asKey() {
        assertSame(METHOD, METHOD.asKey().getValue());
    }

    @Test
    public void to_givenConsumer_callConsumerWithMethod() {
        METHOD.to(method -> { assertTrue(method instanceof Method); });
    }

    @Test(expected = RuntimeException.class)
    public void to_givenConsumer_whenConsumerThrowsException_thenRethrowAsRuntimeException() {
        METHOD.to((Method.OneArgVoid<Method>) method -> { throw new Exception(); });
    }

    @Test
    public void to_givenFunction_callFunctionWithMethod() {
        assertTrue(METHOD.to(method -> method instanceof Method));
    }

    @Test(expected = RuntimeException.class)
    public void to_givenFunction_whenFunctionThrowsException_thenRethrowAsRuntimeException() {
        METHOD.to((Method.OneArg<Method, Void>) method -> { throw new Exception(); });
    }

    //==============================================================================================
    // Casting Methods for Void Methods
    //==============================================================================================

    @Test
    public void of_givenZeroArgsVoidMethod_thenReturnSameMethod() {
        assertSame(Methods.ZERO_ARGS_VOID, Method.of(Methods.ZERO_ARGS_VOID));
    }

    @Test
    public void of_givenOneArgVoidMethod_thenReturnSameMethod() {
        assertSame(Methods.ONE_ARG_VOID, Method.of(Methods.ONE_ARG_VOID));
    }

    @Test
    public void of_givenTwoArgsVoidMethod_thenReturnSameMethod() {
        assertSame(Methods.TWO_ARGS_VOID, Method.of(Methods.TWO_ARGS_VOID));
    }

    @Test
    public void of_givenThreeArgsVoidMethod_thenReturnSameMethod() {
        assertSame(Methods.THREE_ARGS_VOID, Method.of(Methods.THREE_ARGS_VOID));
    }

    @Test
    public void of_givenFourArgsVoidMethod_thenReturnSameMethod() {
        assertSame(Methods.FOUR_ARGS_VOID, Method.of(Methods.FOUR_ARGS_VOID));
    }

    @Test
    public void of_givenFiveArgsVoidMethod_thenReturnSameMethod() {
        assertSame(Methods.FIVE_ARGS_VOID, Method.of(Methods.FIVE_ARGS_VOID));
    }

    @Test
    public void of_givenSixArgsVoidMethod_thenReturnSameMethod() {
        assertSame(Methods.SIX_ARGS_VOID, Method.of(Methods.SIX_ARGS_VOID));
    }

    @Test
    public void of_givenSevenArgsVoidMethod_thenReturnSameMethod() {
        assertSame(Methods.SEVEN_ARGS_VOID, Method.of(Methods.SEVEN_ARGS_VOID));
    }

    @Test
    public void of_givenEightArgsVoidMethod_thenReturnSameMethod() {
        assertSame(Methods.EIGHT_ARGS_VOID, Method.of(Methods.EIGHT_ARGS_VOID));
    }

    @Test
    public void of_givenNineArgsVoidMethod_thenReturnSameMethod() {
        assertSame(Methods.NINE_ARGS_VOID, Method.of(Methods.NINE_ARGS_VOID));
    }

    @Test
    public void of_givenTenArgsVoidMethod_thenReturnSameMethod() {
        assertSame(Methods.TEN_ARGS_VOID, Method.of(Methods.TEN_ARGS_VOID));
    }

    //==============================================================================================
    // Casting Methods for Returning Methods
    //==============================================================================================

    @Test
    public void of_givenZeroArgsMethod_thenReturnSameMethod() {
        assertSame(Methods.ZERO_ARGS, Method.of(Methods.ZERO_ARGS));
    }

    @Test
    public void of_givenOneArgMethod_thenReturnSameMethod() {
        assertSame(Methods.ONE_ARG, Method.of(Methods.ONE_ARG));
    }

    @Test
    public void of_givenTwoArgsMethod_thenReturnSameMethod() {
        assertSame(Methods.TWO_ARGS, Method.of(Methods.TWO_ARGS));
    }

    @Test
    public void of_givenThreeArgsMethod_thenReturnSameMethod() {
        assertSame(Methods.THREE_ARGS, Method.of(Methods.THREE_ARGS));
    }

    @Test
    public void of_givenFourArgsMethod_thenReturnSameMethod() {
        assertSame(Methods.FOUR_ARGS, Method.of(Methods.FOUR_ARGS));
    }

    @Test
    public void of_givenFiveArgsMethod_thenReturnSameMethod() {
        assertSame(Methods.FIVE_ARGS, Method.of(Methods.FIVE_ARGS));
    }

    @Test
    public void of_givenSixArgsMethod_thenReturnSameMethod() {
        assertSame(Methods.SIX_ARGS, Method.of(Methods.SIX_ARGS));
    }

    @Test
    public void of_givenSevenArgsMethod_thenReturnSameMethod() {
        assertSame(Methods.SEVEN_ARGS, Method.of(Methods.SEVEN_ARGS));
    }

    @Test
    public void of_givenEightArgsMethod_thenReturnSameMethod() {
        assertSame(Methods.EIGHT_ARGS, Method.of(Methods.EIGHT_ARGS));
    }

    @Test
    public void of_givenNineArgsMethod_thenReturnSameMethod() {
        assertSame(Methods.NINE_ARGS, Method.of(Methods.NINE_ARGS));
    }

    @Test
    public void of_givenTenArgsMethod_thenReturnSameMethod() {
        assertSame(Methods.TEN_ARGS, Method.of(Methods.TEN_ARGS));
    }
}
