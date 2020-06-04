package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Factorial1Test {

    @Test
    public void factorialUsingStreams() {
        int n = 4; //напишите здесь тест, проверяющий, что факториал для числа 5 равен 120.
        int expected = 24;
        int out = Factorial.calc(n);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void factorialUsingStreams1() {
        int n = 7; //напишите здесь тест, проверяющий, что факториал для числа 5 равен 120.
        int expected = 5040;
        int out = Factorial.calc(n);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void factorialUsingStreams2() {
        int n = 0; //напишите здесь тест, проверяющий, что факториал для числа 5 равен 120.
        int expected = 1;
        int out = Factorial.calc(n);
        Assert.assertEquals(expected, out);
    }
}