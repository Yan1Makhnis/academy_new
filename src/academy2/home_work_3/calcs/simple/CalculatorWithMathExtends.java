package academy2.home_work_3.calcs.simple;

import academy2.home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {

    @Override
    public double mPow(double a, int pow) {
        return Math.pow(a,pow);
    }

    @Override
    public double abs(double a) {
        return Math.abs(a);
    }

    @Override
    public double sqrt(double a) {
        return Math.sqrt(a);
    }
}
