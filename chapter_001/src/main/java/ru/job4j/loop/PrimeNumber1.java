package ru.job4j.loop;

public class PrimeNumber1 {
    public int calc(int finish) {
        int count=0;
        for(int number=2; number < finish; number++) {
            int i = 2;
            if (CheckPrimeNumber.check(i)) {
                count++;
            }
        }
        return count;
    }
}
