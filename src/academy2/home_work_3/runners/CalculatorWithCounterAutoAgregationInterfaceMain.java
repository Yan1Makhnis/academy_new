package academy2.home_work_3.runners;

import academy2.home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import academy2.home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoAgregationInterfaceMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoAgregationInterface c8 = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());

        double a = c8.multip(15, 7);
        System.out.println("Значение 1 равно " + a);
        a = c8.sum(4.1, a);
        System.out.println("Значение 2 равно " + a);
        double b = c8.division(28.0, 5);
        System.out.println("Значение 3 равно " + b);
        b = c8.mPow(b, 2);
        System.out.println("Значение 4 равно " + b);
        System.out.println("Окончательный результат равен " + c8.sum(a, b));
        System.out.println("Количество операций " + c8.getCountOperation());
    }
}
