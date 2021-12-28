package academy2.home_work_3.calcs.additional;

import academy2.home_work_3.calcs.simple.CalculatorWithMathCopy;
import academy2.home_work_3.calcs.simple.CalculatorWithMathExtends;
import academy2.home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoAgregation {

    private long counter;
    private CalculatorWithOperator calculatorWithOperator;
    private CalculatorWithMathCopy calculatorWithMathCopy;
    private CalculatorWithMathExtends calculatorWithMathExtends;


    public CalculatorWithCounterAutoAgregation(CalculatorWithMathExtends calculatorWithMathExtends) {
        this.calculatorWithMathExtends = calculatorWithMathExtends;
    }

    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy calculatorWithMathCopy) {
        this.calculatorWithMathCopy = calculatorWithMathCopy;
    }

    public CalculatorWithCounterAutoAgregation(CalculatorWithOperator calculatorWithOperator) {
        this.calculatorWithOperator = calculatorWithOperator;
    }

    public void incrementCountOperation() {
        counter++;
    }

    public long getCountOperation() {
        return counter;
    }

    public double sum(double a, double b) {
        this.incrementCountOperation();
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.sum(a, b);
        }
        if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.sum(a, b);
        }
        if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.sum(a, b);
        }
        return 0;
    }

    public double diff(double a, double b) {
        this.incrementCountOperation();
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.diff(a, b);
        }
        if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.diff(a, b);
        }
        if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.diff(a, b);
        }
        return 0;
    }

    public double multip(double a, double b) {
        this.incrementCountOperation();
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.multip(a, b);
        }
        if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.multip(a, b);
        }
        if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.multip(a, b);
        }
        return 0;
    }

    public double division(double a, double b) {
        this.incrementCountOperation();
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.division(a, b);
        }
        if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.division(a, b);
        }
        if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.division(a, b);
        }
        return 0;
    }

    public double mPow(double a, int pow) {
        this.incrementCountOperation();
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.mPow(a, pow);
        }
        if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.mPow(a, pow);
        }
        if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.mPow(a, pow);
        }
        return 0;
    }

    public double abs(double a) {
        this.incrementCountOperation();
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.abs(a);
        }
        if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.abs(a);
        }
        if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.abs(a);
        }
        return 0;
    }

    public double sqrt(double a) {
        this.incrementCountOperation();
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.sqrt(a);
        }
        if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.sqrt(a);
        }
        if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.sqrt(a);
        }
        return 0;
    }
}


