package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void rubleToEuro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void rubleToDollar() {
        int in = 120;
        int expected1 = 2;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected1, out);
    }

    @Test
    public void euroToRuble() {
        int in = 5;
        int expected = 70;
        int out = Converter.euroToRuble(in);
        Assert.assertNotEquals(expected, out);
    }
    @Test
    public void dollarToRuble() {
        int in = 24;
        int expected = 60;
        int out = Converter.rubleToDollar(in);
        Assert.assertNotEquals(out, expected);
    }
}
