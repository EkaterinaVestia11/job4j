package ru.job4j.tracker;

import java.util.List;

public class TrackerSingle2 {

    static TrackerSingle2 instance;

    public TrackerSingle2( ) {
    }

    public static TrackerSingle2 getInstance() {
        if (instance == null) {
            instance = new TrackerSingle2 ();
        }
        return instance;
    }

    public List<Item> add( List<Item> model) {
                return model;
    }

    public static void main(String[] args) {
        TrackerSingle2 tracker = TrackerSingle2.getInstance();
        System.out.println(instance);
    }
}

