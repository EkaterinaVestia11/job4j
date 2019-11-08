package ru.job4j.strategy;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static ru.job4j.strategy.Shape.ps;

public class TriangleTest {
    @Test
    public void whenDrawTriangle(){
        Triangle triangle=new Triangle();
        assertThat(triangle.draw(),is(new StringBuilder()
                        .append("       +       ").append(ps)
                        .append("     +++++     ").append(ps)
                        .append("   +++++++++   ").append(ps)
                        .append(" +++++++++++++ ").append(ps)
                        .append("+++++++++++++++").append(ps)
                        .toString()

                )
        );
    }
}
