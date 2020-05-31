package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StartUIExampleStaticTest {

    private Item ItemExpectede;
    private Item expected;

    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUIExampleStatic.createItem(input, tracker);
        Item created = tracker.add(new Item("Fix PC", 4));
        ItemExpectede = new Item("Fix PC", 4);
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("replaced item", 4);
        tracker.add(item);
        String[] answers = {
                item.getId(), // id сохраненной заявки в объект tracker.
                "replaced item"
        };
        StartUIExampleStatic.replaceItem(new StubInput(answers), tracker);
        Item replaced = (Item) tracker.findById(item.getId());
        assertThat(replaced.getName(), is("replaced item"));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("Item was delete", 4);
        tracker.add(item);
        String[] answers = {item.getId(), null};
        StartUIExampleStatic.deleteItem(new StubInput(answers), tracker);
        Item deleted = (Item) tracker.findById(item.getId());
        assertThat(deleted.getName(), is("Item was delete"));
    }
}
