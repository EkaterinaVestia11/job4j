package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FindElTest {
    @Test(expected = ElementNotFoundException.class)
    public void whenIsEmptyArray() throws ElementNotFoundException {
        int rsl = FindEl.indexOf(new String[]{" "}, " ");
        assertThat(rsl, is("null "));
    }
}

