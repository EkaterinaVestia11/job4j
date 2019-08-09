package ru.job4j.loop;

public class Counter{
    public static int add (int start,int finish){
        int sum=0;
        int a;
        for(a=start; a <= finish; a++) {
            if (start % 2 == 0)
            sum+=a; // 0 + 2 + 4 + 6 + 8 + 10
        }
        return sum;
    }
}