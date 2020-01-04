package org.haozhang.locky.keys.method;

import org.haozhang.locky.LockyTestSupport;
import org.haozhang.locky.support.method.*;
import org.junit.Test;

public class MethodKeyTest extends LockyTestSupport {
    //==============================================================================================
    // Void Methods
    //==============================================================================================

    @Test
    public void voidMethods() {
        MethodKey.of(Methods::zeroArgsVoid);
        MethodKey.of(Methods::oneArgVoid);
        MethodKey.of(Methods::twoArgsVoid);
        MethodKey.of(Methods::threeArgsVoid);
        MethodKey.of(Methods::fourArgsVoid);
        MethodKey.of(Methods::fiveArgsVoid);
        MethodKey.of(Methods::sixArgsVoid);
        MethodKey.of(Methods::sevenArgsVoid);
        MethodKey.of(Methods::eightArgsVoid);
        MethodKey.of(Methods::nineArgsVoid);
        MethodKey.of(Methods::tenArgsVoid);
    }

    @Test
    public <T extends Void> void variadicVoidMethods() {
        MethodKey.of(VariadicMethods::zeroArgsVoid);
        MethodKey.of((Method.OneArgVoid<T[]>) VariadicMethods::oneArgVoid);
        MethodKey.of((Method.TwoArgsVoid<T, T[]>) VariadicMethods::twoArgsVoid);
        MethodKey.of((Method.ThreeArgsVoid<T, T, T[]>) VariadicMethods::threeArgsVoid);
        MethodKey.of((Method.FourArgsVoid<T, T, T, T[]>) VariadicMethods::fourArgsVoid);
        MethodKey.of((Method.FiveArgsVoid<T, T, T, T, T[]>) VariadicMethods::fiveArgsVoid);
        MethodKey.of((Method.SixArgsVoid<T, T, T, T, T, T[]>) VariadicMethods::sixArgsVoid);
        MethodKey.of((Method.SevenArgsVoid<T, T, T, T, T, T, T[]>) VariadicMethods::sevenArgsVoid);
        MethodKey.of((Method.EightArgsVoid<T, T, T, T, T, T, T, T[]>) VariadicMethods::eightArgsVoid);
        MethodKey.of((Method.NineArgsVoid<T, T, T, T, T, T, T, T, T[]>) VariadicMethods::nineArgsVoid);
        MethodKey.of((Method.TenArgsVoid<T, T, T, T, T, T, T, T, T, T[]>) VariadicMethods::tenArgsVoid);
    }

    @Test
    public void genericVoidMethods() {
        MethodKey.of((Method.ZeroArgsVoid) GenericMethods::zeroArgsVoid);
        MethodKey.of((Method.OneArgVoid) GenericMethods::oneArgVoid);
        MethodKey.of((Method.TwoArgsVoid) GenericMethods::twoArgsVoid);
        MethodKey.of((Method.ThreeArgsVoid) GenericMethods::threeArgsVoid);
        MethodKey.of((Method.FourArgsVoid) GenericMethods::fourArgsVoid);
        MethodKey.of((Method.FiveArgsVoid) GenericMethods::fiveArgsVoid);
        MethodKey.of((Method.SixArgsVoid) GenericMethods::sixArgsVoid);
        MethodKey.of((Method.SevenArgsVoid) GenericMethods::sevenArgsVoid);
        MethodKey.of((Method.EightArgsVoid) GenericMethods::eightArgsVoid);
        MethodKey.of((Method.NineArgsVoid) GenericMethods::nineArgsVoid);
        MethodKey.of((Method.TenArgsVoid) GenericMethods::tenArgsVoid);
    }

    @Test
    public <T extends Void> void genericVariadicVoidMethods() {
        MethodKey.of((Method.ZeroArgsVoid) GenericVariadicMethods::zeroArgsVoid);
        MethodKey.of((Method.OneArgVoid<T[]>) GenericVariadicMethods::oneArgVoid);
        MethodKey.of((Method.TwoArgsVoid<T, T[]>) GenericVariadicMethods::twoArgsVoid);
        MethodKey.of((Method.ThreeArgsVoid<T, T, T[]>) GenericVariadicMethods::threeArgsVoid);
        MethodKey.of((Method.FourArgsVoid<T, T, T, T[]>) GenericVariadicMethods::fourArgsVoid);
        MethodKey.of((Method.FiveArgsVoid<T, T, T, T, T[]>) GenericVariadicMethods::fiveArgsVoid);
        MethodKey.of((Method.SixArgsVoid<T, T, T, T, T, T[]>) GenericVariadicMethods::sixArgsVoid);
        MethodKey.of((Method.SevenArgsVoid<T, T, T, T, T, T, T[]>) GenericVariadicMethods::sevenArgsVoid);
        MethodKey.of((Method.EightArgsVoid<T, T, T, T, T, T, T, T[]>) GenericVariadicMethods::eightArgsVoid);
        MethodKey.of((Method.NineArgsVoid<T, T, T, T, T, T, T, T, T[]>) GenericVariadicMethods::nineArgsVoid);
        MethodKey.of((Method.TenArgsVoid<T, T, T, T, T, T, T, T, T, T[]>) GenericVariadicMethods::tenArgsVoid);
    }

