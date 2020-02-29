package ru.job4j.tracker;

public enum TrackerSingle1 {
    INSTANCE;
    private static int x;

    // здесь мы указываем перечисления.
    public static TrackerSingle1 Instance( ) {
         return INSTANCE;
    }

    public static TrackerSingle1 getInstance() {
        TrackerSingle1 instance= INSTANCE;
        return instance;
    }
      // Конструкторы и методы.
    public Item<Number> add( Item<Number> model) {
         return model;
    }
    public static void main(String[] args) {
        TrackerSingle1 instance = TrackerSingle1.getInstance();
        System.out.println(INSTANCE);
        INSTANCE.x = 10;
        System.out.println(INSTANCE.x );
        TrackerSingle1 instance1= TrackerSingle1.getInstance();
        System.out.println(instance1.x );
    }
 }

