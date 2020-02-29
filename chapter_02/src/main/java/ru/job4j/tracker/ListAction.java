package ru.job4j.tracker;

public class ListAction implements UserAction {
   // private String key;

    @Override
    public String name( ) {
        return "=== Get a list of items ====";
    }

    @Override
    public boolean execute( Input input,Tracker tracker ){
        Item<Number>[] all=tracker.findAll().toArray(new Item[ 0 ]);
        for(Item<Number> item : all) {
           // Item[] name = tracker.findByName(key) ;
            System.out.println(String.format("Item id:%s, Item name:%s", item.getId(), item.getName()));
        }
        return true;
    }
}
