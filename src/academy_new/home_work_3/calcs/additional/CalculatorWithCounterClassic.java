package academy_new.home_work_3.calcs.additional;

import academy_new.home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {


    private int counter = 0;

    public int getCounter() {
        return counter;
    }
    //должен увеличивать внутренний счётчик (поле) в калькуляторе.

    public void incrementCountOperation(){ //

        counter++;
    }

    //должен возвращать количество использований данного калькулятора (поле)

    public long getCountOperation(){
        return counter;
    }
}
