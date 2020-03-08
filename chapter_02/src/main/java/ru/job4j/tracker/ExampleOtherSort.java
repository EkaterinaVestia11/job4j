package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExampleOtherSort extends SortByNameItem {
    public static void main( String[] args ) {
        List<Item> items=Arrays.asList(
                new Item ("Rosa", 4),
                new Item ("Lilia" ,1),
                new Item ("Valentina" ,2)
        );
        System.out.println(items);
        Collections.sort(items);
        System.out.println(items);
        Collections.sort(items ,new SortByNameItem());
        System.out.println(items);
    }
}

