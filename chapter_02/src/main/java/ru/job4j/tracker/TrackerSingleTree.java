package ru.job4j.tracker;

public class TrackerSingleTree {
    public static final TrackerSingleTree INSTANCE = new TrackerSingleTree();

    public TrackerSingleTree() {
    }

    public static TrackerSingleTree getInstance() {
        return INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }

    public static void main(String[] args) {
        TrackerSingleTree tracker = TrackerSingleTree.getInstance();
        System.out.println(TrackerSingleTree.INSTANCE);
    }
}
