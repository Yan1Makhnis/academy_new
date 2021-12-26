package academy_new.home_work_3.calcs.simple;

public class CalculatorWithMathExtends extends CalculatorWithOperator{

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
