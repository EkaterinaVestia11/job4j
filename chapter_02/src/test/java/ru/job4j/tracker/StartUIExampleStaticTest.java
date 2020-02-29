package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUIExampleStaticTest {

    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUIExampleStatic.createItem(input, tracker);
        Item<Number> created = tracker.add(new Item<Number>("Fix PC"));
        Item<Number> expected = new Item<Number>("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item<Number> item = new Item<Number>("replaced item");
        tracker.add(item);
        String[] answers = {
                item.getId(), // id сохраненной заявки в объект tracker.
                "replaced item"
        };
        StartUIExampleStatic.replaceItem(new StubInput(answers), tracker);
        Item<Number> replaced = tracker.findById(item.getId());
        assertThat(replaced.getName(), is("replaced item"));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item<Number> item = new Item<Number>("Item was delete");
        tracker.add(item);
        String[] answers = { item.getId(),null };
        StartUIExampleStatic.deleteItem(new StubInput(answers), tracker);
        Item<Number> deleted = tracker.findById(item.getId());
        assertThat(deleted.getName(), is("Item was delete"));
    }
}
