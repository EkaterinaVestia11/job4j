package ru.job4j.loop;

public class PrimeNumber1 {
    public int calc( int finish ) {
        int count  = 0;
        for(int number = 2; number < finish; number++) {
         // for(int i = 2; i <= number; i++)
            if (CheckPrimeNumber.check(number)){
                int i = 2;
                if (i % number == 0){
                    count++;
                }
            }
        }
        return count;
    }
}
