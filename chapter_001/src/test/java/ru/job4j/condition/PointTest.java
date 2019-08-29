package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distance() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        double v = 1;
        Assert.assertEquals(expected, out, v);
    }

    @Test
    public void distance1() {
        int x1 = 2;
        int y1 = 3;
        int x2 = 5;
        int y2 = 8;
        double expected = 5;
        double out = Point.distance(x1, y1, x2, y2);
        double v = 1;
        Assert.assertEquals(expected, out, v);
    }

    @Test
    public void distance2() {
        int x1 = 5;
        int y1 = 7;
        int x2 = 9;
        int y2 = 11;
        double expected = 6;
        double out = Point.distance(x1, y1, x2, y2);
        double v = 1;
        Assert.assertEquals(expected, out, v);
    }

    @Test
    public void distance3() {
        int x1 = 2;
        int y1 = 5;
        int x2 = 4;
        int y2 = 9;
        double expected = 4;
        double out = Point.distance(x1, y1, x2, y2);
        double v = 1;
        Assert.assertEquals(expected, out, v);
    }
}
