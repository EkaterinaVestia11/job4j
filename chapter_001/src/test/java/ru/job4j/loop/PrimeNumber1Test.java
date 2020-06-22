package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PrimeNumber1Test {

    @Test
    public void when5() {
        PrimeNumber1 prime = new PrimeNumber1();
        int count = prime.calc(5);
        assertThat(count, is(2));
    }

    @Test
    public void when11() {
        PrimeNumber1 prime = new PrimeNumber1();
        int count = prime.calc(11);
        assertThat(count, is(4));
    }

    @Test
    public void when2() {
        PrimeNumber1 prime = new PrimeNumber1();
        int count = prime.calc(2);
        assertThat(count, is(0));
    }
}