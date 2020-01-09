package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

public class TrackerSingle1Test {
    @Test
    public  void TrackerSingle1() throws Exception{
        TrackerSingle1 trackerSingle1=TrackerSingle1.INSTANCE;
        TrackerSingle1 actual = TrackerSingle1.Instance();
        TrackerSingle1 expected = TrackerSingle1.getInstance ();
        Assert.assertSame(TrackerSingle1.Instance(),TrackerSingle1.getInstance());
    }
 }
