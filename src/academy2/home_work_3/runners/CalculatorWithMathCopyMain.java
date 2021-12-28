package academy2.home_work_3.runners;

import academy2.home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy c1 = new CalculatorWithMathCopy();
        double a = 4.1 + c1.multip(15, 7) + c1.mPow(c1.division(28, 5), 2);
        System.out.println(a);
    }
}
