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
        Item<Number> created = tracker.add(new Item<Number>("Fix PC" ,4));
        Item<Number> expected = new Item<Number>("Fix PC" ,4);
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item<Number> item = new Item<Number>("replaced item" ,4);
        tracker.add(item);
        String[] answers = {
                item.getId(), // id сохраненной заявки в объект tracker.
                "replaced item"
        };
        StartUIExampleStatic.replaceItem(new StubInput(answers), tracker);
        Item<Item> replaced =(Item<Item>) tracker.findById(item.getId());
        assertThat(replaced.getName(), is("replaced item"));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item<Number> item = new Item<Number>("Item was delete" ,4);
        tracker.add(item);
        String[] answers = { item.getId(),null };
        StartUIExampleStatic.deleteItem(new StubInput(answers), tracker);
        Item<Number> deleted =(Item<Number>) tracker.findById(item.getId());
        assertThat(deleted.getName(), is("Item was delete"));
    }
}
