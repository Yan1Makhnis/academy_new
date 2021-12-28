package academy2.home_work_3.calcs.additional;

import academy2.home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    private long counter;

    public void incrementCountOperation(){
        counter++;
    }

    public long getCountOperation(){
        return counter;
    }


    @Override
    public double mPow(double a, int pow) {
        this.incrementCountOperation();
        return super.mPow(a, pow);
    }

    @Override
    public double abs(double a) {
        this.incrementCountOperation();
        return super.abs(a);
    }

    @Override
    public double sqrt(double a) {
        this.incrementCountOperation();
        return super.sqrt(a);
    }

    @Override
    public double sum(double a, double b) {
        this.incrementCountOperation();
        return super.sum(a, b);
    }

    @Override
    public double diff(double a, double b) {
        this.incrementCountOperation();
        return super.diff(a, b);
    }

    @Override
    public double multip(double a, double b) {
        this.incrementCountOperation();
        return super.multip(a, b);
    }

    @Override
    public double division(double a, double b) {
        this.incrementCountOperation();
        return super.division(a, b);
    }
}
