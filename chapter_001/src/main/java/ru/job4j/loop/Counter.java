package ru.job4j.loop;

import static java.lang.Integer.sum;

public class Counter {
    public static int add(int start, int finish) {
        int sum = 0;
        int a;
        for (a = start; a <= finish; a++) {
            if (a % 2 == 0) {
                sum += a;  // 0 + 2 + 4 + 6 + 8 + 10
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));

        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
    }
}