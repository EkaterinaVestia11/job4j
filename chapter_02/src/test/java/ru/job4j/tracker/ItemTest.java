package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ItemTest {
    @Test
    public void compareToAscending() {
        List<Item> items=Arrays.asList(
                new Item("Astra" ,1) ,
                new Item("Tulpan" ,3) ,
                new Item("Lilia" ,2)
        );
        System.out.println(items);
        Collections.sort(items);
        System.out.println(items);
    }

    @Test
    public void compareToNameDescending() {
        List<Item> items=Arrays.asList(
                new Item("Scissors" ,1) ,
                new Item("Eraser" ,3) ,
                new Item("Pencil" ,2)
          );
        System.out.println(items);
        Collections.sort(items);
        System.out.println(items);
        Collections.sort(items, Collections.reverseOrder());
        System.out.println(items);
     }
}