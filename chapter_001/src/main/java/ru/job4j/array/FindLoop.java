package ru.job4j.array;

public class FindLoop {
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index < data.length; index++) {
            if (data[ index ] == el) { //находим нужный элемент
                rst = index;
                break;
            }
        }
        return rst;
    }

    public int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int i = 0; i < finish; i++) {
            if (start <= finish) { //ищем в определенном диапазоне
                for (int index = 0; index < data.length; index++) {
                    if (data[ index ] == el) {
                        rst = index;
                    }
                }
            }
        }
        return rst;
    }

    public int[] sort(int[] data) {
        for (int min = 0; min < data.length - 1; min++) {
            int i = min;
            for (int j = min + 1; j < data.length; j++) {
                if (data[ j ] < data[ i ]) { //сортируем
                    i = j;
                }
            }
            int tmp = data[ min ];
            data[ min ] = data[ i ];
            data[ i ] = tmp;
        }
        return data;
    }
}

