package academy_new.home_work_3.calcs.runners;

import academy_new.home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper c4 = new CalculatorWithCounterAutoSuper();

        double a = c4.multip(15, 7);
        System.out.println("Значение 1 равно "+a );
        a = c4.sum(4.1, a);
        System.out.println("Значение 2 равно "+a );
        double b = c4.division(28.0, 5);
        System.out.println("Значение 3 равно "+b );
        b = c4.mPow(b, 2);
        System.out.println("Значение 4 равно "+b );
        System.out.println("Результат равен " + c4.sum(a, b));
        System.out.println("Количество операций " + c4.getCountOperation());
    }
}

