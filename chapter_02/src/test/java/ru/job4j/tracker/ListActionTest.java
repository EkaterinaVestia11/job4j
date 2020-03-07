package ru.job4j.tracker;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ListActionTest {

    @Test
    public void whenCheckOutput() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        Tracker tracker = new Tracker();
        Item<Number> item =new Item<Number>("fix bug" ,4) {
            @Override
            public int intValue( ) {
                return 0;
            }

            @Override
            public long longValue( ) {
                return 0;
            }

            @Override
            public float floatValue( ) {
                return 0;
            }

            @Override
            public double doubleValue( ) {
                return 0;
            }
        };
        tracker.add(item);
        ListAction act = new ListAction();
        act.execute(new StubInput(new String[] {}), tracker);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add(item.getId() + " " + item.getName())
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
        System.setOut(def);
    }
}
