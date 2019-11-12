package ru.job4j.tracker;

public class ListAction implements UserAction {
    @Override
    public String name( ) {
        return "=== Get a list of items ====";
    }

    @Override
    public boolean execute( Input input,Tracker tracker ){
        System.out.print("Select name: ");
        Item[] all=tracker.findAll();
        for(Item item : all) {
            System.out.println(item);
        }
        return true;
    }
}
