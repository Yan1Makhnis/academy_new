package academy2.home_work_3.calcs.simple;

import academy2.home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {
    private double a;
    private double b;
    private double res;
    private int pow;

    public double getRes() {
        return res;
    }

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
        res = a + b;
        return res;
    }

    public double diff(double a, double b) {
        res = a - b;
        return res;
    }

    public double multip(double a, double b) {
        res = a * b;
        return res;
    }

    public double division(double a, double b) {
        res = a / b;
        return res;
    }

    public double mPow(double a, int pow) {
        res = Math.pow(a, pow);
        return res;
    }

    public double abs(double a) {
        res = Math.abs(a);
        return res;
    }

    public double sqrt(double a) {
        res = Math.sqrt(a);
        return res;
    }
}

