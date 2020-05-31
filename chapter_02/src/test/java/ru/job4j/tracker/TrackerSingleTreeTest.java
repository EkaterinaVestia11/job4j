package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

public class TrackerSingleTreeTest {
    @Test
    public void TrackerSingleTree() throws Exception {
        TrackerSingleTree actual = TrackerSingleTree.INSTANCE;
        TrackerSingleTree expected = TrackerSingleTree.getInstance();
        Assert.assertSame(TrackerSingleTree.getInstance(), TrackerSingleTree.INSTANCE);
    }
 }