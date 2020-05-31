package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {

    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", 4);
        tracker.add(item);
        Item result = (Item) tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", 4);
        tracker.add(previous);
        Item next = new Item("test2", 4);
        next.setId(previous.getId());
        tracker.replace(previous.getId(), (Item) next);
        assertThat(tracker.findById(previous.getId()), is("test2"));
    }

    @Test
    public void whenDeleteNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", 4);
        Item item1 = new Item("test2", 4);
        Item item2 = new Item("test3", 4);
        tracker.add(item2);
        String idDelete = item2.getId();
        assertThat(tracker.delete(idDelete), is(true));
    }

    @Test
    public void whenCopyFindAllNameThenReturnCopyArray() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", 4);
        Item item1 = new Item("test2", 4);
        Item item2 = new Item("test3", 4);
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
        Item item = new Item("test1", 4);
        Item item1 = new Item("test2", 4);
        Item item2 = new Item("test3", 4);
        tracker.add(item);
        tracker.add(item1);
        tracker.add(item2);
        assertThat(tracker.findByName("test2"), is(new ArrayList<Item>().add(item1)));
    }

    @Test
    public void whenFindByIdThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", 4);
        Item item1 = new Item("test2", 4);
        Item item2 = new Item("test3", 4);
        tracker.add(item);
        tracker.add(item1);
        tracker.add(item2);
        String idById = item2.getId();
        Item result = (Item) tracker.findById(item.getId());
        assertThat(tracker.findById(idById), is(item2));
    }
}