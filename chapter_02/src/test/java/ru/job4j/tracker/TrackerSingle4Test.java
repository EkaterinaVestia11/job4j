package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

public class TrackerSingle4Test{

    @Test
    public void getInstance( ) throws Exception {
        TrackerSingle4 trackerSingle4=new TrackerSingle4();
        TrackerSingle4 actual= TrackerSingle4.Holder.INSTANCE;
        TrackerSingle4 expected=TrackerSingle4.getInstance();
        Assert.assertSame(TrackerSingle4.Holder.INSTANCE,trackerSingle4);
    }
}