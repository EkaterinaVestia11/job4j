package ru.job4j.tracker;

public enum TrackerSingleOne {
    INSTANCE;
    private static int x;

    // здесь мы указываем перечисления.
    public static TrackerSingleOne Instance() {
         return INSTANCE;
    }

    public static TrackerSingleOne getInstance() {
        TrackerSingleOne instance = INSTANCE;
        return instance;
    }
      // Конструкторы и методы.
    public Item add(Item model) {
         return model;
    }
    public static void main(String[] args) {
        TrackerSingleOne instance = TrackerSingleOne.getInstance();
        System.out.println(INSTANCE);
        INSTANCE.x = 10;
        System.out.println(INSTANCE.x);
        TrackerSingleOne instance1 = TrackerSingleOne.getInstance();
        System.out.println(instance1.x);
    }
 }

