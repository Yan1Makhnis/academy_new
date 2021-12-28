package academy2.home_work_3.calcs.additional;

import academy2.home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {


    private long counter = 0;

    public void incrementCountOperation(){
        counter++;
    }
    public long getCountOperation(){
        return counter;
    }
}
