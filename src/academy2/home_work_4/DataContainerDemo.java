package academy2.home_work_4;

import java.util.Arrays;
import academy2.home_work_4.comparator.DataComparator;

public class DataContainerDemo {

    public static void main(String[] args) {
        Integer[] data = {1, 3, null, null, 5};
        String[] data1 = {"Yan", "Vitaly", null, "Home"};

        DataContainer<Integer> container = new DataContainer<>(data);

        System.out.println(Arrays.toString(container.getItems()));
        System.out.println(container);
        container.add(34);
        container.add(35);
        container.add(36);
        container.add(37);
        container.add(38);
        System.out.println(Arrays.toString(container.getItems()));
        container.delete(99);
        container.delete(Integer.valueOf(1));
        System.out.println(Arrays.toString(container.getItems()));

        DataComparator comparatorInt = new DataComparator();

        container.sort(comparatorInt);
        System.out.println(Arrays.toString(container.getItems()));


        DataContainer<String> container1 = new DataContainer<>(data1);

//        System.out.println(Arrays.toString(container1.getItems()));
//        container1.add("Viktor");
//        System.out.println(Arrays.toString(container1.getItems()));
//        container1.delete(1);
//        System.out.println(Arrays.toString(container1.getItems()));
//        container1.delete("Home");
//        System.out.println(Arrays.toString(container1.getItems()));

        System.out.println(container1);


    }
}
