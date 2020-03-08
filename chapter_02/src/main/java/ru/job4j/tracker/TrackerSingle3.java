package ru.job4j.tracker;

public class TrackerSingle3 {
    public static final TrackerSingle3 INSTANCE = new TrackerSingle3();

    public TrackerSingle3( ) {
    }

    public static TrackerSingle3 getInstance() {
        return INSTANCE;
    }

    public Item add( Item model) {
        return model;
    }

    public static void main(String[] args) {
        TrackerSingle3 tracker = TrackerSingle3.getInstance();
        System.out.println(TrackerSingle3.INSTANCE);
    }
}
