package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

public class TrackerSingle3Test {
    @Test
    public void TrackerSingle3( ) throws Exception {
        TrackerSingle3 trackerSingle3=new TrackerSingle3();
        TrackerSingle3 actual =TrackerSingle3.INSTANCE;
        TrackerSingle3 expected= TrackerSingle3.getInstance();
        Assert.assertSame(TrackerSingle3.getInstance(), TrackerSingle3.INSTANCE);

    }
 }