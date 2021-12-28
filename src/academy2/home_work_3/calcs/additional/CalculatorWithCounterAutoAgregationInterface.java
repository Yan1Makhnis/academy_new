package academy2.home_work_3.calcs.additional;

import academy2.home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregationInterface {

    private long counter;
    private ICalculator calculator;

    public CalculatorWithCounterAutoAgregationInterface(ICalculator calculator) {
        this.calculator = calculator;
    }

    public void incrementCountOperation(){
        counter++;
    }

    public long getCountOperation(){
        return counter;
    }

    public double sum(double a, double b) {
        this.incrementCountOperation();
        return calculator.sum(a,b);
    }

    public double diff(double a, double b) {
        this.incrementCountOperation();
        return calculator.diff(a,b);
    }

    public double multip(double a, double b) {
        this.incrementCountOperation();
        return calculator.multip(a,b);
    }

    public double division(double a, double b) {
        this.incrementCountOperation();
        return calculator.division(a,b);
    }

    public double mPow(double a, int pow) {
        this.incrementCountOperation();
        return calculator.mPow(a,pow);
    }

    public double abs(double a) {
        this.incrementCountOperation();
        return calculator.abs(a);
    }

    public double sqrt(double a) {
        this.incrementCountOperation();
        return calculator.sqrt(a);
    }

}


