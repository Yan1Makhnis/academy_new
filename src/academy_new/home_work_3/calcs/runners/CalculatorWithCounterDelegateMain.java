package academy_new.home_work_3.calcs.runners;


import academy_new.home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import academy_new.home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;
import academy_new.home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterDelegateMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite c5 = new CalculatorWithCounterAutoComposite();
        System.out.println("КОМПОЗИЦИЯ");
        System.out.println("==========");
        double a = c5.multip(15, 7);
        System.out.println("Значение 1 равно " + a);
        a = c5.sum(4.1, a);
        System.out.println("Значение 2 равно " + a);
        double b = c5.division(28.0, 5);
        System.out.println("Значение 3 равно " + b);
        b = c5.mPow(b, 2);
        System.out.println("Значение 4 равно " + b);
        System.out.println("Окончательный результат равен " + c5.sum(a, b));
        System.out.println("Количество операций " + c5.getCountOperation());

        CalculatorWithCounterAutoAgregation c6 = new CalculatorWithCounterAutoAgregation(new CalculatorWithMathCopy());
        System.out.println("____________________________________");
        System.out.println("АГРЕГАЦИЯ");
        System.out.println("==========");
        double m = c6.multip(15, 7);
        System.out.println("Значение 1 равно " + m);
        m = c6.sum(4.1, m);
        System.out.println("Значение 2 равно " + m);
        double n = c6.division(28.0, 5);
        System.out.println("Значение 3 равно " + n);
        n = c6.mPow(n, 2);
        System.out.println("Значение 4 равно " + n);
        System.out.println("Окончательный результат равен " + c6.sum(m, n));
        System.out.println("Количество операций " + c6.getCountOperation());
    }
}
