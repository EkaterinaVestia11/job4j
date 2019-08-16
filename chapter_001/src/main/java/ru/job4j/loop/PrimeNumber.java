package ru.job4j.loop;

public class PrimeNumber{
    public int calc (int finish){
        int count=0;
        //int div=0;
        int a;
        int b;

        for(a=2; a <= finish; a++) //перебираем целые числа
        {
            for(b=2; b < a; b++)//перебираем делители
            {
                if (a % b == 0) { //проверяем  делимость числа на целое
                } //else div++;
            }
            if ( a % 2 == 0 || a % 3 == 0|| a == b) {
                // break;
                count++;
            }
        }

        return count;//вывод количества простых чисел
    }
}













