package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMaxOfTo() {
        Max max =new Max();
        int result = max.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void whenMaxOfThree() {
        Max max = new Max();
        int result = max.max(1, 3, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenMaxOfFour() {
        Max max = new Max();
        int result = max.max(5, 8, 1, 9);
        assertThat(result, is(9));
    }
}
