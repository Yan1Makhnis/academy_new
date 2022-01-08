package academy2.home_work_4;

import academy2.home_work_4.comparator.DataComparator;

import java.util.Arrays;

import java.util.Comparator;

public class DataContainer<T> {

    T[] data;

    private int size;


    public DataContainer(T[] data) {
        this.data = data;
        this.size = data.length;
    }

    public int getSize() {
        return size;
    }

    public T[] getItems() {
        return data;
    }

    public int add(T item) {
        if (item == null) {
            return -1;
        }
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = item;
                return i;
            }
        }
        data = Arrays.copyOf(data, size + 1);
        data[size] = item;
        return this.size++;
    }

    public T get(int index) {
        if (index >= data.length && index < 0) {
            return null;
        }
        return data[index];
    }

    public boolean delete(int index) {
        if (index > data.length && index < 0) {
            return false;
        }
        for (int i = index; i < data.length - 1; i++) {
            data[i] = data[i + 1];
        }
        data = Arrays.copyOf(data, data.length - 1);
        return true;
    }

    public boolean delete(T item) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(item)) {
                for (int j = i; j < data.length - 1; j++) {
                    data[j] = data[j + 1];
                }
                data = Arrays.copyOf(data, data.length - 1);
                return true;
            }
        }
        return false;
    }

    public void sort(Comparator<T> comparator) {
        boolean sorted;

        do {
            sorted = true;

            for (int i = 0; i < data.length - 1; i++) {
                T o1 = data[i];
                T o2 = data[i + 1];

                if (comparator.compare(o1, o2) > 0) {
                    data[i + 1] = o1;
                    data[i] = o2;
                    sorted = false;
                }
            }

        } while (!sorted);
    }

    /**
     * array - новый массив без Null
     */

    @Override
    public String toString() {

        T[] array = data;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array = Arrays.copyOf(array, array.length - 1);
                i--;
            }
        }

        return "DataContainer{" +
                "data=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }
}