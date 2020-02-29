package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {

    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item<Number> item = new Item<Number>("test1");
        tracker.add(item);
        Item<Number> result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item<Number> previous = new Item<Number>("test1");
        tracker.add(previous);
        Item<Number> next = new Item<Number>("test2");
        next.setId(previous.getId());
        tracker.replace(previous.getId(), next);
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    @Test
    public void whenDeleteNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item<Number> item = new Item<Number>("test1");
        Item<Number> item1 = new Item<Number>("test2");
        Item<Number> item2 = new Item<Number>("test3");
        tracker.add(item2);
        String idDelete = item2.getId();
        assertThat(tracker.delete(idDelete), is(true));
    }

    @Test
    public void whenCopyFindAllNameThenReturnCopyArray() {
        Tracker tracker = new Tracker();
        Item<Number> item = new Item<Number>("test1");
        Item<Number> item1 = new Item<Number>("test2");
        Item<Number> item2 = new Item<Number>("test3");
        tracker.add(item);
        tracker.add(item1);
        tracker.add(item2);
        assertThat(tracker.findAll(), is(new ArrayList<Item>().add(item)));
        assertThat(tracker.findAll(), is(new ArrayList<Item>().add(item1)));
        assertThat(tracker.findAll(), is(new ArrayList<Item>().add(item2)));

    }

    @Test
    public void whenFindByNameThenReturnArrayOfKeys() {
        Tracker tracker = new Tracker();
        Item<Number> item = new Item<Number>("test1");
        Item<Number> item1 = new Item<Number>("test2");
        Item<Number> item2 = new Item<Number>("test3");
        tracker.add(item);
        tracker.add(item1);
        tracker.add(item2);
        assertThat(tracker.findByName("test2"), is(new ArrayList<Item>().add(item1)));
    }

    @Test
    public void whenFindByIdThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item<Number> item = new Item<Number>("test1");
        Item<Number> item1 = new Item<Number>("test2");
        Item<Number> item2 = new Item<Number>("test3");
        tracker.add(item);
        tracker.add(item1);
        tracker.add(item2);
        String idById = item2.getId();
        Item<Number> result = tracker.findById(item.getId());
        assertThat(tracker.findById(idById), is(item2));
    }
}