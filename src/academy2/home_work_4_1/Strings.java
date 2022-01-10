package academy2.home_work_4_1;

public class Strings {

//    Написать метод String toWeek(int day).
//            3.1 В данном методе посчитать количество прошедших недель по переданному числу дней.
//	          3.2 Пример передали: 5. Получили "0 недель"
//            3.3 Пример передали: 14. Получили "2 недели"
//            3.4 Пример передали: 177. Получили "25 недель"


    public static String toWeek(int day) {
        int i = day / 7;
        String wk = Integer.toString(i);
        switch (i % 10) {
            case 1:
                return wk + " неделя";
            case 2, 3, 4:
                return wk + " недели";
            default:
                return wk + " недель";
        }
    }
}
