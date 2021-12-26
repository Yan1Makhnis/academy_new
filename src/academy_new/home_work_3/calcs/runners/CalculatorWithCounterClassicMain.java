package academy_new.home_work_3.calcs.runners;

//Создать класс CalculatorWithCounterClassicMain в котором будет точка входа (main метод).
//        В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1,
//        при каждой математической операции самостоятельно вызывать метод incrementCountOperation() для увеличения счётчика.
//        Вывести в консоль результат.

import academy_new.home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic c3 = new CalculatorWithCounterClassic();

        double a = c3.multip(15, 7);
        c3.incrementCountOperation();
        a = c3.sum(4.1, a);
        c3.incrementCountOperation();
        double b = c3.division(28.0, 5);
        c3.incrementCountOperation();
        b = c3.mPow(b, 2);
        c3.incrementCountOperation();
        System.out.println("Результат равен " + c3.sum(a, b));
        c3.incrementCountOperation();
        System.out.println("Количество операций " + c3.getCountOperation());

    }
}
