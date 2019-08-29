package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        Max max = new Max();
        int result = max.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2To2Then1() {
        Max max = new Max();
        int result = max.max(3, 2);
        assertThat(result, is(03));
    }

    @Test
    public void whenMax1ToEqual2() {
        Max max = new Max();
        int result = max.max(4, 4);
        assertThat(result, is(4));
    }
}
