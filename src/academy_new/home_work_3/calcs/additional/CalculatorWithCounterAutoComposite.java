package academy_new.home_work_3.calcs.additional;

import academy_new.home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoComposite {

    private double a;
    private double b;
    private int pow;
    private int counter;
    public CalculatorWithOperator calc;
    public CalculatorWithCounterAutoComposite(CalculatorWithOperator calc) {
        this.calc = calc;
    }

    public int getCounter() {
        return counter;
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

    public void incrementCountOperation(){
        counter++;
    }

    public long getCountOperation(){
        return counter;
    }

    public double sum(double a, double b) {
        this.incrementCountOperation();
        return a + b;
    }

    public double diff(double a, double b) {
        this.incrementCountOperation();
        return a - b;
    }

    public double multip(double a, double b) {
        this.incrementCountOperation();
        return a * b;
    }

    public double division(double a, double b) {
        this.incrementCountOperation();
        return a / b;
    }

    public double mPow(double a, int pow) {
        this.incrementCountOperation();
        return Math.pow(a,pow);
    }

    public double abs(double a) {
        this.incrementCountOperation();
        return Math.abs(a);
    }

    public double sqrt(double a) {
        this.incrementCountOperation();
        return Math.sqrt(a);
    }
}


