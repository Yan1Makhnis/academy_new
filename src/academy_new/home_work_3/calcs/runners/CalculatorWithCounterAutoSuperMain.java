package academy_new.home_work_3.calcs.runners;

import academy_new.home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper c4 = new CalculatorWithCounterAutoSuper();

        double a = c4.multip(15, 7);
        a = c4.sum(4.1, a);
        double b = c4.division(28.0, 5);
        b = c4.mPow(b, 2);
        System.out.println("Результат равен " + c4.sum(a, b));
        System.out.println("Количество операций " + c4.getCountOperation());
    }
}

