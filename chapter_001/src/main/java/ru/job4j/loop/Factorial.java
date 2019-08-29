package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        int a;
        for (a = 1; a <= n; a++) {
           result = result * a;
        }
        return result;
    }
}
