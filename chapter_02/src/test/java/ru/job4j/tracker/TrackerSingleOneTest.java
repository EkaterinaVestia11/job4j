package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

public class TrackerSingleOneTest {
    @Test
    public  void TrackerSingle1() throws Exception {
        TrackerSingleOne actual = TrackerSingleOne.Instance();
        TrackerSingleOne expected = TrackerSingleOne.getInstance();
        Assert.assertSame(TrackerSingleOne.Instance(), TrackerSingleOne.getInstance());
    }
 }
