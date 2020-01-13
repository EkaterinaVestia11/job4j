package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

import static ru.job4j.tracker.TrackerSingle2.instance;

public class TrackerSingle2Test{

       @Test
    public void TrackerSingle2( ) throws Exception {
        TrackerSingle2 actual = TrackerSingle2.instance;
        TrackerSingle2 expected= TrackerSingle2.getInstance();
        Assert.assertSame(TrackerSingle2.getInstance(), instance);
    }
}


