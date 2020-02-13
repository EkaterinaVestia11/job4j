package ru.job4j.collection;

import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(3);
        names.add("Petr");
        names.add("Ivan");
        names.add("Stefan");

        for(String string : names){
            System.out.println(string);
        }
    }
}
