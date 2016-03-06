package za.ac.calculate.cput.Impl;

import za.ac.calculate.cput.*;

/**
 * Created by Songezo on 2016-03-06.
 */
public class MultiModuleCalcImpl implements MultiModuleCalc {
    private AddNum addNum = new AddNum();
    private DivideNum divideNum = new DivideNum();
    private MultiplyNum multiplyNum = new MultiplyNum();
    private SubtractNum subtractNum = new SubtractNum();

    @Override
    public int add(int a, int b) {
        return addNum.add(a, b);
    }
    @Override
    public int multiply(int a, int b) {
        return multiplyNum.multiply(a, b);
    }
    @Override
    public int subStract(int a, int b) {
        return subtractNum.subtract(a, b);
    }
    @Override
    public int divide(int a, int b) {
        return divideNum.divide(a, b);
    }
}
