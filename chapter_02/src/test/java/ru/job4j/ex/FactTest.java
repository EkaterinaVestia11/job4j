package ru.job4j.ex;

import org.junit.Test;
import java.util.DuplicateFormatFlagsException;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FactTest{

    private DuplicateFormatFlagsException e;

    @Test(expected=IllegalArgumentException.class)
    public void whenFact( ) {
        int rsl=Fact.calc(-2);
        assertThat(e.getMessage(),is("N could not be less then 1"));
    }
}
