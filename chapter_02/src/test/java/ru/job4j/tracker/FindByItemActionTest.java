package ru.job4j.tracker;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindByItemActionTest {

    @Test
    public void whenFindByItem () {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        Tracker tracker = new Tracker();
        Item item = new Item ("Hello");
        tracker.add(item);
        FindByItemAction actions = new FindByItemAction ();
        actions.execute(new StubInput(new String[] {"name","1"}), tracker);
        String expect = new StringJoiner (System.lineSeparator(), "", System.lineSeparator())
                .add( String.format("%s %s", item.getId(), item.getName()))
                .add ("")
                .toString();
        assertThat(new String(out.toByteArray()), is (expect));
        System.setOut(def);
    }
}
