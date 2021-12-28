package academy2.home_work_3.calcs.simple;

import academy2.home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {
    private double a;
    private double b;
    private int pow;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public int getPow() {
        return pow;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public double diff(double a, double b) {
        return a - b;
    }

    public double multip(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        return a / b;
    }

    public double mPow(double a, int pow) {
        double result = 1;
        for (int i = 1; i <= pow; i++) {
            result = a * result;
        }
        return result;
    }

    public double abs(double a) {
        return ((a < 0) ? -a : a);
    }

    public double sqrt(double a) {
        return Math.sqrt(a);
    }
}

