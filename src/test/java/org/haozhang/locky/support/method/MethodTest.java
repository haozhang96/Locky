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
        assertSame(METHOD.asKey().getKey(), METHOD);
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
        assertSame(Method.of(Methods.ZERO_ARGS_VOID), Methods.ZERO_ARGS_VOID);
    }

    @Test
    public void of_givenOneArgVoidMethod_thenReturnSameMethod() {
        assertSame(Method.of(Methods.ONE_ARG_VOID), Methods.ONE_ARG_VOID);
    }

    @Test
    public void of_givenTwoArgsVoidMethod_thenReturnSameMethod() {
        assertSame(Method.of(Methods.TWO_ARGS_VOID), Methods.TWO_ARGS_VOID);
    }

    @Test
    public void of_givenThreeArgsVoidMethod_thenReturnSameMethod() {
        assertSame(Method.of(Methods.THREE_ARGS_VOID), Methods.THREE_ARGS_VOID);
    }

    @Test
    public void of_givenFourArgsVoidMethod_thenReturnSameMethod() {
        assertSame(Method.of(Methods.FOUR_ARGS_VOID), Methods.FOUR_ARGS_VOID);
    }

    @Test
    public void of_givenFiveArgsVoidMethod_thenReturnSameMethod() {
        assertSame(Method.of(Methods.FIVE_ARGS_VOID), Methods.FIVE_ARGS_VOID);
    }

    @Test
    public void of_givenSixArgsVoidMethod_thenReturnSameMethod() {
        assertSame(Method.of(Methods.SIX_ARGS_VOID), Methods.SIX_ARGS_VOID);
    }

    @Test
    public void of_givenSevenArgsVoidMethod_thenReturnSameMethod() {
        assertSame(Method.of(Methods.SEVEN_ARGS_VOID), Methods.SEVEN_ARGS_VOID);
    }

    @Test
    public void of_givenEightArgsVoidMethod_thenReturnSameMethod() {
        assertSame(Method.of(Methods.EIGHT_ARGS_VOID), Methods.EIGHT_ARGS_VOID);
    }

    @Test
    public void of_givenNineArgsVoidMethod_thenReturnSameMethod() {
        assertSame(Method.of(Methods.NINE_ARGS_VOID), Methods.NINE_ARGS_VOID);
    }

    @Test
    public void of_givenTenArgsVoidMethod_thenReturnSameMethod() {
        assertSame(Method.of(Methods.TEN_ARGS_VOID), Methods.TEN_ARGS_VOID);
    }

    //==============================================================================================
    // Casting Methods for Returning Method
    //==============================================================================================

    @Test
    public void of_givenZeroArgsMethod_thenReturnSameMethod() {
        assertSame(Method.of(Methods.ZERO_ARGS), Methods.ZERO_ARGS);
    }

    @Test
    public void of_givenOneArgMethod_thenReturnSameMethod() {
        assertSame(Method.of(Methods.ONE_ARG), Methods.ONE_ARG);
    }

    @Test
    public void of_givenTwoArgsMethod_thenReturnSameMethod() {
        assertSame(Method.of(Methods.TWO_ARGS), Methods.TWO_ARGS);
    }

    @Test
    public void of_givenThreeArgsMethod_thenReturnSameMethod() {
        assertSame(Method.of(Methods.THREE_ARGS), Methods.THREE_ARGS);
    }

    @Test
    public void of_givenFourArgsMethod_thenReturnSameMethod() {
        assertSame(Method.of(Methods.FOUR_ARGS), Methods.FOUR_ARGS);
    }

    @Test
    public void of_givenFiveArgsMethod_thenReturnSameMethod() {
        assertSame(Method.of(Methods.FIVE_ARGS), Methods.FIVE_ARGS);
    }

    @Test
    public void of_givenSixArgsMethod_thenReturnSameMethod() {
        assertSame(Method.of(Methods.SIX_ARGS), Methods.SIX_ARGS);
    }

    @Test
    public void of_givenSevenArgsMethod_thenReturnSameMethod() {
        assertSame(Method.of(Methods.SEVEN_ARGS), Methods.SEVEN_ARGS);
    }

    @Test
    public void of_givenEightArgsMethod_thenReturnSameMethod() {
        assertSame(Method.of(Methods.EIGHT_ARGS), Methods.EIGHT_ARGS);
    }

    @Test
    public void of_givenNineArgsMethod_thenReturnSameMethod() {
        assertSame(Method.of(Methods.NINE_ARGS), Methods.NINE_ARGS);
    }

    @Test
    public void of_givenTenArgsMethod_thenReturnSameMethod() {
        assertSame(Method.of(Methods.TEN_ARGS), Methods.TEN_ARGS);
    }
}
