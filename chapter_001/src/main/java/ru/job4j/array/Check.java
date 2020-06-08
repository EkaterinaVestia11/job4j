package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        boolean n = data[ 0 ]; //обозначим первый элемент
        boolean k = data[ data.length - 1 ]; //и последний, чтобы не выходить за пределы
        for (int i = 0; i < data.length - 1; i++) {
            if (data[ 0 ] != data[ i ]) { //сравниваем элементы одинаковые или нет
                result = false; break;
            } else {
                result = true;
            }
        }
       return result;
    }
}

