package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckTest {
    @Test
    public void whenDataMonoByTrueThenTrue() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, true, true};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, false, true};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    @Test
    public void whenDataNotMonoByTrueThenF() {
        Check check = new Check();
        boolean[] input = new boolean[] {false, false, false};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    @Test
    public void whenDataNotMonoByTrueThenT41() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, true, true, true};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataNotMonoByTrueThenT42() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, false, true, false};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    @Test
    public void whenDataNotMonoByTrueThenT43() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, true, true, false};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    @Test
    public void whenDataNotMonoByTrueThenT44() {
        Check check = new Check();
        boolean[] input = new boolean[] {false, false, false, false};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    @Test
    public void whenDataNotMonoByTrueThenT40() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, false, false, false};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
}

