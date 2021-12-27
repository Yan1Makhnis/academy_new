package academy_new.home_work_3.runners;

import academy_new.home_work_3.calcs.additional.CalculatorWithMemory;

//4.1 + 15 * 7 + (28 / 5) ^ 2
public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithMemory c9 = new CalculatorWithMemory();
        c9.sum(c9.mPow(c9.division(28.0,5.0),2),4.1);
        c9.putInMemory();

        System.out.println(c9.sum(c9.takeFromMemory(),c9.multip(15,7)));

    }
}
