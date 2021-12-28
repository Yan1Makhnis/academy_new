package academy2.home_work_3.calcs.additional;

import academy2.home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMemory {

    private long counter;
    private double memory;

    private CalculatorWithMathCopy calculator= new CalculatorWithMathCopy();

    public void incrementCountOperation() {
        counter++;
    }

    public long getCountOperation() {
        return counter;
    }

    public double sum(double a, double b) {
        this.incrementCountOperation();
        return calculator.sum(a, b);
    }

    public double diff(double a, double b) {
        this.incrementCountOperation();
        return calculator.diff(a, b);
    }

    public double multip(double a, double b) {
        this.incrementCountOperation();
        return calculator.multip(a, b);
    }

    public double division(double a, double b) {
        this.incrementCountOperation();
        return calculator.division(a, b);
    }

    public double mPow(double a, int pow) {
        this.incrementCountOperation();
        return calculator.mPow(a, pow);
    }

    public double abs(double a) {
        this.incrementCountOperation();
        return calculator.abs(a);
    }

    public double sqrt(double a) {
        this.incrementCountOperation();
        return calculator.sqrt(a);
    }


    public void putInMemory() {
        memory = calculator.getRes() ;
    }



    public double takeFromMemory() {
        return memory;
    }
}

