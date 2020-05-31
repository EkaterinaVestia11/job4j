package ru.job4j.strategy;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static ru.job4j.strategy.Shape.PS;

public class SquareTest {
    @Test
    public void whenDrawSquare() {
        Square square = new Square();
        assertThat(square.draw(), is(new StringBuilder()
                        .append("++++++++++").append(PS)
                        .append("+        +").append(PS)
                        .append("+        +").append(PS)
                        .append("++++++++++").append(PS)
                        .toString()
                )
        );
    }
}
