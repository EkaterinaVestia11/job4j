package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CountTest {


    @Test
    public void whenStartGreaterThenFinish() {
        int rsl =  Count.add(0, 3);
        assertThat(rsl, is(3));
    }
}
