package academy2.home_work_3.runners;

import academy2.home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends c2 = new CalculatorWithMathExtends();
        double a = 4.1 + c2.multip(15, 7) + c2.mPow(c2.division(28, 5), 2);
        System.out.println(a);
    }
}