    //==============================================================================================
    // Returning Methods
    //==============================================================================================

    @Test
    public void returningMethods() {
        MethodKey.of(Methods::zeroArgs);
        MethodKey.of(Methods::oneArg);
        MethodKey.of(Methods::twoArgs);
        MethodKey.of(Methods::threeArgs);
        MethodKey.of(Methods::fourArgs);
        MethodKey.of(Methods::fiveArgs);
        MethodKey.of(Methods::sixArgs);
        MethodKey.of(Methods::sevenArgs);
        MethodKey.of(Methods::eightArgs);
        MethodKey.of(Methods::nineArgs);
        MethodKey.of(Methods::tenArgs);
    }

    @Test
    public <T extends Void> void varadicReturningMethods() {
        MethodKey.of(VariadicMethods::zeroArgs);
        MethodKey.of((Method.OneArg<T[], ?>) VariadicMethods::oneArg);
        MethodKey.of((Method.TwoArgs<T, T[], ?>) VariadicMethods::twoArgs);
        MethodKey.of((Method.ThreeArgs<T, T, T[], ?>) VariadicMethods::threeArgs);
        MethodKey.of((Method.FourArgs<T, T, T, T[], ?>) VariadicMethods::fourArgs);
        MethodKey.of((Method.FiveArgs<T, T, T, T, T[], ?>) VariadicMethods::fiveArgs);
        MethodKey.of((Method.SixArgs<T, T, T, T, T, T[], ?>) VariadicMethods::sixArgs);
        MethodKey.of((Method.SevenArgs<T, T, T, T, T, T, T[], ?>) VariadicMethods::sevenArgs);
        MethodKey.of((Method.EightArgs<T, T, T, T, T, T, T, T[], ?>) VariadicMethods::eightArgs);
        MethodKey.of((Method.NineArgs<T, T, T, T, T, T, T, T, T[], ?>) VariadicMethods::nineArgs);
        MethodKey.of((Method.TenArgs<T, T, T, T, T, T, T, T, T, T[], ?>) VariadicMethods::tenArgs);
    }

    @Test
    public void genericReturningMethods() {
        MethodKey.of((Method.ZeroArgs) GenericMethods::zeroArgs);
        MethodKey.of((Method.OneArg) GenericMethods::oneArg);
        MethodKey.of((Method.TwoArgs) GenericMethods::twoArgs);
        MethodKey.of((Method.ThreeArgs) GenericMethods::threeArgs);
        MethodKey.of((Method.FourArgs) GenericMethods::fourArgs);
        MethodKey.of((Method.FiveArgs) GenericMethods::fiveArgs);
        MethodKey.of((Method.SixArgs) GenericMethods::sixArgs);
        MethodKey.of((Method.SevenArgs) GenericMethods::sevenArgs);
        MethodKey.of((Method.EightArgs) GenericMethods::eightArgs);
        MethodKey.of((Method.NineArgs) GenericMethods::nineArgs);
        MethodKey.of((Method.TenArgs) GenericMethods::tenArgs);
    }

    @Test
    public <T extends Void> void genericVariadicReturningMethods() {
        MethodKey.of((Method.ZeroArgs) GenericVariadicMethods::zeroArgs);
        MethodKey.of((Method.OneArg<T[], ?>) GenericVariadicMethods::oneArg);
        MethodKey.of((Method.TwoArgs<T, T[], ?>) GenericVariadicMethods::twoArgs);
        MethodKey.of((Method.ThreeArgs<T, T, T[], ?>) GenericVariadicMethods::threeArgs);
        MethodKey.of((Method.FourArgs<T, T, T, T[], ?>) GenericVariadicMethods::fourArgs);
        MethodKey.of((Method.FiveArgs<T, T, T, T, T[], ?>) GenericVariadicMethods::fiveArgs);
        MethodKey.of((Method.SixArgs<T, T, T, T, T, T[], ?>) GenericVariadicMethods::sixArgs);
        MethodKey.of((Method.SevenArgs<T, T, T, T, T, T, T[], ?>) GenericVariadicMethods::sevenArgs);
        MethodKey.of((Method.EightArgs<T, T, T, T, T, T, T, T[], ?>) GenericVariadicMethods::eightArgs);
        MethodKey.of((Method.NineArgs<T, T, T, T, T, T, T, T, T[], ?>) GenericVariadicMethods::nineArgs);
        MethodKey.of((Method.TenArgs<T, T, T, T, T, T, T, T, T, T[], ?>) GenericVariadicMethods::tenArgs);
    }
}
