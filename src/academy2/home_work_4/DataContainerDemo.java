package academy2.home_work_4;

import academy2.home_work_4.comparator.DataComparator;

import java.util.Arrays;

public class DataContainerDemo {

    public static void main(String[] args) {
        int index;
        Integer[] data = {3, 1, null, null, 5};

        DataContainer<Integer> container = new DataContainer<>(data);

        System.out.println(Arrays.toString(container.getItems()));

        index = container.add(34);
        System.out.println(Arrays.toString(container.getItems()) + " - " +
                "Индекс добавленного элемента " + index);
        index = container.add(35);
        System.out.println(Arrays.toString(container.getItems()) + " - " +
                "Индекс добавленного элемента " + index);
        index = container.add(36);
        System.out.println(Arrays.toString(container.getItems()) + " - " +
                "Индекс добавленного элемента " + index);
        index = container.add(37);
        System.out.println(Arrays.toString(container.getItems()) + " - " +
                "Индекс добавленного элемента " + index);

        container.delete(Integer.valueOf(35)); // удаляем по значению
        System.out.println(Arrays.toString(container.getItems()));
        container.delete(4); //удаляем по индексу
        System.out.println(Arrays.toString(container.getItems()));

        DataComparator comparator = new DataComparator();
        container.sort(comparator);
        System.out.println(Arrays.toString(container.getItems())); //после сортировки

    }
}
