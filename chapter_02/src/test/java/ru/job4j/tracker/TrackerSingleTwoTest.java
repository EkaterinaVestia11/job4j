package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

import static ru.job4j.tracker.TrackerSingleTwo.instance;

public class TrackerSingleTwoTest {

       @Test
    public void TrackerSingle2() throws Exception {
        TrackerSingleTwo actual = TrackerSingleTwo.instance;
        TrackerSingleTwo expected = TrackerSingleTwo.getInstance();
        Assert.assertSame(TrackerSingleTwo.getInstance(), instance);
    }
}


