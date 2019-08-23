package ru.job4j.array;

public class Check{
    public boolean mono (boolean[] data){
        boolean result = false;
        boolean n = data[0];//обозначим первый элемент
        boolean K = data[data.length - 1];//и последний, чтобы не выходить за пределы
        for(int i = 0; i < data.length - 1; i++) {
            if ( data[ i ] == data[ i+1 ] ){//сравниваем элементы
                result = true;
            } else{
                result = false;
            }
          }
        return result;
    }
}

