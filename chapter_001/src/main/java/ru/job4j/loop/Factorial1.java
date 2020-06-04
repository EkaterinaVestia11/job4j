package ru.job4j.loop;

import java.util.stream.LongStream;

public class Factorial1 {
    public long factorialUsingStreams(int n) {
        return LongStream.rangeClosed(1, n)
                .reduce(1, (long x, long y) -> x * y);
    }
}
