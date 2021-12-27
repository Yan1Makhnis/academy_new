package academy_new.home_work_3.calcs.additional;

import academy_new.home_work_3.calcs.simple.CalculatorWithMathCopy;


public class CalculatorWithCounterAutoComposite {
    private long counter;
    private CalculatorWithMathCopy calculatorWithMathCopy= new CalculatorWithMathCopy();

    public void incrementCountOperation(){
        counter++;
    }

    public long getCountOperation(){
        return counter;
    }

    public double sum(double a, double b) {
        this.incrementCountOperation();
        return calculatorWithMathCopy.sum(a,b);
    }

    public double diff(double a, double b) {
        this.incrementCountOperation();
        return calculatorWithMathCopy.diff(a,b);
    }

    public double multip(double a, double b) {
        this.incrementCountOperation();
        return calculatorWithMathCopy.multip(a,b);
    }

    public double division(double a, double b) {
        this.incrementCountOperation();
        return calculatorWithMathCopy.division(a,b);
    }

    public double mPow(double a, int pow) {
        this.incrementCountOperation();
        return calculatorWithMathCopy.mPow(a,pow);
    }

    public double abs(double a) {
        this.incrementCountOperation();
        return calculatorWithMathCopy.abs(a);
    }

    public double sqrt(double a) {
        this.incrementCountOperation();
        return calculatorWithMathCopy.sqrt(a);
    }
}

