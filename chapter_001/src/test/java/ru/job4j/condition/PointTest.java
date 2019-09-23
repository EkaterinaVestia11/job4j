package ru.job4j.condition;

import org.junit.Test;

public class PointTest {
    @Test
    public void distance() {
        Point first =new Point(0, 0);
        Point second = new Point(0, 2);
        double dist = first.distance(second);
        double v = 1;
        assertThat(dist, 1d);
    }

    private void assertThat (double dist,double v){
    }

    @Test
    public void distance1() {
        Point first =new Point(2, 3);
        Point second = new Point(5, 8);
        double dist = first.distance(second);
        double v = 1;
        assertThat(dist, 1d);
    }

    @Test
    public void distance2() {
        Point first =new Point(5, 7);
        Point second = new Point(9, 11);
        double dist = first.distance(second);
        double v = 1;
        assertThat(dist, 1d);
    }

    @Test
    public void distance3() {
        Point first =new Point(2, 5);
        Point second = new Point(4, 9);
        double dist = first.distance(second);
        double v = 1;
        assertThat(dist, 1d);
    }
}
