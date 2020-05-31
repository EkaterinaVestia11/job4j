package ru.job4j.tracker;

import java.util.List;

public class TrackerSingleTwo {

    static TrackerSingleTwo instance;

    public TrackerSingleTwo() {
    }

    public static TrackerSingleTwo getInstance() {
        if (instance == null) {
            instance = new TrackerSingleTwo();
        }
        return instance;
    }

    public List<Item> add(List<Item> model) {
                return model;
    }

    public static void main(String[] args) {
        TrackerSingleTwo tracker = TrackerSingleTwo.getInstance();
        System.out.println(instance);
    }
}

