package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        for (int a = 2; a <= finish; a++) {
            for (int b = 2; b <= a; b++) { //перебираем делители
                if (a % b == 0 & b < a) {
                    break;
                } else if (b == a) {
                    count++;
                }
            }
        }
        return count;
    }
}














