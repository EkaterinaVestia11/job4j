package ru.job4j.tracker;

public class TrackerSingle4 {
    public TrackerSingle4( ) {
    }

    public static TrackerSingle4 getInstance() {
        return Holder.INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }

    public static final class Holder {
        static final TrackerSingle4 INSTANCE = new TrackerSingle4 ();
    }

    public static void main(String[] args) {
        TrackerSingle4 tracker = TrackerSingle4.getInstance();
        System.out.println(Holder.INSTANCE);
    }
}
