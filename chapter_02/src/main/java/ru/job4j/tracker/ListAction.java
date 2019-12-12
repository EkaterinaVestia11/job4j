package ru.job4j.tracker;

public class ListAction implements UserAction {
    private String key;

    @Override
    public String name( ) {
        return "=== Get a list of items ====";
    }

    @Override
    public boolean execute( Input input,Tracker tracker ){
        Item[] all=tracker.findAll();
        for(Item item : all) {
            Item[] name = tracker.findByName(key) ;
            System.out.println(String.format("%s %s", item.getId(), item.getName()));
        }
        return true;
    }
}
