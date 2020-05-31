package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FactTest {

     @Test(expected = IllegalArgumentException.class)
    public void whenFact() {
        int rsl = Fact.calc(5);
        assertThat(rsl, is("N could not be less then 1"));
    }
}
