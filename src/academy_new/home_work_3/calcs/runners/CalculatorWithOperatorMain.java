package academy_new.home_work_3.calcs.runners;

import academy_new.home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator c = new CalculatorWithOperator();
        double a = 4.1 + c.multip(15, 7) + c.mPow(c.division(28, 5), 2);
        System.out.println(a);
    }
}
