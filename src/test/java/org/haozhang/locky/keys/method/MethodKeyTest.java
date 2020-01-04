package org.haozhang.locky.keys.method;

import org.haozhang.locky.support.LockyTestSupport;
import org.haozhang.locky.support.method.*;
import org.junit.Test;

public class MethodKeyTest extends LockyTestSupport {
    //==============================================================================================
    // Void Methods
    //==============================================================================================

    @Test
    public void voidMethods() {
        assertNotNull(MethodKey.of(Methods::zeroArgsVoid));
        assertNotNull(MethodKey.of(Methods::oneArgVoid));
        assertNotNull(MethodKey.of(Methods::twoArgsVoid));
        assertNotNull(MethodKey.of(Methods::threeArgsVoid));
        assertNotNull(MethodKey.of(Methods::fourArgsVoid));
        assertNotNull(MethodKey.of(Methods::fiveArgsVoid));
        assertNotNull(MethodKey.of(Methods::sixArgsVoid));
        assertNotNull(MethodKey.of(Methods::sevenArgsVoid));
        assertNotNull(MethodKey.of(Methods::eightArgsVoid));
        assertNotNull(MethodKey.of(Methods::nineArgsVoid));
        assertNotNull(MethodKey.of(Methods::tenArgsVoid));
    }

    @Test
    public <T extends Void> void variadicVoidMethods() {
        assertNotNull(MethodKey.of(VariadicMethods::zeroArgsVoid));
        assertNotNull(MethodKey.of((Method.OneArgVoid<T[]>) VariadicMethods::oneArgVoid));
        assertNotNull(MethodKey.of((Method.TwoArgsVoid<T, T[]>) VariadicMethods::twoArgsVoid));
        assertNotNull(MethodKey.of((Method.ThreeArgsVoid<T, T, T[]>) VariadicMethods::threeArgsVoid));
        assertNotNull(MethodKey.of((Method.FourArgsVoid<T, T, T, T[]>) VariadicMethods::fourArgsVoid));
        assertNotNull(MethodKey.of((Method.FiveArgsVoid<T, T, T, T, T[]>) VariadicMethods::fiveArgsVoid));
        assertNotNull(MethodKey.of((Method.SixArgsVoid<T, T, T, T, T, T[]>) VariadicMethods::sixArgsVoid));
        assertNotNull(MethodKey.of((Method.SevenArgsVoid<T, T, T, T, T, T, T[]>) VariadicMethods::sevenArgsVoid));
        assertNotNull(MethodKey.of((Method.EightArgsVoid<T, T, T, T, T, T, T, T[]>) VariadicMethods::eightArgsVoid));
        assertNotNull(MethodKey.of((Method.NineArgsVoid<T, T, T, T, T, T, T, T, T[]>) VariadicMethods::nineArgsVoid));
        assertNotNull(MethodKey.of((Method.TenArgsVoid<T, T, T, T, T, T, T, T, T, T[]>) VariadicMethods::tenArgsVoid));
    }

    @Test
    public void genericVoidMethods() {
        assertNotNull(MethodKey.of((Method.ZeroArgsVoid) GenericMethods::zeroArgsVoid));
        assertNotNull(MethodKey.of((Method.OneArgVoid) GenericMethods::oneArgVoid));
        assertNotNull(MethodKey.of((Method.TwoArgsVoid) GenericMethods::twoArgsVoid));
        assertNotNull(MethodKey.of((Method.ThreeArgsVoid) GenericMethods::threeArgsVoid));
        assertNotNull(MethodKey.of((Method.FourArgsVoid) GenericMethods::fourArgsVoid));
        assertNotNull(MethodKey.of((Method.FiveArgsVoid) GenericMethods::fiveArgsVoid));
        assertNotNull(MethodKey.of((Method.SixArgsVoid) GenericMethods::sixArgsVoid));
        assertNotNull(MethodKey.of((Method.SevenArgsVoid) GenericMethods::sevenArgsVoid));
        assertNotNull(MethodKey.of((Method.EightArgsVoid) GenericMethods::eightArgsVoid));
        assertNotNull(MethodKey.of((Method.NineArgsVoid) GenericMethods::nineArgsVoid));
        assertNotNull(MethodKey.of((Method.TenArgsVoid) GenericMethods::tenArgsVoid));
    }

    @Test
    public <T extends Void> void genericVariadicVoidMethods() {
        assertNotNull(MethodKey.of((Method.ZeroArgsVoid) GenericVariadicMethods::zeroArgsVoid));
        assertNotNull(MethodKey.of((Method.OneArgVoid<T[]>) GenericVariadicMethods::oneArgVoid));
        assertNotNull(MethodKey.of((Method.TwoArgsVoid<T, T[]>) GenericVariadicMethods::twoArgsVoid));
        assertNotNull(MethodKey.of((Method.ThreeArgsVoid<T, T, T[]>) GenericVariadicMethods::threeArgsVoid));
        assertNotNull(MethodKey.of((Method.FourArgsVoid<T, T, T, T[]>) GenericVariadicMethods::fourArgsVoid));
        assertNotNull(MethodKey.of((Method.FiveArgsVoid<T, T, T, T, T[]>) GenericVariadicMethods::fiveArgsVoid));
        assertNotNull(MethodKey.of((Method.SixArgsVoid<T, T, T, T, T, T[]>) GenericVariadicMethods::sixArgsVoid));
        assertNotNull(MethodKey.of((Method.SevenArgsVoid<T, T, T, T, T, T, T[]>) GenericVariadicMethods::sevenArgsVoid));
        assertNotNull(MethodKey.of((Method.EightArgsVoid<T, T, T, T, T, T, T, T[]>) GenericVariadicMethods::eightArgsVoid));
        assertNotNull(MethodKey.of((Method.NineArgsVoid<T, T, T, T, T, T, T, T, T[]>) GenericVariadicMethods::nineArgsVoid));
        assertNotNull(MethodKey.of((Method.TenArgsVoid<T, T, T, T, T, T, T, T, T, T[]>) GenericVariadicMethods::tenArgsVoid));
    }

