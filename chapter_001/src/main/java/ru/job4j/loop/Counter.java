package ru.job4j.loop;

public class Counter{
    public static int add (int start,int finish){
        int sum = 0;
        finish = 10;
        for (start = 0; start <= finish; start += 2) {
            if (start % 2 == 0) {
                sum+=start; // 0 + 2 + 4 + 6 + 8 + 10
            }
           // return sum; // System.out.println ( "Сумма чисел от 1 до 10" + sum );
        }
        return sum;
    }
}