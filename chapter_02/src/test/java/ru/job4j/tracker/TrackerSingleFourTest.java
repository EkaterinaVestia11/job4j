package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

public class TrackerSingleFourTest {

     @Test
    public void getInstance() throws Exception {
        TrackerSingleFour actual = TrackerSingleFour.Holder.INSTANCE;
        TrackerSingleFour expected = TrackerSingleFour.getInstance();
        Assert.assertSame(TrackerSingleFour.Holder.INSTANCE, TrackerSingleFour.getInstance());
    }
}