    //==============================================================================================
    // Returning Methods
    //==============================================================================================

    @Test
    public void returningMethods() {
        assertNotNull(MethodKey.of(Methods::zeroArgs));
        assertNotNull(MethodKey.of(Methods::oneArg));
        assertNotNull(MethodKey.of(Methods::twoArgs));
        assertNotNull(MethodKey.of(Methods::threeArgs));
        assertNotNull(MethodKey.of(Methods::fourArgs));
        assertNotNull(MethodKey.of(Methods::fiveArgs));
        assertNotNull(MethodKey.of(Methods::sixArgs));
        assertNotNull(MethodKey.of(Methods::sevenArgs));
        assertNotNull(MethodKey.of(Methods::eightArgs));
        assertNotNull(MethodKey.of(Methods::nineArgs));
        assertNotNull(MethodKey.of(Methods::tenArgs));
    }

    @Test
    public <T extends Void> void varadicReturningMethods() {
        assertNotNull(MethodKey.of(VariadicMethods::zeroArgs));
        assertNotNull(MethodKey.of((Method.OneArg<T[], ?>) VariadicMethods::oneArg));
        assertNotNull(MethodKey.of((Method.TwoArgs<T, T[], ?>) VariadicMethods::twoArgs));
        assertNotNull(MethodKey.of((Method.ThreeArgs<T, T, T[], ?>) VariadicMethods::threeArgs));
        assertNotNull(MethodKey.of((Method.FourArgs<T, T, T, T[], ?>) VariadicMethods::fourArgs));
        assertNotNull(MethodKey.of((Method.FiveArgs<T, T, T, T, T[], ?>) VariadicMethods::fiveArgs));
        assertNotNull(MethodKey.of((Method.SixArgs<T, T, T, T, T, T[], ?>) VariadicMethods::sixArgs));
        assertNotNull(MethodKey.of((Method.SevenArgs<T, T, T, T, T, T, T[], ?>) VariadicMethods::sevenArgs));
        assertNotNull(MethodKey.of((Method.EightArgs<T, T, T, T, T, T, T, T[], ?>) VariadicMethods::eightArgs));
        assertNotNull(MethodKey.of((Method.NineArgs<T, T, T, T, T, T, T, T, T[], ?>) VariadicMethods::nineArgs));
        assertNotNull(MethodKey.of((Method.TenArgs<T, T, T, T, T, T, T, T, T, T[], ?>) VariadicMethods::tenArgs));
    }

    @Test
    public void genericReturningMethods() {
        assertNotNull(MethodKey.of((Method.ZeroArgs) GenericMethods::zeroArgs));
        assertNotNull(MethodKey.of((Method.OneArg) GenericMethods::oneArg));
        assertNotNull(MethodKey.of((Method.TwoArgs) GenericMethods::twoArgs));
        assertNotNull(MethodKey.of((Method.ThreeArgs) GenericMethods::threeArgs));
        assertNotNull(MethodKey.of((Method.FourArgs) GenericMethods::fourArgs));
        assertNotNull(MethodKey.of((Method.FiveArgs) GenericMethods::fiveArgs));
        assertNotNull(MethodKey.of((Method.SixArgs) GenericMethods::sixArgs));
        assertNotNull(MethodKey.of((Method.SevenArgs) GenericMethods::sevenArgs));
        assertNotNull(MethodKey.of((Method.EightArgs) GenericMethods::eightArgs));
        assertNotNull(MethodKey.of((Method.NineArgs) GenericMethods::nineArgs));
        assertNotNull(MethodKey.of((Method.TenArgs) GenericMethods::tenArgs));
    }

    @Test
    public <T extends Void> void genericVariadicReturningMethods() {
        assertNotNull(MethodKey.of((Method.ZeroArgs) GenericVariadicMethods::zeroArgs));
        assertNotNull(MethodKey.of((Method.OneArg<T[], ?>) GenericVariadicMethods::oneArg));
        assertNotNull(MethodKey.of((Method.TwoArgs<T, T[], ?>) GenericVariadicMethods::twoArgs));
        assertNotNull(MethodKey.of((Method.ThreeArgs<T, T, T[], ?>) GenericVariadicMethods::threeArgs));
        assertNotNull(MethodKey.of((Method.FourArgs<T, T, T, T[], ?>) GenericVariadicMethods::fourArgs));
        assertNotNull(MethodKey.of((Method.FiveArgs<T, T, T, T, T[], ?>) GenericVariadicMethods::fiveArgs));
        assertNotNull(MethodKey.of((Method.SixArgs<T, T, T, T, T, T[], ?>) GenericVariadicMethods::sixArgs));
        assertNotNull(MethodKey.of((Method.SevenArgs<T, T, T, T, T, T, T[], ?>) GenericVariadicMethods::sevenArgs));
        assertNotNull(MethodKey.of((Method.EightArgs<T, T, T, T, T, T, T, T[], ?>) GenericVariadicMethods::eightArgs));
        assertNotNull(MethodKey.of((Method.NineArgs<T, T, T, T, T, T, T, T, T[], ?>) GenericVariadicMethods::nineArgs));
        assertNotNull(MethodKey.of((Method.TenArgs<T, T, T, T, T, T, T, T, T, T[], ?>) GenericVariadicMethods::tenArgs));
    }
}
