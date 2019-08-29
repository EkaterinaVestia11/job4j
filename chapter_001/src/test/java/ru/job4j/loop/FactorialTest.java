package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int n = 5; //напишите здесь тест, проверяющий, что факториал для числа 5 равен 120.
        int expected = 120;
        int out = Factorial.calc(n);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int n = 0; //напишите здесь тест, проверяющий, что факториал для числа 0 равен 1.
        int expected = 1;
        int out = Factorial.calc(n);
        Assert.assertEquals(expected, out);
    }
}
