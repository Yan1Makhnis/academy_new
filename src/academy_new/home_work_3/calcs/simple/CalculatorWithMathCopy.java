package academy_new.home_work_3.calcs.simple;

import academy_new.home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {
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
        return Math.pow(a,pow);
    }

    public double abs(double a) {
        return Math.abs(a);
    }

    public double sqrt(double a) {
        return Math.sqrt(a);
    }
}

