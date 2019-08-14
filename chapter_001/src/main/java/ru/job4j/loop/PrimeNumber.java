package ru.job4j.loop;

public class PrimeNumber{
    public int calc(int finish) {
        int count = 0;//количество делителей
        int a;//
        int b;//

        for(a = 2; a <= finish; a++) {//перебираем целые числа
            for(b=2; b < a; b++)//перебираем делители
            {
                if ((a % b) == 0) ;//проверяем  делимость числа на целое
                break;
            }
            if (a % 2 == 0 || a % 3 == 0) {//
                count++; //считаем делители
            }
        }
        return count;//вывод
    }
}
