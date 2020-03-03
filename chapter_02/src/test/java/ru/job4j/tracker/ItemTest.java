package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ItemTest {

    @Test
    public void compareTo( ) {
       // public static void main(String[] args) {
            List<Item> items = Arrays.asList(
                    new Item(1, "Lilia"),
                    new Item(5, "Roza"),
                    new Item(2, "Tulpan")
            );
            System.out.println(items);
            Collections.sort(items);
            Collections.sort(items,new SortByNameItem());
            System.out.println(items);
    }
}