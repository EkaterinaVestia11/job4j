package ru.job4j.tracker;

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

    public Item<Number> add( Item<Number> model) {
                return model;
    }

    public static void main(String[] args) {
        TrackerSingle2 tracker = TrackerSingle2.getInstance();
        System.out.println(instance);
    }
}

