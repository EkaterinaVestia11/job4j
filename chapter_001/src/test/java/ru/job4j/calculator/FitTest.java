package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void  manWeight() {
       double d = 172;
       double expected = 82.8;
       double out = Fit.manWeight(d);
       double v = 1;
       Assert.assertEquals(expected, out, v);
    }

    @Test
    public void  womanWeight() {
        double d = 167;
        double expected = 65.55;
        double out = Fit.manWeight(d);
        double v = 100;
        Assert.assertEquals(expected, out, v);
    }
}
